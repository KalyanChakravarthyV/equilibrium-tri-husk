package com.tririga.ws;

import com.tririga.ws.dto.Association;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deassociateRecords complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="deassociateRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Associations" type="{http://dto.ws.tririga.com}Association" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deassociateRecords", propOrder = {
        "associations"
})
public class DeassociateRecords {

    @XmlElement(name = "Associations", required = true)
    protected Association[] associations;

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

}
