package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordSection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecordSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}Section"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordFields" type="{http://dto.ws.tririga.com}RecordField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordSection", propOrder = {
        "recordFields"
})
public class RecordSection
        extends Section {

    @XmlElement(nillable = true)
    protected RecordField[] recordFields;

    /**
     * @return array of
     * {@link RecordField }
     */
    public RecordField[] getRecordFields() {
        if (this.recordFields == null) {
            return new RecordField[0];
        }
        RecordField[] retVal = new RecordField[this.recordFields.length];
        System.arraycopy(this.recordFields, 0, retVal, 0, this.recordFields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link RecordField }
     */
    public void setRecordFields(RecordField[] values) {
        if (values == null) {
            this.recordFields = null;
            return;
        }
        int len = values.length;
        this.recordFields = ((RecordField[]) new RecordField[len]);
        for (int i = 0; (i < len); i++) {
            this.recordFields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link RecordField }
     */
    public RecordField getRecordFields(int idx) {
        if (this.recordFields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recordFields[idx];
    }

    public int getRecordFieldsLength() {
        if (this.recordFields == null) {
            return 0;
        }
        return this.recordFields.length;
    }

    /**
     * @param value allowed object is
     *              {@link RecordField }
     */
    public RecordField setRecordFields(int idx, RecordField value) {
        return this.recordFields[idx] = value;
    }

}
