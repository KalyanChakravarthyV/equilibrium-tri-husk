package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IntegrationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://dto.ws.tririga.com}IntegrationSection" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationRecord", propOrder = {
        "actionName",
        "guiId",
        "id",
        "key",
        "moduleId",
        "name",
        "objectPath",
        "objectTypeId",
        "objectTypeName",
        "parentId",
        "projectId",
        "sections"
})
public class IntegrationRecord {

    @XmlElement(required = true)
    protected String actionName;
    protected Long guiId;
    protected long id;
    @XmlElement(nillable = true)
    protected String key;
    protected int moduleId;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String objectPath;
    protected long objectTypeId;
    @XmlElement(required = true)
    protected String objectTypeName;
    protected Long parentId;
    protected Long projectId;
    @XmlElement(required = true)
    protected IntegrationSection[] sections;

    /**
     * Gets the value of the actionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setActionName(String value) {
        this.actionName = value;
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
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the key property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the moduleId property.
     */
    public int getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     */
    public void setModuleId(int value) {
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
     */
    public long getObjectTypeId() {
        return objectTypeId;
    }

    /**
     * Sets the value of the objectTypeId property.
     */
    public void setObjectTypeId(long value) {
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
     * Gets the value of the projectId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setProjectId(Long value) {
        this.projectId = value;
    }

    /**
     * @return array of
     * {@link IntegrationSection }
     */
    public IntegrationSection[] getSections() {
        if (this.sections == null) {
            return new IntegrationSection[0];
        }
        IntegrationSection[] retVal = new IntegrationSection[this.sections.length];
        System.arraycopy(this.sections, 0, retVal, 0, this.sections.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationSection }
     */
    public void setSections(IntegrationSection[] values) {
        if (values == null) {
            this.sections = null;
            return;
        }
        int len = values.length;
        this.sections = ((IntegrationSection[]) new IntegrationSection[len]);
        for (int i = 0; (i < len); i++) {
            this.sections[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationSection }
     */
    public IntegrationSection getSections(int idx) {
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
     *              {@link IntegrationSection }
     */
    public IntegrationSection setSections(int idx, IntegrationSection value) {
        return this.sections[idx] = value;
    }

}
