/**
 * LoginFault.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package wsAfip.wsdl;

public class LoginFault extends java.lang.Exception {

  private static final long serialVersionUID = 1722961891354L;

  private wsAfip.wsdl.LoginCMSServiceStub.Fault faultMessage;

  public LoginFault() {
    super("LoginFault");
  }

  public LoginFault(java.lang.String s) {
    super(s);
  }

  public LoginFault(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public LoginFault(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(wsAfip.wsdl.LoginCMSServiceStub.Fault msg) {
    faultMessage = msg;
  }

  public wsAfip.wsdl.LoginCMSServiceStub.Fault getFaultMessage() {
    return faultMessage;
  }
}
