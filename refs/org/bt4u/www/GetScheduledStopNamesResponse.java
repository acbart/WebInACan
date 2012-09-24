/**
 * GetScheduledStopNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.bt4u.www;

public class GetScheduledStopNamesResponse  implements java.io.Serializable {
    private org.bt4u.www.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNamesResult;

    public GetScheduledStopNamesResponse() {
    }

    public GetScheduledStopNamesResponse(
           org.bt4u.www.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNamesResult) {
           this.getScheduledStopNamesResult = getScheduledStopNamesResult;
    }


    /**
     * Gets the getScheduledStopNamesResult value for this GetScheduledStopNamesResponse.
     * 
     * @return getScheduledStopNamesResult
     */
    public org.bt4u.www.GetScheduledStopNamesResponseGetScheduledStopNamesResult getGetScheduledStopNamesResult() {
        return getScheduledStopNamesResult;
    }


    /**
     * Sets the getScheduledStopNamesResult value for this GetScheduledStopNamesResponse.
     * 
     * @param getScheduledStopNamesResult
     */
    public void setGetScheduledStopNamesResult(org.bt4u.www.GetScheduledStopNamesResponseGetScheduledStopNamesResult getScheduledStopNamesResult) {
        this.getScheduledStopNamesResult = getScheduledStopNamesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledStopNamesResponse)) return false;
        GetScheduledStopNamesResponse other = (GetScheduledStopNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getScheduledStopNamesResult==null && other.getGetScheduledStopNamesResult()==null) || 
             (this.getScheduledStopNamesResult!=null &&
              this.getScheduledStopNamesResult.equals(other.getGetScheduledStopNamesResult())));
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
        if (getGetScheduledStopNamesResult() != null) {
            _hashCode += getGetScheduledStopNamesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledStopNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledStopNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getScheduledStopNamesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetScheduledStopNamesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetScheduledStopNamesResponse>GetScheduledStopNamesResult"));
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
