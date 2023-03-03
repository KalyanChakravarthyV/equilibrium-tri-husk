package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GUI complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GUI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childRecordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="popupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saveOnPopup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="singleTab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tabs" type="{http://gui.dto.ws.tririga.com}Tab" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GUI", propOrder = {
        "childRecordId",
        "id",
        "label",
        "moduleId",
        "moduleName",
        "name",
        "objectTypeId",
        "objectTypeName",
        "popupId",
        "recordId",
        "recordName",
        "saveOnPopup",
        "singleTab",
        "state",
        "tabs",
        "type"
})
public class GUI {

    protected Long childRecordId;
    protected Long id;
    @XmlElement(nillable = true)
    protected String label;
    protected Integer moduleId;
    @XmlElement(nillable = true)
    protected String moduleName;
    @XmlElement(nillable = true)
    protected String name;
    protected Long objectTypeId;
    @XmlElement(nillable = true)
    protected String objectTypeName;
    protected Long popupId;
    protected Long recordId;
    @XmlElement(nillable = true)
    protected String recordName;
    protected Boolean saveOnPopup;
    protected Boolean singleTab;
    @XmlElement(nillable = true)
    protected String state;
    @XmlElement(nillable = true)
    protected Tab[] tabs;
    @XmlElement(nillable = true)
    protected String type;

    /**
     * Gets the value of the childRecordId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getChildRecordId() {
        return childRecordId;
    }

    /**
     * Sets the value of the childRecordId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setChildRecordId(Long value) {
        this.childRecordId = value;
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
     * Gets the value of the popupId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getPopupId() {
        return popupId;
    }

    /**
     * Sets the value of the popupId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setPopupId(Long value) {
        this.popupId = value;
    }

    /**
     * Gets the value of the recordId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the recordName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the saveOnPopup property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSaveOnPopup() {
        return saveOnPopup;
    }

    /**
     * Sets the value of the saveOnPopup property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSaveOnPopup(Boolean value) {
        this.saveOnPopup = value;
    }

    /**
     * Gets the value of the singleTab property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSingleTab() {
        return singleTab;
    }

    /**
     * Sets the value of the singleTab property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSingleTab(Boolean value) {
        this.singleTab = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
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
