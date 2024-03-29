//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.exchange.client.model.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldStatus" type="{http://asxgw.com/Schema/V2/ScheduleResult}scheduleStatusType" minOccurs="0"/>
 *         &lt;element name="newStatus" type="{http://asxgw.com/Schema/V2/ScheduleResult}scheduleStatusType" minOccurs="0"/>
 *         &lt;element name="scheduledAt" type="{http://asxgw.com/Schema/V2/ScheduleResult}scheduleDateTime" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://asxgw.com/Schema/V2/ScheduleResult}errorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleResultType", namespace = "http://asxgw.com/Schema/V2/ScheduleResult", propOrder = {
    "operationSuccess",
    "scheduleId",
    "registrationId",
    "oldStatus",
    "newStatus",
    "scheduledAt",
    "errors"
})
@XmlRootElement(name = "schedule")
public class ScheduleResultType {

    protected boolean operationSuccess;
    protected String scheduleId;
    protected String registrationId;
    protected ScheduleStatusType oldStatus;
    protected ScheduleStatusType newStatus;
    protected String scheduledAt;
    protected ErrorsType errors;

    /**
     * Default no-arg constructor
     * 
     */
    public ScheduleResultType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScheduleResultType(final boolean operationSuccess, final String scheduleId, final String registrationId, final ScheduleStatusType oldStatus, final ScheduleStatusType newStatus, final String scheduledAt, final ErrorsType errors) {
        this.operationSuccess = operationSuccess;
        this.scheduleId = scheduleId;
        this.registrationId = registrationId;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.scheduledAt = scheduledAt;
        this.errors = errors;
    }

    /**
     * Gets the value of the operationSuccess property.
     * 
     */
    public boolean isOperationSuccess() {
        return operationSuccess;
    }

    /**
     * Sets the value of the operationSuccess property.
     * 
     */
    public void setOperationSuccess(boolean value) {
        this.operationSuccess = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the oldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleStatusType }
     *     
     */
    public ScheduleStatusType getOldStatus() {
        return oldStatus;
    }

    /**
     * Sets the value of the oldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleStatusType }
     *     
     */
    public void setOldStatus(ScheduleStatusType value) {
        this.oldStatus = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleStatusType }
     *     
     */
    public ScheduleStatusType getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleStatusType }
     *     
     */
    public void setNewStatus(ScheduleStatusType value) {
        this.newStatus = value;
    }

    /**
     * Gets the value of the scheduledAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledAt() {
        return scheduledAt;
    }

    /**
     * Sets the value of the scheduledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledAt(String value) {
        this.scheduledAt = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

}
