//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.exchange.client.model.callback;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callbackType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://asxgw.com/Schema/V2/Callback}callbackType">
 *       &lt;redefine>
 *         &lt;complexType name="callbackType">
 *           &lt;complexContent>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;sequence>
 *                 &lt;element name="result" type="{http://asxgw.com/Schema/V2/Callback}resultType"/>
 *                 &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;element name="transactionType" type="{http://asxgw.com/Schema/V2/Callback}transactionMethodType" minOccurs="0"/>
 *                 &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;element name="amount" type="{http://asxgw.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *                 &lt;element name="currency" type="{http://asxgw.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *                 &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;element name="scheduleStatus" type="{http://asxgw.com/Schema/V2/Callback}scheduleStatusType" minOccurs="0"/>
 *                 &lt;element name="customerProfile" type="{http://asxgw.com/Schema/V2/Callback}customerProfileDataType" minOccurs="0"/>
 *                 &lt;element name="errors" type="{http://asxgw.com/Schema/V2/Callback}errorsType" minOccurs="0"/>
 *                 &lt;element name="chargebackData" type="{http://asxgw.com/Schema/V2/Callback}chargebackDataType" minOccurs="0"/>
 *                 &lt;element name="chargebackReversalData" type="{http://asxgw.com/Schema/V2/Callback}chargebackReversalDataType" minOccurs="0"/>
 *                 &lt;element name="extraData" type="{http://asxgw.com/Schema/V2/Callback}extraDataType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element name="merchantMetaData" type="{http://asxgw.com/Schema/V2/Callback}merchantMetaDataType" minOccurs="0"/>
 *                 &lt;element name="returnData" type="{http://asxgw.com/Schema/V2/Callback}returnDataType" minOccurs="0"/>
 *                 &lt;element name="customerData" type="{http://asxgw.com/Schema/V2/Callback}customerDataType" minOccurs="0"/>
 *               &lt;/sequence>
 *             &lt;/restriction>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element name="fees" type="{http://asxgw.com/Schema/V2/Callback}feesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callbackType", propOrder = {
    "fees"
})
public class CallbackType
    extends OriginalCallbackType
{

    protected FeesType fees;

    /**
     * Default no-arg constructor
     * 
     */
    public CallbackType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CallbackType(final ResultType result, final String referenceId, final String transactionId, final String purchaseId, final TransactionMethodType transactionType, final String paymentMethod, final BigDecimal amount, final String currency, final String scheduleId, final ScheduleStatusType scheduleStatus, final CustomerProfileDataType customerProfile, final ErrorsType errors, final ChargebackDataType chargebackData, final ChargebackReversalDataType chargebackReversalData, final List<ExtraDataType> extraData, final String merchantMetaData, final ReturnDataType returnData, final CustomerDataType customerData, final FeesType fees) {
        super(result, referenceId, transactionId, purchaseId, transactionType, paymentMethod, amount, currency, scheduleId, scheduleStatus, customerProfile, errors, chargebackData, chargebackReversalData, extraData, merchantMetaData, returnData, customerData);
        this.fees = fees;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

}