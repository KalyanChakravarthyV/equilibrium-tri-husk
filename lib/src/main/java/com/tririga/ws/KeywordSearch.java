package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keywordSearch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="keywordSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keywordSearch", propOrder = {
        "projectId",
        "moduleId",
        "objectTypeId",
        "keyword"
})
public class KeywordSearch {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long projectId;
    protected long moduleId;
    protected long objectTypeId;
    protected String keyword;

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
     * Gets the value of the moduleId property.
     */
    public long getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     */
    public void setModuleId(long value) {
        this.moduleId = value;
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
     * Gets the value of the keyword property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

}
