package wsAfip;

import wsAfip.services.CreateCMS;
import wsAfip.services.VerificarPadron;
import wsAfip.services.afip_wsaa_client;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE;
import wsAfip.wsdl.PersonaServiceA5Stub.Persona;

import java.util.List;
import java.util.Properties;

import javax.xml.datatype.DatatypeConfigurationException;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class wsApp {

    public static void main(String[] args) throws Exception, DatatypeConfigurationException {

        /* propiedades de la app */
        Properties config = new Properties();
        try {
            config.load(new FileInputStream("./swAfip.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* user dir */
        String path = System.getProperty("user.dir");

        /* datos obtenidos */
        String token = ""; // token
        String sign = ""; // firma

        /* valores de configuración */
        String endPoint = config.getProperty("endpoint", "default");
        String certificate = path + "/" + config.getProperty("certificate", "");
        String privateKey = path + "/" + config.getProperty("privateKey", "");

        /* verifico que exista archivo */
        File priv = new File(privateKey);
        if (priv.isFile())
            System.out.println("Clave privada encontrada");

        File trust = new File(certificate);
        if (trust.isFile())
            System.out.println("Certificate encontrada");

        final String service = "ws_sr_constancia_inscripcion";

        /* busco token u sign previo */
        SAXReader reader = new SAXReader();
        File xmlFile = new File("loginTicketResponse.xml");
        Document document = reader.read(xmlFile);
        Element RootElement = document.getRootElement();

        // Iterating over the List
        List<Element> elements = RootElement.elements();

        /* datos a extraer desde el xml */
        String expirationXml = "";

        for (Element ele : elements) {
            /* credentials header */
            switch (ele.getName()) {
                case "credentials":
                    /* token | sign */
                    for (Element eleCred : ele.elements()) {
                        switch (eleCred.getName()) {
                            case "token":
                                token = eleCred.getTextTrim();
                                break;
                            case "sign":
                                sign = eleCred.getTextTrim();
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "header":
                    for (Element eleCred : ele.elements()) {
                        /* source | destination | uniqueId | generationTime | expirationTime */
                        switch (eleCred.getName()) {
                            case "expirationTime":
                                expirationXml = eleCred.getTextTrim();
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("DESDE XML: ");
        System.out.println("TOKEN: " + token);
        System.out.println("SIGN: " + sign);

        // Parse the string to an OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(expirationXml, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        // Convert OffsetDateTime to Instant
        OffsetDateTime futureDateTime = OffsetDateTime.now().plusHours(3);
        if (futureDateTime.isAfter(offsetDateTime)) {
            /* acá tengo que buscar nuevo token */
            /* creo el login ticket xml firmado en base64 cms */
            byte[] lt_xml_cms = CreateCMS.crearCms(privateKey, certificate, service);

            System.out.println(lt_xml_cms);
            /* invoco el servicio */
            String LoginTicketResponse = afip_wsaa_client.invoke_wsaa(lt_xml_cms, endPoint);

            if (LoginTicketResponse == null) {
                System.out.println("algo salió mal.");
                return;
            }

            /* obtener token y sign */
            // Get token & sign from LoginTicketResponse
            try {
                Reader tokenReader = new StringReader(LoginTicketResponse);
                Document tokenDoc = new SAXReader(false).read(tokenReader);

                token = tokenDoc.valueOf("/loginTicketResponse/credentials/token");
                sign = tokenDoc.valueOf("/loginTicketResponse/credentials/sign");

                System.out.println("NUEVOS desde AFIP: ");
                System.out.println("TOKEN: " + token);
                System.out.println("SIGN: " + sign);

                FileOutputStream newFile = new FileOutputStream("loginTicketResponse.xml");
                XMLWriter writer = new XMLWriter(newFile);
                writer.write(tokenDoc);

                OutputFormat format = OutputFormat.createPrettyPrint();
                XMLWriter consoleWriter = new XMLWriter(System.out, format);
                consoleWriter.write(tokenDoc);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        /* Pido */

        VerificarPadron verificarPadron = new VerificarPadron();
        verificarPadron.setSignWsaa(sign);
        verificarPadron.setTokenWsaa(token);

        /** para formateo de salida de info en json */
        ObjectMapper objectMapper = new ObjectMapper();

        /** Get de a un registro - verificación */
        // GetPersona_v2ResponseE rta = verificarPadron.verificaCuit(30665549050L);

        // try {
        // // Convert Person object to JSON string
        // String jsonString =
        // objectMapper.writeValueAsString(rta.getGetPersona_v2Response().getPersonaReturn());

        // // Print JSON string to the console
        // System.out.println(jsonString);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // Lista de registros
        long[] cuits = new long[12];
        cuits[0] = 30665549050L; // GSJ
        cuits[1] = 20049895306L; // MRS
        cuits[2] = 33711688779L; // DAVNAR
        cuits[3] = 30708658509L; // Tecven
        cuits[4] = 23209146169L; // Ratto
        cuits[5] = 27260169063L; // Natalia
        cuits[6] = 20250886420L; // MJS
        cuits[7] = 20101340377L; // Juan Molnar
        cuits[8] = 27011119315L; // Rossi María Teresa (Chivilcoy)
        cuits[9] = 23044792494L; // Rossi María Teresa (Pety)
        cuits[10] = 27063941781L; // Mónica
        cuits[11] = 20250886429L; // Error

        GetPersonaList_v2ResponseE lista = verificarPadron.verificarLista(cuits);
        int contador = 0;
        for (Persona l : lista.getGetPersonaList_v2Response().getPersonaListReturn().getPersona()) {
            // String jsoString = objectMapper.writeValueAsString(l);
            String fileName = null;
            if (l.isDatosGeneralesSpecified()) {
                fileName = "salida/" + l.getDatosGenerales().getIdPersona() + ".json";
            } else {
                if (l.isErrorConstanciaSpecified()) {
                    fileName = "salida/" + l.getErrorConstancia().getIdPersona() + "-error.json";
                } else {
                    fileName = "salida/Output-Error-" + String.valueOf(contador++) + ".json";
                }
            }
            System.out.println(fileName);
            objectMapper.writeValue(new File(fileName), l);
        }

        return;

    };

}
