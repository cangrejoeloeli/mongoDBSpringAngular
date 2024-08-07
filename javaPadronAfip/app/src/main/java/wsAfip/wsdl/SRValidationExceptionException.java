/**
 * SRValidationExceptionException.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package wsAfip.wsdl;

public class SRValidationExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1722970397503L;

  private wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE faultMessage;

  public SRValidationExceptionException() {
    super("SRValidationExceptionException");
  }

  public SRValidationExceptionException(java.lang.String s) {
    super(s);
  }

  public SRValidationExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public SRValidationExceptionException(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE msg) {
    faultMessage = msg;
  }

  public wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE getFaultMessage() {
    return faultMessage;
  }
}
