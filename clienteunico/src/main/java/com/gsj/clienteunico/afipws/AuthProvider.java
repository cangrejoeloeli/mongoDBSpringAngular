package com.gsj.clienteunico.afipws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.io.Reader;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import org.springframework.stereotype.Component;

import com.gsj.clienteunico.afipws.services.CreateCMS;

/**
 * para tener en memoria los datos de token y firma
 * los busca del archivo, si no está lo trae de afip
 * si están vencidos los renueva
 */
@Component
public class AuthProvider {

    private String certificate;
    private String privateKey;
    private String endPoint;

    private String token;
    private String sign;

    private OffsetDateTime expirationDateTime = OffsetDateTime.now(); /* cuando expira la info de authenticacion */

    final String service = "ws_sr_constancia_inscripcion";

    private long cuitRepresentado = 20250886420L;

    /* user dir */
    private String path = System.getProperty("user.dir");

    /* priedades desde archivo */
    private Properties config = new Properties();

    @PostConstruct
    public void init() {
        // Obtengo propiedades desde archvivo
        try {
            config.load(new FileInputStream("./clienteunico.properties"));
        } catch (Exception e) {
            System.out.println("No se cargaron las propiedades");
        }

        /* valores de configuración */
        endPoint = config.getProperty("endpoint", "");
        certificate = path + "/" + config.getProperty("certificate", "");
        privateKey = path + "/" + config.getProperty("privateKey", "");

        /* verifico que exista archivo */
        File priv = new File(privateKey);
        if (priv.isFile())
            System.out.println("Clave privada encontrada");

        File trust = new File(certificate);
        if (trust.isFile())
            System.out.println("Certificate encontrada");

        /* voy a buscar los valores en el xml */
        /* si no está el xml, no se actualizan los valores, la fecha queda como now */
        getTokenSingFromFile();

        /*
         * ya busqué en archivo, me fijo si está vencido o no
         * si está vencido, lo trae desde afip el método.
         */
        if (isNotAuthInfoExpired())
            System.out.println("Inciados token y sign");
        else
            System.out.println("Error en token y sign");

    }

    /**
     * @return token para consumir servicio constancia
     */
    public String getToken() {
        return token;
    }

    /**
     * @return firma para consumir servicio constancia
     */
    public String getSign() {
        return sign;
    }

    /**
     * @return CUIT del representado dueño del certificado
     */
    public long getCuitRepresentado() {
        return cuitRepresentado;
    }

    /**
     * Busca los valores token y sign grabados en archivo por
     * ejecución anterior. Si están y les queda una hora de vida,
     * los asigna en la variables para uso. *
     * 
     * @return si pudo obtener los valores desde el archivo
     */
    private void getTokenSingFromFile() {

        File xmlFile = new File("loginTicketResponse.xml");
        /* si no existe el archivo, salgo directamente */
        if (!xmlFile.isFile()) {
            System.out.println("No existe loginTicketResponse.xml");
            return;
        }
        try {
            /* busco token y sign previo */
            SAXReader reader = new SAXReader();

            Document document = reader.read(xmlFile);
            Element RootElement = document.getRootElement();

            // Iterating over the List
            List<Element> elements = RootElement.elements();

            /* datos a extraer desde el xml */
            String expirationXml = "";
            String sToken = "";
            String sSign = "";

            /* obtengo los elementos desde el xml */
            for (Element ele : elements) {
                /* credentials header */
                switch (ele.getName()) {
                    case "credentials":
                        /* token | sign */
                        for (Element eleCred : ele.elements()) {
                            switch (eleCred.getName()) {
                                case "token":
                                    sToken = eleCred.getTextTrim();
                                    break;
                                case "sign":
                                    sSign = eleCred.getTextTrim();
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

            // Establece cuándo vence la info de authenticacion
            expirationDateTime = OffsetDateTime.parse(expirationXml,
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME);

            // asigno los valores y respondo true
            this.token = sToken;
            this.sign = sSign;

            System.out.println("Valores obtenidos desde xml");
        } catch (Exception e) {
            /** por algún motivo no pudo obtenerlo desde el .xml */

            e.printStackTrace();
        }
    }

    /**
     * Para verificar si token y sign no están vencidos *
     * Si está vencido, lo obtiene desde afip y guarda en xml
     * 
     * @return true si están correctos.
     */
    private boolean isNotAuthInfoExpired() {
        /* si le queda menos de una hora, los obtiene desde afip nuevamente */
        OffsetDateTime futureDateTime = OffsetDateTime.now().plusHours(1);
        if (futureDateTime.isAfter(expirationDateTime)) {
            try {
                return getSignDataFromAfip();
            } catch (Exception e) {
                System.out.println("Error obteniendo token desde afip");
                return false;
            }
        }
        return true;
    }

    /**
     * Obtiene los datos de authenticacion desde ws afip
     * 
     * @return true si los obtuvo correctamente y grabó en archivo
     * @throws Exception
     */
    private boolean getSignDataFromAfip() throws Exception {
        /* creo el pedido para invocar al ws */
        byte[] lt_xml_cms = CreateCMS.crearCms(privateKey, certificate, service);

        /* invoco el servicio */
        String LoginTicketResponse = WebServiceAfip.getLoginTicket(lt_xml_cms, endPoint);

        if (LoginTicketResponse == null) {
            System.out.println("algo salió mal.");
            return false;
        }

        /* obtener token y sign */
        // Get token & sign from LoginTicketResponse
        try {
            Reader tokenReader = new StringReader(LoginTicketResponse);
            Document tokenDoc = new SAXReader(false).read(tokenReader);

            token = tokenDoc.valueOf("/loginTicketResponse/credentials/token");
            sign = tokenDoc.valueOf("/loginTicketResponse/credentials/sign");

            String expirationXml = tokenDoc.valueOf("/loginTicketResponse/header/expirationTime");

            expirationDateTime = OffsetDateTime.parse(expirationXml,
                    DateTimeFormatter.ISO_OFFSET_DATE_TIME);

            System.out.println("Token y sign NUEVOS desde AFIP");

            FileOutputStream newFile = new FileOutputStream("loginTicketResponse.xml");
            XMLWriter writer = new XMLWriter(newFile);
            writer.write(tokenDoc);

            // OutputFormat format = OutputFormat.createPrettyPrint();
            // XMLWriter consoleWriter = new XMLWriter(System.out, format);
            // consoleWriter.write(tokenDoc);

            return true;

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
