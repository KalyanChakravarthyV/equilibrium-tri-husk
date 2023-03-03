package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}HierarchyObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvalHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="auditAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="auditActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="auditDataChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="createdById" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasCalendar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="requireExplanation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://dto.ws.tririga.com}Section" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="showSingleTab" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", propOrder = {
        "approvalHistory",
        "auditAccess",
        "auditActions",
        "auditDataChanges",
        "createdById",
        "description",
        "displayName",
        "hasCalendar",
        "moduleId",
        "requireExplanation",
        "sections",
        "showSingleTab",
        "type"
})
public class ObjectType
        extends HierarchyObjectType {

    protected Boolean approvalHistory;
    protected Boolean auditAccess;
    protected Boolean auditActions;
    protected Boolean auditDataChanges;
    protected Long createdById;
    @XmlElement(nillable = true)
    protected String description;
    @XmlElement(nillable = true)
    protected String displayName;
    protected Boolean hasCalendar;
    protected Integer moduleId;
    protected Boolean requireExplanation;
    @XmlElement(nillable = true)
    protected Section[] sections;
    protected Boolean showSingleTab;
    protected Integer type;

    /**
     * Gets the value of the approvalHistory property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isApprovalHistory() {
        return approvalHistory;
    }

    /**
     * Sets the value of the approvalHistory property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setApprovalHistory(Boolean value) {
        this.approvalHistory = value;
    }

    /**
     * Gets the value of the auditAccess property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAuditAccess() {
        return auditAccess;
    }

    /**
     * Sets the value of the auditAccess property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAuditAccess(Boolean value) {
        this.auditAccess = value;
    }

    /**
     * Gets the value of the auditActions property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAuditActions() {
        return auditActions;
    }

    /**
     * Sets the value of the auditActions property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAuditActions(Boolean value) {
        this.auditActions = value;
    }

    /**
     * Gets the value of the auditDataChanges property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAuditDataChanges() {
        return auditDataChanges;
    }

    /**
     * Sets the value of the auditDataChanges property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAuditDataChanges(Boolean value) {
        this.auditDataChanges = value;
    }

    /**
     * Gets the value of the createdById property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setCreatedById(Long value) {
        this.createdById = value;
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
     * Gets the value of the displayName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the hasCalendar property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isHasCalendar() {
        return hasCalendar;
    }

    /**
     * Sets the value of the hasCalendar property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setHasCalendar(Boolean value) {
        this.hasCalendar = value;
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
     * Gets the value of the requireExplanation property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRequireExplanation() {
        return requireExplanation;
    }

    /**
     * Sets the value of the requireExplanation property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRequireExplanation(Boolean value) {
        this.requireExplanation = value;
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
     * Gets the value of the showSingleTab property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isShowSingleTab() {
        return showSingleTab;
    }

    /**
     * Sets the value of the showSingleTab property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setShowSingleTab(Boolean value) {
        this.showSingleTab = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
