package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConversionGroup complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfConversionGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConversionGroup" type="{http://dto.ws.tririga.com}ConversionGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversionGroup", propOrder = {
        "conversionGroup"
})
public class ArrayOfConversionGroup {

    @XmlElement(name = "ConversionGroup", nillable = true)
    protected ConversionGroup[] conversionGroup;

    /**
     * @return array of
     * {@link ConversionGroup }
     */
    public ConversionGroup[] getConversionGroup() {
        if (this.conversionGroup == null) {
            return new ConversionGroup[0];
        }
        ConversionGroup[] retVal = new ConversionGroup[this.conversionGroup.length];
        System.arraycopy(this.conversionGroup, 0, retVal, 0, this.conversionGroup.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ConversionGroup }
     */
    public void setConversionGroup(ConversionGroup[] values) {
        if (values == null) {
            this.conversionGroup = null;
            return;
        }
        int len = values.length;
        this.conversionGroup = ((ConversionGroup[]) new ConversionGroup[len]);
        for (int i = 0; (i < len); i++) {
            this.conversionGroup[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ConversionGroup }
     */
    public ConversionGroup getConversionGroup(int idx) {
        if (this.conversionGroup == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.conversionGroup[idx];
    }

    public int getConversionGroupLength() {
        if (this.conversionGroup == null) {
            return 0;
        }
        return this.conversionGroup.length;
    }

    /**
     * @param value allowed object is
     *              {@link ConversionGroup }
     */
    public ConversionGroup setConversionGroup(int idx, ConversionGroup value) {
        return this.conversionGroup[idx] = value;
    }

}
