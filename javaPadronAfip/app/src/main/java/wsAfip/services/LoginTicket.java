/** Para crear y leer el login ticket */

package wsAfip.services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class LoginTicket {

        public static String crearLoginTicket(String service)
                        throws DatatypeConfigurationException {

                /* unique id */
                Date GenTime = new Date();
                Long UniqueId = GenTime.getTime() / 1000;

                /* fecha hora actual */
                GregorianCalendar gregorianCalendar = new GregorianCalendar();

                /* format xml */
                XMLGregorianCalendar xmlGrCaGeneration = DatatypeFactory.newInstance()
                                .newXMLGregorianCalendar(gregorianCalendar);

                /* agrego 18 horas de las 24 perimtidas */
                gregorianCalendar.add(Calendar.HOUR, 18);

                /* format xml */
                XMLGregorianCalendar xmlGrCaExpiration = DatatypeFactory.newInstance()
                                .newXMLGregorianCalendar(gregorianCalendar);

                String LoginTicketRequest_xml;

                LoginTicketRequest_xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                                + "<loginTicketRequest version=\"1.0\">"
                                + "<header>"
                                + "<uniqueId>" + UniqueId + "</uniqueId>"
                                + "<generationTime>" + xmlGrCaGeneration + "</generationTime>"
                                + "<expirationTime>" + xmlGrCaExpiration + "</expirationTime>"
                                + "</header>"
                                + "<service>" + service + "</service>"
                                + "</loginTicketRequest>";

                /* devuelvo el ticket */
                return LoginTicketRequest_xml;
        }
}
