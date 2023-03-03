package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssociationDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAssociationDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationDefinition" type="{http://dto.ws.tririga.com}AssociationDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssociationDefinition", propOrder = {
        "associationDefinition"
})
public class ArrayOfAssociationDefinition {

    @XmlElement(name = "AssociationDefinition", nillable = true)
    protected AssociationDefinition[] associationDefinition;

    /**
     * @return array of
     * {@link AssociationDefinition }
     */
    public AssociationDefinition[] getAssociationDefinition() {
        if (this.associationDefinition == null) {
            return new AssociationDefinition[0];
        }
        AssociationDefinition[] retVal = new AssociationDefinition[this.associationDefinition.length];
        System.arraycopy(this.associationDefinition, 0, retVal, 0, this.associationDefinition.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationDefinition }
     */
    public void setAssociationDefinition(AssociationDefinition[] values) {
        if (values == null) {
            this.associationDefinition = null;
            return;
        }
        int len = values.length;
        this.associationDefinition = ((AssociationDefinition[]) new AssociationDefinition[len]);
        for (int i = 0; (i < len); i++) {
            this.associationDefinition[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationDefinition }
     */
    public AssociationDefinition getAssociationDefinition(int idx) {
        if (this.associationDefinition == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associationDefinition[idx];
    }

    public int getAssociationDefinitionLength() {
        if (this.associationDefinition == null) {
            return 0;
        }
        return this.associationDefinition.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationDefinition }
     */
    public AssociationDefinition setAssociationDefinition(int idx, AssociationDefinition value) {
        return this.associationDefinition[idx] = value;
    }

}
