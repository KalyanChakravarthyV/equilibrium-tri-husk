package com.tririga.ws;

import com.tririga.ws.dto.ConversionGroup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrencyConversionGroupsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getCurrencyConversionGroupsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ConversionGroup" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrencyConversionGroupsResponse", propOrder = {
        "out"
})
public class GetCurrencyConversionGroupsResponse {

    @XmlElement(required = true, nillable = true)
    protected ConversionGroup[] out;

    /**
     * @return array of
     * {@link ConversionGroup }
     */
    public ConversionGroup[] getOut() {
        if (this.out == null) {
            return new ConversionGroup[0];
        }
        ConversionGroup[] retVal = new ConversionGroup[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ConversionGroup }
     */
    public void setOut(ConversionGroup[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((ConversionGroup[]) new ConversionGroup[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ConversionGroup }
     */
    public ConversionGroup getOut(int idx) {
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
     *              {@link ConversionGroup }
     */
    public ConversionGroup setOut(int idx, ConversionGroup value) {
        return this.out[idx] = value;
    }

}
