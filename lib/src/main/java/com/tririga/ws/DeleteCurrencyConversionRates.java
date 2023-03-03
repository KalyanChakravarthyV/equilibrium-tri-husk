package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCurrencyConversionRates complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deleteCurrencyConversionRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conversionRateIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCurrencyConversionRates", propOrder = {
        "conversionRateIds"
})
public class DeleteCurrencyConversionRates {

    @XmlElement(type = Long.class)
    protected long[] conversionRateIds;

    /**
     * @return array of
     * {@link Long }
     */
    public long[] getConversionRateIds() {
        if (this.conversionRateIds == null) {
            return new long[0];
        }
        long[] retVal = new long[this.conversionRateIds.length];
        System.arraycopy(this.conversionRateIds, 0, retVal, 0, this.conversionRateIds.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Long }
     */
    public void setConversionRateIds(long[] values) {
        if (values == null) {
            this.conversionRateIds = null;
            return;
        }
        int len = values.length;
        this.conversionRateIds = ((long[]) new long[len]);
        for (int i = 0; (i < len); i++) {
            this.conversionRateIds[i] = new Long(values[i]);
        }
    }

    /**
     * @return one of
     * {@link Long }
     */
    public long getConversionRateIds(int idx) {
        if (this.conversionRateIds == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.conversionRateIds[idx];
    }

    public int getConversionRateIdsLength() {
        if (this.conversionRateIds == null) {
            return 0;
        }
        return this.conversionRateIds.length;
    }

    /**
     * @param value allowed object is
     *              {@link Long }
     */
    public long setConversionRateIds(int idx, long value) {
        return this.conversionRateIds[idx] = new Long(value);
    }

}
