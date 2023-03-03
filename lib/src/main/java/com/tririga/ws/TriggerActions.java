package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for triggerActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="triggerActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TriggerActions" type="{http://dto.ws.tririga.com}TriggerActions" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggerActions", propOrder = {
        "triggerActions"
})
public class TriggerActions {

    @XmlElement(name = "TriggerActions", required = true)
    protected com.tririga.ws.dto.TriggerActions[] triggerActions;

    /**
     * @return array of
     * {@link com.tririga.ws.dto.TriggerActions }
     */
    public com.tririga.ws.dto.TriggerActions[] getTriggerActions() {
        if (this.triggerActions == null) {
            return new com.tririga.ws.dto.TriggerActions[0];
        }
        com.tririga.ws.dto.TriggerActions[] retVal = new com.tririga.ws.dto.TriggerActions[this.triggerActions.length];
        System.arraycopy(this.triggerActions, 0, retVal, 0, this.triggerActions.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link com.tririga.ws.dto.TriggerActions }
     */
    public void setTriggerActions(com.tririga.ws.dto.TriggerActions[] values) {
        if (values == null) {
            this.triggerActions = null;
            return;
        }
        int len = values.length;
        this.triggerActions = ((com.tririga.ws.dto.TriggerActions[]) new com.tririga.ws.dto.TriggerActions[len]);
        for (int i = 0; (i < len); i++) {
            this.triggerActions[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link com.tririga.ws.dto.TriggerActions }
     */
    public com.tririga.ws.dto.TriggerActions getTriggerActions(int idx) {
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
     *              {@link com.tririga.ws.dto.TriggerActions }
     */
    public com.tririga.ws.dto.TriggerActions setTriggerActions(int idx, com.tririga.ws.dto.TriggerActions value) {
        return this.triggerActions[idx] = value;
    }

}
