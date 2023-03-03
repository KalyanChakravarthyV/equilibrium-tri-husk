package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copy complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="copy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="toRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copy", propOrder = {
        "fromRecordId",
        "toRecordId"
})
public class Copy {

    protected long fromRecordId;
    protected long toRecordId;

    /**
     * Gets the value of the fromRecordId property.
     */
    public long getFromRecordId() {
        return fromRecordId;
    }

    /**
     * Sets the value of the fromRecordId property.
     */
    public void setFromRecordId(long value) {
        this.fromRecordId = value;
    }

    /**
     * Gets the value of the toRecordId property.
     */
    public long getToRecordId() {
        return toRecordId;
    }

    /**
     * Sets the value of the toRecordId property.
     */
    public void setToRecordId(long value) {
        this.toRecordId = value;
    }

}
