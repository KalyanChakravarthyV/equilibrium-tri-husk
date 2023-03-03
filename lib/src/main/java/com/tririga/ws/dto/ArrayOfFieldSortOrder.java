package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldSortOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfFieldSortOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldSortOrder" type="{http://dto.ws.tririga.com}FieldSortOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldSortOrder", propOrder = {
        "fieldSortOrder"
})
public class ArrayOfFieldSortOrder {

    @XmlElement(name = "FieldSortOrder", nillable = true)
    protected FieldSortOrder[] fieldSortOrder;

    /**
     * @return array of
     * {@link FieldSortOrder }
     */
    public FieldSortOrder[] getFieldSortOrder() {
        if (this.fieldSortOrder == null) {
            return new FieldSortOrder[0];
        }
        FieldSortOrder[] retVal = new FieldSortOrder[this.fieldSortOrder.length];
        System.arraycopy(this.fieldSortOrder, 0, retVal, 0, this.fieldSortOrder.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link FieldSortOrder }
     */
    public void setFieldSortOrder(FieldSortOrder[] values) {
        if (values == null) {
            this.fieldSortOrder = null;
            return;
        }
        int len = values.length;
        this.fieldSortOrder = ((FieldSortOrder[]) new FieldSortOrder[len]);
        for (int i = 0; (i < len); i++) {
            this.fieldSortOrder[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link FieldSortOrder }
     */
    public FieldSortOrder getFieldSortOrder(int idx) {
        if (this.fieldSortOrder == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fieldSortOrder[idx];
    }

    public int getFieldSortOrderLength() {
        if (this.fieldSortOrder == null) {
            return 0;
        }
        return this.fieldSortOrder.length;
    }

    /**
     * @param value allowed object is
     *              {@link FieldSortOrder }
     */
    public FieldSortOrder setFieldSortOrder(int idx, FieldSortOrder value) {
        return this.fieldSortOrder[idx] = value;
    }

}
