package com.tririga.ws.dto.gui;

import com.tririga.ws.dto.DataType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataType" type="{http://dto.ws.tririga.com}DataType" minOccurs="0"/&gt;
 *         &lt;element name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiRootClassificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiRootClassificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="listModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="liveLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locatorField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locatorModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="mobileField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobileFieldSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="refObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="refSpecId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rootClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootClassificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
        "dataType",
        "displayValue",
        "guiRootClassificationId",
        "guiRootClassificationName",
        "guiSectionId",
        "guiSectionName",
        "label",
        "listId",
        "listModuleId",
        "liveLink",
        "locatorField",
        "locatorModuleId",
        "mobileField",
        "mobileFieldSeq",
        "name",
        "readOnly",
        "refObjectTypeId",
        "refSpecId",
        "required",
        "rootClassification",
        "rootClassificationId",
        "sectionName",
        "specId",
        "type",
        "unitOfMeasure",
        "unitOfMeasureType",
        "value"
})
public class Field {

    @XmlElement(nillable = true)
    protected DataType dataType;
    @XmlElement(nillable = true)
    protected String displayValue;
    protected Long guiRootClassificationId;
    @XmlElement(nillable = true)
    protected String guiRootClassificationName;
    protected Long guiSectionId;
    @XmlElement(nillable = true)
    protected String guiSectionName;
    @XmlElement(nillable = true)
    protected String label;
    protected Long listId;
    protected Long listModuleId;
    protected Boolean liveLink;
    protected Boolean locatorField;
    protected Long locatorModuleId;
    protected Boolean mobileField;
    protected Long mobileFieldSeq;
    @XmlElement(nillable = true)
    protected String name;
    protected Boolean readOnly;
    protected Long refObjectTypeId;
    protected Long refSpecId;
    protected Boolean required;
    @XmlElement(nillable = true)
    protected String rootClassification;
    protected Long rootClassificationId;
    @XmlElement(nillable = true)
    protected String sectionName;
    protected Long specId;
    @XmlElement(nillable = true)
    protected String type;
    @XmlElement(nillable = true)
    protected String unitOfMeasure;
    protected Long unitOfMeasureType;
    @XmlElement(nillable = true)
    protected String value;

    /**
     * Gets the value of the dataType property.
     *
     * @return possible object is
     * {@link DataType }
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     *
     * @param value allowed object is
     *              {@link DataType }
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the displayValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the guiRootClassificationId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getGuiRootClassificationId() {
        return guiRootClassificationId;
    }

    /**
     * Sets the value of the guiRootClassificationId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setGuiRootClassificationId(Long value) {
        this.guiRootClassificationId = value;
    }

    /**
     * Gets the value of the guiRootClassificationName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuiRootClassificationName() {
        return guiRootClassificationName;
    }

    /**
     * Sets the value of the guiRootClassificationName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuiRootClassificationName(String value) {
        this.guiRootClassificationName = value;
    }

    /**
     * Gets the value of the guiSectionId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getGuiSectionId() {
        return guiSectionId;
    }

    /**
     * Sets the value of the guiSectionId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setGuiSectionId(Long value) {
        this.guiSectionId = value;
    }

    /**
     * Gets the value of the guiSectionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuiSectionName() {
        return guiSectionName;
    }

    /**
     * Sets the value of the guiSectionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuiSectionName(String value) {
        this.guiSectionName = value;
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
     * Gets the value of the listId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setListId(Long value) {
        this.listId = value;
    }

    /**
     * Gets the value of the listModuleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getListModuleId() {
        return listModuleId;
    }

    /**
     * Sets the value of the listModuleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setListModuleId(Long value) {
        this.listModuleId = value;
    }

    /**
     * Gets the value of the liveLink property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLiveLink() {
        return liveLink;
    }

    /**
     * Sets the value of the liveLink property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLiveLink(Boolean value) {
        this.liveLink = value;
    }

    /**
     * Gets the value of the locatorField property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isLocatorField() {
        return locatorField;
    }

    /**
     * Sets the value of the locatorField property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setLocatorField(Boolean value) {
        this.locatorField = value;
    }

    /**
     * Gets the value of the locatorModuleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getLocatorModuleId() {
        return locatorModuleId;
    }

    /**
     * Sets the value of the locatorModuleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setLocatorModuleId(Long value) {
        this.locatorModuleId = value;
    }

    /**
     * Gets the value of the mobileField property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isMobileField() {
        return mobileField;
    }

    /**
     * Sets the value of the mobileField property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMobileField(Boolean value) {
        this.mobileField = value;
    }

    /**
     * Gets the value of the mobileFieldSeq property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getMobileFieldSeq() {
        return mobileFieldSeq;
    }

    /**
     * Sets the value of the mobileFieldSeq property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setMobileFieldSeq(Long value) {
        this.mobileFieldSeq = value;
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
     * Gets the value of the readOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the refObjectTypeId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRefObjectTypeId() {
        return refObjectTypeId;
    }

    /**
     * Sets the value of the refObjectTypeId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRefObjectTypeId(Long value) {
        this.refObjectTypeId = value;
    }

    /**
     * Gets the value of the refSpecId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRefSpecId() {
        return refSpecId;
    }

    /**
     * Sets the value of the refSpecId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRefSpecId(Long value) {
        this.refSpecId = value;
    }

    /**
     * Gets the value of the required property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the rootClassification property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRootClassification() {
        return rootClassification;
    }

    /**
     * Sets the value of the rootClassification property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRootClassification(String value) {
        this.rootClassification = value;
    }

    /**
     * Gets the value of the rootClassificationId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRootClassificationId() {
        return rootClassificationId;
    }

    /**
     * Sets the value of the rootClassificationId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRootClassificationId(Long value) {
        this.rootClassificationId = value;
    }

    /**
     * Gets the value of the sectionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the specId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSpecId() {
        return specId;
    }

    /**
     * Sets the value of the specId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSpecId(Long value) {
        this.specId = value;
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

    /**
     * Gets the value of the unitOfMeasure property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitOfMeasureType property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getUnitOfMeasureType() {
        return unitOfMeasureType;
    }

    /**
     * Sets the value of the unitOfMeasureType property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setUnitOfMeasureType(Long value) {
        this.unitOfMeasureType = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

}
