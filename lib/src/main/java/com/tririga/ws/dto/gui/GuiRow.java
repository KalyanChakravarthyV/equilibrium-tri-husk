package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuiRow complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GuiRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://gui.dto.ws.tririga.com}Field" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuiRow", propOrder = {
        "fields",
        "recordId"
})
public class GuiRow {

    @XmlElement(nillable = true)
    protected Field[] fields;
    protected Long recordId;

    /**
     * @return array of
     * {@link Field }
     */
    public Field[] getFields() {
        if (this.fields == null) {
            return new Field[0];
        }
        Field[] retVal = new Field[this.fields.length];
        System.arraycopy(this.fields, 0, retVal, 0, this.fields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Field }
     */
    public void setFields(Field[] values) {
        if (values == null) {
            this.fields = null;
            return;
        }
        int len = values.length;
        this.fields = ((Field[]) new Field[len]);
        for (int i = 0; (i < len); i++) {
            this.fields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Field }
     */
    public Field getFields(int idx) {
        if (this.fields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fields[idx];
    }

    public int getFieldsLength() {
        if (this.fields == null) {
            return 0;
        }
        return this.fields.length;
    }

    /**
     * @param value allowed object is
     *              {@link Field }
     */
    public Field setFields(int idx, Field value) {
        return this.fields[idx] = value;
    }

    /**
     * Gets the value of the recordId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

}
