package wsAfip.services;

import org.bouncycastle.util.encoders.Base64;

import wsAfip.wsdl.LoginCMSServiceStub;
import wsAfip.wsdl.LoginCMSServiceStub.LoginCms;
import wsAfip.wsdl.LoginCMSServiceStub.LoginCmsResponse;

public class afip_wsaa_client {

    /* invoca el método de autenticacion */
    public static String invoke_wsaa(byte[] LoginTicketRequest_xml_cms, String endPoint) throws Exception {

        String LoginTicketResponse = null;

        // final EndpointReference targetEPR = new EndpointReference(endPoint);

        try {
            // Create a stub instance
            LoginCMSServiceStub stub = new LoginCMSServiceStub();

            // Create a request object
            LoginCms request = new LoginCms();

            // Set the parameters of the request

            request.setIn0(new String(Base64.encode(LoginTicketRequest_xml_cms))); // Adjust
            // the
            // parameters
            // according
            // to the
            // WSDL

            // Invoke the web service
            LoginCmsResponse response = stub.loginCms(request);

            return response.getLoginCmsReturn();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (LoginTicketResponse);

    }

}
