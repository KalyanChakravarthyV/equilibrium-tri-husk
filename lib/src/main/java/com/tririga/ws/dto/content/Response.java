package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://content.dto.ws.tririga.com}Content"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
        "checksum",
        "length",
        "message",
        "mimeType",
        "status",
        "updatedDate"
})
public class Response
        extends Content {

    protected Long checksum;
    @XmlElement(nillable = true)
    protected Long length;
    @XmlElement(nillable = true)
    protected String message;
    @XmlElement(nillable = true)
    protected String mimeType;
    @XmlElement(nillable = true)
    protected String status;
    @XmlElement(nillable = true)
    protected String updatedDate;

    /**
     * Gets the value of the checksum property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setChecksum(Long value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the length property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLength(Long value) {
        this.length = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the mimeType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the updatedDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

}
