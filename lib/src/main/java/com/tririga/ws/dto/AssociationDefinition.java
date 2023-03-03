package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AssociationDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssociationDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="associatedObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="associationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inverseAssociationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationDefinition", propOrder = {
        "associatedModuleId",
        "associatedObjectTypeId",
        "associationName",
        "inverseAssociationName",
        "moduleName",
        "objectTypeName",
        "sourceModuleId",
        "sourceObjectTypeId"
})
@XmlSeeAlso({
        Association.class
})
public class AssociationDefinition {

    protected Long associatedModuleId;
    protected Long associatedObjectTypeId;
    @XmlElement(nillable = true)
    protected String associationName;
    @XmlElement(nillable = true)
    protected String inverseAssociationName;
    @XmlElement(nillable = true)
    protected String moduleName;
    @XmlElement(nillable = true)
    protected String objectTypeName;
    protected Long sourceModuleId;
    protected Long sourceObjectTypeId;

    /**
     * Gets the value of the associatedModuleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAssociatedModuleId() {
        return associatedModuleId;
    }

    /**
     * Sets the value of the associatedModuleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAssociatedModuleId(Long value) {
        this.associatedModuleId = value;
    }

    /**
     * Gets the value of the associatedObjectTypeId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAssociatedObjectTypeId() {
        return associatedObjectTypeId;
    }

    /**
     * Sets the value of the associatedObjectTypeId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAssociatedObjectTypeId(Long value) {
        this.associatedObjectTypeId = value;
    }

    /**
     * Gets the value of the associationName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * Sets the value of the associationName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociationName(String value) {
        this.associationName = value;
    }

    /**
     * Gets the value of the inverseAssociationName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInverseAssociationName() {
        return inverseAssociationName;
    }

    /**
     * Sets the value of the inverseAssociationName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInverseAssociationName(String value) {
        this.inverseAssociationName = value;
    }

    /**
     * Gets the value of the moduleName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the objectTypeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjectTypeName() {
        return objectTypeName;
    }

    /**
     * Sets the value of the objectTypeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjectTypeName(String value) {
        this.objectTypeName = value;
    }

    /**
     * Gets the value of the sourceModuleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSourceModuleId() {
        return sourceModuleId;
    }

    /**
     * Sets the value of the sourceModuleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSourceModuleId(Long value) {
        this.sourceModuleId = value;
    }

    /**
     * Gets the value of the sourceObjectTypeId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSourceObjectTypeId() {
        return sourceObjectTypeId;
    }

    /**
     * Sets the value of the sourceObjectTypeId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSourceObjectTypeId(Long value) {
        this.sourceObjectTypeId = value;
    }

}
