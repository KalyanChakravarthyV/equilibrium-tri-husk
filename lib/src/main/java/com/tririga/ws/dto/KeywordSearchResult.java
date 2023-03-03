package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordSearchResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="KeywordSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordSearchResult", propOrder = {
        "moduleId",
        "moduleName",
        "objectTypeId",
        "objectTypeName",
        "recordIds"
})
public class KeywordSearchResult {

    protected Integer moduleId;
    @XmlElement(nillable = true)
    protected String moduleName;
    protected Long objectTypeId;
    @XmlElement(nillable = true)
    protected String objectTypeName;
    @XmlElement(nillable = true)
    protected Long[] recordIds;

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
     * @return array of
     * {@link Long }
     */
    public Long[] getRecordIds() {
        if (this.recordIds == null) {
            return new Long[0];
        }
        Long[] retVal = new Long[this.recordIds.length];
        System.arraycopy(this.recordIds, 0, retVal, 0, this.recordIds.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Long }
     */
    public void setRecordIds(Long[] values) {
        if (values == null) {
            this.recordIds = null;
            return;
        }
        int len = values.length;
        this.recordIds = ((Long[]) new Long[len]);
        for (int i = 0; (i < len); i++) {
            this.recordIds[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Long }
     */
    public Long getRecordIds(int idx) {
        if (this.recordIds == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recordIds[idx];
    }

    public int getRecordIdsLength() {
        if (this.recordIds == null) {
            return 0;
        }
        return this.recordIds.length;
    }

    /**
     * @param value allowed object is
     *              {@link Long }
     */
    public Long setRecordIds(int idx, Long value) {
        return this.recordIds[idx] = value;
    }

}
