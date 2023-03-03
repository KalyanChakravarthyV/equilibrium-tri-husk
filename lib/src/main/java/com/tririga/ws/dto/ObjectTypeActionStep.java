package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectTypeActionStep complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObjectTypeActionStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeActionSteps" type="{http://dto.ws.tririga.com}ObjectTypeActionStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTypeActionStep", propOrder = {
        "action",
        "actionId",
        "label",
        "objectTypeActionSteps"
})
public class ObjectTypeActionStep {

    @XmlElement(nillable = true)
    protected String action;
    protected Long actionId;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected ObjectTypeActionStep[] objectTypeActionSteps;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * Sets the value of the actionId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setActionId(Long value) {
        this.actionId = value;
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
     * @return array of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep[] getObjectTypeActionSteps() {
        if (this.objectTypeActionSteps == null) {
            return new ObjectTypeActionStep[0];
        }
        ObjectTypeActionStep[] retVal = new ObjectTypeActionStep[this.objectTypeActionSteps.length];
        System.arraycopy(this.objectTypeActionSteps, 0, retVal, 0, this.objectTypeActionSteps.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ObjectTypeActionStep }
     */
    public void setObjectTypeActionSteps(ObjectTypeActionStep[] values) {
        if (values == null) {
            this.objectTypeActionSteps = null;
            return;
        }
        int len = values.length;
        this.objectTypeActionSteps = ((ObjectTypeActionStep[]) new ObjectTypeActionStep[len]);
        for (int i = 0; (i < len); i++) {
            this.objectTypeActionSteps[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep getObjectTypeActionSteps(int idx) {
        if (this.objectTypeActionSteps == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.objectTypeActionSteps[idx];
    }

    public int getObjectTypeActionStepsLength() {
        if (this.objectTypeActionSteps == null) {
            return 0;
        }
        return this.objectTypeActionSteps.length;
    }

    /**
     * @param value allowed object is
     *              {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep setObjectTypeActionSteps(int idx, ObjectTypeActionStep value) {
        return this.objectTypeActionSteps[idx] = value;
    }

}
