package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dependantList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parentProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceClassId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListType", propOrder = {
        "dependantList",
        "description",
        "id",
        "label",
        "language",
        "name",
        "parentId",
        "parentProduct",
        "product",
        "sourceClassId",
        "sourceObjectTypeId",
        "sourceType",
        "system",
        "type"
})
public class ListType {

    protected Boolean dependantList;
    @XmlElement(nillable = true)
    protected String description;
    protected Long id;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String language;
    @XmlElement(nillable = true)
    protected String name;
    protected Long parentId;
    @XmlElement(nillable = true)
    protected String parentProduct;
    @XmlElement(nillable = true)
    protected String product;
    protected Long sourceClassId;
    protected Long sourceObjectTypeId;
    protected Integer sourceType;
    protected Boolean system;
    @XmlElement(nillable = true)
    protected String type;

    /**
     * Gets the value of the dependantList property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDependantList() {
        return dependantList;
    }

    /**
     * Sets the value of the dependantList property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDependantList(Boolean value) {
        this.dependantList = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
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

    /**
     * Gets the value of the parentId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the parentProduct property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getParentProduct() {
        return parentProduct;
    }

    /**
     * Sets the value of the parentProduct property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setParentProduct(String value) {
        this.parentProduct = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the sourceClassId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSourceClassId() {
        return sourceClassId;
    }

    /**
     * Sets the value of the sourceClassId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSourceClassId(Long value) {
        this.sourceClassId = value;
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

    /**
     * Gets the value of the sourceType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSourceType(Integer value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the system property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSystem(Boolean value) {
        this.system = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
