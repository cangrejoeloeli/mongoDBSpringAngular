/**
 * LoginFault.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package com.gsj.clienteunico.afipws.wsdl;

public class LoginFault extends java.lang.Exception {

  private static final long serialVersionUID = 1722961891354L;

  private LoginCMSServiceStub.Fault faultMessage;

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

  public void setFaultMessage(LoginCMSServiceStub.Fault msg) {
    faultMessage = msg;
  }

  public LoginCMSServiceStub.Fault getFaultMessage() {
    return faultMessage;
  }
}
