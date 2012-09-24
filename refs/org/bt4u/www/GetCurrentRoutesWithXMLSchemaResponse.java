/**
 * GetCurrentRoutesWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public class GetCurrentRoutesWithXMLSchemaResponse  implements java.io.Serializable {
    private org.bt4u.www.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchemaResult;

    public GetCurrentRoutesWithXMLSchemaResponse() {
    }

    public GetCurrentRoutesWithXMLSchemaResponse(
           org.bt4u.www.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchemaResult) {
           this.getCurrentRoutesWithXMLSchemaResult = getCurrentRoutesWithXMLSchemaResult;
    }


    /**
     * Gets the getCurrentRoutesWithXMLSchemaResult value for this GetCurrentRoutesWithXMLSchemaResponse.
     * 
     * @return getCurrentRoutesWithXMLSchemaResult
     */
    public org.bt4u.www.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getGetCurrentRoutesWithXMLSchemaResult() {
        return getCurrentRoutesWithXMLSchemaResult;
    }


    /**
     * Sets the getCurrentRoutesWithXMLSchemaResult value for this GetCurrentRoutesWithXMLSchemaResponse.
     * 
     * @param getCurrentRoutesWithXMLSchemaResult
     */
    public void setGetCurrentRoutesWithXMLSchemaResult(org.bt4u.www.GetCurrentRoutesWithXMLSchemaResponseGetCurrentRoutesWithXMLSchemaResult getCurrentRoutesWithXMLSchemaResult) {
        this.getCurrentRoutesWithXMLSchemaResult = getCurrentRoutesWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentRoutesWithXMLSchemaResponse)) return false;
        GetCurrentRoutesWithXMLSchemaResponse other = (GetCurrentRoutesWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCurrentRoutesWithXMLSchemaResult==null && other.getGetCurrentRoutesWithXMLSchemaResult()==null) || 
             (this.getCurrentRoutesWithXMLSchemaResult!=null &&
              this.getCurrentRoutesWithXMLSchemaResult.equals(other.getGetCurrentRoutesWithXMLSchemaResult())));
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
        if (getGetCurrentRoutesWithXMLSchemaResult() != null) {
            _hashCode += getGetCurrentRoutesWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentRoutesWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutesWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentRoutesWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutesWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesWithXMLSchemaResponse>GetCurrentRoutesWithXMLSchemaResult"));
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
