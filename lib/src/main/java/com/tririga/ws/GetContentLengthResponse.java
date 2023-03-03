package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContentLengthResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getContentLengthResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContentLengthResponse", propOrder = {
        "length"
})
public class GetContentLengthResponse {

    @XmlElement(nillable = true)
    protected Long length;

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

}
