package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfField complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" type="{http://gui.dto.ws.tririga.com}Field" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfField", propOrder = {
        "field"
})
public class ArrayOfField {

    @XmlElement(name = "Field", nillable = true)
    protected Field[] field;

    /**
     * @return array of
     * {@link Field }
     */
    public Field[] getField() {
        if (this.field == null) {
            return new Field[0];
        }
        Field[] retVal = new Field[this.field.length];
        System.arraycopy(this.field, 0, retVal, 0, this.field.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Field }
     */
    public void setField(Field[] values) {
        if (values == null) {
            this.field = null;
            return;
        }
        int len = values.length;
        this.field = ((Field[]) new Field[len]);
        for (int i = 0; (i < len); i++) {
            this.field[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Field }
     */
    public Field getField(int idx) {
        if (this.field == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.field[idx];
    }

    public int getFieldLength() {
        if (this.field == null) {
            return 0;
        }
        return this.field.length;
    }

    /**
     * @param value allowed object is
     *              {@link Field }
     */
    public Field setField(int idx, Field value) {
        return this.field[idx] = value;
    }

}
