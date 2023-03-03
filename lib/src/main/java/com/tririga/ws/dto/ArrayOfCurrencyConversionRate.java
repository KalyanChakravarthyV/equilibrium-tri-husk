package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCurrencyConversionRate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfCurrencyConversionRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyConversionRate" type="{http://dto.ws.tririga.com}CurrencyConversionRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCurrencyConversionRate", propOrder = {
        "currencyConversionRate"
})
public class ArrayOfCurrencyConversionRate {

    @XmlElement(name = "CurrencyConversionRate", nillable = true)
    protected CurrencyConversionRate[] currencyConversionRate;

    /**
     * @return array of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate[] getCurrencyConversionRate() {
        if (this.currencyConversionRate == null) {
            return new CurrencyConversionRate[0];
        }
        CurrencyConversionRate[] retVal = new CurrencyConversionRate[this.currencyConversionRate.length];
        System.arraycopy(this.currencyConversionRate, 0, retVal, 0, this.currencyConversionRate.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link CurrencyConversionRate }
     */
    public void setCurrencyConversionRate(CurrencyConversionRate[] values) {
        if (values == null) {
            this.currencyConversionRate = null;
            return;
        }
        int len = values.length;
        this.currencyConversionRate = ((CurrencyConversionRate[]) new CurrencyConversionRate[len]);
        for (int i = 0; (i < len); i++) {
            this.currencyConversionRate[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate getCurrencyConversionRate(int idx) {
        if (this.currencyConversionRate == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.currencyConversionRate[idx];
    }

    public int getCurrencyConversionRateLength() {
        if (this.currencyConversionRate == null) {
            return 0;
        }
        return this.currencyConversionRate.length;
    }

    /**
     * @param value allowed object is
     *              {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate setCurrencyConversionRate(int idx, CurrencyConversionRate value) {
        return this.currencyConversionRate[idx] = value;
    }

}
