/**
 * GetCurrentBusInfoWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public class GetCurrentBusInfoWithXMLSchemaResponse  implements java.io.Serializable {
    private org.bt4u.www.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchemaResult;

    public GetCurrentBusInfoWithXMLSchemaResponse() {
    }

    public GetCurrentBusInfoWithXMLSchemaResponse(
           org.bt4u.www.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchemaResult) {
           this.getCurrentBusInfoWithXMLSchemaResult = getCurrentBusInfoWithXMLSchemaResult;
    }


    /**
     * Gets the getCurrentBusInfoWithXMLSchemaResult value for this GetCurrentBusInfoWithXMLSchemaResponse.
     * 
     * @return getCurrentBusInfoWithXMLSchemaResult
     */
    public org.bt4u.www.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getGetCurrentBusInfoWithXMLSchemaResult() {
        return getCurrentBusInfoWithXMLSchemaResult;
    }


    /**
     * Sets the getCurrentBusInfoWithXMLSchemaResult value for this GetCurrentBusInfoWithXMLSchemaResponse.
     * 
     * @param getCurrentBusInfoWithXMLSchemaResult
     */
    public void setGetCurrentBusInfoWithXMLSchemaResult(org.bt4u.www.GetCurrentBusInfoWithXMLSchemaResponseGetCurrentBusInfoWithXMLSchemaResult getCurrentBusInfoWithXMLSchemaResult) {
        this.getCurrentBusInfoWithXMLSchemaResult = getCurrentBusInfoWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentBusInfoWithXMLSchemaResponse)) return false;
        GetCurrentBusInfoWithXMLSchemaResponse other = (GetCurrentBusInfoWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCurrentBusInfoWithXMLSchemaResult==null && other.getGetCurrentBusInfoWithXMLSchemaResult()==null) || 
             (this.getCurrentBusInfoWithXMLSchemaResult!=null &&
              this.getCurrentBusInfoWithXMLSchemaResult.equals(other.getGetCurrentBusInfoWithXMLSchemaResult())));
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
        if (getGetCurrentBusInfoWithXMLSchemaResult() != null) {
            _hashCode += getGetCurrentBusInfoWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentBusInfoWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentBusInfoWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentBusInfoWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentBusInfoWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentBusInfoWithXMLSchemaResponse>GetCurrentBusInfoWithXMLSchemaResult"));
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
