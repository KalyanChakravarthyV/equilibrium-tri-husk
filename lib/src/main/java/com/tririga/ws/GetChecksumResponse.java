package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChecksumResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getChecksumResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChecksumResponse", propOrder = {
        "checksum"
})
public class GetChecksumResponse {

    @XmlElement(nillable = true)
    protected Long checksum;

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

}
