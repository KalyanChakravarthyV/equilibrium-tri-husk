package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTriggerActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTriggerActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TriggerActions" type="{http://dto.ws.tririga.com}TriggerActions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTriggerActions", propOrder = {
        "triggerActions"
})
public class ArrayOfTriggerActions {

    @XmlElement(name = "TriggerActions", nillable = true)
    protected TriggerActions[] triggerActions;

    /**
     * @return array of
     * {@link TriggerActions }
     */
    public TriggerActions[] getTriggerActions() {
        if (this.triggerActions == null) {
            return new TriggerActions[0];
        }
        TriggerActions[] retVal = new TriggerActions[this.triggerActions.length];
        System.arraycopy(this.triggerActions, 0, retVal, 0, this.triggerActions.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link TriggerActions }
     */
    public void setTriggerActions(TriggerActions[] values) {
        if (values == null) {
            this.triggerActions = null;
            return;
        }
        int len = values.length;
        this.triggerActions = ((TriggerActions[]) new TriggerActions[len]);
        for (int i = 0; (i < len); i++) {
            this.triggerActions[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link TriggerActions }
     */
    public TriggerActions getTriggerActions(int idx) {
        if (this.triggerActions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.triggerActions[idx];
    }

    public int getTriggerActionsLength() {
        if (this.triggerActions == null) {
            return 0;
        }
        return this.triggerActions.length;
    }

    /**
     * @param value allowed object is
     *              {@link TriggerActions }
     */
    public TriggerActions setTriggerActions(int idx, TriggerActions value) {
        return this.triggerActions[idx] = value;
    }

}
