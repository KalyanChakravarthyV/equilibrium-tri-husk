package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Record" type="{http://dto.ws.tririga.com}Record" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecord", propOrder = {
        "record"
})
public class ArrayOfRecord {

    @XmlElement(name = "Record", nillable = true)
    protected Record[] record;

    /**
     * @return array of
     * {@link Record }
     */
    public Record[] getRecord() {
        if (this.record == null) {
            return new Record[0];
        }
        Record[] retVal = new Record[this.record.length];
        System.arraycopy(this.record, 0, retVal, 0, this.record.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Record }
     */
    public void setRecord(Record[] values) {
        if (values == null) {
            this.record = null;
            return;
        }
        int len = values.length;
        this.record = ((Record[]) new Record[len]);
        for (int i = 0; (i < len); i++) {
            this.record[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Record }
     */
    public Record getRecord(int idx) {
        if (this.record == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.record[idx];
    }

    public int getRecordLength() {
        if (this.record == null) {
            return 0;
        }
        return this.record.length;
    }

    /**
     * @param value allowed object is
     *              {@link Record }
     */
    public Record setRecord(int idx, Record value) {
        return this.record[idx] = value;
    }

}
