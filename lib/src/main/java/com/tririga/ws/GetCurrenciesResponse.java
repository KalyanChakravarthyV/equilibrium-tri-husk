package com.tririga.ws;

import com.tririga.ws.dto.Currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrenciesResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getCurrenciesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}Currency" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrenciesResponse", propOrder = {
        "out"
})
public class GetCurrenciesResponse {

    @XmlElement(required = true, nillable = true)
    protected Currency[] out;

    /**
     * @return array of
     * {@link Currency }
     */
    public Currency[] getOut() {
        if (this.out == null) {
            return new Currency[0];
        }
        Currency[] retVal = new Currency[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Currency }
     */
    public void setOut(Currency[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((Currency[]) new Currency[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Currency }
     */
    public Currency getOut(int idx) {
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
     *              {@link Currency }
     */
    public Currency setOut(int idx, Currency value) {
        return this.out[idx] = value;
    }

}
