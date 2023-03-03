package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecordField complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfRecordField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordField" type="{http://dto.ws.tririga.com}RecordField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecordField", propOrder = {
        "recordField"
})
public class ArrayOfRecordField {

    @XmlElement(name = "RecordField", nillable = true)
    protected RecordField[] recordField;

    /**
     * @return array of
     * {@link RecordField }
     */
    public RecordField[] getRecordField() {
        if (this.recordField == null) {
            return new RecordField[0];
        }
        RecordField[] retVal = new RecordField[this.recordField.length];
        System.arraycopy(this.recordField, 0, retVal, 0, this.recordField.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link RecordField }
     */
    public void setRecordField(RecordField[] values) {
        if (values == null) {
            this.recordField = null;
            return;
        }
        int len = values.length;
        this.recordField = ((RecordField[]) new RecordField[len]);
        for (int i = 0; (i < len); i++) {
            this.recordField[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link RecordField }
     */
    public RecordField getRecordField(int idx) {
        if (this.recordField == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recordField[idx];
    }

    public int getRecordFieldLength() {
        if (this.recordField == null) {
            return 0;
        }
        return this.recordField.length;
    }

    /**
     * @param value allowed object is
     *              {@link RecordField }
     */
    public RecordField setRecordField(int idx, RecordField value) {
        return this.recordField[idx] = value;
    }

}
