/**
 * GetScheduledStopCodesWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetScheduledStopCodesWithXMLSchemaResponse  implements java.io.Serializable {
    private bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchemaResult;

    public GetScheduledStopCodesWithXMLSchemaResponse() {
    }

    public GetScheduledStopCodesWithXMLSchemaResponse(
           bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchemaResult) {
           this.getScheduledStopCodesWithXMLSchemaResult = getScheduledStopCodesWithXMLSchemaResult;
    }


    /**
     * Gets the getScheduledStopCodesWithXMLSchemaResult value for this GetScheduledStopCodesWithXMLSchemaResponse.
     * 
     * @return getScheduledStopCodesWithXMLSchemaResult
     */
    public bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getGetScheduledStopCodesWithXMLSchemaResult() {
        return getScheduledStopCodesWithXMLSchemaResult;
    }


    /**
     * Sets the getScheduledStopCodesWithXMLSchemaResult value for this GetScheduledStopCodesWithXMLSchemaResponse.
     * 
     * @param getScheduledStopCodesWithXMLSchemaResult
     */
    public void setGetScheduledStopCodesWithXMLSchemaResult(bustracker.GetScheduledStopCodesWithXMLSchemaResponseGetScheduledStopCodesWithXMLSchemaResult getScheduledStopCodesWithXMLSchemaResult) {
        this.getScheduledStopCodesWithXMLSchemaResult = getScheduledStopCodesWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledStopCodesWithXMLSchemaResponse)) return false;
        GetScheduledStopCodesWithXMLSchemaResponse other = (GetScheduledStopCodesWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledStopCodesWithXMLSchemaResult==null && other.getGetScheduledStopCodesWithXMLSchemaResult()==null) || 
             (this.getScheduledStopCodesWithXMLSchemaResult!=null &&
              this.getScheduledStopCodesWithXMLSchemaResult.equals(other.getGetScheduledStopCodesWithXMLSchemaResult())));
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
        if (getGetScheduledStopCodesWithXMLSchemaResult() != null) {
            _hashCode += getGetScheduledStopCodesWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledStopCodesWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopCodesWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledStopCodesWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopCodesWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopCodesWithXMLSchemaResponse>GetScheduledStopCodesWithXMLSchemaResult"));
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
