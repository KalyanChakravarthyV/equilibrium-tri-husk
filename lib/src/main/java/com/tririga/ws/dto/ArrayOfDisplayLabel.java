package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDisplayLabel complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfDisplayLabel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayLabel" type="{http://dto.ws.tririga.com}DisplayLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDisplayLabel", propOrder = {
        "displayLabel"
})
public class ArrayOfDisplayLabel {

    @XmlElement(name = "DisplayLabel", nillable = true)
    protected DisplayLabel[] displayLabel;

    /**
     * @return array of
     * {@link DisplayLabel }
     */
    public DisplayLabel[] getDisplayLabel() {
        if (this.displayLabel == null) {
            return new DisplayLabel[0];
        }
        DisplayLabel[] retVal = new DisplayLabel[this.displayLabel.length];
        System.arraycopy(this.displayLabel, 0, retVal, 0, this.displayLabel.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link DisplayLabel }
     */
    public void setDisplayLabel(DisplayLabel[] values) {
        if (values == null) {
            this.displayLabel = null;
            return;
        }
        int len = values.length;
        this.displayLabel = ((DisplayLabel[]) new DisplayLabel[len]);
        for (int i = 0; (i < len); i++) {
            this.displayLabel[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link DisplayLabel }
     */
    public DisplayLabel getDisplayLabel(int idx) {
        if (this.displayLabel == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.displayLabel[idx];
    }

    public int getDisplayLabelLength() {
        if (this.displayLabel == null) {
            return 0;
        }
        return this.displayLabel.length;
    }

    /**
     * @param value allowed object is
     *              {@link DisplayLabel }
     */
    public DisplayLabel setDisplayLabel(int idx, DisplayLabel value) {
        return this.displayLabel[idx] = value;
    }

}
