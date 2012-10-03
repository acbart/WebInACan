/**
 * GetScheduledStopNamesWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public class GetScheduledStopNamesWithXMLSchemaResponse  implements java.io.Serializable {
    private org.bt4u.www.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchemaResult;

    public GetScheduledStopNamesWithXMLSchemaResponse() {
    }

    public GetScheduledStopNamesWithXMLSchemaResponse(
           org.bt4u.www.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchemaResult) {
           this.getScheduledStopNamesWithXMLSchemaResult = getScheduledStopNamesWithXMLSchemaResult;
    }


    /**
     * Gets the getScheduledStopNamesWithXMLSchemaResult value for this GetScheduledStopNamesWithXMLSchemaResponse.
     * 
     * @return getScheduledStopNamesWithXMLSchemaResult
     */
    public org.bt4u.www.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getGetScheduledStopNamesWithXMLSchemaResult() {
        return getScheduledStopNamesWithXMLSchemaResult;
    }


    /**
     * Sets the getScheduledStopNamesWithXMLSchemaResult value for this GetScheduledStopNamesWithXMLSchemaResponse.
     * 
     * @param getScheduledStopNamesWithXMLSchemaResult
     */
    public void setGetScheduledStopNamesWithXMLSchemaResult(org.bt4u.www.GetScheduledStopNamesWithXMLSchemaResponseGetScheduledStopNamesWithXMLSchemaResult getScheduledStopNamesWithXMLSchemaResult) {
        this.getScheduledStopNamesWithXMLSchemaResult = getScheduledStopNamesWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledStopNamesWithXMLSchemaResponse)) return false;
        GetScheduledStopNamesWithXMLSchemaResponse other = (GetScheduledStopNamesWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledStopNamesWithXMLSchemaResult==null && other.getGetScheduledStopNamesWithXMLSchemaResult()==null) || 
             (this.getScheduledStopNamesWithXMLSchemaResult!=null &&
              this.getScheduledStopNamesWithXMLSchemaResult.equals(other.getGetScheduledStopNamesWithXMLSchemaResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetScheduledStopNamesWithXMLSchemaResult() != null) {
            _hashCode += getGetScheduledStopNamesWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledStopNamesWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNamesWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledStopNamesWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNamesWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesWithXMLSchemaResponse>GetScheduledStopNamesWithXMLSchemaResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
