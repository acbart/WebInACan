/**
 * BT4U_WebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public class BT4U_WebServiceLocator extends org.apache.axis.client.Service implements org.bt4u.www.BT4U_WebService {

    public BT4U_WebServiceLocator() {
    }


    public BT4U_WebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BT4U_WebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BT4U_WebServiceSoap
    private java.lang.String BT4U_WebServiceSoap_address = "http://www.bt4u.org/BT4U_Webservice.asmx";

    public java.lang.String getBT4U_WebServiceSoapAddress() {
        return BT4U_WebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BT4U_WebServiceSoapWSDDServiceName = "BT4U_WebServiceSoap";

    public java.lang.String getBT4U_WebServiceSoapWSDDServiceName() {
        return BT4U_WebServiceSoapWSDDServiceName;
    }

    public void setBT4U_WebServiceSoapWSDDServiceName(java.lang.String name) {
        BT4U_WebServiceSoapWSDDServiceName = name;
    }

    public org.bt4u.www.BT4U_WebServiceSoap getBT4U_WebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BT4U_WebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBT4U_WebServiceSoap(endpoint);
    }

    public org.bt4u.www.BT4U_WebServiceSoap getBT4U_WebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.bt4u.www.BT4U_WebServiceSoapStub _stub = new org.bt4u.www.BT4U_WebServiceSoapStub(portAddress, this);
            _stub.setPortName(getBT4U_WebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBT4U_WebServiceSoapEndpointAddress(java.lang.String address) {
        BT4U_WebServiceSoap_address = address;
    }


    // Use to get a proxy class for BT4U_WebServiceSoap12
    private java.lang.String BT4U_WebServiceSoap12_address = "http://www.bt4u.org/BT4U_Webservice.asmx";

    public java.lang.String getBT4U_WebServiceSoap12Address() {
        return BT4U_WebServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BT4U_WebServiceSoap12WSDDServiceName = "BT4U_WebServiceSoap12";

    public java.lang.String getBT4U_WebServiceSoap12WSDDServiceName() {
        return BT4U_WebServiceSoap12WSDDServiceName;
    }

    public void setBT4U_WebServiceSoap12WSDDServiceName(java.lang.String name) {
        BT4U_WebServiceSoap12WSDDServiceName = name;
    }

    public org.bt4u.www.BT4U_WebServiceSoap getBT4U_WebServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BT4U_WebServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBT4U_WebServiceSoap12(endpoint);
    }

    public org.bt4u.www.BT4U_WebServiceSoap getBT4U_WebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.bt4u.www.BT4U_WebServiceSoap12Stub _stub = new org.bt4u.www.BT4U_WebServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getBT4U_WebServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBT4U_WebServiceSoap12EndpointAddress(java.lang.String address) {
        BT4U_WebServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.bt4u.www.BT4U_WebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.bt4u.www.BT4U_WebServiceSoapStub _stub = new org.bt4u.www.BT4U_WebServiceSoapStub(new java.net.URL(BT4U_WebServiceSoap_address), this);
                _stub.setPortName(getBT4U_WebServiceSoapWSDDServiceName());
                return _stub;
            }
            if (org.bt4u.www.BT4U_WebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.bt4u.www.BT4U_WebServiceSoap12Stub _stub = new org.bt4u.www.BT4U_WebServiceSoap12Stub(new java.net.URL(BT4U_WebServiceSoap12_address), this);
                _stub.setPortName(getBT4U_WebServiceSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BT4U_WebServiceSoap".equals(inputPortName)) {
            return getBT4U_WebServiceSoap();
        }
        else if ("BT4U_WebServiceSoap12".equals(inputPortName)) {
            return getBT4U_WebServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.bt4u.org/", "BT4U_WebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.bt4u.org/", "BT4U_WebServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://www.bt4u.org/", "BT4U_WebServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BT4U_WebServiceSoap".equals(portName)) {
            setBT4U_WebServiceSoapEndpointAddress(address);
        }
        else 
if ("BT4U_WebServiceSoap12".equals(portName)) {
            setBT4U_WebServiceSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
