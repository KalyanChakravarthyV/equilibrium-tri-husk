package com.tririga.ws;

import com.tririga.ws.dto.CurrencyConversionRate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putCurrencyConversionRatesResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="putCurrencyConversionRatesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}CurrencyConversionRate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putCurrencyConversionRatesResponse", propOrder = {
        "out"
})
public class PutCurrencyConversionRatesResponse {

    @XmlElement(required = true, nillable = true)
    protected CurrencyConversionRate[] out;

    /**
     * @return array of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate[] getOut() {
        if (this.out == null) {
            return new CurrencyConversionRate[0];
        }
        CurrencyConversionRate[] retVal = new CurrencyConversionRate[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link CurrencyConversionRate }
     */
    public void setOut(CurrencyConversionRate[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((CurrencyConversionRate[]) new CurrencyConversionRate[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate getOut(int idx) {
        if (this.out == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.out[idx];
    }

    public int getOutLength() {
        if (this.out == null) {
            return 0;
        }
        return this.out.length;
    }

    /**
     * @param value allowed object is
     *              {@link CurrencyConversionRate }
     */
    public CurrencyConversionRate setOut(int idx, CurrencyConversionRate value) {
        return this.out[idx] = value;
    }

}
