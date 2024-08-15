package com.gsj.clienteunico.afipws;

import java.rmi.RemoteException;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsj.clienteunico.afipws.wsdl.LoginCMSServiceStub;
import com.gsj.clienteunico.afipws.wsdl.LoginCMSServiceStub.LoginCms;
import com.gsj.clienteunico.afipws.wsdl.LoginCMSServiceStub.LoginCmsResponse;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersonaList_v2;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersona_v2;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersona_v2E;
import com.gsj.clienteunico.afipws.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE;
import com.gsj.clienteunico.afipws.wsdl.SRValidationExceptionException;

@Service
public class WebServiceAfip {

    @Autowired
    private AuthProvider authProvider;

    /* invoca el método de autenticacion */
    public static String getLoginTicket(byte[] LoginTicketRequest_xml_cms, String endPoint) throws Exception {

        String LoginTicketResponse = null;

        try {
            // Create a stub instance
            LoginCMSServiceStub stub = new LoginCMSServiceStub();

            // Create a request object
            LoginCms request = new LoginCms();

            // Set the parameters of the request
            request.setIn0(new String(Base64.encode(LoginTicketRequest_xml_cms)));

            // Invoke the web service
            LoginCmsResponse response = stub.loginCms(request);

            return response.getLoginCmsReturn();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (LoginTicketResponse);

    }

    public GetPersona_v2ResponseE verificaCuit(Long cuit) throws RemoteException, SRValidationExceptionException {

        PersonaServiceA5Stub stub = new PersonaServiceA5Stub();

        GetPersona_v2E request = new GetPersona_v2E();

        GetPersona_v2 persona_v2 = new GetPersona_v2();

        persona_v2.setSign(authProvider.getSign());
        persona_v2.setToken(authProvider.getToken());
        persona_v2.setCuitRepresentada(authProvider.getCuitRepresentado());
        persona_v2.setIdPersona(cuit);

        request.setGetPersona_v2(persona_v2);

        return stub.getPersona_v2(request);
    }

    public GetPersonaList_v2ResponseE verificarLista(long[] cuits)
            throws RemoteException, SRValidationExceptionException {

        PersonaServiceA5Stub stub = new PersonaServiceA5Stub();

        GetPersonaList_v2E request = new GetPersonaList_v2E();

        GetPersonaList_v2 lista_v2 = new GetPersonaList_v2();

        lista_v2.setSign(authProvider.getSign());
        lista_v2.setToken(authProvider.getToken());
        lista_v2.setCuitRepresentada(authProvider.getCuitRepresentado());

        lista_v2.setIdPersona(cuits);

        request.setGetPersonaList_v2(lista_v2);

        return stub.getPersonaList_v2(request);
    }

}
