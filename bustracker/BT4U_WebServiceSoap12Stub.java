/**
 * BT4U_WebServiceSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class BT4U_WebServiceSoap12Stub extends org.apache.axis.client.Stub implements bustracker.BT4U_WebServiceSoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledRoutes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "stopCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledRoutesResponse>GetScheduledRoutesResult"));
        oper.setReturnClass(bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledRoutesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledRoutesWithXMLSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "stopCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledRoutesWithXMLSchemaResponse>GetScheduledRoutesWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledRoutesWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledStopCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesResponse>GetScheduledStopCodesResult"));
        oper.setReturnClass(bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledStopCodesWithXMLSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesWithXMLSchemaResponse>GetScheduledStopCodesWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodesWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledStopNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesResponse>GetScheduledStopNamesResult"));
        oper.setReturnClass(bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNamesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledStopNamesWithXMLSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesWithXMLSchemaResponse>GetScheduledStopNamesWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNamesWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledPatternPoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsResponse>GetScheduledPatternPointsResult"));
        oper.setReturnClass(bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPointsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScheduledPatternPointsWithXMLSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsWithXMLSchemaResponse>GetScheduledPatternPointsWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPointsWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentBusInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentBusInfoResponse>GetCurrentBusInfoResult"));
        oper.setReturnClass(bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentBusInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentBusInfoWithXMLSchema");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentBusInfoWithXMLSchemaResponse>GetCurrentBusInfoWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentBusInfoWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentRoutes");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesResponse>GetCurrentRoutesResult"));
        oper.setReturnClass(bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentRoutesWithXMLSchema");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesWithXMLSchemaResponse>GetCurrentRoutesWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutesWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextDepartures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "stopCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesResponse>GetNextDeparturesResult"));
        oper.setReturnClass(bustracker.GetNextDeparturesResponseGetNextDeparturesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDeparturesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextDeparturesWithXMLSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bt4u.org/", "stopCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesWithXMLSchemaResponse>GetNextDeparturesWithXMLSchemaResult"));
        oper.setReturnClass(bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDeparturesWithXMLSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

    }

    public BT4U_WebServiceSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BT4U_WebServiceSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BT4U_WebServiceSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentBusInfoResponse>GetCurrentBusInfoResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentBusInfoWithXMLSchemaResponse>GetCurrentBusInfoWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesResponse>GetCurrentRoutesResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesWithXMLSchemaResponse>GetCurrentRoutesWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesResponse>GetNextDeparturesResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDeparturesResponseGetNextDeparturesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesWithXMLSchemaResponse>GetNextDeparturesWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsResponse>GetScheduledPatternPointsResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsWithXMLSchemaResponse>GetScheduledPatternPointsWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledRoutesResponse>GetScheduledRoutesResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledRoutesWithXMLSchemaResponse>GetScheduledRoutesWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesResponse>GetScheduledStopCodesResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesWithXMLSchemaResponse>GetScheduledStopCodesWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesResponse>GetScheduledStopNamesResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesWithXMLSchemaResponse>GetScheduledStopNamesWithXMLSchemaResult");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentBusInfo");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentBusInfoResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentBusInfoWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfoWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentBusInfoWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentBusInfoWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutes");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutesResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutesWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutesWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutesWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetCurrentRoutesWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDepartures");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDepartures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDeparturesResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDeparturesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDeparturesWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDeparturesWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDeparturesWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetNextDeparturesWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPoints");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPointsResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPointsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPointsWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPointsWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPointsWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledPatternPointsWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledRoutesWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledRoutesWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledRoutesWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledRoutesWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodes");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodesResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodesWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodesWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodesWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopCodesWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNames");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNamesResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNamesWithXMLSchema");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNamesWithXMLSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNamesWithXMLSchemaResponse");
            cachedSerQNames.add(qName);
            cls = bustracker.GetScheduledStopNamesWithXMLSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult getScheduledRoutes(java.lang.String stopCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledRoutes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledRoutes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stopCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledRoutesResponseGetScheduledRoutesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult getScheduledRoutesWithXMLSchema(java.lang.String stopCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledRoutesWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledRoutesWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stopCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledRoutesWithXMLSchemaResponseGetScheduledRoutesWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult getScheduledStopCodes(java.lang.String routeShortName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledStopCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledStopCodesResponseGetScheduledStopCodesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledStopCodesWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodesWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNames(java.lang.String routeShortName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledStopNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledStopNamesResponseGetScheduledStopNamesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchema(java.lang.String routeShortName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledStopNamesWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNamesWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult getScheduledPatternPoints(java.lang.String routeName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledPatternPoints");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledPatternPointsResponseGetScheduledPatternPointsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchema(java.lang.String routeName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetScheduledPatternPointsWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPointsWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult getCurrentBusInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetCurrentBusInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentBusInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetCurrentBusInfoResponseGetCurrentBusInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchema() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetCurrentBusInfoWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentBusInfoWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetCurrentRoutes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchema() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetCurrentRoutesWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutesWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetNextDeparturesResponseGetNextDeparturesResult getNextDepartures(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetNextDepartures");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDepartures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName, stopCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetNextDeparturesResponseGetNextDeparturesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetNextDeparturesResponseGetNextDeparturesResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetNextDeparturesResponseGetNextDeparturesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchema(java.lang.String routeShortName, java.lang.String stopCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.bt4u.org/GetNextDeparturesWithXMLSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDeparturesWithXMLSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeShortName, stopCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult) org.apache.axis.utils.JavaUtils.convert(_resp, bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
