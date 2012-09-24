/**
 * GetScheduledPatternPoints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetScheduledPatternPoints  implements java.io.Serializable {
    private java.lang.String routeName;

    public GetScheduledPatternPoints() {
    }

    public GetScheduledPatternPoints(
           java.lang.String routeName) {
           this.routeName = routeName;
    }


    /**
     * Gets the routeName value for this GetScheduledPatternPoints.
     * 
     * @return routeName
     */
    public java.lang.String getRouteName() {
        return routeName;
    }


    /**
     * Sets the routeName value for this GetScheduledPatternPoints.
     * 
     * @param routeName
     */
    public void setRouteName(java.lang.String routeName) {
        this.routeName = routeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetScheduledPatternPoints)) return false;
        GetScheduledPatternPoints other = (GetScheduledPatternPoints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routeName==null && other.getRouteName()==null) || 
             (this.routeName!=null &&
              this.routeName.equals(other.getRouteName())));
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
        if (getRouteName() != null) {
            _hashCode += getRouteName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScheduledPatternPoints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetScheduledPatternPoints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
