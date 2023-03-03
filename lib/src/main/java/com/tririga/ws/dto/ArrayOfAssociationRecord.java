package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssociationRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAssociationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationRecord" type="{http://dto.ws.tririga.com}AssociationRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssociationRecord", propOrder = {
        "associationRecord"
})
public class ArrayOfAssociationRecord {

    @XmlElement(name = "AssociationRecord", nillable = true)
    protected AssociationRecord[] associationRecord;

    /**
     * @return array of
     * {@link AssociationRecord }
     */
    public AssociationRecord[] getAssociationRecord() {
        if (this.associationRecord == null) {
            return new AssociationRecord[0];
        }
        AssociationRecord[] retVal = new AssociationRecord[this.associationRecord.length];
        System.arraycopy(this.associationRecord, 0, retVal, 0, this.associationRecord.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationRecord }
     */
    public void setAssociationRecord(AssociationRecord[] values) {
        if (values == null) {
            this.associationRecord = null;
            return;
        }
        int len = values.length;
        this.associationRecord = ((AssociationRecord[]) new AssociationRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.associationRecord[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationRecord }
     */
    public AssociationRecord getAssociationRecord(int idx) {
        if (this.associationRecord == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associationRecord[idx];
    }

    public int getAssociationRecordLength() {
        if (this.associationRecord == null) {
            return 0;
        }
        return this.associationRecord.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationRecord }
     */
    public AssociationRecord setAssociationRecord(int idx, AssociationRecord value) {
        return this.associationRecord[idx] = value;
    }

}
