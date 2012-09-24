/**
 * BT4U_WebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public interface BT4U_WebServiceSoap extends java.rmi.Remote {
    public org.bt4u.www.GetScheduledRoutesResponseGetScheduledRoutesResult getScheduledRoutes(java.lang.String stopCode) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult getScheduledRoutesWithXMLSchema(java.lang.String stopCode) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodes(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNames(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPoints(java.lang.String routeName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchema(java.lang.String routeName) throws java.rmi.RemoteException;
    public org.bt4u.www.GetCurrentBusInfoResponseGetCurrentBusInfoResult getCurrentBusInfo() throws java.rmi.RemoteException;
    public org.bt4u.www.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchema() throws java.rmi.RemoteException;
    public org.bt4u.www.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutes() throws java.rmi.RemoteException;
    public org.bt4u.www.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchema() throws java.rmi.RemoteException;
    public org.bt4u.www.GetNextDeparturesResponseGetNextDeparturesResult getNextDepartures(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException;
    public org.bt4u.www.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchema(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException;
}
