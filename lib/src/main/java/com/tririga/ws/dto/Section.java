package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Section complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Section"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://dto.ws.tririga.com}Field" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refModuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="refObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rows" type="{http://dto.ws.tririga.com}Row" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://dto.ws.tririga.com}Section" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Section", propOrder = {
        "fields",
        "guiSectionId",
        "guiSectionName",
        "id",
        "label",
        "name",
        "refModuleId",
        "refObjectTypeId",
        "rows",
        "sections",
        "type",
        "typeId"
})
@XmlSeeAlso({
        RecordSection.class
})
public class Section {

    @XmlElement(nillable = true)
    protected Field[] fields;
    protected Long guiSectionId;
    @XmlElement(nillable = true)
    protected String guiSectionName;
    protected Long id;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String name;
    protected Long refModuleId;
    protected Long refObjectTypeId;
    @XmlElement(nillable = true)
    protected Row[] rows;
    @XmlElement(nillable = true)
    protected Section[] sections;
    @XmlElement(nillable = true)
    protected String type;
    protected Integer typeId;

    /**
     * @return array of
     * {@link Field }
     */
    public Field[] getFields() {
        if (this.fields == null) {
            return new Field[0];
        }
        Field[] retVal = new Field[this.fields.length];
        System.arraycopy(this.fields, 0, retVal, 0, this.fields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Field }
     */
    public void setFields(Field[] values) {
        if (values == null) {
            this.fields = null;
            return;
        }
        int len = values.length;
        this.fields = ((Field[]) new Field[len]);
        for (int i = 0; (i < len); i++) {
            this.fields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Field }
     */
    public Field getFields(int idx) {
        if (this.fields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fields[idx];
    }

    public int getFieldsLength() {
        if (this.fields == null) {
            return 0;
        }
        return this.fields.length;
    }

    /**
     * @param value allowed object is
     *              {@link Field }
     */
    public Field setFields(int idx, Field value) {
        return this.fields[idx] = value;
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
     * Gets the value of the refModuleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRefModuleId() {
        return refModuleId;
    }

    /**
     * Sets the value of the refModuleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRefModuleId(Long value) {
        this.refModuleId = value;
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
     * @return array of
     * {@link Row }
     */
    public Row[] getRows() {
        if (this.rows == null) {
            return new Row[0];
        }
        Row[] retVal = new Row[this.rows.length];
        System.arraycopy(this.rows, 0, retVal, 0, this.rows.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Row }
     */
    public void setRows(Row[] values) {
        if (values == null) {
            this.rows = null;
            return;
        }
        int len = values.length;
        this.rows = ((Row[]) new Row[len]);
        for (int i = 0; (i < len); i++) {
            this.rows[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Row }
     */
    public Row getRows(int idx) {
        if (this.rows == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.rows[idx];
    }

    public int getRowsLength() {
        if (this.rows == null) {
            return 0;
        }
        return this.rows.length;
    }

    /**
     * @param value allowed object is
     *              {@link Row }
     */
    public Row setRows(int idx, Row value) {
        return this.rows[idx] = value;
    }

    /**
     * @return array of
     * {@link Section }
     */
    public Section[] getSections() {
        if (this.sections == null) {
            return new Section[0];
        }
        Section[] retVal = new Section[this.sections.length];
        System.arraycopy(this.sections, 0, retVal, 0, this.sections.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Section }
     */
    public void setSections(Section[] values) {
        if (values == null) {
            this.sections = null;
            return;
        }
        int len = values.length;
        this.sections = ((Section[]) new Section[len]);
        for (int i = 0; (i < len); i++) {
            this.sections[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Section }
     */
    public Section getSections(int idx) {
        if (this.sections == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sections[idx];
    }

    public int getSectionsLength() {
        if (this.sections == null) {
            return 0;
        }
        return this.sections.length;
    }

    /**
     * @param value allowed object is
     *              {@link Section }
     */
    public Section setSections(int idx, Section value) {
        return this.sections[idx] = value;
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
     * Gets the value of the typeId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

}
