package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFormulaParam complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExtendedFormulaParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associationChain" type="{http://dto.ws.tririga.com}AssociationDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fieldKey" type="{http://dto.ws.tririga.com}FieldKey" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFormulaParam", propOrder = {
        "associationChain",
        "fieldKey",
        "name"
})
public class ExtendedFormulaParam {

    @XmlElement(nillable = true)
    protected AssociationDefinition[] associationChain;
    @XmlElement(nillable = true)
    protected FieldKey fieldKey;
    @XmlElement(nillable = true)
    protected String name;

    /**
     * @return array of
     * {@link AssociationDefinition }
     */
    public AssociationDefinition[] getAssociationChain() {
        if (this.associationChain == null) {
            return new AssociationDefinition[0];
        }
        AssociationDefinition[] retVal = new AssociationDefinition[this.associationChain.length];
        System.arraycopy(this.associationChain, 0, retVal, 0, this.associationChain.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationDefinition }
     */
    public void setAssociationChain(AssociationDefinition[] values) {
        if (values == null) {
            this.associationChain = null;
            return;
        }
        int len = values.length;
        this.associationChain = ((AssociationDefinition[]) new AssociationDefinition[len]);
        for (int i = 0; (i < len); i++) {
            this.associationChain[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationDefinition }
     */
    public AssociationDefinition getAssociationChain(int idx) {
        if (this.associationChain == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associationChain[idx];
    }

    public int getAssociationChainLength() {
        if (this.associationChain == null) {
            return 0;
        }
        return this.associationChain.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationDefinition }
     */
    public AssociationDefinition setAssociationChain(int idx, AssociationDefinition value) {
        return this.associationChain[idx] = value;
    }

    /**
     * Gets the value of the fieldKey property.
     *
     * @return possible object is
     * {@link FieldKey }
     */
    public FieldKey getFieldKey() {
        return fieldKey;
    }

    /**
     * Sets the value of the fieldKey property.
     *
     * @param value allowed object is
     *              {@link FieldKey }
     */
    public void setFieldKey(FieldKey value) {
        this.fieldKey = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
