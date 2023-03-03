package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssociationFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAssociationFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationFilter" type="{http://dto.ws.tririga.com}AssociationFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssociationFilter", propOrder = {
        "associationFilter"
})
public class ArrayOfAssociationFilter {

    @XmlElement(name = "AssociationFilter", nillable = true)
    protected AssociationFilter[] associationFilter;

    /**
     * @return array of
     * {@link AssociationFilter }
     */
    public AssociationFilter[] getAssociationFilter() {
        if (this.associationFilter == null) {
            return new AssociationFilter[0];
        }
        AssociationFilter[] retVal = new AssociationFilter[this.associationFilter.length];
        System.arraycopy(this.associationFilter, 0, retVal, 0, this.associationFilter.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationFilter }
     */
    public void setAssociationFilter(AssociationFilter[] values) {
        if (values == null) {
            this.associationFilter = null;
            return;
        }
        int len = values.length;
        this.associationFilter = ((AssociationFilter[]) new AssociationFilter[len]);
        for (int i = 0; (i < len); i++) {
            this.associationFilter[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationFilter }
     */
    public AssociationFilter getAssociationFilter(int idx) {
        if (this.associationFilter == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associationFilter[idx];
    }

    public int getAssociationFilterLength() {
        if (this.associationFilter == null) {
            return 0;
        }
        return this.associationFilter.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationFilter }
     */
    public AssociationFilter setAssociationFilter(int idx, AssociationFilter value) {
        return this.associationFilter[idx] = value;
    }

}
