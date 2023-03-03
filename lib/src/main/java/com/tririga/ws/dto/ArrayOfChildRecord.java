package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChildRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfChildRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildRecord" type="{http://dto.ws.tririga.com}ChildRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChildRecord", propOrder = {
        "childRecord"
})
public class ArrayOfChildRecord {

    @XmlElement(name = "ChildRecord", nillable = true)
    protected ChildRecord[] childRecord;

    /**
     * @return array of
     * {@link ChildRecord }
     */
    public ChildRecord[] getChildRecord() {
        if (this.childRecord == null) {
            return new ChildRecord[0];
        }
        ChildRecord[] retVal = new ChildRecord[this.childRecord.length];
        System.arraycopy(this.childRecord, 0, retVal, 0, this.childRecord.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ChildRecord }
     */
    public void setChildRecord(ChildRecord[] values) {
        if (values == null) {
            this.childRecord = null;
            return;
        }
        int len = values.length;
        this.childRecord = ((ChildRecord[]) new ChildRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.childRecord[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ChildRecord }
     */
    public ChildRecord getChildRecord(int idx) {
        if (this.childRecord == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.childRecord[idx];
    }

    public int getChildRecordLength() {
        if (this.childRecord == null) {
            return 0;
        }
        return this.childRecord.length;
    }

    /**
     * @param value allowed object is
     *              {@link ChildRecord }
     */
    public ChildRecord setChildRecord(int idx, ChildRecord value) {
        return this.childRecord[idx] = value;
    }

}
