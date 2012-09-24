/**
 * GetNextDeparturesWithXMLSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetNextDeparturesWithXMLSchemaResponse  implements java.io.Serializable {
    private bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchemaResult;

    public GetNextDeparturesWithXMLSchemaResponse() {
    }

    public GetNextDeparturesWithXMLSchemaResponse(
           bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchemaResult) {
           this.getNextDeparturesWithXMLSchemaResult = getNextDeparturesWithXMLSchemaResult;
    }


    /**
     * Gets the getNextDeparturesWithXMLSchemaResult value for this GetNextDeparturesWithXMLSchemaResponse.
     * 
     * @return getNextDeparturesWithXMLSchemaResult
     */
    public bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getGetNextDeparturesWithXMLSchemaResult() {
        return getNextDeparturesWithXMLSchemaResult;
    }


    /**
     * Sets the getNextDeparturesWithXMLSchemaResult value for this GetNextDeparturesWithXMLSchemaResponse.
     * 
     * @param getNextDeparturesWithXMLSchemaResult
     */
    public void setGetNextDeparturesWithXMLSchemaResult(bustracker.GetNextDeparturesWithXMLSchemaResponseGetNextDeparturesWithXMLSchemaResult getNextDeparturesWithXMLSchemaResult) {
        this.getNextDeparturesWithXMLSchemaResult = getNextDeparturesWithXMLSchemaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNextDeparturesWithXMLSchemaResponse)) return false;
        GetNextDeparturesWithXMLSchemaResponse other = (GetNextDeparturesWithXMLSchemaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getNextDeparturesWithXMLSchemaResult==null && other.getGetNextDeparturesWithXMLSchemaResult()==null) || 
             (this.getNextDeparturesWithXMLSchemaResult!=null &&
              this.getNextDeparturesWithXMLSchemaResult.equals(other.getGetNextDeparturesWithXMLSchemaResult())));
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
        if (getGetNextDeparturesWithXMLSchemaResult() != null) {
            _hashCode += getGetNextDeparturesWithXMLSchemaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNextDeparturesWithXMLSchemaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDeparturesWithXMLSchemaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNextDeparturesWithXMLSchemaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "GetNextDeparturesWithXMLSchemaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">>GetNextDeparturesWithXMLSchemaResponse>GetNextDeparturesWithXMLSchemaResult"));
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
