package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getObjectTypeActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getObjectTypeActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectTypeActions", propOrder = {
        "moduleId",
        "objectTypeId",
        "recordId",
        "guiId"
})
public class GetObjectTypeActions {

    protected long moduleId;
    protected long objectTypeId;
    protected long recordId;
    protected long guiId;

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
     * Gets the value of the recordId property.
     */
    public long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     */
    public void setRecordId(long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the guiId property.
     */
    public long getGuiId() {
        return guiId;
    }

    /**
     * Sets the value of the guiId property.
     */
    public void setGuiId(long value) {
        this.guiId = value;
    }

}
