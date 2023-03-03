package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Record complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="guiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://dto.ws.tririga.com}RecordSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tabs" type="{http://dto.ws.tririga.com}Tab" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
        "currentState",
        "description",
        "guiId",
        "guiName",
        "id",
        "moduleId",
        "name",
        "objectPath",
        "objectTypeId",
        "objectTypeName",
        "parentId",
        "sections",
        "tabs"
})
@XmlSeeAlso({
        ChildRecord.class
})
public class Record {

    @XmlElement(nillable = true)
    protected String currentState;
    @XmlElement(nillable = true)
    protected String description;
    protected Long guiId;
    @XmlElement(nillable = true)
    protected String guiName;
    protected Long id;
    protected Integer moduleId;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String objectPath;
    protected Long objectTypeId;
    @XmlElement(nillable = true)
    protected String objectTypeName;
    protected Long parentId;
    @XmlElement(nillable = true)
    protected RecordSection[] sections;
    @XmlElement(nillable = true)
    protected Tab[] tabs;

    /**
     * Gets the value of the currentState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentState(String value) {
        this.currentState = value;
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
     * Gets the value of the guiName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGuiName() {
        return guiName;
    }

    /**
     * Sets the value of the guiName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGuiName(String value) {
        this.guiName = value;
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
     * Gets the value of the moduleId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setModuleId(Integer value) {
        this.moduleId = value;
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
     * Gets the value of the objectPath property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjectPath(String value) {
        this.objectPath = value;
    }

    /**
     * Gets the value of the objectTypeId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getObjectTypeId() {
        return objectTypeId;
    }

    /**
     * Sets the value of the objectTypeId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setObjectTypeId(Long value) {
        this.objectTypeId = value;
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
     * @return array of
     * {@link RecordSection }
     */
    public RecordSection[] getSections() {
        if (this.sections == null) {
            return new RecordSection[0];
        }
        RecordSection[] retVal = new RecordSection[this.sections.length];
        System.arraycopy(this.sections, 0, retVal, 0, this.sections.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link RecordSection }
     */
    public void setSections(RecordSection[] values) {
        if (values == null) {
            this.sections = null;
            return;
        }
        int len = values.length;
        this.sections = ((RecordSection[]) new RecordSection[len]);
        for (int i = 0; (i < len); i++) {
            this.sections[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link RecordSection }
     */
    public RecordSection getSections(int idx) {
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
     *              {@link RecordSection }
     */
    public RecordSection setSections(int idx, RecordSection value) {
        return this.sections[idx] = value;
    }

    /**
     * @return array of
     * {@link Tab }
     */
    public Tab[] getTabs() {
        if (this.tabs == null) {
            return new Tab[0];
        }
        Tab[] retVal = new Tab[this.tabs.length];
        System.arraycopy(this.tabs, 0, retVal, 0, this.tabs.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Tab }
     */
    public void setTabs(Tab[] values) {
        if (values == null) {
            this.tabs = null;
            return;
        }
        int len = values.length;
        this.tabs = ((Tab[]) new Tab[len]);
        for (int i = 0; (i < len); i++) {
            this.tabs[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Tab }
     */
    public Tab getTabs(int idx) {
        if (this.tabs == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.tabs[idx];
    }

    public int getTabsLength() {
        if (this.tabs == null) {
            return 0;
        }
        return this.tabs.length;
    }

    /**
     * @param value allowed object is
     *              {@link Tab }
     */
    public Tab setTabs(int idx, Tab value) {
        return this.tabs[idx] = value;
    }

}
