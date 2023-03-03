package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="associationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attributeSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="autoPopulate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="colSpan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="columnSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://dto.ws.tririga.com}DataType" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="editUOMList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="endRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fieldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="financialToken" type="{http://dto.ws.tririga.com}FinancialToken" minOccurs="0"/&gt;
 *         &lt;element name="formula" type="{http://dto.ws.tririga.com}Formula" minOccurs="0"/&gt;
 *         &lt;element name="fullPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="generateOnCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="guiFieldId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiFieldType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiRootClassificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiRootClassificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiTabId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="hierarchyObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="listModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="liveLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locatorField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locatorModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="mobileField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobileFieldSeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="resultColumn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rollupSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootClassificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="specId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="specTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="stagingTableField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subAttributeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sumThisField" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureSourceAttribute" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unitOfMeasureType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="validation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field", propOrder = {
        "associationString",
        "attributeSequence",
        "autoPopulate",
        "colSpan",
        "columnSeq",
        "dataType",
        "defaultValue",
        "dependent",
        "displayValue",
        "editUOMList",
        "endRow",
        "fieldId",
        "financialToken",
        "formula",
        "fullPath",
        "generateOnCreate",
        "guiFieldId",
        "guiFieldName",
        "guiFieldType",
        "guiId",
        "guiRootClassificationId",
        "guiRootClassificationName",
        "guiSectionId",
        "guiSectionName",
        "guiTabId",
        "hierarchyObjectId",
        "label",
        "listId",
        "listModuleId",
        "liveLink",
        "locatorField",
        "locatorModuleId",
        "mobileField",
        "mobileFieldSeq",
        "name",
        "precision",
        "queryId",
        "queryName",
        "readOnly",
        "required",
        "resultColumn",
        "rollupSource",
        "rootClassification",
        "rootClassificationId",
        "sectionName",
        "seq",
        "specId",
        "specTemplateId",
        "stagingTableField",
        "startRow",
        "subAttributeType",
        "subCategoryId",
        "sumThisField",
        "type",
        "unitOfMeasure",
        "unitOfMeasureSourceAttribute",
        "unitOfMeasureType",
        "validation",
        "value",
        "valueId"
})
@XmlSeeAlso({
        RecordField.class
})
public class Field {

    @XmlElement(nillable = true)
    protected String associationString;
    protected Long attributeSequence;
    protected Boolean autoPopulate;
    protected Integer colSpan;
    protected Long columnSeq;
    @XmlElement(nillable = true)
    protected DataType dataType;
    @XmlElement(nillable = true)
    protected String defaultValue;
    protected Boolean dependent;
    @XmlElement(nillable = true)
    protected String displayValue;
    protected Boolean editUOMList;
    protected Integer endRow;
    protected Long fieldId;
    @XmlElement(nillable = true)
    protected FinancialToken financialToken;
    @XmlElement(nillable = true)
    protected Formula formula;
    protected Boolean fullPath;
    protected Boolean generateOnCreate;
    protected Long guiFieldId;
    @XmlElement(nillable = true)
    protected String guiFieldName;
    protected Integer guiFieldType;
    protected Long guiId;
    protected Long guiRootClassificationId;
    @XmlElement(nillable = true)
    protected String guiRootClassificationName;
    protected Long guiSectionId;
    @XmlElement(nillable = true)
    protected String guiSectionName;
    protected Long guiTabId;
    protected Long hierarchyObjectId;
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
    protected Long precision;
    protected Long queryId;
    @XmlElement(nillable = true)
    protected String queryName;
    protected Boolean readOnly;
    protected Boolean required;
    protected Boolean resultColumn;
    @XmlElement(nillable = true)
    protected String rollupSource;
    @XmlElement(nillable = true)
    protected String rootClassification;
    protected Long rootClassificationId;
    @XmlElement(nillable = true)
    protected String sectionName;
    protected Long seq;
    protected Long specId;
    protected Long specTemplateId;
    protected Boolean stagingTableField;
    protected Integer startRow;
    @XmlElement(nillable = true)
    protected String subAttributeType;
    protected Long subCategoryId;
    protected Boolean sumThisField;
    @XmlElement(nillable = true)
    protected String type;
    @XmlElement(nillable = true)
    protected String unitOfMeasure;
    protected Long unitOfMeasureSourceAttribute;
    protected Long unitOfMeasureType;
    @XmlElement(nillable = true)
    protected String validation;
    @XmlElement(nillable = true)
    protected String value;
    protected Long valueId;

    /**
     * Gets the value of the associationString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociationString() {
        return associationString;
    }

    /**
     * Sets the value of the associationString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociationString(String value) {
        this.associationString = value;
    }

    /**
     * Gets the value of the attributeSequence property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAttributeSequence() {
        return attributeSequence;
    }

    /**
     * Sets the value of the attributeSequence property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAttributeSequence(Long value) {
        this.attributeSequence = value;
    }

    /**
     * Gets the value of the autoPopulate property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAutoPopulate() {
        return autoPopulate;
    }

    /**
     * Sets the value of the autoPopulate property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAutoPopulate(Boolean value) {
        this.autoPopulate = value;
    }

    /**
     * Gets the value of the colSpan property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getColSpan() {
        return colSpan;
    }

    /**
     * Sets the value of the colSpan property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setColSpan(Integer value) {
        this.colSpan = value;
    }

    /**
     * Gets the value of the columnSeq property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getColumnSeq() {
        return columnSeq;
    }

    /**
     * Sets the value of the columnSeq property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setColumnSeq(Long value) {
        this.columnSeq = value;
    }

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
     * Gets the value of the defaultValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the dependent property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isDependent() {
        return dependent;
    }

    /**
     * Sets the value of the dependent property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setDependent(Boolean value) {
        this.dependent = value;
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
     * Gets the value of the editUOMList property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEditUOMList() {
        return editUOMList;
    }

    /**
     * Sets the value of the editUOMList property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setEditUOMList(Boolean value) {
        this.editUOMList = value;
    }

    /**
     * Gets the value of the endRow property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setEndRow(Integer value) {
        this.endRow = value;
    }

    /**
     * Gets the value of the fieldId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setFieldId(Long value) {
        this.fieldId = value;
    }

    /**
     * Gets the value of the financialToken property.
     *
     * @return possible object is
     * {@link FinancialToken }
     */
    public FinancialToken getFinancialToken() {
        return financialToken;
    }

    /**
     * Sets the value of the financialToken property.
     *
     * @param value allowed object is
     *              {@link FinancialToken }
     */
    public void setFinancialToken(FinancialToken value) {
        this.financialToken = value;
    }

    /**
     * Gets the value of the formula property.
     *
     * @return possible object is
     * {@link Formula }
     */
    public Formula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     *
     * @param value allowed object is
     *              {@link Formula }
     */
    public void setFormula(Formula value) {
        this.formula = value;
    }

    /**
     * Gets the value of the fullPath property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFullPath() {
        return fullPath;
    }

    /**
     * Sets the value of the fullPath property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFullPath(Boolean value) {
        this.fullPath = value;
    }

    /**
     * Gets the value of the generateOnCreate property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGenerateOnCreate() {
        return generateOnCreate;
    }

    /**
     * Sets the value of the generateOnCreate property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGenerateOnCreate(Boolean value) {
        this.generateOnCreate = value;
    }

    /**
     * Gets the value of the guiFieldId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getGuiFieldId() {
        return guiFieldId;
    }

    /**
     * Sets the value of the guiFieldId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setGuiFieldId(Long value) {
        this.guiFieldId = value;
    }

    /**
     * Gets the value of the guiFieldName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuiFieldName() {
        return guiFieldName;
    }

    /**
     * Sets the value of the guiFieldName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuiFieldName(String value) {
        this.guiFieldName = value;
    }

    /**
     * Gets the value of the guiFieldType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getGuiFieldType() {
        return guiFieldType;
    }

    /**
     * Sets the value of the guiFieldType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setGuiFieldType(Integer value) {
        this.guiFieldType = value;
    }

    /**
     * Gets the value of the guiId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getGuiId() {
        return guiId;
    }

    /**
     * Sets the value of the guiId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setGuiId(Long value) {
        this.guiId = value;
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
     * Gets the value of the guiTabId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getGuiTabId() {
        return guiTabId;
    }

    /**
     * Sets the value of the guiTabId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setGuiTabId(Long value) {
        this.guiTabId = value;
    }

    /**
     * Gets the value of the hierarchyObjectId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getHierarchyObjectId() {
        return hierarchyObjectId;
    }

    /**
     * Sets the value of the hierarchyObjectId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setHierarchyObjectId(Long value) {
        this.hierarchyObjectId = value;
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
     * Gets the value of the precision property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPrecision(Long value) {
        this.precision = value;
    }

    /**
     * Gets the value of the queryId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setQueryId(Long value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the queryName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQueryName(String value) {
        this.queryName = value;
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
     * Gets the value of the resultColumn property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isResultColumn() {
        return resultColumn;
    }

    /**
     * Sets the value of the resultColumn property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setResultColumn(Boolean value) {
        this.resultColumn = value;
    }

    /**
     * Gets the value of the rollupSource property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRollupSource() {
        return rollupSource;
    }

    /**
     * Sets the value of the rollupSource property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRollupSource(String value) {
        this.rollupSource = value;
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
     * Gets the value of the seq property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSeq(Long value) {
        this.seq = value;
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
     * Gets the value of the specTemplateId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSpecTemplateId() {
        return specTemplateId;
    }

    /**
     * Sets the value of the specTemplateId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSpecTemplateId(Long value) {
        this.specTemplateId = value;
    }

    /**
     * Gets the value of the stagingTableField property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isStagingTableField() {
        return stagingTableField;
    }

    /**
     * Sets the value of the stagingTableField property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setStagingTableField(Boolean value) {
        this.stagingTableField = value;
    }

    /**
     * Gets the value of the startRow property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStartRow(Integer value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the subAttributeType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSubAttributeType() {
        return subAttributeType;
    }

    /**
     * Sets the value of the subAttributeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubAttributeType(String value) {
        this.subAttributeType = value;
    }

    /**
     * Gets the value of the subCategoryId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSubCategoryId() {
        return subCategoryId;
    }

    /**
     * Sets the value of the subCategoryId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSubCategoryId(Long value) {
        this.subCategoryId = value;
    }

    /**
     * Gets the value of the sumThisField property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSumThisField() {
        return sumThisField;
    }

    /**
     * Sets the value of the sumThisField property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSumThisField(Boolean value) {
        this.sumThisField = value;
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
     * Gets the value of the unitOfMeasureSourceAttribute property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getUnitOfMeasureSourceAttribute() {
        return unitOfMeasureSourceAttribute;
    }

    /**
     * Sets the value of the unitOfMeasureSourceAttribute property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setUnitOfMeasureSourceAttribute(Long value) {
        this.unitOfMeasureSourceAttribute = value;
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
     * Gets the value of the validation property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValidation(String value) {
        this.validation = value;
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

    /**
     * Gets the value of the valueId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * Sets the value of the valueId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setValueId(Long value) {
        this.valueId = value;
    }

}
