//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.exchange.client.model.transaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="INITIAL"/>
 *     &lt;enumeration value="RECURRING"/>
 *     &lt;enumeration value="CARDONFILE"/>
 *     &lt;enumeration value="CARDONFILE-MERCHANT-INITIATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionIndicatorType")
@XmlEnum
public enum TransactionIndicatorType {

    SINGLE("SINGLE"),
    INITIAL("INITIAL"),
    RECURRING("RECURRING"),
    CARDONFILE("CARDONFILE"),
    @XmlEnumValue("CARDONFILE-MERCHANT-INITIATED")
    CARDONFILE_MERCHANT_INITIATED("CARDONFILE-MERCHANT-INITIATED");
    private final String value;

    TransactionIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionIndicatorType fromValue(String v) {
        for (TransactionIndicatorType c: TransactionIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
