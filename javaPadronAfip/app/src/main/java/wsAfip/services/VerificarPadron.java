package wsAfip.services;

import java.rmi.RemoteException;
import wsAfip.wsdl.PersonaServiceA5Stub;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E;
import wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE;
import wsAfip.wsdl.SRValidationExceptionException;

public class VerificarPadron {

    public String tokenWsaa;
    public String signWsaa;

    public String cuitRepresentado;

    /**
     * Token obtenido desde wsaa login ticket
     * 
     * @param token
     */
    public void setTokenWsaa(String token) {
        this.tokenWsaa = token;
    }

    /**
     * Firma obtenida desde wsaa login ticket
     * 
     * @param sign
     */
    public void setSignWsaa(String sign) {
        this.signWsaa = sign;
    }

    /**
     * CUIT del autorizado para la consulta del padrón
     * 
     * @param cuit
     */
    public void setCuitRepresentado(String cuit) {
        this.cuitRepresentado = cuit;
    }

    public GetPersona_v2ResponseE verificaCuit(Long cuit) throws RemoteException, SRValidationExceptionException {

        PersonaServiceA5Stub stub = new PersonaServiceA5Stub();

        GetPersona_v2E request = new GetPersona_v2E();

        GetPersona_v2 persona_v2 = new GetPersona_v2();

        persona_v2.setSign(signWsaa);
        persona_v2.setToken(tokenWsaa);
        persona_v2.setCuitRepresentada(20250886420L);
        persona_v2.setIdPersona(cuit);

        request.setGetPersona_v2(persona_v2);

        return stub.getPersona_v2(request);
    }

    public GetPersonaList_v2ResponseE verificarLista(long[] cuits)
            throws RemoteException, SRValidationExceptionException {

        PersonaServiceA5Stub stub = new PersonaServiceA5Stub();

        GetPersonaList_v2E request = new GetPersonaList_v2E();

        GetPersonaList_v2 lista_v2 = new GetPersonaList_v2();

        lista_v2.setSign(signWsaa);
        lista_v2.setToken(tokenWsaa);
        lista_v2.setCuitRepresentada(20250886420L);

        lista_v2.setIdPersona(cuits);

        request.setGetPersonaList_v2(lista_v2);

        return stub.getPersonaList_v2(request);
    }
}
