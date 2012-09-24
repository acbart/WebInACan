/**
 * GetScheduledPatternPointsWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetScheduledPatternPointsWithXMLSchemaResponse  implements java.io.Serializable {
    private bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchemaResult;

    public GetScheduledPatternPointsWithXMLSchemaResponse() {
    }

    public GetScheduledPatternPointsWithXMLSchemaResponse(
           bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchemaResult) {
           this.getScheduledPatternPointsWithXMLSchemaResult = getScheduledPatternPointsWithXMLSchemaResult;
    }


    /**
     * Gets the getScheduledPatternPointsWithXMLSchemaResult value for this GetScheduledPatternPointsWithXMLSchemaResponse.
     * 
     * @return getScheduledPatternPointsWithXMLSchemaResult
     */
    public bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getGetScheduledPatternPointsWithXMLSchemaResult() {
        return getScheduledPatternPointsWithXMLSchemaResult;
    }


    /**
     * Sets the getScheduledPatternPointsWithXMLSchemaResult value for this GetScheduledPatternPointsWithXMLSchemaResponse.
     * 
     * @param getScheduledPatternPointsWithXMLSchemaResult
     */
    public void setGetScheduledPatternPointsWithXMLSchemaResult(bustracker.GetScheduledPatternPointsWithXMLSchemaResponseGetScheduledPatternPointsWithXMLSchemaResult getScheduledPatternPointsWithXMLSchemaResult) {
        this.getScheduledPatternPointsWithXMLSchemaResult = getScheduledPatternPointsWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledPatternPointsWithXMLSchemaResponse)) return false;
        GetScheduledPatternPointsWithXMLSchemaResponse other = (GetScheduledPatternPointsWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledPatternPointsWithXMLSchemaResult==null && other.getGetScheduledPatternPointsWithXMLSchemaResult()==null) || 
             (this.getScheduledPatternPointsWithXMLSchemaResult!=null &&
              this.getScheduledPatternPointsWithXMLSchemaResult.equals(other.getGetScheduledPatternPointsWithXMLSchemaResult())));
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
        if (getGetScheduledPatternPointsWithXMLSchemaResult() != null) {
            _hashCode += getGetScheduledPatternPointsWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledPatternPointsWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPointsWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledPatternPointsWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledPatternPointsWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledPatternPointsWithXMLSchemaResponse>GetScheduledPatternPointsWithXMLSchemaResult"));
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
