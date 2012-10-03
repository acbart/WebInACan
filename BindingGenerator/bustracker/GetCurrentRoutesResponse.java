/**
 * GetCurrentRoutesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetCurrentRoutesResponse  implements java.io.Serializable {
    private bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutesResult;

    public GetCurrentRoutesResponse() {
    }

    public GetCurrentRoutesResponse(
           bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutesResult) {
           this.getCurrentRoutesResult = getCurrentRoutesResult;
    }


    /**
     * Gets the getCurrentRoutesResult value for this GetCurrentRoutesResponse.
     * 
     * @return getCurrentRoutesResult
     */
    public bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getGetCurrentRoutesResult() {
        return getCurrentRoutesResult;
    }


    /**
     * Sets the getCurrentRoutesResult value for this GetCurrentRoutesResponse.
     * 
     * @param getCurrentRoutesResult
     */
    public void setGetCurrentRoutesResult(bustracker.GetCurrentRoutesResponseGetCurrentRoutesResult getCurrentRoutesResult) {
        this.getCurrentRoutesResult = getCurrentRoutesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrentRoutesResponse)) return false;
        GetCurrentRoutesResponse other = (GetCurrentRoutesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCurrentRoutesResult==null && other.getGetCurrentRoutesResult()==null) || 
             (this.getCurrentRoutesResult!=null &&
              this.getCurrentRoutesResult.equals(other.getGetCurrentRoutesResult())));
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
        if (getGetCurrentRoutesResult() != null) {
            _hashCode += getGetCurrentRoutesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentRoutesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetCurrentRoutesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentRoutesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetCurrentRoutesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetCurrentRoutesResponse>GetCurrentRoutesResult"));
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
