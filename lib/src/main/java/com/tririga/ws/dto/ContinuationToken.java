package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContinuationToken complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContinuationToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tokenString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinuationToken", propOrder = {
        "tokenString"
})
public class ContinuationToken {

    @XmlElement(required = true)
    protected String tokenString;

    /**
     * Gets the value of the tokenString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTokenString() {
        return tokenString;
    }

    /**
     * Sets the value of the tokenString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTokenString(String value) {
        this.tokenString = value;
    }

}
