package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssociationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associations" type="{http://dto.ws.tririga.com}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationRecord", propOrder = {
        "associations",
        "recordId"
})
public class AssociationRecord {

    @XmlElement(nillable = true)
    protected Association[] associations;
    protected Long recordId;

    /**
     * @return array of
     * {@link Association }
     */
    public Association[] getAssociations() {
        if (this.associations == null) {
            return new Association[0];
        }
        Association[] retVal = new Association[this.associations.length];
        System.arraycopy(this.associations, 0, retVal, 0, this.associations.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Association }
     */
    public void setAssociations(Association[] values) {
        if (values == null) {
            this.associations = null;
            return;
        }
        int len = values.length;
        this.associations = ((Association[]) new Association[len]);
        for (int i = 0; (i < len); i++) {
            this.associations[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Association }
     */
    public Association getAssociations(int idx) {
        if (this.associations == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associations[idx];
    }

    public int getAssociationsLength() {
        if (this.associations == null) {
            return 0;
        }
        return this.associations.length;
    }

    /**
     * @param value allowed object is
     *              {@link Association }
     */
    public Association setAssociations(int idx, Association value) {
        return this.associations[idx] = value;
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
