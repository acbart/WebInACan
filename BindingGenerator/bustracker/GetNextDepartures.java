/**
 * GetNextDepartures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bustracker;

public class GetNextDepartures  implements java.io.Serializable {
    private java.lang.String routeShortName;

    private java.lang.String stopCode;

    public GetNextDepartures() {
    }

    public GetNextDepartures(
           java.lang.String routeShortName,
           java.lang.String stopCode) {
           this.routeShortName = routeShortName;
           this.stopCode = stopCode;
    }


    /**
     * Gets the routeShortName value for this GetNextDepartures.
     * 
     * @return routeShortName
     */
    public java.lang.String getRouteShortName() {
        return routeShortName;
    }


    /**
     * Sets the routeShortName value for this GetNextDepartures.
     * 
     * @param routeShortName
     */
    public void setRouteShortName(java.lang.String routeShortName) {
        this.routeShortName = routeShortName;
    }


    /**
     * Gets the stopCode value for this GetNextDepartures.
     * 
     * @return stopCode
     */
    public java.lang.String getStopCode() {
        return stopCode;
    }


    /**
     * Sets the stopCode value for this GetNextDepartures.
     * 
     * @param stopCode
     */
    public void setStopCode(java.lang.String stopCode) {
        this.stopCode = stopCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNextDepartures)) return false;
        GetNextDepartures other = (GetNextDepartures) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routeShortName==null && other.getRouteShortName()==null) || 
             (this.routeShortName!=null &&
              this.routeShortName.equals(other.getRouteShortName()))) &&
            ((this.stopCode==null && other.getStopCode()==null) || 
             (this.stopCode!=null &&
              this.stopCode.equals(other.getStopCode())));
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
        if (getRouteShortName() != null) {
            _hashCode += getRouteShortName().hashCode();
        }
        if (getStopCode() != null) {
            _hashCode += getStopCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNextDepartures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bt4u.org/", ">GetNextDepartures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeShortName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "routeShortName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bt4u.org/", "stopCode"));
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
