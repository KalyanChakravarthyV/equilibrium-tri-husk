package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGUI complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getGUI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGUI", propOrder = {
        "guiId",
        "recordId"
})
public class GetGUI {

    protected long guiId;
    protected long recordId;

    /**
     * Gets the value of the guiId property.
     */
    public long getGuiId() {
        return guiId;
    }

    /**
     * Sets the value of the guiId property.
     */
    public void setGuiId(long value) {
        this.guiId = value;
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
