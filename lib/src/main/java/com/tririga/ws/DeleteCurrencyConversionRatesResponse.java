package com.tririga.ws;

import com.tririga.ws.dto.ResponseHelperHeader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCurrencyConversionRatesResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deleteCurrencyConversionRatesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ResponseHelperHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCurrencyConversionRatesResponse", propOrder = {
        "out"
})
public class DeleteCurrencyConversionRatesResponse {

    protected ResponseHelperHeader out;

    /**
     * Gets the value of the out property.
     *
     * @return possible object is
     * {@link ResponseHelperHeader }
     */
    public ResponseHelperHeader getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     *
     * @param value allowed object is
     *              {@link ResponseHelperHeader }
     */
    public void setOut(ResponseHelperHeader value) {
        this.out = value;
    }

}
