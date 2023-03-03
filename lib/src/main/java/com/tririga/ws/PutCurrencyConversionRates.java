package com.tririga.ws;

import com.tririga.ws.dto.CurrencyConversionRate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putCurrencyConversionRates complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="putCurrencyConversionRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrencyConversionRates" type="{http://dto.ws.tririga.com}CurrencyConversionRate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putCurrencyConversionRates", propOrder = {
        "currencyConversionRates"
})
public class PutCurrencyConversionRates {

    @XmlElement(name = "CurrencyConversionRates", required = true)
    protected CurrencyConversionRate[] currencyConversionRates;

    /**
     * @return array of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate[] getCurrencyConversionRates() {
        if (this.currencyConversionRates == null) {
            return new CurrencyConversionRate[0];
        }
        CurrencyConversionRate[] retVal = new CurrencyConversionRate[this.currencyConversionRates.length];
        System.arraycopy(this.currencyConversionRates, 0, retVal, 0, this.currencyConversionRates.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link CurrencyConversionRate }
     */
    public void setCurrencyConversionRates(CurrencyConversionRate[] values) {
        if (values == null) {
            this.currencyConversionRates = null;
            return;
        }
        int len = values.length;
        this.currencyConversionRates = ((CurrencyConversionRate[]) new CurrencyConversionRate[len]);
        for (int i = 0; (i < len); i++) {
            this.currencyConversionRates[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate getCurrencyConversionRates(int idx) {
        if (this.currencyConversionRates == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.currencyConversionRates[idx];
    }

    public int getCurrencyConversionRatesLength() {
        if (this.currencyConversionRates == null) {
            return 0;
        }
        return this.currencyConversionRates.length;
    }

    /**
     * @param value allowed object is
     *              {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate setCurrencyConversionRates(int idx, CurrencyConversionRate value) {
        return this.currencyConversionRates[idx] = value;
    }

}
