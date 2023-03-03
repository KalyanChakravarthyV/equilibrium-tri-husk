package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssociation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Association" type="{http://dto.ws.tririga.com}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssociation", propOrder = {
        "association"
})
public class ArrayOfAssociation {

    @XmlElement(name = "Association", nillable = true)
    protected Association[] association;

    /**
     * @return array of
     * {@link Association }
     */
    public Association[] getAssociation() {
        if (this.association == null) {
            return new Association[0];
        }
        Association[] retVal = new Association[this.association.length];
        System.arraycopy(this.association, 0, retVal, 0, this.association.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Association }
     */
    public void setAssociation(Association[] values) {
        if (values == null) {
            this.association = null;
            return;
        }
        int len = values.length;
        this.association = ((Association[]) new Association[len]);
        for (int i = 0; (i < len); i++) {
            this.association[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Association }
     */
    public Association getAssociation(int idx) {
        if (this.association == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.association[idx];
    }

    public int getAssociationLength() {
        if (this.association == null) {
            return 0;
        }
        return this.association.length;
    }

    /**
     * @param value allowed object is
     *              {@link Association }
     */
    public Association setAssociation(int idx, Association value) {
        return this.association[idx] = value;
    }

}
