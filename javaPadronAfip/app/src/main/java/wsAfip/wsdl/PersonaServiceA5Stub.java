/**
 * PersonaServiceA5Stub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package wsAfip.wsdl;

/*
 *  PersonaServiceA5Stub java implementation
 */

public class PersonaServiceA5Stub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultExceptionNameMap = new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultExceptionClassNameMap = new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap = new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("PersonaServiceA5" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[5];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona_v2"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersonaList"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "dummy"));
    _service.addOperation(__operation);

    _operations[4] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona_v2"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona_v2"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona_v2"),
        "wsAfip.wsdl.PersonaServiceA5Stub$SRValidationExceptionE");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersona"),
        "wsAfip.wsdl.PersonaServiceA5Stub$SRValidationExceptionE");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList_v2"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList_v2"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList_v2"),
        "wsAfip.wsdl.PersonaServiceA5Stub$SRValidationExceptionE");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList"),
        "wsAfip.wsdl.SRValidationExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName(
                "http://a5.soap.ws.server.puc.sr/", "SRValidationException"),
            "getPersonaList"),
        "wsAfip.wsdl.PersonaServiceA5Stub$SRValidationExceptionE");
  }

  /** Constructor that takes in a configContext */
  public PersonaServiceA5Stub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public PersonaServiceA5Stub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
  }

  /** Default Constructor */
  public PersonaServiceA5Stub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "https://aws.afip.gov.ar/sr-padron/webservices/personaServiceA5");
  }

  /** Default Constructor */
  public PersonaServiceA5Stub() throws org.apache.axis2.AxisFault {

    this("https://aws.afip.gov.ar/sr-padron/webservices/personaServiceA5");
  }

  /** Constructor taking the target endpoint */
  public PersonaServiceA5Stub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see wsAfip.wsdl.PersonaServiceA5#getPersona_v2
   * @param getPersona_v2
   * @throws wsAfip.wsdl.SRValidationExceptionException :
   */
  public wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE getPersona_v2(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E getPersona_v2)
      throws java.rmi.RemoteException, wsAfip.wsdl.SRValidationExceptionException {

    org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
      _operationClient
          .getOptions()
          .setAction("http://a5.soap.ws.server.puc.sr/PersonaServiceA5/getPersona_v2");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env = toEnvelope(
          getFactory(_operationClient.getOptions().getSoapVersionURI()),
          getPersona_v2,
          optimizeContent(
              new javax.xml.namespace.QName(
                  "http://a5.soap.ws.server.puc.sr/", "getPersona_v2")),
          new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona_v2"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
          org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object = fromOM(
          _returnEnv.getBody().getFirstElement(),
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona_v2"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName = faultExceptionClassNameMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona_v2"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName = faultMessageMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona_v2"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                new java.lang.Class[] { messageClass });
            m.invoke(ex, new java.lang.Object[] { messageObject });

            if (ex instanceof wsAfip.wsdl.SRValidationExceptionException) {
              throw (wsAfip.wsdl.SRValidationExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see wsAfip.wsdl.PersonaServiceA5#getPersona
   * @param getPersona
   * @throws wsAfip.wsdl.SRValidationExceptionException :
   */
  public wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE getPersona(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE getPersona)
      throws java.rmi.RemoteException, wsAfip.wsdl.SRValidationExceptionException {

    org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
      _operationClient
          .getOptions()
          .setAction("http://a5.soap.ws.server.puc.sr/PersonaServiceA5/getPersona");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env = toEnvelope(
          getFactory(_operationClient.getOptions().getSoapVersionURI()),
          getPersona,
          optimizeContent(
              new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona")),
          new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
          org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object = fromOM(
          _returnEnv.getBody().getFirstElement(),
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName = faultExceptionClassNameMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName = faultMessageMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersona"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                new java.lang.Class[] { messageClass });
            m.invoke(ex, new java.lang.Object[] { messageObject });

            if (ex instanceof wsAfip.wsdl.SRValidationExceptionException) {
              throw (wsAfip.wsdl.SRValidationExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see wsAfip.wsdl.PersonaServiceA5#getPersonaList_v2
   * @param getPersonaList_v2
   * @throws wsAfip.wsdl.SRValidationExceptionException :
   */
  public wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE getPersonaList_v2(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E getPersonaList_v2)
      throws java.rmi.RemoteException, wsAfip.wsdl.SRValidationExceptionException {

    org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
      _operationClient
          .getOptions()
          .setAction("http://a5.soap.ws.server.puc.sr/PersonaServiceA5/getPersonaList_v2");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env = toEnvelope(
          getFactory(_operationClient.getOptions().getSoapVersionURI()),
          getPersonaList_v2,
          optimizeContent(
              new javax.xml.namespace.QName(
                  "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2")),
          new javax.xml.namespace.QName(
              "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
          org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object = fromOM(
          _returnEnv.getBody().getFirstElement(),
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersonaList_v2"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName = faultExceptionClassNameMap.get(
                new org.apache.axis2.client.FaultMapKey(
                    faultElt.getQName(), "getPersonaList_v2"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName = faultMessageMap.get(
                new org.apache.axis2.client.FaultMapKey(
                    faultElt.getQName(), "getPersonaList_v2"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                new java.lang.Class[] { messageClass });
            m.invoke(ex, new java.lang.Object[] { messageObject });

            if (ex instanceof wsAfip.wsdl.SRValidationExceptionException) {
              throw (wsAfip.wsdl.SRValidationExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see wsAfip.wsdl.PersonaServiceA5#getPersonaList
   * @param getPersonaList
   * @throws wsAfip.wsdl.SRValidationExceptionException :
   */
  public wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE getPersonaList(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE getPersonaList)
      throws java.rmi.RemoteException, wsAfip.wsdl.SRValidationExceptionException {

    org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
      _operationClient
          .getOptions()
          .setAction("http://a5.soap.ws.server.puc.sr/PersonaServiceA5/getPersonaList");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env = toEnvelope(
          getFactory(_operationClient.getOptions().getSoapVersionURI()),
          getPersonaList,
          optimizeContent(
              new javax.xml.namespace.QName(
                  "http://a5.soap.ws.server.puc.sr/", "getPersonaList")),
          new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersonaList"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
          org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object = fromOM(
          _returnEnv.getBody().getFirstElement(),
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersonaList"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName = faultExceptionClassNameMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersonaList"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName = faultMessageMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPersonaList"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                new java.lang.Class[] { messageClass });
            m.invoke(ex, new java.lang.Object[] { messageObject });

            if (ex instanceof wsAfip.wsdl.SRValidationExceptionException) {
              throw (wsAfip.wsdl.SRValidationExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see wsAfip.wsdl.PersonaServiceA5#dummy
   * @param dummy
   */
  public wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE dummy(
      wsAfip.wsdl.PersonaServiceA5Stub.DummyE dummy) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
      _operationClient
          .getOptions()
          .setAction("http://a5.soap.ws.server.puc.sr/PersonaServiceA5/dummy");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env = toEnvelope(
          getFactory(_operationClient.getOptions().getSoapVersionURI()),
          dummy,
          optimizeContent(
              new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "dummy")),
          new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "dummy"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
          org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object = fromOM(
          _returnEnv.getBody().getFirstElement(),
          wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "dummy"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName = faultExceptionClassNameMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "dummy"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName = faultMessageMap.get(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "dummy"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                new java.lang.Class[] { messageClass });
            m.invoke(ex, new java.lang.Object[] { messageObject });

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }

  // https://aws.afip.gov.ar/sr-padron/webservices/personaServiceA5
  public static class GetPersona_v2Response implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersona_v2Response
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for PersonaReturn */
    protected PersonaReturn localPersonaReturn;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPersonaReturnTracker = false;

    public boolean isPersonaReturnSpecified() {
      return localPersonaReturnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return PersonaReturn
     */
    public PersonaReturn getPersonaReturn() {
      return localPersonaReturn;
    }

    /**
     * Auto generated setter method
     *
     * @param param PersonaReturn
     */
    public void setPersonaReturn(PersonaReturn param) {
      localPersonaReturnTracker = param != null;

      this.localPersonaReturn = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersona_v2Response",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersona_v2Response",
              xmlWriter);
        }
      }
      if (localPersonaReturnTracker) {
        if (localPersonaReturn == null) {
          throw new org.apache.axis2.databinding.ADBException("personaReturn cannot be null!!");
        }
        localPersonaReturn.serialize(new javax.xml.namespace.QName("", "personaReturn"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersona_v2Response parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersona_v2Response object = new GetPersona_v2Response();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersona_v2Response".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersona_v2Response) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "personaReturn").equals(reader.getName())) {

            object.setPersonaReturn(PersonaReturn.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Domicilio implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = domicilio
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for CodPostal */
    protected java.lang.String localCodPostal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localCodPostalTracker = false;

    public boolean isCodPostalSpecified() {
      return localCodPostalTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCodPostal() {
      return localCodPostal;
    }

    /**
     * Auto generated setter method
     *
     * @param param CodPostal
     */
    public void setCodPostal(java.lang.String param) {
      localCodPostalTracker = param != null;

      this.localCodPostal = param;
    }

    /** field for DatoAdicional */
    protected java.lang.String localDatoAdicional;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatoAdicionalTracker = false;

    public boolean isDatoAdicionalSpecified() {
      return localDatoAdicionalTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDatoAdicional() {
      return localDatoAdicional;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatoAdicional
     */
    public void setDatoAdicional(java.lang.String param) {
      localDatoAdicionalTracker = param != null;

      this.localDatoAdicional = param;
    }

    /** field for DescripcionProvincia */
    protected java.lang.String localDescripcionProvincia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionProvinciaTracker = false;

    public boolean isDescripcionProvinciaSpecified() {
      return localDescripcionProvinciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionProvincia() {
      return localDescripcionProvincia;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionProvincia
     */
    public void setDescripcionProvincia(java.lang.String param) {
      localDescripcionProvinciaTracker = param != null;

      this.localDescripcionProvincia = param;
    }

    /** field for Direccion */
    protected java.lang.String localDireccion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDireccionTracker = false;

    public boolean isDireccionSpecified() {
      return localDireccionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDireccion() {
      return localDireccion;
    }

    /**
     * Auto generated setter method
     *
     * @param param Direccion
     */
    public void setDireccion(java.lang.String param) {
      localDireccionTracker = param != null;

      this.localDireccion = param;
    }

    /** field for IdProvincia */
    protected int localIdProvincia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdProvinciaTracker = false;

    public boolean isIdProvinciaSpecified() {
      return localIdProvinciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdProvincia() {
      return localIdProvincia;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdProvincia
     */
    public void setIdProvincia(int param) {

      // setting primitive attribute tracker to true
      localIdProvinciaTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdProvincia = param;
    }

    /** field for Localidad */
    protected java.lang.String localLocalidad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localLocalidadTracker = false;

    public boolean isLocalidadSpecified() {
      return localLocalidadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocalidad() {
      return localLocalidad;
    }

    /**
     * Auto generated setter method
     *
     * @param param Localidad
     */
    public void setLocalidad(java.lang.String param) {
      localLocalidadTracker = param != null;

      this.localLocalidad = param;
    }

    /** field for TipoDatoAdicional */
    protected java.lang.String localTipoDatoAdicional;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoDatoAdicionalTracker = false;

    public boolean isTipoDatoAdicionalSpecified() {
      return localTipoDatoAdicionalTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoDatoAdicional() {
      return localTipoDatoAdicional;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoDatoAdicional
     */
    public void setTipoDatoAdicional(java.lang.String param) {
      localTipoDatoAdicionalTracker = param != null;

      this.localTipoDatoAdicional = param;
    }

    /** field for TipoDomicilio */
    protected java.lang.String localTipoDomicilio;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoDomicilioTracker = false;

    public boolean isTipoDomicilioSpecified() {
      return localTipoDomicilioTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoDomicilio() {
      return localTipoDomicilio;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoDomicilio
     */
    public void setTipoDomicilio(java.lang.String param) {
      localTipoDomicilioTracker = param != null;

      this.localTipoDomicilio = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":domicilio",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "domicilio", xmlWriter);
        }
      }
      if (localCodPostalTracker) {
        namespace = "";
        writeStartElement(null, namespace, "codPostal", xmlWriter);

        if (localCodPostal == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("codPostal cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCodPostal);
        }

        xmlWriter.writeEndElement();
      }
      if (localDatoAdicionalTracker) {
        namespace = "";
        writeStartElement(null, namespace, "datoAdicional", xmlWriter);

        if (localDatoAdicional == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("datoAdicional cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDatoAdicional);
        }

        xmlWriter.writeEndElement();
      }
      if (localDescripcionProvinciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionProvincia", xmlWriter);

        if (localDescripcionProvincia == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionProvincia cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionProvincia);
        }

        xmlWriter.writeEndElement();
      }
      if (localDireccionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "direccion", xmlWriter);

        if (localDireccion == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("direccion cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDireccion);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdProvinciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idProvincia", xmlWriter);

        if (localIdProvincia == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idProvincia cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdProvincia));
        }

        xmlWriter.writeEndElement();
      }
      if (localLocalidadTracker) {
        namespace = "";
        writeStartElement(null, namespace, "localidad", xmlWriter);

        if (localLocalidad == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLocalidad);
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoDatoAdicionalTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoDatoAdicional", xmlWriter);

        if (localTipoDatoAdicional == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoDatoAdicional cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoDatoAdicional);
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoDomicilioTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoDomicilio", xmlWriter);

        if (localTipoDomicilio == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoDomicilio cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoDomicilio);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Domicilio parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Domicilio object = new Domicilio();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"domicilio".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Domicilio) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "codPostal").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "codPostal" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCodPostal(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datoAdicional").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "datoAdicional" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDatoAdicional(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionProvincia")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionProvincia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionProvincia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "direccion").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "direccion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDireccion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idProvincia").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idProvincia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdProvincia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdProvincia(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "localidad").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "localidad" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLocalidad(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoDatoAdicional").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoDatoAdicional" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoDatoAdicional(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoDomicilio").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoDomicilio" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoDomicilio(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaListResponseE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersonaListResponse", "ns1");

    /** field for GetPersonaListResponse */
    protected GetPersonaListResponse localGetPersonaListResponse;

    /**
     * Auto generated getter method
     *
     * @return GetPersonaListResponse
     */
    public GetPersonaListResponse getGetPersonaListResponse() {
      return localGetPersonaListResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersonaListResponse
     */
    public void setGetPersonaListResponse(GetPersonaListResponse param) {

      this.localGetPersonaListResponse = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersonaListResponse == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "getPersonaListResponse cannot be null!");
      }
      localGetPersonaListResponse.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaListResponseE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaListResponseE object = new GetPersonaListResponseE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersonaListResponse")
                      .equals(reader.getName())) {

                object.setGetPersonaListResponse(GetPersonaListResponse.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class PersonaReturn implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = personaReturn
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DatosGenerales */
    protected DatosGenerales localDatosGenerales;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosGeneralesTracker = false;

    public boolean isDatosGeneralesSpecified() {
      return localDatosGeneralesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosGenerales
     */
    public DatosGenerales getDatosGenerales() {
      return localDatosGenerales;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosGenerales
     */
    public void setDatosGenerales(DatosGenerales param) {
      localDatosGeneralesTracker = param != null;

      this.localDatosGenerales = param;
    }

    /** field for DatosMonotributo */
    protected DatosMonotributo localDatosMonotributo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosMonotributoTracker = false;

    public boolean isDatosMonotributoSpecified() {
      return localDatosMonotributoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosMonotributo
     */
    public DatosMonotributo getDatosMonotributo() {
      return localDatosMonotributo;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosMonotributo
     */
    public void setDatosMonotributo(DatosMonotributo param) {
      localDatosMonotributoTracker = param != null;

      this.localDatosMonotributo = param;
    }

    /** field for DatosRegimenGeneral */
    protected DatosRegimenGeneral localDatosRegimenGeneral;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosRegimenGeneralTracker = false;

    public boolean isDatosRegimenGeneralSpecified() {
      return localDatosRegimenGeneralTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosRegimenGeneral
     */
    public DatosRegimenGeneral getDatosRegimenGeneral() {
      return localDatosRegimenGeneral;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosRegimenGeneral
     */
    public void setDatosRegimenGeneral(DatosRegimenGeneral param) {
      localDatosRegimenGeneralTracker = param != null;

      this.localDatosRegimenGeneral = param;
    }

    /** field for ErrorConstancia */
    protected ErrorConstancia localErrorConstancia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorConstanciaTracker = false;

    public boolean isErrorConstanciaSpecified() {
      return localErrorConstanciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorConstancia
     */
    public ErrorConstancia getErrorConstancia() {
      return localErrorConstancia;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorConstancia
     */
    public void setErrorConstancia(ErrorConstancia param) {
      localErrorConstanciaTracker = param != null;

      this.localErrorConstancia = param;
    }

    /** field for ErrorMonotributo */
    protected ErrorMonotributo localErrorMonotributo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorMonotributoTracker = false;

    public boolean isErrorMonotributoSpecified() {
      return localErrorMonotributoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorMonotributo
     */
    public ErrorMonotributo getErrorMonotributo() {
      return localErrorMonotributo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorMonotributo
     */
    public void setErrorMonotributo(ErrorMonotributo param) {
      localErrorMonotributoTracker = param != null;

      this.localErrorMonotributo = param;
    }

    /** field for ErrorRegimenGeneral */
    protected ErrorRegimenGeneral localErrorRegimenGeneral;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorRegimenGeneralTracker = false;

    public boolean isErrorRegimenGeneralSpecified() {
      return localErrorRegimenGeneralTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorRegimenGeneral
     */
    public ErrorRegimenGeneral getErrorRegimenGeneral() {
      return localErrorRegimenGeneral;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorRegimenGeneral
     */
    public void setErrorRegimenGeneral(ErrorRegimenGeneral param) {
      localErrorRegimenGeneralTracker = param != null;

      this.localErrorRegimenGeneral = param;
    }

    /** field for Metadata */
    protected Metadata localMetadata;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localMetadataTracker = false;

    public boolean isMetadataSpecified() {
      return localMetadataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Metadata
     */
    public Metadata getMetadata() {
      return localMetadata;
    }

    /**
     * Auto generated setter method
     *
     * @param param Metadata
     */
    public void setMetadata(Metadata param) {
      localMetadataTracker = param != null;

      this.localMetadata = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":personaReturn",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "personaReturn",
              xmlWriter);
        }
      }
      if (localDatosGeneralesTracker) {
        if (localDatosGenerales == null) {
          throw new org.apache.axis2.databinding.ADBException("datosGenerales cannot be null!!");
        }
        localDatosGenerales.serialize(
            new javax.xml.namespace.QName("", "datosGenerales"), xmlWriter);
      }
      if (localDatosMonotributoTracker) {
        if (localDatosMonotributo == null) {
          throw new org.apache.axis2.databinding.ADBException("datosMonotributo cannot be null!!");
        }
        localDatosMonotributo.serialize(
            new javax.xml.namespace.QName("", "datosMonotributo"), xmlWriter);
      }
      if (localDatosRegimenGeneralTracker) {
        if (localDatosRegimenGeneral == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "datosRegimenGeneral cannot be null!!");
        }
        localDatosRegimenGeneral.serialize(
            new javax.xml.namespace.QName("", "datosRegimenGeneral"), xmlWriter);
      }
      if (localErrorConstanciaTracker) {
        if (localErrorConstancia == null) {
          throw new org.apache.axis2.databinding.ADBException("errorConstancia cannot be null!!");
        }
        localErrorConstancia.serialize(
            new javax.xml.namespace.QName("", "errorConstancia"), xmlWriter);
      }
      if (localErrorMonotributoTracker) {
        if (localErrorMonotributo == null) {
          throw new org.apache.axis2.databinding.ADBException("errorMonotributo cannot be null!!");
        }
        localErrorMonotributo.serialize(
            new javax.xml.namespace.QName("", "errorMonotributo"), xmlWriter);
      }
      if (localErrorRegimenGeneralTracker) {
        if (localErrorRegimenGeneral == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "errorRegimenGeneral cannot be null!!");
        }
        localErrorRegimenGeneral.serialize(
            new javax.xml.namespace.QName("", "errorRegimenGeneral"), xmlWriter);
      }
      if (localMetadataTracker) {
        if (localMetadata == null) {
          throw new org.apache.axis2.databinding.ADBException("metadata cannot be null!!");
        }
        localMetadata.serialize(new javax.xml.namespace.QName("", "metadata"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static PersonaReturn parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        PersonaReturn object = new PersonaReturn();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"personaReturn".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (PersonaReturn) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosGenerales").equals(reader.getName())) {

            object.setDatosGenerales(DatosGenerales.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosMonotributo").equals(reader.getName())) {

            object.setDatosMonotributo(DatosMonotributo.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosRegimenGeneral")
                  .equals(reader.getName())) {

            object.setDatosRegimenGeneral(DatosRegimenGeneral.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorConstancia").equals(reader.getName())) {

            object.setErrorConstancia(ErrorConstancia.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorMonotributo").equals(reader.getName())) {

            object.setErrorMonotributo(ErrorMonotributo.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorRegimenGeneral")
                  .equals(reader.getName())) {

            object.setErrorRegimenGeneral(ErrorRegimenGeneral.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "metadata").equals(reader.getName())) {

            object.setMetadata(Metadata.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DummyResponse implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = dummyResponse
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for _return */
    protected DummyReturn local_return;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean local_returnTracker = false;

    public boolean is_returnSpecified() {
      return local_returnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DummyReturn
     */
    public DummyReturn get_return() {
      return local_return;
    }

    /**
     * Auto generated setter method
     *
     * @param param _return
     */
    public void set_return(DummyReturn param) {
      local_returnTracker = param != null;

      this.local_return = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":dummyResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "dummyResponse",
              xmlWriter);
        }
      }
      if (local_returnTracker) {
        if (local_return == null) {
          throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
        }
        local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DummyResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DummyResponse object = new DummyResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"dummyResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DummyResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "return").equals(reader.getName())) {

            object.set_return(DummyReturn.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaResponseE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersonaResponse", "ns1");

    /** field for GetPersonaResponse */
    protected GetPersonaResponse localGetPersonaResponse;

    /**
     * Auto generated getter method
     *
     * @return GetPersonaResponse
     */
    public GetPersonaResponse getGetPersonaResponse() {
      return localGetPersonaResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersonaResponse
     */
    public void setGetPersonaResponse(GetPersonaResponse param) {

      this.localGetPersonaResponse = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersonaResponse == null) {
        throw new org.apache.axis2.databinding.ADBException("getPersonaResponse cannot be null!");
      }
      localGetPersonaResponse.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaResponseE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaResponseE object = new GetPersonaResponseE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersonaResponse")
                      .equals(reader.getName())) {

                object.setGetPersonaResponse(GetPersonaResponse.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DatosMonotributo implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = datosMonotributo
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Actividad This was an Array! */
    protected Actividad[] localActividad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localActividadTracker = false;

    public boolean isActividadSpecified() {
      return localActividadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Actividad[]
     */
    public Actividad[] getActividad() {
      return localActividad;
    }

    /** validate the array for Actividad */
    protected void validateActividad(Actividad[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Actividad
     */
    public void setActividad(Actividad[] param) {

      validateActividad(param);

      localActividadTracker = true;

      this.localActividad = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Actividad
     */
    public void addActividad(Actividad param) {
      if (localActividad == null) {
        localActividad = new Actividad[] {};
      }

      // update the setting tracker
      localActividadTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localActividad);
      list.add(param);
      this.localActividad = (Actividad[]) list.toArray(new Actividad[list.size()]);
    }

    /** field for ActividadMonotributista */
    protected Actividad localActividadMonotributista;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localActividadMonotributistaTracker = false;

    public boolean isActividadMonotributistaSpecified() {
      return localActividadMonotributistaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Actividad
     */
    public Actividad getActividadMonotributista() {
      return localActividadMonotributista;
    }

    /**
     * Auto generated setter method
     *
     * @param param ActividadMonotributista
     */
    public void setActividadMonotributista(Actividad param) {
      localActividadMonotributistaTracker = param != null;

      this.localActividadMonotributista = param;
    }

    /** field for CategoriaMonotributo */
    protected Categoria localCategoriaMonotributo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localCategoriaMonotributoTracker = false;

    public boolean isCategoriaMonotributoSpecified() {
      return localCategoriaMonotributoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Categoria
     */
    public Categoria getCategoriaMonotributo() {
      return localCategoriaMonotributo;
    }

    /**
     * Auto generated setter method
     *
     * @param param CategoriaMonotributo
     */
    public void setCategoriaMonotributo(Categoria param) {
      localCategoriaMonotributoTracker = param != null;

      this.localCategoriaMonotributo = param;
    }

    /** field for ComponenteDeSociedad This was an Array! */
    protected Relacion[] localComponenteDeSociedad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localComponenteDeSociedadTracker = false;

    public boolean isComponenteDeSociedadSpecified() {
      return localComponenteDeSociedadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Relacion[]
     */
    public Relacion[] getComponenteDeSociedad() {
      return localComponenteDeSociedad;
    }

    /** validate the array for ComponenteDeSociedad */
    protected void validateComponenteDeSociedad(Relacion[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param ComponenteDeSociedad
     */
    public void setComponenteDeSociedad(Relacion[] param) {

      validateComponenteDeSociedad(param);

      localComponenteDeSociedadTracker = true;

      this.localComponenteDeSociedad = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Relacion
     */
    public void addComponenteDeSociedad(Relacion param) {
      if (localComponenteDeSociedad == null) {
        localComponenteDeSociedad = new Relacion[] {};
      }

      // update the setting tracker
      localComponenteDeSociedadTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localComponenteDeSociedad);
      list.add(param);
      this.localComponenteDeSociedad = (Relacion[]) list.toArray(new Relacion[list.size()]);
    }

    /** field for Impuesto This was an Array! */
    protected Impuesto[] localImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localImpuestoTracker = false;

    public boolean isImpuestoSpecified() {
      return localImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Impuesto[]
     */
    public Impuesto[] getImpuesto() {
      return localImpuesto;
    }

    /** validate the array for Impuesto */
    protected void validateImpuesto(Impuesto[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Impuesto
     */
    public void setImpuesto(Impuesto[] param) {

      validateImpuesto(param);

      localImpuestoTracker = true;

      this.localImpuesto = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Impuesto
     */
    public void addImpuesto(Impuesto param) {
      if (localImpuesto == null) {
        localImpuesto = new Impuesto[] {};
      }

      // update the setting tracker
      localImpuestoTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localImpuesto);
      list.add(param);
      this.localImpuesto = (Impuesto[]) list.toArray(new Impuesto[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":datosMonotributo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "datosMonotributo",
              xmlWriter);
        }
      }
      if (localActividadTracker) {
        if (localActividad != null) {
          for (int i = 0; i < localActividad.length; i++) {
            if (localActividad[i] != null) {
              localActividad[i].serialize(
                  new javax.xml.namespace.QName("", "actividad"), xmlWriter);
            } else {

              writeStartElement(null, "", "actividad", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "actividad", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localActividadMonotributistaTracker) {
        if (localActividadMonotributista == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "actividadMonotributista cannot be null!!");
        }
        localActividadMonotributista.serialize(
            new javax.xml.namespace.QName("", "actividadMonotributista"), xmlWriter);
      }
      if (localCategoriaMonotributoTracker) {
        if (localCategoriaMonotributo == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "categoriaMonotributo cannot be null!!");
        }
        localCategoriaMonotributo.serialize(
            new javax.xml.namespace.QName("", "categoriaMonotributo"), xmlWriter);
      }
      if (localComponenteDeSociedadTracker) {
        if (localComponenteDeSociedad != null) {
          for (int i = 0; i < localComponenteDeSociedad.length; i++) {
            if (localComponenteDeSociedad[i] != null) {
              localComponenteDeSociedad[i].serialize(
                  new javax.xml.namespace.QName("", "componenteDeSociedad"), xmlWriter);
            } else {

              writeStartElement(null, "", "componenteDeSociedad", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "componenteDeSociedad", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localImpuestoTracker) {
        if (localImpuesto != null) {
          for (int i = 0; i < localImpuesto.length; i++) {
            if (localImpuesto[i] != null) {
              localImpuesto[i].serialize(new javax.xml.namespace.QName("", "impuesto"), xmlWriter);
            } else {

              writeStartElement(null, "", "impuesto", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "impuesto", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DatosMonotributo parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DatosMonotributo object = new DatosMonotributo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"datosMonotributo".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DatosMonotributo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          java.util.ArrayList list4 = new java.util.ArrayList();

          java.util.ArrayList list5 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "actividad").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(Actividad.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("", "actividad").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(Actividad.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setActividad(
                (Actividad[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Actividad.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "actividadMonotributista")
                  .equals(reader.getName())) {

            object.setActividadMonotributista(Actividad.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "categoriaMonotributo")
                  .equals(reader.getName())) {

            object.setCategoriaMonotributo(Categoria.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "componenteDeSociedad")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list4.add(null);
              reader.next();
            } else {
              list4.add(Relacion.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone4 = false;
            while (!loopDone4) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone4 = true;
              } else {
                if (new javax.xml.namespace.QName("", "componenteDeSociedad")
                    .equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list4.add(null);
                    reader.next();
                  } else {
                    list4.add(Relacion.Factory.parse(reader));
                  }
                } else {
                  loopDone4 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setComponenteDeSociedad(
                (Relacion[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Relacion.class, list4));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "impuesto").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list5.add(null);
              reader.next();
            } else {
              list5.add(Impuesto.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone5 = false;
            while (!loopDone5) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone5 = true;
              } else {
                if (new javax.xml.namespace.QName("", "impuesto").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list5.add(null);
                    reader.next();
                  } else {
                    list5.add(Impuesto.Factory.parse(reader));
                  }
                } else {
                  loopDone5 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setImpuesto(
                (Impuesto[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Impuesto.class, list5));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaList_v2ResponseE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2Response", "ns1");

    /** field for GetPersonaList_v2Response */
    protected GetPersonaList_v2Response localGetPersonaList_v2Response;

    /**
     * Auto generated getter method
     *
     * @return GetPersonaList_v2Response
     */
    public GetPersonaList_v2Response getGetPersonaList_v2Response() {
      return localGetPersonaList_v2Response;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersonaList_v2Response
     */
    public void setGetPersonaList_v2Response(GetPersonaList_v2Response param) {

      this.localGetPersonaList_v2Response = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersonaList_v2Response == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "getPersonaList_v2Response cannot be null!");
      }
      localGetPersonaList_v2Response.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaList_v2ResponseE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaList_v2ResponseE object = new GetPersonaList_v2ResponseE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2Response")
                      .equals(reader.getName())) {

                object.setGetPersonaList_v2Response(
                    GetPersonaList_v2Response.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Dummy implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = dummy
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":dummy",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "dummy", xmlWriter);
        }
      }

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Dummy parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Dummy object = new Dummy();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"dummy".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Dummy) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DatosGenerales implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = datosGenerales
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Apellido */
    protected java.lang.String localApellido;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localApellidoTracker = false;

    public boolean isApellidoSpecified() {
      return localApellidoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApellido() {
      return localApellido;
    }

    /**
     * Auto generated setter method
     *
     * @param param Apellido
     */
    public void setApellido(java.lang.String param) {
      localApellidoTracker = param != null;

      this.localApellido = param;
    }

    /** field for Caracterizacion This was an Array! */
    protected Caracterizacion[] localCaracterizacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localCaracterizacionTracker = false;

    public boolean isCaracterizacionSpecified() {
      return localCaracterizacionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Caracterizacion[]
     */
    public Caracterizacion[] getCaracterizacion() {
      return localCaracterizacion;
    }

    /** validate the array for Caracterizacion */
    protected void validateCaracterizacion(Caracterizacion[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Caracterizacion
     */
    public void setCaracterizacion(Caracterizacion[] param) {

      validateCaracterizacion(param);

      localCaracterizacionTracker = true;

      this.localCaracterizacion = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Caracterizacion
     */
    public void addCaracterizacion(Caracterizacion param) {
      if (localCaracterizacion == null) {
        localCaracterizacion = new Caracterizacion[] {};
      }

      // update the setting tracker
      localCaracterizacionTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localCaracterizacion);
      list.add(param);
      this.localCaracterizacion = (Caracterizacion[]) list.toArray(new Caracterizacion[list.size()]);
    }

    /** field for Dependencia */
    protected Dependencia localDependencia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDependenciaTracker = false;

    public boolean isDependenciaSpecified() {
      return localDependenciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Dependencia
     */
    public Dependencia getDependencia() {
      return localDependencia;
    }

    /**
     * Auto generated setter method
     *
     * @param param Dependencia
     */
    public void setDependencia(Dependencia param) {
      localDependenciaTracker = param != null;

      this.localDependencia = param;
    }

    /** field for DomicilioFiscal */
    protected Domicilio localDomicilioFiscal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDomicilioFiscalTracker = false;

    public boolean isDomicilioFiscalSpecified() {
      return localDomicilioFiscalTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Domicilio
     */
    public Domicilio getDomicilioFiscal() {
      return localDomicilioFiscal;
    }

    /**
     * Auto generated setter method
     *
     * @param param DomicilioFiscal
     */
    public void setDomicilioFiscal(Domicilio param) {
      localDomicilioFiscalTracker = param != null;

      this.localDomicilioFiscal = param;
    }

    /** field for EsSucesion */
    protected java.lang.String localEsSucesion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localEsSucesionTracker = false;

    public boolean isEsSucesionSpecified() {
      return localEsSucesionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEsSucesion() {
      return localEsSucesion;
    }

    /**
     * Auto generated setter method
     *
     * @param param EsSucesion
     */
    public void setEsSucesion(java.lang.String param) {
      localEsSucesionTracker = param != null;

      this.localEsSucesion = param;
    }

    /** field for EstadoClave */
    protected java.lang.String localEstadoClave;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localEstadoClaveTracker = false;

    public boolean isEstadoClaveSpecified() {
      return localEstadoClaveTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEstadoClave() {
      return localEstadoClave;
    }

    /**
     * Auto generated setter method
     *
     * @param param EstadoClave
     */
    public void setEstadoClave(java.lang.String param) {
      localEstadoClaveTracker = param != null;

      this.localEstadoClave = param;
    }

    /** field for FechaContratoSocial */
    protected java.util.Calendar localFechaContratoSocial;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localFechaContratoSocialTracker = false;

    public boolean isFechaContratoSocialSpecified() {
      return localFechaContratoSocialTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaContratoSocial() {
      return localFechaContratoSocial;
    }

    /**
     * Auto generated setter method
     *
     * @param param FechaContratoSocial
     */
    public void setFechaContratoSocial(java.util.Calendar param) {
      localFechaContratoSocialTracker = param != null;

      this.localFechaContratoSocial = param;
    }

    /** field for FechaFallecimiento */
    protected java.util.Calendar localFechaFallecimiento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localFechaFallecimientoTracker = false;

    public boolean isFechaFallecimientoSpecified() {
      return localFechaFallecimientoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaFallecimiento() {
      return localFechaFallecimiento;
    }

    /**
     * Auto generated setter method
     *
     * @param param FechaFallecimiento
     */
    public void setFechaFallecimiento(java.util.Calendar param) {
      localFechaFallecimientoTracker = param != null;

      this.localFechaFallecimiento = param;
    }

    /** field for IdPersona */
    protected long localIdPersona;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdPersonaTracker = false;

    public boolean isIdPersonaSpecified() {
      return localIdPersonaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdPersona() {
      return localIdPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long param) {

      // setting primitive attribute tracker to true
      localIdPersonaTracker = param != java.lang.Long.MIN_VALUE;

      this.localIdPersona = param;
    }

    /** field for MesCierre */
    protected int localMesCierre;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localMesCierreTracker = false;

    public boolean isMesCierreSpecified() {
      return localMesCierreTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMesCierre() {
      return localMesCierre;
    }

    /**
     * Auto generated setter method
     *
     * @param param MesCierre
     */
    public void setMesCierre(int param) {

      // setting primitive attribute tracker to true
      localMesCierreTracker = param != java.lang.Integer.MIN_VALUE;

      this.localMesCierre = param;
    }

    /** field for Nombre */
    protected java.lang.String localNombre;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localNombreTracker = false;

    public boolean isNombreSpecified() {
      return localNombreTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNombre() {
      return localNombre;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nombre
     */
    public void setNombre(java.lang.String param) {
      localNombreTracker = param != null;

      this.localNombre = param;
    }

    /** field for RazonSocial */
    protected java.lang.String localRazonSocial;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localRazonSocialTracker = false;

    public boolean isRazonSocialSpecified() {
      return localRazonSocialTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRazonSocial() {
      return localRazonSocial;
    }

    /**
     * Auto generated setter method
     *
     * @param param RazonSocial
     */
    public void setRazonSocial(java.lang.String param) {
      localRazonSocialTracker = param != null;

      this.localRazonSocial = param;
    }

    /** field for TipoClave */
    protected java.lang.String localTipoClave;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoClaveTracker = false;

    public boolean isTipoClaveSpecified() {
      return localTipoClaveTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoClave() {
      return localTipoClave;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoClave
     */
    public void setTipoClave(java.lang.String param) {
      localTipoClaveTracker = param != null;

      this.localTipoClave = param;
    }

    /** field for TipoPersona */
    protected java.lang.String localTipoPersona;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoPersonaTracker = false;

    public boolean isTipoPersonaSpecified() {
      return localTipoPersonaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoPersona() {
      return localTipoPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoPersona
     */
    public void setTipoPersona(java.lang.String param) {
      localTipoPersonaTracker = param != null;

      this.localTipoPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":datosGenerales",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "datosGenerales",
              xmlWriter);
        }
      }
      if (localApellidoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "apellido", xmlWriter);

        if (localApellido == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("apellido cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApellido);
        }

        xmlWriter.writeEndElement();
      }
      if (localCaracterizacionTracker) {
        if (localCaracterizacion != null) {
          for (int i = 0; i < localCaracterizacion.length; i++) {
            if (localCaracterizacion[i] != null) {
              localCaracterizacion[i].serialize(
                  new javax.xml.namespace.QName("", "caracterizacion"), xmlWriter);
            } else {

              writeStartElement(null, "", "caracterizacion", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "caracterizacion", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localDependenciaTracker) {
        if (localDependencia == null) {
          throw new org.apache.axis2.databinding.ADBException("dependencia cannot be null!!");
        }
        localDependencia.serialize(new javax.xml.namespace.QName("", "dependencia"), xmlWriter);
      }
      if (localDomicilioFiscalTracker) {
        if (localDomicilioFiscal == null) {
          throw new org.apache.axis2.databinding.ADBException("domicilioFiscal cannot be null!!");
        }
        localDomicilioFiscal.serialize(
            new javax.xml.namespace.QName("", "domicilioFiscal"), xmlWriter);
      }
      if (localEsSucesionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "esSucesion", xmlWriter);

        if (localEsSucesion == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("esSucesion cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEsSucesion);
        }

        xmlWriter.writeEndElement();
      }
      if (localEstadoClaveTracker) {
        namespace = "";
        writeStartElement(null, namespace, "estadoClave", xmlWriter);

        if (localEstadoClave == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("estadoClave cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEstadoClave);
        }

        xmlWriter.writeEndElement();
      }
      if (localFechaContratoSocialTracker) {
        namespace = "";
        writeStartElement(null, namespace, "fechaContratoSocial", xmlWriter);

        if (localFechaContratoSocial == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "fechaContratoSocial cannot be null!!");

        } else {

          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localFechaContratoSocial));
        }

        xmlWriter.writeEndElement();
      }
      if (localFechaFallecimientoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "fechaFallecimiento", xmlWriter);

        if (localFechaFallecimiento == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "fechaFallecimiento cannot be null!!");

        } else {

          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localFechaFallecimiento));
        }

        xmlWriter.writeEndElement();
      }
      if (localIdPersonaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idPersona", xmlWriter);

        if (localIdPersona == java.lang.Long.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPersona));
        }

        xmlWriter.writeEndElement();
      }
      if (localMesCierreTracker) {
        namespace = "";
        writeStartElement(null, namespace, "mesCierre", xmlWriter);

        if (localMesCierre == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("mesCierre cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMesCierre));
        }

        xmlWriter.writeEndElement();
      }
      if (localNombreTracker) {
        namespace = "";
        writeStartElement(null, namespace, "nombre", xmlWriter);

        if (localNombre == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNombre);
        }

        xmlWriter.writeEndElement();
      }
      if (localRazonSocialTracker) {
        namespace = "";
        writeStartElement(null, namespace, "razonSocial", xmlWriter);

        if (localRazonSocial == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("razonSocial cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRazonSocial);
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoClaveTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoClave", xmlWriter);

        if (localTipoClave == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoClave cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoClave);
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoPersonaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoPersona", xmlWriter);

        if (localTipoPersona == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoPersona cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoPersona);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DatosGenerales parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DatosGenerales object = new DatosGenerales();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"datosGenerales".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DatosGenerales) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list2 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "apellido").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "apellido" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApellido(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "caracterizacion").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list2.add(null);
              reader.next();
            } else {
              list2.add(Caracterizacion.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone2 = false;
            while (!loopDone2) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone2 = true;
              } else {
                if (new javax.xml.namespace.QName("", "caracterizacion").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list2.add(null);
                    reader.next();
                  } else {
                    list2.add(Caracterizacion.Factory.parse(reader));
                  }
                } else {
                  loopDone2 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setCaracterizacion(
                (Caracterizacion[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Caracterizacion.class, list2));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "dependencia").equals(reader.getName())) {

            object.setDependencia(Dependencia.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "domicilioFiscal").equals(reader.getName())) {

            object.setDomicilioFiscal(Domicilio.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "esSucesion").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "esSucesion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEsSucesion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "estadoClave").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "estadoClave" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEstadoClave(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "fechaContratoSocial")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "fechaContratoSocial" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFechaContratoSocial(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "fechaFallecimiento").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "fechaFallecimiento" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFechaFallecimiento(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idPersona" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdPersona(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdPersona(java.lang.Long.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "mesCierre").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "mesCierre" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMesCierre(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setMesCierre(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "nombre").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "nombre" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNombre(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "razonSocial").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "razonSocial" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRazonSocial(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoClave").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoClave" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoClave(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoPersona").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoPersona" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoPersona(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Actividad implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = actividad
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DescripcionActividad */
    protected java.lang.String localDescripcionActividad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionActividadTracker = false;

    public boolean isDescripcionActividadSpecified() {
      return localDescripcionActividadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionActividad() {
      return localDescripcionActividad;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionActividad
     */
    public void setDescripcionActividad(java.lang.String param) {
      localDescripcionActividadTracker = param != null;

      this.localDescripcionActividad = param;
    }

    /** field for IdActividad */
    protected long localIdActividad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdActividadTracker = false;

    public boolean isIdActividadSpecified() {
      return localIdActividadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdActividad() {
      return localIdActividad;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdActividad
     */
    public void setIdActividad(long param) {

      // setting primitive attribute tracker to true
      localIdActividadTracker = param != java.lang.Long.MIN_VALUE;

      this.localIdActividad = param;
    }

    /** field for Nomenclador */
    protected int localNomenclador;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localNomencladorTracker = false;

    public boolean isNomencladorSpecified() {
      return localNomencladorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getNomenclador() {
      return localNomenclador;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nomenclador
     */
    public void setNomenclador(int param) {

      // setting primitive attribute tracker to true
      localNomencladorTracker = param != java.lang.Integer.MIN_VALUE;

      this.localNomenclador = param;
    }

    /** field for Orden */
    protected int localOrden;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localOrdenTracker = false;

    public boolean isOrdenSpecified() {
      return localOrdenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getOrden() {
      return localOrden;
    }

    /**
     * Auto generated setter method
     *
     * @param param Orden
     */
    public void setOrden(int param) {

      // setting primitive attribute tracker to true
      localOrdenTracker = param != java.lang.Integer.MIN_VALUE;

      this.localOrden = param;
    }

    /** field for Periodo */
    protected int localPeriodo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPeriodoTracker = false;

    public boolean isPeriodoSpecified() {
      return localPeriodoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPeriodo() {
      return localPeriodo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Periodo
     */
    public void setPeriodo(int param) {

      // setting primitive attribute tracker to true
      localPeriodoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localPeriodo = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":actividad",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "actividad", xmlWriter);
        }
      }
      if (localDescripcionActividadTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionActividad", xmlWriter);

        if (localDescripcionActividad == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionActividad cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionActividad);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdActividadTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idActividad", xmlWriter);

        if (localIdActividad == java.lang.Long.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idActividad cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdActividad));
        }

        xmlWriter.writeEndElement();
      }
      if (localNomencladorTracker) {
        namespace = "";
        writeStartElement(null, namespace, "nomenclador", xmlWriter);

        if (localNomenclador == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("nomenclador cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomenclador));
        }

        xmlWriter.writeEndElement();
      }
      if (localOrdenTracker) {
        namespace = "";
        writeStartElement(null, namespace, "orden", xmlWriter);

        if (localOrden == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("orden cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrden));
        }

        xmlWriter.writeEndElement();
      }
      if (localPeriodoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "periodo", xmlWriter);

        if (localPeriodo == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("periodo cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPeriodo));
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Actividad parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Actividad object = new Actividad();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"actividad".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Actividad) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionActividad")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionActividad" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionActividad(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idActividad").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idActividad" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdActividad(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdActividad(java.lang.Long.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "nomenclador").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "nomenclador" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNomenclador(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setNomenclador(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "orden").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "orden" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setOrden(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setOrden(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "periodo").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "periodo" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPeriodo(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setPeriodo(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ErrorRegimenGeneral implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = errorRegimenGeneral
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Error This was an Array! */
    protected java.lang.String[] localError;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorTracker = false;

    public boolean isErrorSpecified() {
      return localErrorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String[]
     */
    public java.lang.String[] getError() {
      return localError;
    }

    /** validate the array for Error */
    protected void validateError(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Error
     */
    public void setError(java.lang.String[] param) {

      validateError(param);

      localErrorTracker = true;

      this.localError = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param java.lang.String
     */
    public void addError(java.lang.String param) {
      if (localError == null) {
        localError = new java.lang.String[] {};
      }

      // update the setting tracker
      localErrorTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localError);
      list.add(param);
      this.localError = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    /** field for Mensaje */
    protected java.lang.String localMensaje;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localMensajeTracker = false;

    public boolean isMensajeSpecified() {
      return localMensajeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMensaje() {
      return localMensaje;
    }

    /**
     * Auto generated setter method
     *
     * @param param Mensaje
     */
    public void setMensaje(java.lang.String param) {
      localMensajeTracker = param != null;

      this.localMensaje = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":errorRegimenGeneral",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "errorRegimenGeneral",
              xmlWriter);
        }
      }
      if (localErrorTracker) {
        if (localError != null) {
          namespace = "";
          for (int i = 0; i < localError.length; i++) {

            if (localError[i] != null) {

              writeStartElement(null, namespace, "error", xmlWriter);

              xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localError[i]));

              xmlWriter.writeEndElement();

            } else {

              // write null attribute
              namespace = "";
              writeStartElement(null, namespace, "error", xmlWriter);
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          // write the null attribute
          // write null attribute
          writeStartElement(null, "", "error", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localMensajeTracker) {
        namespace = "";
        writeStartElement(null, namespace, "mensaje", xmlWriter);

        if (localMensaje == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMensaje);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static ErrorRegimenGeneral parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        ErrorRegimenGeneral object = new ErrorRegimenGeneral();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"errorRegimenGeneral".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ErrorRegimenGeneral) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);

              reader.next();
            } else {
              list1.add(reader.getElementText());
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // Ensure we are at the EndElement
              while (!reader.isEndElement()) {
                reader.next();
              }
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);

                    reader.next();
                  } else {
                    list1.add(reader.getElementText());
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setError((java.lang.String[]) list1.toArray(new java.lang.String[list1.size()]));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "mensaje").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "mensaje" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMensaje(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersona implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersona
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Token */
    protected java.lang.String localToken;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getToken() {
      return localToken;
    }

    /**
     * Auto generated setter method
     *
     * @param param Token
     */
    public void setToken(java.lang.String param) {

      this.localToken = param;
    }

    /** field for Sign */
    protected java.lang.String localSign;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSign() {
      return localSign;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sign
     */
    public void setSign(java.lang.String param) {

      this.localSign = param;
    }

    /** field for CuitRepresentada */
    protected long localCuitRepresentada;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCuitRepresentada() {
      return localCuitRepresentada;
    }

    /**
     * Auto generated setter method
     *
     * @param param CuitRepresentada
     */
    public void setCuitRepresentada(long param) {

      this.localCuitRepresentada = param;
    }

    /** field for IdPersona */
    protected long localIdPersona;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdPersona() {
      return localIdPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long param) {

      this.localIdPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersona",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getPersona", xmlWriter);
        }
      }

      namespace = "";
      writeStartElement(null, namespace, "token", xmlWriter);

      if (localToken == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("token cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localToken);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "sign", xmlWriter);

      if (localSign == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sign cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSign);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "cuitRepresentada", xmlWriter);

      if (localCuitRepresentada == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cuitRepresentada cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCuitRepresentada));
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "idPersona", xmlWriter);

      if (localIdPersona == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPersona));
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersona parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersona object = new GetPersona();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersona".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersona) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "token").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setToken(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "sign").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "sign" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSign(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "cuitRepresentada").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "cuitRepresentada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCuitRepresentada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idPersona" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdPersona(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaResponse implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersonaResponse
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for PersonaReturn */
    protected PersonaReturn localPersonaReturn;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPersonaReturnTracker = false;

    public boolean isPersonaReturnSpecified() {
      return localPersonaReturnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return PersonaReturn
     */
    public PersonaReturn getPersonaReturn() {
      return localPersonaReturn;
    }

    /**
     * Auto generated setter method
     *
     * @param param PersonaReturn
     */
    public void setPersonaReturn(PersonaReturn param) {
      localPersonaReturnTracker = param != null;

      this.localPersonaReturn = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersonaResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersonaResponse",
              xmlWriter);
        }
      }
      if (localPersonaReturnTracker) {
        if (localPersonaReturn == null) {
          throw new org.apache.axis2.databinding.ADBException("personaReturn cannot be null!!");
        }
        localPersonaReturn.serialize(new javax.xml.namespace.QName("", "personaReturn"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaResponse object = new GetPersonaResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersonaResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersonaResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "personaReturn").equals(reader.getName())) {

            object.setPersonaReturn(PersonaReturn.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Regimen implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = regimen
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DescripcionRegimen */
    protected java.lang.String localDescripcionRegimen;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionRegimenTracker = false;

    public boolean isDescripcionRegimenSpecified() {
      return localDescripcionRegimenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionRegimen() {
      return localDescripcionRegimen;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionRegimen
     */
    public void setDescripcionRegimen(java.lang.String param) {
      localDescripcionRegimenTracker = param != null;

      this.localDescripcionRegimen = param;
    }

    /** field for IdImpuesto */
    protected int localIdImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdImpuestoTracker = false;

    public boolean isIdImpuestoSpecified() {
      return localIdImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdImpuesto() {
      return localIdImpuesto;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdImpuesto
     */
    public void setIdImpuesto(int param) {

      // setting primitive attribute tracker to true
      localIdImpuestoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdImpuesto = param;
    }

    /** field for IdRegimen */
    protected int localIdRegimen;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdRegimenTracker = false;

    public boolean isIdRegimenSpecified() {
      return localIdRegimenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdRegimen() {
      return localIdRegimen;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdRegimen
     */
    public void setIdRegimen(int param) {

      // setting primitive attribute tracker to true
      localIdRegimenTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdRegimen = param;
    }

    /** field for Periodo */
    protected int localPeriodo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPeriodoTracker = false;

    public boolean isPeriodoSpecified() {
      return localPeriodoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPeriodo() {
      return localPeriodo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Periodo
     */
    public void setPeriodo(int param) {

      // setting primitive attribute tracker to true
      localPeriodoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localPeriodo = param;
    }

    /** field for TipoRegimen */
    protected java.lang.String localTipoRegimen;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoRegimenTracker = false;

    public boolean isTipoRegimenSpecified() {
      return localTipoRegimenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoRegimen() {
      return localTipoRegimen;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoRegimen
     */
    public void setTipoRegimen(java.lang.String param) {
      localTipoRegimenTracker = param != null;

      this.localTipoRegimen = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":regimen",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "regimen", xmlWriter);
        }
      }
      if (localDescripcionRegimenTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionRegimen", xmlWriter);

        if (localDescripcionRegimen == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionRegimen cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionRegimen);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdImpuestoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idImpuesto", xmlWriter);

        if (localIdImpuesto == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idImpuesto cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdImpuesto));
        }

        xmlWriter.writeEndElement();
      }
      if (localIdRegimenTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idRegimen", xmlWriter);

        if (localIdRegimen == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idRegimen cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdRegimen));
        }

        xmlWriter.writeEndElement();
      }
      if (localPeriodoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "periodo", xmlWriter);

        if (localPeriodo == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("periodo cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPeriodo));
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoRegimenTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoRegimen", xmlWriter);

        if (localTipoRegimen == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoRegimen cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoRegimen);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Regimen parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Regimen object = new Regimen();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"regimen".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Regimen) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionRegimen").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionRegimen" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionRegimen(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idImpuesto").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idImpuesto" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdImpuesto(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdImpuesto(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idRegimen").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idRegimen" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdRegimen(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdRegimen(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "periodo").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "periodo" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPeriodo(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setPeriodo(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoRegimen").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoRegimen" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoRegimen(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Dependencia implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = dependencia
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for CodPostal */
    protected java.lang.String localCodPostal;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localCodPostalTracker = false;

    public boolean isCodPostalSpecified() {
      return localCodPostalTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCodPostal() {
      return localCodPostal;
    }

    /**
     * Auto generated setter method
     *
     * @param param CodPostal
     */
    public void setCodPostal(java.lang.String param) {
      localCodPostalTracker = param != null;

      this.localCodPostal = param;
    }

    /** field for DescripcionDependencia */
    protected java.lang.String localDescripcionDependencia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionDependenciaTracker = false;

    public boolean isDescripcionDependenciaSpecified() {
      return localDescripcionDependenciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionDependencia() {
      return localDescripcionDependencia;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionDependencia
     */
    public void setDescripcionDependencia(java.lang.String param) {
      localDescripcionDependenciaTracker = param != null;

      this.localDescripcionDependencia = param;
    }

    /** field for DescripcionProvincia */
    protected java.lang.String localDescripcionProvincia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionProvinciaTracker = false;

    public boolean isDescripcionProvinciaSpecified() {
      return localDescripcionProvinciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionProvincia() {
      return localDescripcionProvincia;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionProvincia
     */
    public void setDescripcionProvincia(java.lang.String param) {
      localDescripcionProvinciaTracker = param != null;

      this.localDescripcionProvincia = param;
    }

    /** field for Direccion */
    protected java.lang.String localDireccion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDireccionTracker = false;

    public boolean isDireccionSpecified() {
      return localDireccionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDireccion() {
      return localDireccion;
    }

    /**
     * Auto generated setter method
     *
     * @param param Direccion
     */
    public void setDireccion(java.lang.String param) {
      localDireccionTracker = param != null;

      this.localDireccion = param;
    }

    /** field for IdDependencia */
    protected int localIdDependencia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdDependenciaTracker = false;

    public boolean isIdDependenciaSpecified() {
      return localIdDependenciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdDependencia() {
      return localIdDependencia;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdDependencia
     */
    public void setIdDependencia(int param) {

      // setting primitive attribute tracker to true
      localIdDependenciaTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdDependencia = param;
    }

    /** field for IdProvincia */
    protected int localIdProvincia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdProvinciaTracker = false;

    public boolean isIdProvinciaSpecified() {
      return localIdProvinciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdProvincia() {
      return localIdProvincia;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdProvincia
     */
    public void setIdProvincia(int param) {

      // setting primitive attribute tracker to true
      localIdProvinciaTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdProvincia = param;
    }

    /** field for Localidad */
    protected java.lang.String localLocalidad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localLocalidadTracker = false;

    public boolean isLocalidadSpecified() {
      return localLocalidadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocalidad() {
      return localLocalidad;
    }

    /**
     * Auto generated setter method
     *
     * @param param Localidad
     */
    public void setLocalidad(java.lang.String param) {
      localLocalidadTracker = param != null;

      this.localLocalidad = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":dependencia",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "dependencia", xmlWriter);
        }
      }
      if (localCodPostalTracker) {
        namespace = "";
        writeStartElement(null, namespace, "codPostal", xmlWriter);

        if (localCodPostal == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("codPostal cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCodPostal);
        }

        xmlWriter.writeEndElement();
      }
      if (localDescripcionDependenciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionDependencia", xmlWriter);

        if (localDescripcionDependencia == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionDependencia cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionDependencia);
        }

        xmlWriter.writeEndElement();
      }
      if (localDescripcionProvinciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionProvincia", xmlWriter);

        if (localDescripcionProvincia == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionProvincia cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionProvincia);
        }

        xmlWriter.writeEndElement();
      }
      if (localDireccionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "direccion", xmlWriter);

        if (localDireccion == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("direccion cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDireccion);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdDependenciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idDependencia", xmlWriter);

        if (localIdDependencia == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idDependencia cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdDependencia));
        }

        xmlWriter.writeEndElement();
      }
      if (localIdProvinciaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idProvincia", xmlWriter);

        if (localIdProvincia == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idProvincia cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdProvincia));
        }

        xmlWriter.writeEndElement();
      }
      if (localLocalidadTracker) {
        namespace = "";
        writeStartElement(null, namespace, "localidad", xmlWriter);

        if (localLocalidad == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLocalidad);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Dependencia parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Dependencia object = new Dependencia();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"dependencia".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Dependencia) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "codPostal").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "codPostal" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCodPostal(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionDependencia")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionDependencia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionDependencia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionProvincia")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionProvincia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionProvincia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "direccion").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "direccion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDireccion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idDependencia").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idDependencia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdDependencia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdDependencia(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idProvincia").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idProvincia" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdProvincia(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdProvincia(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "localidad").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "localidad" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLocalidad(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaList_v2Response implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersonaList_v2Response
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for PersonaListReturn */
    protected PersonaListReturn localPersonaListReturn;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPersonaListReturnTracker = false;

    public boolean isPersonaListReturnSpecified() {
      return localPersonaListReturnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return PersonaListReturn
     */
    public PersonaListReturn getPersonaListReturn() {
      return localPersonaListReturn;
    }

    /**
     * Auto generated setter method
     *
     * @param param PersonaListReturn
     */
    public void setPersonaListReturn(PersonaListReturn param) {
      localPersonaListReturnTracker = param != null;

      this.localPersonaListReturn = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersonaList_v2Response",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersonaList_v2Response",
              xmlWriter);
        }
      }
      if (localPersonaListReturnTracker) {
        if (localPersonaListReturn == null) {
          throw new org.apache.axis2.databinding.ADBException("personaListReturn cannot be null!!");
        }
        localPersonaListReturn.serialize(
            new javax.xml.namespace.QName("", "personaListReturn"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaList_v2Response parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaList_v2Response object = new GetPersonaList_v2Response();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersonaList_v2Response".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersonaList_v2Response) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "personaListReturn").equals(reader.getName())) {

            object.setPersonaListReturn(PersonaListReturn.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersona_v2E implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersona_v2", "ns1");

    /** field for GetPersona_v2 */
    protected GetPersona_v2 localGetPersona_v2;

    /**
     * Auto generated getter method
     *
     * @return GetPersona_v2
     */
    public GetPersona_v2 getGetPersona_v2() {
      return localGetPersona_v2;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersona_v2
     */
    public void setGetPersona_v2(GetPersona_v2 param) {

      this.localGetPersona_v2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersona_v2 == null) {
        throw new org.apache.axis2.databinding.ADBException("getPersona_v2 cannot be null!");
      }
      localGetPersona_v2.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersona_v2E parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersona_v2E object = new GetPersona_v2E();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersona_v2")
                      .equals(reader.getName())) {

                object.setGetPersona_v2(GetPersona_v2.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SRValidationExceptionE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "SRValidationException", "ns1");

    /** field for SRValidationException */
    protected SRValidationException localSRValidationException;

    /**
     * Auto generated getter method
     *
     * @return SRValidationException
     */
    public SRValidationException getSRValidationException() {
      return localSRValidationException;
    }

    /**
     * Auto generated setter method
     *
     * @param param SRValidationException
     */
    public void setSRValidationException(SRValidationException param) {

      this.localSRValidationException = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localSRValidationException == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "SRValidationException cannot be null!");
      }
      localSRValidationException.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static SRValidationExceptionE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        SRValidationExceptionE object = new SRValidationExceptionE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "SRValidationException")
                      .equals(reader.getName())) {

                object.setSRValidationException(SRValidationException.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Impuesto implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = impuesto
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DescripcionImpuesto */
    protected java.lang.String localDescripcionImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionImpuestoTracker = false;

    public boolean isDescripcionImpuestoSpecified() {
      return localDescripcionImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionImpuesto() {
      return localDescripcionImpuesto;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionImpuesto
     */
    public void setDescripcionImpuesto(java.lang.String param) {
      localDescripcionImpuestoTracker = param != null;

      this.localDescripcionImpuesto = param;
    }

    /** field for IdImpuesto */
    protected int localIdImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdImpuestoTracker = false;

    public boolean isIdImpuestoSpecified() {
      return localIdImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdImpuesto() {
      return localIdImpuesto;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdImpuesto
     */
    public void setIdImpuesto(int param) {

      // setting primitive attribute tracker to true
      localIdImpuestoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdImpuesto = param;
    }

    /** field for Periodo */
    protected int localPeriodo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPeriodoTracker = false;

    public boolean isPeriodoSpecified() {
      return localPeriodoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPeriodo() {
      return localPeriodo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Periodo
     */
    public void setPeriodo(int param) {

      // setting primitive attribute tracker to true
      localPeriodoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localPeriodo = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":impuesto",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "impuesto", xmlWriter);
        }
      }
      if (localDescripcionImpuestoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionImpuesto", xmlWriter);

        if (localDescripcionImpuesto == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionImpuesto cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionImpuesto);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdImpuestoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idImpuesto", xmlWriter);

        if (localIdImpuesto == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idImpuesto cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdImpuesto));
        }

        xmlWriter.writeEndElement();
      }
      if (localPeriodoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "periodo", xmlWriter);

        if (localPeriodo == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("periodo cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPeriodo));
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Impuesto parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Impuesto object = new Impuesto();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"impuesto".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Impuesto) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionImpuesto")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionImpuesto" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionImpuesto(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idImpuesto").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idImpuesto" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdImpuesto(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdImpuesto(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "periodo").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "periodo" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPeriodo(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setPeriodo(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DatosRegimenGeneral implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = datosRegimenGeneral
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Actividad This was an Array! */
    protected Actividad[] localActividad;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localActividadTracker = false;

    public boolean isActividadSpecified() {
      return localActividadTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Actividad[]
     */
    public Actividad[] getActividad() {
      return localActividad;
    }

    /** validate the array for Actividad */
    protected void validateActividad(Actividad[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Actividad
     */
    public void setActividad(Actividad[] param) {

      validateActividad(param);

      localActividadTracker = true;

      this.localActividad = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Actividad
     */
    public void addActividad(Actividad param) {
      if (localActividad == null) {
        localActividad = new Actividad[] {};
      }

      // update the setting tracker
      localActividadTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localActividad);
      list.add(param);
      this.localActividad = (Actividad[]) list.toArray(new Actividad[list.size()]);
    }

    /** field for CategoriaAutonomo */
    protected Categoria localCategoriaAutonomo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localCategoriaAutonomoTracker = false;

    public boolean isCategoriaAutonomoSpecified() {
      return localCategoriaAutonomoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Categoria
     */
    public Categoria getCategoriaAutonomo() {
      return localCategoriaAutonomo;
    }

    /**
     * Auto generated setter method
     *
     * @param param CategoriaAutonomo
     */
    public void setCategoriaAutonomo(Categoria param) {
      localCategoriaAutonomoTracker = param != null;

      this.localCategoriaAutonomo = param;
    }

    /** field for Impuesto This was an Array! */
    protected Impuesto[] localImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localImpuestoTracker = false;

    public boolean isImpuestoSpecified() {
      return localImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Impuesto[]
     */
    public Impuesto[] getImpuesto() {
      return localImpuesto;
    }

    /** validate the array for Impuesto */
    protected void validateImpuesto(Impuesto[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Impuesto
     */
    public void setImpuesto(Impuesto[] param) {

      validateImpuesto(param);

      localImpuestoTracker = true;

      this.localImpuesto = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Impuesto
     */
    public void addImpuesto(Impuesto param) {
      if (localImpuesto == null) {
        localImpuesto = new Impuesto[] {};
      }

      // update the setting tracker
      localImpuestoTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localImpuesto);
      list.add(param);
      this.localImpuesto = (Impuesto[]) list.toArray(new Impuesto[list.size()]);
    }

    /** field for Regimen This was an Array! */
    protected Regimen[] localRegimen;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localRegimenTracker = false;

    public boolean isRegimenSpecified() {
      return localRegimenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Regimen[]
     */
    public Regimen[] getRegimen() {
      return localRegimen;
    }

    /** validate the array for Regimen */
    protected void validateRegimen(Regimen[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Regimen
     */
    public void setRegimen(Regimen[] param) {

      validateRegimen(param);

      localRegimenTracker = true;

      this.localRegimen = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Regimen
     */
    public void addRegimen(Regimen param) {
      if (localRegimen == null) {
        localRegimen = new Regimen[] {};
      }

      // update the setting tracker
      localRegimenTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRegimen);
      list.add(param);
      this.localRegimen = (Regimen[]) list.toArray(new Regimen[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":datosRegimenGeneral",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "datosRegimenGeneral",
              xmlWriter);
        }
      }
      if (localActividadTracker) {
        if (localActividad != null) {
          for (int i = 0; i < localActividad.length; i++) {
            if (localActividad[i] != null) {
              localActividad[i].serialize(
                  new javax.xml.namespace.QName("", "actividad"), xmlWriter);
            } else {

              writeStartElement(null, "", "actividad", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "actividad", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localCategoriaAutonomoTracker) {
        if (localCategoriaAutonomo == null) {
          throw new org.apache.axis2.databinding.ADBException("categoriaAutonomo cannot be null!!");
        }
        localCategoriaAutonomo.serialize(
            new javax.xml.namespace.QName("", "categoriaAutonomo"), xmlWriter);
      }
      if (localImpuestoTracker) {
        if (localImpuesto != null) {
          for (int i = 0; i < localImpuesto.length; i++) {
            if (localImpuesto[i] != null) {
              localImpuesto[i].serialize(new javax.xml.namespace.QName("", "impuesto"), xmlWriter);
            } else {

              writeStartElement(null, "", "impuesto", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "impuesto", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localRegimenTracker) {
        if (localRegimen != null) {
          for (int i = 0; i < localRegimen.length; i++) {
            if (localRegimen[i] != null) {
              localRegimen[i].serialize(new javax.xml.namespace.QName("", "regimen"), xmlWriter);
            } else {

              writeStartElement(null, "", "regimen", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "regimen", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DatosRegimenGeneral parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DatosRegimenGeneral object = new DatosRegimenGeneral();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"datosRegimenGeneral".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DatosRegimenGeneral) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          java.util.ArrayList list3 = new java.util.ArrayList();

          java.util.ArrayList list4 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "actividad").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(Actividad.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("", "actividad").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(Actividad.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setActividad(
                (Actividad[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Actividad.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "categoriaAutonomo").equals(reader.getName())) {

            object.setCategoriaAutonomo(Categoria.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "impuesto").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list3.add(null);
              reader.next();
            } else {
              list3.add(Impuesto.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone3 = false;
            while (!loopDone3) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone3 = true;
              } else {
                if (new javax.xml.namespace.QName("", "impuesto").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list3.add(null);
                    reader.next();
                  } else {
                    list3.add(Impuesto.Factory.parse(reader));
                  }
                } else {
                  loopDone3 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setImpuesto(
                (Impuesto[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Impuesto.class, list3));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "regimen").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list4.add(null);
              reader.next();
            } else {
              list4.add(Regimen.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone4 = false;
            while (!loopDone4) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone4 = true;
              } else {
                if (new javax.xml.namespace.QName("", "regimen").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list4.add(null);
                    reader.next();
                  } else {
                    list4.add(Regimen.Factory.parse(reader));
                  }
                } else {
                  loopDone4 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setRegimen(
                (Regimen[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Regimen.class, list4));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Relacion implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = relacion
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for ApellidoPersonaAsociada */
    protected java.lang.String localApellidoPersonaAsociada;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localApellidoPersonaAsociadaTracker = false;

    public boolean isApellidoPersonaAsociadaSpecified() {
      return localApellidoPersonaAsociadaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApellidoPersonaAsociada() {
      return localApellidoPersonaAsociada;
    }

    /**
     * Auto generated setter method
     *
     * @param param ApellidoPersonaAsociada
     */
    public void setApellidoPersonaAsociada(java.lang.String param) {
      localApellidoPersonaAsociadaTracker = param != null;

      this.localApellidoPersonaAsociada = param;
    }

    /** field for FfRelacion */
    protected java.util.Calendar localFfRelacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localFfRelacionTracker = false;

    public boolean isFfRelacionSpecified() {
      return localFfRelacionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getFfRelacion() {
      return localFfRelacion;
    }

    /**
     * Auto generated setter method
     *
     * @param param FfRelacion
     */
    public void setFfRelacion(java.util.Calendar param) {
      localFfRelacionTracker = param != null;

      this.localFfRelacion = param;
    }

    /** field for FfVencimiento */
    protected java.util.Calendar localFfVencimiento;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localFfVencimientoTracker = false;

    public boolean isFfVencimientoSpecified() {
      return localFfVencimientoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getFfVencimiento() {
      return localFfVencimiento;
    }

    /**
     * Auto generated setter method
     *
     * @param param FfVencimiento
     */
    public void setFfVencimiento(java.util.Calendar param) {
      localFfVencimientoTracker = param != null;

      this.localFfVencimiento = param;
    }

    /** field for IdPersonaAsociada */
    protected long localIdPersonaAsociada;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdPersonaAsociadaTracker = false;

    public boolean isIdPersonaAsociadaSpecified() {
      return localIdPersonaAsociadaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdPersonaAsociada() {
      return localIdPersonaAsociada;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersonaAsociada
     */
    public void setIdPersonaAsociada(long param) {

      // setting primitive attribute tracker to true
      localIdPersonaAsociadaTracker = param != java.lang.Long.MIN_VALUE;

      this.localIdPersonaAsociada = param;
    }

    /** field for NombrePersonaAsociada */
    protected java.lang.String localNombrePersonaAsociada;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localNombrePersonaAsociadaTracker = false;

    public boolean isNombrePersonaAsociadaSpecified() {
      return localNombrePersonaAsociadaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNombrePersonaAsociada() {
      return localNombrePersonaAsociada;
    }

    /**
     * Auto generated setter method
     *
     * @param param NombrePersonaAsociada
     */
    public void setNombrePersonaAsociada(java.lang.String param) {
      localNombrePersonaAsociadaTracker = param != null;

      this.localNombrePersonaAsociada = param;
    }

    /** field for RazonSocialPersonaAsociada */
    protected java.lang.String localRazonSocialPersonaAsociada;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localRazonSocialPersonaAsociadaTracker = false;

    public boolean isRazonSocialPersonaAsociadaSpecified() {
      return localRazonSocialPersonaAsociadaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRazonSocialPersonaAsociada() {
      return localRazonSocialPersonaAsociada;
    }

    /**
     * Auto generated setter method
     *
     * @param param RazonSocialPersonaAsociada
     */
    public void setRazonSocialPersonaAsociada(java.lang.String param) {
      localRazonSocialPersonaAsociadaTracker = param != null;

      this.localRazonSocialPersonaAsociada = param;
    }

    /** field for TipoComponente */
    protected java.lang.String localTipoComponente;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localTipoComponenteTracker = false;

    public boolean isTipoComponenteSpecified() {
      return localTipoComponenteTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoComponente() {
      return localTipoComponente;
    }

    /**
     * Auto generated setter method
     *
     * @param param TipoComponente
     */
    public void setTipoComponente(java.lang.String param) {
      localTipoComponenteTracker = param != null;

      this.localTipoComponente = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":relacion",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "relacion", xmlWriter);
        }
      }
      if (localApellidoPersonaAsociadaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "apellidoPersonaAsociada", xmlWriter);

        if (localApellidoPersonaAsociada == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "apellidoPersonaAsociada cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApellidoPersonaAsociada);
        }

        xmlWriter.writeEndElement();
      }
      if (localFfRelacionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "ffRelacion", xmlWriter);

        if (localFfRelacion == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("ffRelacion cannot be null!!");

        } else {

          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFfRelacion));
        }

        xmlWriter.writeEndElement();
      }
      if (localFfVencimientoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "ffVencimiento", xmlWriter);

        if (localFfVencimiento == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("ffVencimiento cannot be null!!");

        } else {

          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFfVencimiento));
        }

        xmlWriter.writeEndElement();
      }
      if (localIdPersonaAsociadaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idPersonaAsociada", xmlWriter);

        if (localIdPersonaAsociada == java.lang.Long.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idPersonaAsociada cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localIdPersonaAsociada));
        }

        xmlWriter.writeEndElement();
      }
      if (localNombrePersonaAsociadaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "nombrePersonaAsociada", xmlWriter);

        if (localNombrePersonaAsociada == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "nombrePersonaAsociada cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNombrePersonaAsociada);
        }

        xmlWriter.writeEndElement();
      }
      if (localRazonSocialPersonaAsociadaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "razonSocialPersonaAsociada", xmlWriter);

        if (localRazonSocialPersonaAsociada == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "razonSocialPersonaAsociada cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRazonSocialPersonaAsociada);
        }

        xmlWriter.writeEndElement();
      }
      if (localTipoComponenteTracker) {
        namespace = "";
        writeStartElement(null, namespace, "tipoComponente", xmlWriter);

        if (localTipoComponente == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("tipoComponente cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTipoComponente);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Relacion parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Relacion object = new Relacion();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"relacion".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Relacion) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "apellidoPersonaAsociada")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "apellidoPersonaAsociada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApellidoPersonaAsociada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "ffRelacion").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "ffRelacion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFfRelacion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "ffVencimiento").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "ffVencimiento" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFfVencimiento(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersonaAsociada").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idPersonaAsociada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdPersonaAsociada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdPersonaAsociada(java.lang.Long.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "nombrePersonaAsociada")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "nombrePersonaAsociada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNombrePersonaAsociada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "razonSocialPersonaAsociada")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "razonSocialPersonaAsociada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRazonSocialPersonaAsociada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "tipoComponente").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "tipoComponente" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTipoComponente(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class PersonaListReturn implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = personaListReturn
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Metadata */
    protected Metadata localMetadata;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localMetadataTracker = false;

    public boolean isMetadataSpecified() {
      return localMetadataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Metadata
     */
    public Metadata getMetadata() {
      return localMetadata;
    }

    /**
     * Auto generated setter method
     *
     * @param param Metadata
     */
    public void setMetadata(Metadata param) {
      localMetadataTracker = param != null;

      this.localMetadata = param;
    }

    /** field for Persona This was an Array! */
    protected Persona[] localPersona;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPersonaTracker = false;

    public boolean isPersonaSpecified() {
      return localPersonaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Persona[]
     */
    public Persona[] getPersona() {
      return localPersona;
    }

    /** validate the array for Persona */
    protected void validatePersona(Persona[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Persona
     */
    public void setPersona(Persona[] param) {

      validatePersona(param);

      localPersonaTracker = true;

      this.localPersona = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Persona
     */
    public void addPersona(Persona param) {
      if (localPersona == null) {
        localPersona = new Persona[] {};
      }

      // update the setting tracker
      localPersonaTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPersona);
      list.add(param);
      this.localPersona = (Persona[]) list.toArray(new Persona[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":personaListReturn",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "personaListReturn",
              xmlWriter);
        }
      }
      if (localMetadataTracker) {
        if (localMetadata == null) {
          throw new org.apache.axis2.databinding.ADBException("metadata cannot be null!!");
        }
        localMetadata.serialize(new javax.xml.namespace.QName("", "metadata"), xmlWriter);
      }
      if (localPersonaTracker) {
        if (localPersona != null) {
          for (int i = 0; i < localPersona.length; i++) {
            if (localPersona[i] != null) {
              localPersona[i].serialize(new javax.xml.namespace.QName("", "persona"), xmlWriter);
            } else {

              writeStartElement(null, "", "persona", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "", "persona", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static PersonaListReturn parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        PersonaListReturn object = new PersonaListReturn();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"personaListReturn".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (PersonaListReturn) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list2 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "metadata").equals(reader.getName())) {

            object.setMetadata(Metadata.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "persona").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list2.add(null);
              reader.next();
            } else {
              list2.add(Persona.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone2 = false;
            while (!loopDone2) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement())
                reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone2 = true;
              } else {
                if (new javax.xml.namespace.QName("", "persona").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list2.add(null);
                    reader.next();
                  } else {
                    list2.add(Persona.Factory.parse(reader));
                  }
                } else {
                  loopDone2 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setPersona(
                (Persona[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    Persona.class, list2));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ExtensionMapper {

    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI,
        java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "dependencia".equals(typeName)) {

        return Dependencia.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersonaList_v2Response".equals(typeName)) {

        return GetPersonaList_v2Response.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "errorRegimenGeneral".equals(typeName)) {

        return ErrorRegimenGeneral.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersona".equals(typeName)) {

        return GetPersona.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersonaList_v2".equals(typeName)) {

        return GetPersonaList_v2.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersonaResponse".equals(typeName)) {

        return GetPersonaResponse.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "caracterizacion".equals(typeName)) {

        return Caracterizacion.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "categoria".equals(typeName)) {

        return Categoria.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "personaReturn".equals(typeName)) {

        return PersonaReturn.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "dummyResponse".equals(typeName)) {

        return DummyResponse.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "persona".equals(typeName)) {

        return Persona.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersona_v2Response".equals(typeName)) {

        return GetPersona_v2Response.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "datosGenerales".equals(typeName)) {

        return DatosGenerales.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "errorMonotributo".equals(typeName)) {

        return ErrorMonotributo.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "datosRegimenGeneral".equals(typeName)) {

        return DatosRegimenGeneral.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "personaListReturn".equals(typeName)) {

        return PersonaListReturn.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersonaList".equals(typeName)) {

        return GetPersonaList.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "impuesto".equals(typeName)) {

        return Impuesto.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersonaListResponse".equals(typeName)) {

        return GetPersonaListResponse.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "actividad".equals(typeName)) {

        return Actividad.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "datosMonotributo".equals(typeName)) {

        return DatosMonotributo.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "errorConstancia".equals(typeName)) {

        return ErrorConstancia.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "metadata".equals(typeName)) {

        return Metadata.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "relacion".equals(typeName)) {

        return Relacion.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "getPersona_v2".equals(typeName)) {

        return GetPersona_v2.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "regimen".equals(typeName)) {

        return Regimen.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "dummyReturn".equals(typeName)) {

        return DummyReturn.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "domicilio".equals(typeName)) {

        return Domicilio.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI)
          && "SRValidationException".equals(typeName)) {

        return SRValidationException.Factory.parse(reader);
      }

      if ("http://a5.soap.ws.server.puc.sr/".equals(namespaceURI) && "dummy".equals(typeName)) {

        return Dummy.Factory.parse(reader);
      }

      throw new org.apache.axis2.databinding.ADBException(
          "Unsupported type " + namespaceURI + " " + typeName);
    }
  }

  public static class Metadata implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = metadata
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for FechaHora */
    protected java.util.Calendar localFechaHora;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localFechaHoraTracker = false;

    public boolean isFechaHoraSpecified() {
      return localFechaHoraTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getFechaHora() {
      return localFechaHora;
    }

    /**
     * Auto generated setter method
     *
     * @param param FechaHora
     */
    public void setFechaHora(java.util.Calendar param) {
      localFechaHoraTracker = param != null;

      this.localFechaHora = param;
    }

    /** field for Servidor */
    protected java.lang.String localServidor;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localServidorTracker = false;

    public boolean isServidorSpecified() {
      return localServidorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getServidor() {
      return localServidor;
    }

    /**
     * Auto generated setter method
     *
     * @param param Servidor
     */
    public void setServidor(java.lang.String param) {
      localServidorTracker = param != null;

      this.localServidor = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":metadata",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "metadata", xmlWriter);
        }
      }
      if (localFechaHoraTracker) {
        namespace = "";
        writeStartElement(null, namespace, "fechaHora", xmlWriter);

        if (localFechaHora == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("fechaHora cannot be null!!");

        } else {

          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaHora));
        }

        xmlWriter.writeEndElement();
      }
      if (localServidorTracker) {
        namespace = "";
        writeStartElement(null, namespace, "servidor", xmlWriter);

        if (localServidor == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("servidor cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localServidor);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Metadata parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Metadata object = new Metadata();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"metadata".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Metadata) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "fechaHora").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "fechaHora" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFechaHora(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "servidor").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "servidor" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setServidor(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Persona implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = persona
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DatosGenerales */
    protected DatosGenerales localDatosGenerales;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosGeneralesTracker = false;

    public boolean isDatosGeneralesSpecified() {
      return localDatosGeneralesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosGenerales
     */
    public DatosGenerales getDatosGenerales() {
      return localDatosGenerales;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosGenerales
     */
    public void setDatosGenerales(DatosGenerales param) {
      localDatosGeneralesTracker = param != null;

      this.localDatosGenerales = param;
    }

    /** field for DatosMonotributo */
    protected DatosMonotributo localDatosMonotributo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosMonotributoTracker = false;

    public boolean isDatosMonotributoSpecified() {
      return localDatosMonotributoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosMonotributo
     */
    public DatosMonotributo getDatosMonotributo() {
      return localDatosMonotributo;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosMonotributo
     */
    public void setDatosMonotributo(DatosMonotributo param) {
      localDatosMonotributoTracker = param != null;

      this.localDatosMonotributo = param;
    }

    /** field for DatosRegimenGeneral */
    protected DatosRegimenGeneral localDatosRegimenGeneral;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDatosRegimenGeneralTracker = false;

    public boolean isDatosRegimenGeneralSpecified() {
      return localDatosRegimenGeneralTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DatosRegimenGeneral
     */
    public DatosRegimenGeneral getDatosRegimenGeneral() {
      return localDatosRegimenGeneral;
    }

    /**
     * Auto generated setter method
     *
     * @param param DatosRegimenGeneral
     */
    public void setDatosRegimenGeneral(DatosRegimenGeneral param) {
      localDatosRegimenGeneralTracker = param != null;

      this.localDatosRegimenGeneral = param;
    }

    /** field for ErrorConstancia */
    protected ErrorConstancia localErrorConstancia;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorConstanciaTracker = false;

    public boolean isErrorConstanciaSpecified() {
      return localErrorConstanciaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorConstancia
     */
    public ErrorConstancia getErrorConstancia() {
      return localErrorConstancia;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorConstancia
     */
    public void setErrorConstancia(ErrorConstancia param) {
      localErrorConstanciaTracker = param != null;

      this.localErrorConstancia = param;
    }

    /** field for ErrorMonotributo */
    protected ErrorMonotributo localErrorMonotributo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorMonotributoTracker = false;

    public boolean isErrorMonotributoSpecified() {
      return localErrorMonotributoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorMonotributo
     */
    public ErrorMonotributo getErrorMonotributo() {
      return localErrorMonotributo;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorMonotributo
     */
    public void setErrorMonotributo(ErrorMonotributo param) {
      localErrorMonotributoTracker = param != null;

      this.localErrorMonotributo = param;
    }

    /** field for ErrorRegimenGeneral */
    protected ErrorRegimenGeneral localErrorRegimenGeneral;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorRegimenGeneralTracker = false;

    public boolean isErrorRegimenGeneralSpecified() {
      return localErrorRegimenGeneralTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ErrorRegimenGeneral
     */
    public ErrorRegimenGeneral getErrorRegimenGeneral() {
      return localErrorRegimenGeneral;
    }

    /**
     * Auto generated setter method
     *
     * @param param ErrorRegimenGeneral
     */
    public void setErrorRegimenGeneral(ErrorRegimenGeneral param) {
      localErrorRegimenGeneralTracker = param != null;

      this.localErrorRegimenGeneral = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":persona",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "persona", xmlWriter);
        }
      }
      if (localDatosGeneralesTracker) {
        if (localDatosGenerales == null) {
          throw new org.apache.axis2.databinding.ADBException("datosGenerales cannot be null!!");
        }
        localDatosGenerales.serialize(
            new javax.xml.namespace.QName("", "datosGenerales"), xmlWriter);
      }
      if (localDatosMonotributoTracker) {
        if (localDatosMonotributo == null) {
          throw new org.apache.axis2.databinding.ADBException("datosMonotributo cannot be null!!");
        }
        localDatosMonotributo.serialize(
            new javax.xml.namespace.QName("", "datosMonotributo"), xmlWriter);
      }
      if (localDatosRegimenGeneralTracker) {
        if (localDatosRegimenGeneral == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "datosRegimenGeneral cannot be null!!");
        }
        localDatosRegimenGeneral.serialize(
            new javax.xml.namespace.QName("", "datosRegimenGeneral"), xmlWriter);
      }
      if (localErrorConstanciaTracker) {
        if (localErrorConstancia == null) {
          throw new org.apache.axis2.databinding.ADBException("errorConstancia cannot be null!!");
        }
        localErrorConstancia.serialize(
            new javax.xml.namespace.QName("", "errorConstancia"), xmlWriter);
      }
      if (localErrorMonotributoTracker) {
        if (localErrorMonotributo == null) {
          throw new org.apache.axis2.databinding.ADBException("errorMonotributo cannot be null!!");
        }
        localErrorMonotributo.serialize(
            new javax.xml.namespace.QName("", "errorMonotributo"), xmlWriter);
      }
      if (localErrorRegimenGeneralTracker) {
        if (localErrorRegimenGeneral == null) {
          throw new org.apache.axis2.databinding.ADBException(
              "errorRegimenGeneral cannot be null!!");
        }
        localErrorRegimenGeneral.serialize(
            new javax.xml.namespace.QName("", "errorRegimenGeneral"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Persona parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Persona object = new Persona();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"persona".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Persona) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosGenerales").equals(reader.getName())) {

            object.setDatosGenerales(DatosGenerales.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosMonotributo").equals(reader.getName())) {

            object.setDatosMonotributo(DatosMonotributo.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "datosRegimenGeneral")
                  .equals(reader.getName())) {

            object.setDatosRegimenGeneral(DatosRegimenGeneral.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorConstancia").equals(reader.getName())) {

            object.setErrorConstancia(ErrorConstancia.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorMonotributo").equals(reader.getName())) {

            object.setErrorMonotributo(ErrorMonotributo.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "errorRegimenGeneral")
                  .equals(reader.getName())) {

            object.setErrorRegimenGeneral(ErrorRegimenGeneral.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersona", "ns1");

    /** field for GetPersona */
    protected GetPersona localGetPersona;

    /**
     * Auto generated getter method
     *
     * @return GetPersona
     */
    public GetPersona getGetPersona() {
      return localGetPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersona
     */
    public void setGetPersona(GetPersona param) {

      this.localGetPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersona == null) {
        throw new org.apache.axis2.databinding.ADBException("getPersona cannot be null!");
      }
      localGetPersona.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaE object = new GetPersonaE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "getPersona")
                      .equals(reader.getName())) {

                object.setGetPersona(GetPersona.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersona_v2ResponseE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersona_v2Response", "ns1");

    /** field for GetPersona_v2Response */
    protected GetPersona_v2Response localGetPersona_v2Response;

    /**
     * Auto generated getter method
     *
     * @return GetPersona_v2Response
     */
    public GetPersona_v2Response getGetPersona_v2Response() {
      return localGetPersona_v2Response;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersona_v2Response
     */
    public void setGetPersona_v2Response(GetPersona_v2Response param) {

      this.localGetPersona_v2Response = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersona_v2Response == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "getPersona_v2Response cannot be null!");
      }
      localGetPersona_v2Response.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersona_v2ResponseE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersona_v2ResponseE object = new GetPersona_v2ResponseE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersona_v2Response")
                      .equals(reader.getName())) {

                object.setGetPersona_v2Response(GetPersona_v2Response.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DummyReturn implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = dummyReturn
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Appserver */
    protected java.lang.String localAppserver;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localAppserverTracker = false;

    public boolean isAppserverSpecified() {
      return localAppserverTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAppserver() {
      return localAppserver;
    }

    /**
     * Auto generated setter method
     *
     * @param param Appserver
     */
    public void setAppserver(java.lang.String param) {
      localAppserverTracker = param != null;

      this.localAppserver = param;
    }

    /** field for Authserver */
    protected java.lang.String localAuthserver;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localAuthserverTracker = false;

    public boolean isAuthserverSpecified() {
      return localAuthserverTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuthserver() {
      return localAuthserver;
    }

    /**
     * Auto generated setter method
     *
     * @param param Authserver
     */
    public void setAuthserver(java.lang.String param) {
      localAuthserverTracker = param != null;

      this.localAuthserver = param;
    }

    /** field for Dbserver */
    protected java.lang.String localDbserver;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDbserverTracker = false;

    public boolean isDbserverSpecified() {
      return localDbserverTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDbserver() {
      return localDbserver;
    }

    /**
     * Auto generated setter method
     *
     * @param param Dbserver
     */
    public void setDbserver(java.lang.String param) {
      localDbserverTracker = param != null;

      this.localDbserver = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":dummyReturn",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "dummyReturn", xmlWriter);
        }
      }
      if (localAppserverTracker) {
        namespace = "";
        writeStartElement(null, namespace, "appserver", xmlWriter);

        if (localAppserver == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("appserver cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAppserver);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuthserverTracker) {
        namespace = "";
        writeStartElement(null, namespace, "authserver", xmlWriter);

        if (localAuthserver == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("authserver cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuthserver);
        }

        xmlWriter.writeEndElement();
      }
      if (localDbserverTracker) {
        namespace = "";
        writeStartElement(null, namespace, "dbserver", xmlWriter);

        if (localDbserver == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("dbserver cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDbserver);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DummyReturn parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DummyReturn object = new DummyReturn();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"dummyReturn".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DummyReturn) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "appserver").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "appserver" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAppserver(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "authserver").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "authserver" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuthserver(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "dbserver").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "dbserver" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDbserver(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DummyResponseE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "dummyResponse", "ns1");

    /** field for DummyResponse */
    protected DummyResponse localDummyResponse;

    /**
     * Auto generated getter method
     *
     * @return DummyResponse
     */
    public DummyResponse getDummyResponse() {
      return localDummyResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param DummyResponse
     */
    public void setDummyResponse(DummyResponse param) {

      this.localDummyResponse = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localDummyResponse == null) {
        throw new org.apache.axis2.databinding.ADBException("dummyResponse cannot be null!");
      }
      localDummyResponse.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DummyResponseE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DummyResponseE object = new DummyResponseE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "dummyResponse")
                      .equals(reader.getName())) {

                object.setDummyResponse(DummyResponse.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ErrorConstancia implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = errorConstancia
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Apellido */
    protected java.lang.String localApellido;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localApellidoTracker = false;

    public boolean isApellidoSpecified() {
      return localApellidoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApellido() {
      return localApellido;
    }

    /**
     * Auto generated setter method
     *
     * @param param Apellido
     */
    public void setApellido(java.lang.String param) {
      localApellidoTracker = param != null;

      this.localApellido = param;
    }

    /** field for Error This was an Array! */
    protected java.lang.String[] localError;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorTracker = false;

    public boolean isErrorSpecified() {
      return localErrorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String[]
     */
    public java.lang.String[] getError() {
      return localError;
    }

    /** validate the array for Error */
    protected void validateError(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Error
     */
    public void setError(java.lang.String[] param) {

      validateError(param);

      localErrorTracker = true;

      this.localError = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param java.lang.String
     */
    public void addError(java.lang.String param) {
      if (localError == null) {
        localError = new java.lang.String[] {};
      }

      // update the setting tracker
      localErrorTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localError);
      list.add(param);
      this.localError = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    /** field for IdPersona */
    protected long localIdPersona;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdPersonaTracker = false;

    public boolean isIdPersonaSpecified() {
      return localIdPersonaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdPersona() {
      return localIdPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long param) {

      // setting primitive attribute tracker to true
      localIdPersonaTracker = param != java.lang.Long.MIN_VALUE;

      this.localIdPersona = param;
    }

    /** field for Nombre */
    protected java.lang.String localNombre;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localNombreTracker = false;

    public boolean isNombreSpecified() {
      return localNombreTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNombre() {
      return localNombre;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nombre
     */
    public void setNombre(java.lang.String param) {
      localNombreTracker = param != null;

      this.localNombre = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":errorConstancia",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "errorConstancia",
              xmlWriter);
        }
      }
      if (localApellidoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "apellido", xmlWriter);

        if (localApellido == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("apellido cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApellido);
        }

        xmlWriter.writeEndElement();
      }
      if (localErrorTracker) {
        if (localError != null) {
          namespace = "";
          for (int i = 0; i < localError.length; i++) {

            if (localError[i] != null) {

              writeStartElement(null, namespace, "error", xmlWriter);

              xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localError[i]));

              xmlWriter.writeEndElement();

            } else {

              // write null attribute
              namespace = "";
              writeStartElement(null, namespace, "error", xmlWriter);
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          // write the null attribute
          // write null attribute
          writeStartElement(null, "", "error", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localIdPersonaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idPersona", xmlWriter);

        if (localIdPersona == java.lang.Long.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPersona));
        }

        xmlWriter.writeEndElement();
      }
      if (localNombreTracker) {
        namespace = "";
        writeStartElement(null, namespace, "nombre", xmlWriter);

        if (localNombre == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNombre);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static ErrorConstancia parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        ErrorConstancia object = new ErrorConstancia();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"errorConstancia".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ErrorConstancia) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list2 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "apellido").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "apellido" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApellido(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list2.add(null);

              reader.next();
            } else {
              list2.add(reader.getElementText());
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone2 = false;
            while (!loopDone2) {
              // Ensure we are at the EndElement
              while (!reader.isEndElement()) {
                reader.next();
              }
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone2 = true;
              } else {
                if (new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list2.add(null);

                    reader.next();
                  } else {
                    list2.add(reader.getElementText());
                  }
                } else {
                  loopDone2 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setError((java.lang.String[]) list2.toArray(new java.lang.String[list2.size()]));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idPersona" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdPersona(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdPersona(java.lang.Long.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "nombre").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "nombre" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNombre(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaList implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersonaList
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Token */
    protected java.lang.String localToken;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getToken() {
      return localToken;
    }

    /**
     * Auto generated setter method
     *
     * @param param Token
     */
    public void setToken(java.lang.String param) {

      this.localToken = param;
    }

    /** field for Sign */
    protected java.lang.String localSign;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSign() {
      return localSign;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sign
     */
    public void setSign(java.lang.String param) {

      this.localSign = param;
    }

    /** field for CuitRepresentada */
    protected long localCuitRepresentada;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCuitRepresentada() {
      return localCuitRepresentada;
    }

    /**
     * Auto generated setter method
     *
     * @param param CuitRepresentada
     */
    public void setCuitRepresentada(long param) {

      this.localCuitRepresentada = param;
    }

    /** field for IdPersona This was an Array! */
    protected long[] localIdPersona;

    /**
     * Auto generated getter method
     *
     * @return long[]
     */
    public long[] getIdPersona() {
      return localIdPersona;
    }

    /** validate the array for IdPersona */
    protected void validateIdPersona(long[] param) {

      if ((param != null) && (param.length < 1)) {
        throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
      }
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long[] param) {

      validateIdPersona(param);

      this.localIdPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersonaList",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersonaList",
              xmlWriter);
        }
      }

      namespace = "";
      writeStartElement(null, namespace, "token", xmlWriter);

      if (localToken == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("token cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localToken);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "sign", xmlWriter);

      if (localSign == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sign cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSign);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "cuitRepresentada", xmlWriter);

      if (localCuitRepresentada == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cuitRepresentada cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCuitRepresentada));
      }

      xmlWriter.writeEndElement();

      if (localIdPersona != null) {
        namespace = "";
        for (int i = 0; i < localIdPersona.length; i++) {

          if (localIdPersona[i] != java.lang.Long.MIN_VALUE) {

            writeStartElement(null, namespace, "idPersona", xmlWriter);

            xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIdPersona[i]));
            xmlWriter.writeEndElement();

          } else {

            throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");
          }
        }
      } else {

        throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");
      }

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaList parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaList object = new GetPersonaList();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersonaList".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersonaList) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list4 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "token").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setToken(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "sign").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "sign" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSign(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "cuitRepresentada").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "cuitRepresentada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCuitRepresentada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            list4.add(reader.getElementText());

            // loop until we find a start element that is not part of this array
            boolean loopDone4 = false;
            while (!loopDone4) {
              // Ensure we are at the EndElement
              while (!reader.isEndElement()) {
                reader.next();
              }
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone4 = true;
              } else {
                if (new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {
                  list4.add(reader.getElementText());

                } else {
                  loopDone4 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setIdPersona(
                (long[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    long.class, list4));

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersona_v2 implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersona_v2
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Token */
    protected java.lang.String localToken;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getToken() {
      return localToken;
    }

    /**
     * Auto generated setter method
     *
     * @param param Token
     */
    public void setToken(java.lang.String param) {

      this.localToken = param;
    }

    /** field for Sign */
    protected java.lang.String localSign;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSign() {
      return localSign;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sign
     */
    public void setSign(java.lang.String param) {

      this.localSign = param;
    }

    /** field for CuitRepresentada */
    protected long localCuitRepresentada;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCuitRepresentada() {
      return localCuitRepresentada;
    }

    /**
     * Auto generated setter method
     *
     * @param param CuitRepresentada
     */
    public void setCuitRepresentada(long param) {

      this.localCuitRepresentada = param;
    }

    /** field for IdPersona */
    protected long localIdPersona;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getIdPersona() {
      return localIdPersona;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long param) {

      this.localIdPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersona_v2",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersona_v2",
              xmlWriter);
        }
      }

      namespace = "";
      writeStartElement(null, namespace, "token", xmlWriter);

      if (localToken == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("token cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localToken);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "sign", xmlWriter);

      if (localSign == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sign cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSign);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "cuitRepresentada", xmlWriter);

      if (localCuitRepresentada == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cuitRepresentada cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCuitRepresentada));
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "idPersona", xmlWriter);

      if (localIdPersona == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdPersona));
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersona_v2 parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersona_v2 object = new GetPersona_v2();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersona_v2".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersona_v2) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "token").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setToken(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "sign").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "sign" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSign(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "cuitRepresentada").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "cuitRepresentada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCuitRepresentada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idPersona" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdPersona(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ErrorMonotributo implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = errorMonotributo
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Error This was an Array! */
    protected java.lang.String[] localError;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localErrorTracker = false;

    public boolean isErrorSpecified() {
      return localErrorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String[]
     */
    public java.lang.String[] getError() {
      return localError;
    }

    /** validate the array for Error */
    protected void validateError(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Error
     */
    public void setError(java.lang.String[] param) {

      validateError(param);

      localErrorTracker = true;

      this.localError = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param java.lang.String
     */
    public void addError(java.lang.String param) {
      if (localError == null) {
        localError = new java.lang.String[] {};
      }

      // update the setting tracker
      localErrorTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localError);
      list.add(param);
      this.localError = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    /** field for Mensaje */
    protected java.lang.String localMensaje;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localMensajeTracker = false;

    public boolean isMensajeSpecified() {
      return localMensajeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMensaje() {
      return localMensaje;
    }

    /**
     * Auto generated setter method
     *
     * @param param Mensaje
     */
    public void setMensaje(java.lang.String param) {
      localMensajeTracker = param != null;

      this.localMensaje = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":errorMonotributo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "errorMonotributo",
              xmlWriter);
        }
      }
      if (localErrorTracker) {
        if (localError != null) {
          namespace = "";
          for (int i = 0; i < localError.length; i++) {

            if (localError[i] != null) {

              writeStartElement(null, namespace, "error", xmlWriter);

              xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localError[i]));

              xmlWriter.writeEndElement();

            } else {

              // write null attribute
              namespace = "";
              writeStartElement(null, namespace, "error", xmlWriter);
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          // write the null attribute
          // write null attribute
          writeStartElement(null, "", "error", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      if (localMensajeTracker) {
        namespace = "";
        writeStartElement(null, namespace, "mensaje", xmlWriter);

        if (localMensaje == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMensaje);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static ErrorMonotributo parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        ErrorMonotributo object = new ErrorMonotributo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"errorMonotributo".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ErrorMonotributo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);

              reader.next();
            } else {
              list1.add(reader.getElementText());
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // Ensure we are at the EndElement
              while (!reader.isEndElement()) {
                reader.next();
              }
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("", "error").equals(reader.getName())) {

                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);

                    reader.next();
                  } else {
                    list1.add(reader.getElementText());
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setError((java.lang.String[]) list1.toArray(new java.lang.String[list1.size()]));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "mensaje").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "mensaje" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMensaje(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaListResponse implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersonaListResponse
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for PersonaListReturn */
    protected PersonaListReturn localPersonaListReturn;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPersonaListReturnTracker = false;

    public boolean isPersonaListReturnSpecified() {
      return localPersonaListReturnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return PersonaListReturn
     */
    public PersonaListReturn getPersonaListReturn() {
      return localPersonaListReturn;
    }

    /**
     * Auto generated setter method
     *
     * @param param PersonaListReturn
     */
    public void setPersonaListReturn(PersonaListReturn param) {
      localPersonaListReturnTracker = param != null;

      this.localPersonaListReturn = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersonaListResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersonaListResponse",
              xmlWriter);
        }
      }
      if (localPersonaListReturnTracker) {
        if (localPersonaListReturn == null) {
          throw new org.apache.axis2.databinding.ADBException("personaListReturn cannot be null!!");
        }
        localPersonaListReturn.serialize(
            new javax.xml.namespace.QName("", "personaListReturn"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaListResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaListResponse object = new GetPersonaListResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersonaListResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersonaListResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "personaListReturn").equals(reader.getName())) {

            object.setPersonaListReturn(PersonaListReturn.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaList_v2E implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2", "ns1");

    /** field for GetPersonaList_v2 */
    protected GetPersonaList_v2 localGetPersonaList_v2;

    /**
     * Auto generated getter method
     *
     * @return GetPersonaList_v2
     */
    public GetPersonaList_v2 getGetPersonaList_v2() {
      return localGetPersonaList_v2;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersonaList_v2
     */
    public void setGetPersonaList_v2(GetPersonaList_v2 param) {

      this.localGetPersonaList_v2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersonaList_v2 == null) {
        throw new org.apache.axis2.databinding.ADBException("getPersonaList_v2 cannot be null!");
      }
      localGetPersonaList_v2.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaList_v2E parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaList_v2E object = new GetPersonaList_v2E();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersonaList_v2")
                      .equals(reader.getName())) {

                object.setGetPersonaList_v2(GetPersonaList_v2.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaList_v2 implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = getPersonaList_v2
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for Token */
    protected java.lang.String localToken;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getToken() {
      return localToken;
    }

    /**
     * Auto generated setter method
     *
     * @param param Token
     */
    public void setToken(java.lang.String param) {

      this.localToken = param;
    }

    /** field for Sign */
    protected java.lang.String localSign;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSign() {
      return localSign;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sign
     */
    public void setSign(java.lang.String param) {

      this.localSign = param;
    }

    /** field for CuitRepresentada */
    protected long localCuitRepresentada;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCuitRepresentada() {
      return localCuitRepresentada;
    }

    /**
     * Auto generated setter method
     *
     * @param param CuitRepresentada
     */
    public void setCuitRepresentada(long param) {

      this.localCuitRepresentada = param;
    }

    /** field for IdPersona This was an Array! */
    protected long[] localIdPersona;

    /**
     * Auto generated getter method
     *
     * @return long[]
     */
    public long[] getIdPersona() {
      return localIdPersona;
    }

    /** validate the array for IdPersona */
    protected void validateIdPersona(long[] param) {

      if ((param != null) && (param.length < 1)) {
        throw new java.lang.RuntimeException("Input values do not follow defined XSD restrictions");
      }
    }

    /**
     * Auto generated setter method
     *
     * @param param IdPersona
     */
    public void setIdPersona(long[] param) {

      validateIdPersona(param);

      this.localIdPersona = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getPersonaList_v2",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getPersonaList_v2",
              xmlWriter);
        }
      }

      namespace = "";
      writeStartElement(null, namespace, "token", xmlWriter);

      if (localToken == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("token cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localToken);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "sign", xmlWriter);

      if (localSign == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sign cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSign);
      }

      xmlWriter.writeEndElement();

      namespace = "";
      writeStartElement(null, namespace, "cuitRepresentada", xmlWriter);

      if (localCuitRepresentada == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cuitRepresentada cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCuitRepresentada));
      }

      xmlWriter.writeEndElement();

      if (localIdPersona != null) {
        namespace = "";
        for (int i = 0; i < localIdPersona.length; i++) {

          if (localIdPersona[i] != java.lang.Long.MIN_VALUE) {

            writeStartElement(null, namespace, "idPersona", xmlWriter);

            xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localIdPersona[i]));
            xmlWriter.writeEndElement();

          } else {

            throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");
          }
        }
      } else {

        throw new org.apache.axis2.databinding.ADBException("idPersona cannot be null!!");
      }

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaList_v2 parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaList_v2 object = new GetPersonaList_v2();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getPersonaList_v2".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetPersonaList_v2) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list4 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "token").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setToken(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "sign").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "sign" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSign(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "cuitRepresentada").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "cuitRepresentada" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCuitRepresentada(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {

            // Process the array and step past its final element's end.

            list4.add(reader.getElementText());

            // loop until we find a start element that is not part of this array
            boolean loopDone4 = false;
            while (!loopDone4) {
              // Ensure we are at the EndElement
              while (!reader.isEndElement()) {
                reader.next();
              }
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement())
                reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone4 = true;
              } else {
                if (new javax.xml.namespace.QName("", "idPersona").equals(reader.getName())) {
                  list4.add(reader.getElementText());

                } else {
                  loopDone4 = true;
                }
              }
            }
            // call the converter utility to convert and set the array

            object.setIdPersona(
                (long[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                    long.class, list4));

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was
            // passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Caracterizacion implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = caracterizacion
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DescripcionCaracterizacion */
    protected java.lang.String localDescripcionCaracterizacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionCaracterizacionTracker = false;

    public boolean isDescripcionCaracterizacionSpecified() {
      return localDescripcionCaracterizacionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionCaracterizacion() {
      return localDescripcionCaracterizacion;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionCaracterizacion
     */
    public void setDescripcionCaracterizacion(java.lang.String param) {
      localDescripcionCaracterizacionTracker = param != null;

      this.localDescripcionCaracterizacion = param;
    }

    /** field for IdCaracterizacion */
    protected int localIdCaracterizacion;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdCaracterizacionTracker = false;

    public boolean isIdCaracterizacionSpecified() {
      return localIdCaracterizacionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdCaracterizacion() {
      return localIdCaracterizacion;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdCaracterizacion
     */
    public void setIdCaracterizacion(int param) {

      // setting primitive attribute tracker to true
      localIdCaracterizacionTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdCaracterizacion = param;
    }

    /** field for Periodo */
    protected int localPeriodo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPeriodoTracker = false;

    public boolean isPeriodoSpecified() {
      return localPeriodoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPeriodo() {
      return localPeriodo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Periodo
     */
    public void setPeriodo(int param) {

      // setting primitive attribute tracker to true
      localPeriodoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localPeriodo = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":caracterizacion",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "caracterizacion",
              xmlWriter);
        }
      }
      if (localDescripcionCaracterizacionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionCaracterizacion", xmlWriter);

        if (localDescripcionCaracterizacion == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionCaracterizacion cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionCaracterizacion);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdCaracterizacionTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idCaracterizacion", xmlWriter);

        if (localIdCaracterizacion == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idCaracterizacion cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                  localIdCaracterizacion));
        }

        xmlWriter.writeEndElement();
      }
      if (localPeriodoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "periodo", xmlWriter);

        if (localPeriodo == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("periodo cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPeriodo));
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Caracterizacion parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Caracterizacion object = new Caracterizacion();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"caracterizacion".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Caracterizacion) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionCaracterizacion")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionCaracterizacion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionCaracterizacion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idCaracterizacion").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idCaracterizacion" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdCaracterizacion(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdCaracterizacion(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "periodo").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "periodo" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPeriodo(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setPeriodo(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Categoria implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = categoria
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /** field for DescripcionCategoria */
    protected java.lang.String localDescripcionCategoria;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localDescripcionCategoriaTracker = false;

    public boolean isDescripcionCategoriaSpecified() {
      return localDescripcionCategoriaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescripcionCategoria() {
      return localDescripcionCategoria;
    }

    /**
     * Auto generated setter method
     *
     * @param param DescripcionCategoria
     */
    public void setDescripcionCategoria(java.lang.String param) {
      localDescripcionCategoriaTracker = param != null;

      this.localDescripcionCategoria = param;
    }

    /** field for IdCategoria */
    protected int localIdCategoria;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdCategoriaTracker = false;

    public boolean isIdCategoriaSpecified() {
      return localIdCategoriaTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdCategoria() {
      return localIdCategoria;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdCategoria
     */
    public void setIdCategoria(int param) {

      // setting primitive attribute tracker to true
      localIdCategoriaTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdCategoria = param;
    }

    /** field for IdImpuesto */
    protected int localIdImpuesto;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localIdImpuestoTracker = false;

    public boolean isIdImpuestoSpecified() {
      return localIdImpuestoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getIdImpuesto() {
      return localIdImpuesto;
    }

    /**
     * Auto generated setter method
     *
     * @param param IdImpuesto
     */
    public void setIdImpuesto(int param) {

      // setting primitive attribute tracker to true
      localIdImpuestoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localIdImpuesto = param;
    }

    /** field for Periodo */
    protected int localPeriodo;

    /*
     * This tracker boolean wil be used to detect whether the user called the set
     * method
     * for this attribute. It will be used to determine whether to include this
     * field
     * in the serialized XML
     */
    protected boolean localPeriodoTracker = false;

    public boolean isPeriodoSpecified() {
      return localPeriodoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPeriodo() {
      return localPeriodo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Periodo
     */
    public void setPeriodo(int param) {

      // setting primitive attribute tracker to true
      localPeriodoTracker = param != java.lang.Integer.MIN_VALUE;

      this.localPeriodo = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":categoria",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "categoria", xmlWriter);
        }
      }
      if (localDescripcionCategoriaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "descripcionCategoria", xmlWriter);

        if (localDescripcionCategoria == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
              "descripcionCategoria cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescripcionCategoria);
        }

        xmlWriter.writeEndElement();
      }
      if (localIdCategoriaTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idCategoria", xmlWriter);

        if (localIdCategoria == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idCategoria cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdCategoria));
        }

        xmlWriter.writeEndElement();
      }
      if (localIdImpuestoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "idImpuesto", xmlWriter);

        if (localIdImpuesto == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("idImpuesto cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdImpuesto));
        }

        xmlWriter.writeEndElement();
      }
      if (localPeriodoTracker) {
        namespace = "";
        writeStartElement(null, namespace, "periodo", xmlWriter);

        if (localPeriodo == java.lang.Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("periodo cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPeriodo));
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static Categoria parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Categoria object = new Categoria();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"categoria".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Categoria) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "descripcionCategoria")
                  .equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "descripcionCategoria" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescripcionCategoria(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idCategoria").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idCategoria" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdCategoria(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdCategoria(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "idImpuesto").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "idImpuesto" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIdImpuesto(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setIdImpuesto(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("", "periodo").equals(reader.getName())) {

            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "periodo" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPeriodo(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setPeriodo(java.lang.Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SRValidationException implements org.apache.axis2.databinding.ADBBean {
    /*
     * This type was generated from the piece of schema that had
     * name = SRValidationException
     * Namespace URI = http://a5.soap.ws.server.puc.sr/
     * Namespace Prefix = ns1
     */

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://a5.soap.ws.server.puc.sr/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SRValidationException",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SRValidationException",
              xmlWriter);
        }
      }

      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static SRValidationException parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        SRValidationException object = new SRValidationException();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
            java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SRValidationException".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SRValidationException) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid
            // property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetPersonaListE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "getPersonaList", "ns1");

    /** field for GetPersonaList */
    protected GetPersonaList localGetPersonaList;

    /**
     * Auto generated getter method
     *
     * @return GetPersonaList
     */
    public GetPersonaList getGetPersonaList() {
      return localGetPersonaList;
    }

    /**
     * Auto generated setter method
     *
     * @param param GetPersonaList
     */
    public void setGetPersonaList(GetPersonaList param) {

      this.localGetPersonaList = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localGetPersonaList == null) {
        throw new org.apache.axis2.databinding.ADBException("getPersonaList cannot be null!");
      }
      localGetPersonaList.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static GetPersonaListE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetPersonaListE object = new GetPersonaListE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                      "http://a5.soap.ws.server.puc.sr/", "getPersonaList")
                      .equals(reader.getName())) {

                object.setGetPersonaList(GetPersonaList.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DummyE implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
        "http://a5.soap.ws.server.puc.sr/", "dummy", "ns1");

    /** field for Dummy */
    protected Dummy localDummy;

    /**
     * Auto generated getter method
     *
     * @return Dummy
     */
    public Dummy getDummy() {
      return localDummy;
    }

    /**
     * Auto generated setter method
     *
     * @param param Dummy
     */
    public void setDummy(Dummy param) {

      this.localDummy = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      // We can safely assume an element has only one type associated with it

      if (localDummy == null) {
        throw new org.apache.axis2.databinding.ADBException("dummy cannot be null!");
      }
      localDummy.serialize(MY_QNAME, xmlWriter);
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://a5.soap.ws.server.puc.sr/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to
        // write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current
       * or next start element starts this object and any intervening reader events
       * are ignorable If
       * this object is not an element, it is a complex type and the reader is at the
       * event just
       * after the outer start element Postcondition: If this object is an element,
       * the reader is
       * positioned at its end element If this object is a complex type, the reader is
       * positioned at
       * the end element of its outer element
       */
      public static DummyE parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        DummyE object = new DummyE();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement())
            reader.next();

          currentQName = reader.getName();

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          while (!reader.isEndElement()) {
            if (reader.isStartElement()) {

              if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://a5.soap.ws.server.puc.sr/", "dummy")
                      .equals(reader.getName())) {

                object.setDummy(Dummy.Factory.parse(reader));

              } // End of if for expected property start element
              else {
                // 3 - A start element we are not expecting indicates an invalid parameter was
                // passed

                throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
              }

            } else {
              reader.next();
            }
          } // end of while loop

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.DummyE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.DummyE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      wsAfip.wsdl.PersonaServiceA5Stub.DummyE param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(wsAfip.wsdl.PersonaServiceA5Stub.DummyE.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (wsAfip.wsdl.PersonaServiceA5Stub.DummyE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.DummyE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.DummyResponseE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2E.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersona_v2ResponseE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2E.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaList_v2ResponseE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaListResponseE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.GetPersonaResponseE.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = wsAfip.wsdl.PersonaServiceA5Stub.SRValidationExceptionE.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
