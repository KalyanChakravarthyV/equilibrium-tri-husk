package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TriggerActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerActions", propOrder = {
        "actionName",
        "recordId"
})
public class TriggerActions {

    @XmlElement(required = true)
    protected String actionName;
    protected long recordId;

    /**
     * Gets the value of the actionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the recordId property.
     */
    public long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     */
    public void setRecordId(long value) {
        this.recordId = value;
    }

}
