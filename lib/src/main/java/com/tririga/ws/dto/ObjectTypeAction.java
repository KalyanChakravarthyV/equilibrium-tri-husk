package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTypeAction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObjectTypeAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boActionSteps" type="{http://dto.ws.tririga.com}ObjectTypeActionStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guiId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTypeAction", propOrder = {
        "boActionSteps",
        "guiId",
        "moduleId",
        "objectTypeId",
        "recordId"
})
public class ObjectTypeAction {

    @XmlElement(nillable = true)
    protected ObjectTypeActionStep[] boActionSteps;
    protected Long guiId;
    protected Long moduleId;
    protected Long objectTypeId;
    protected Long recordId;

    /**
     * @return array of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep[] getBoActionSteps() {
        if (this.boActionSteps == null) {
            return new ObjectTypeActionStep[0];
        }
        ObjectTypeActionStep[] retVal = new ObjectTypeActionStep[this.boActionSteps.length];
        System.arraycopy(this.boActionSteps, 0, retVal, 0, this.boActionSteps.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ObjectTypeActionStep }
     */
    public void setBoActionSteps(ObjectTypeActionStep[] values) {
        if (values == null) {
            this.boActionSteps = null;
            return;
        }
        int len = values.length;
        this.boActionSteps = ((ObjectTypeActionStep[]) new ObjectTypeActionStep[len]);
        for (int i = 0; (i < len); i++) {
            this.boActionSteps[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep getBoActionSteps(int idx) {
        if (this.boActionSteps == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.boActionSteps[idx];
    }

    public int getBoActionStepsLength() {
        if (this.boActionSteps == null) {
            return 0;
        }
        return this.boActionSteps.length;
    }

    /**
     * @param value allowed object is
     *              {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep setBoActionSteps(int idx, ObjectTypeActionStep value) {
        return this.boActionSteps[idx] = value;
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
     * Gets the value of the moduleId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setModuleId(Long value) {
        this.moduleId = value;
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

}
