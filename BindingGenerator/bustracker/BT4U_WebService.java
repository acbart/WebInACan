/**
 * BT4U_WebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public interface BT4U_WebService extends javax.xml.rpc.Service {
    public java.lang.String getBT4U_WebServiceSoapAddress();

    public bustracker.BT4U_WebServiceSoap_PortType getBT4U_WebServiceSoap() throws javax.xml.rpc.ServiceException;

    public bustracker.BT4U_WebServiceSoap_PortType getBT4U_WebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getBT4U_WebServiceSoap12Address();

    public bustracker.BT4U_WebServiceSoap_PortType getBT4U_WebServiceSoap12() throws javax.xml.rpc.ServiceException;

    public bustracker.BT4U_WebServiceSoap_PortType getBT4U_WebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
