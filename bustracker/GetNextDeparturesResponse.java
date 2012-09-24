/**
 * GetNextDeparturesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetNextDeparturesResponse  implements java.io.Serializable {
    private bustracker.GetNextDeparturesResponseGetNextDeparturesResult getNextDeparturesResult;

    public GetNextDeparturesResponse() {
    }

    public GetNextDeparturesResponse(
           bustracker.GetNextDeparturesResponseGetNextDeparturesResult getNextDeparturesResult) {
           this.getNextDeparturesResult = getNextDeparturesResult;
    }


    /**
     * Gets the getNextDeparturesResult value for this GetNextDeparturesResponse.
     * 
     * @return getNextDeparturesResult
     */
    public bustracker.GetNextDeparturesResponseGetNextDeparturesResult getGetNextDeparturesResult() {
        return getNextDeparturesResult;
    }


    /**
     * Sets the getNextDeparturesResult value for this GetNextDeparturesResponse.
     * 
     * @param getNextDeparturesResult
     */
    public void setGetNextDeparturesResult(bustracker.GetNextDeparturesResponseGetNextDeparturesResult getNextDeparturesResult) {
        this.getNextDeparturesResult = getNextDeparturesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNextDeparturesResponse)) return false;
        GetNextDeparturesResponse other = (GetNextDeparturesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getNextDeparturesResult==null && other.getGetNextDeparturesResult()==null) || 
             (this.getNextDeparturesResult!=null &&
              this.getNextDeparturesResult.equals(other.getGetNextDeparturesResult())));
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
        if (getGetNextDeparturesResult() != null) {
            _hashCode += getGetNextDeparturesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNextDeparturesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDeparturesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNextDeparturesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDeparturesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesResponse>GetNextDeparturesResult"));
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
