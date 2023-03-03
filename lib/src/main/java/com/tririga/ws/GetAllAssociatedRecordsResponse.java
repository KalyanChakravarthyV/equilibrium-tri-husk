package com.tririga.ws;

import com.tririga.ws.dto.AssociationRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllAssociatedRecordsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getAllAssociatedRecordsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}AssociationRecord" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllAssociatedRecordsResponse", propOrder = {
        "out"
})
public class GetAllAssociatedRecordsResponse {

    @XmlElement(required = true, nillable = true)
    protected AssociationRecord[] out;

    /**
     * @return array of
     * {@link AssociationRecord }
     */
    public AssociationRecord[] getOut() {
        if (this.out == null) {
            return new AssociationRecord[0];
        }
        AssociationRecord[] retVal = new AssociationRecord[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationRecord }
     */
    public void setOut(AssociationRecord[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((AssociationRecord[]) new AssociationRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationRecord }
     */
    public AssociationRecord getOut(int idx) {
        if (this.out == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.out[idx];
    }

    public int getOutLength() {
        if (this.out == null) {
            return 0;
        }
        return this.out.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationRecord }
     */
    public AssociationRecord setOut(int idx, AssociationRecord value) {
        return this.out[idx] = value;
    }

}
