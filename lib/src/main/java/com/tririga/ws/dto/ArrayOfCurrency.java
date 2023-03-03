package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCurrency complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfCurrency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Currency" type="{http://dto.ws.tririga.com}Currency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCurrency", propOrder = {
        "currency"
})
public class ArrayOfCurrency {

    @XmlElement(name = "Currency", nillable = true)
    protected Currency[] currency;

    /**
     * @return array of
     * {@link Currency }
     */
    public Currency[] getCurrency() {
        if (this.currency == null) {
            return new Currency[0];
        }
        Currency[] retVal = new Currency[this.currency.length];
        System.arraycopy(this.currency, 0, retVal, 0, this.currency.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Currency }
     */
    public void setCurrency(Currency[] values) {
        if (values == null) {
            this.currency = null;
            return;
        }
        int len = values.length;
        this.currency = ((Currency[]) new Currency[len]);
        for (int i = 0; (i < len); i++) {
            this.currency[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Currency }
     */
    public Currency getCurrency(int idx) {
        if (this.currency == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.currency[idx];
    }

    public int getCurrencyLength() {
        if (this.currency == null) {
            return 0;
        }
        return this.currency.length;
    }

    /**
     * @param value allowed object is
     *              {@link Currency }
     */
    public Currency setCurrency(int idx, Currency value) {
        return this.currency[idx] = value;
    }

}
