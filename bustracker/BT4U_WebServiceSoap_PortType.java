/**
 * BT4U_WebServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public interface BT4U_WebServiceSoap_PortType extends java.rmi.Remote {
    public bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult getScheduledRoutes(java.lang.String stopCode) throws java.rmi.RemoteException;
    public bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult getScheduledRoutesWithXMLSchema(java.lang.String stopCode) throws java.rmi.RemoteException;
    public bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodes(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNames(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException;
    public bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPoints(java.lang.String routeName) throws java.rmi.RemoteException;
    public bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchema(java.lang.String routeName) throws java.rmi.RemoteException;
    public bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult getCurrentBusInfo() throws java.rmi.RemoteException;
    public bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchema() throws java.rmi.RemoteException;
    public bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutes() throws java.rmi.RemoteException;
    public bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchema() throws java.rmi.RemoteException;
    public bustracker.GetNextDeparturesResponseGetNextDeparturesResult getNextDepartures(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException;
    public bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchema(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException;
}
