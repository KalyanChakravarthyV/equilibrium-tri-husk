package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Transition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="actionSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subActions" type="{http://dto.ws.tririga.com}SubAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transition", propOrder = {
        "action",
        "actionId",
        "actionSequence",
        "label",
        "nextState",
        "subActions"
})
public class Transition {

    @XmlElement(nillable = true)
    protected String action;
    protected Long actionId;
    protected Long actionSequence;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String nextState;
    @XmlElement(nillable = true)
    protected SubAction[] subActions;

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
     * Gets the value of the actionSequence property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getActionSequence() {
        return actionSequence;
    }

    /**
     * Sets the value of the actionSequence property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setActionSequence(Long value) {
        this.actionSequence = value;
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
     * Gets the value of the nextState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNextState() {
        return nextState;
    }

    /**
     * Sets the value of the nextState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNextState(String value) {
        this.nextState = value;
    }

    /**
     * @return array of
     * {@link SubAction }
     */
    public SubAction[] getSubActions() {
        if (this.subActions == null) {
            return new SubAction[0];
        }
        SubAction[] retVal = new SubAction[this.subActions.length];
        System.arraycopy(this.subActions, 0, retVal, 0, this.subActions.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link SubAction }
     */
    public void setSubActions(SubAction[] values) {
        if (values == null) {
            this.subActions = null;
            return;
        }
        int len = values.length;
        this.subActions = ((SubAction[]) new SubAction[len]);
        for (int i = 0; (i < len); i++) {
            this.subActions[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link SubAction }
     */
    public SubAction getSubActions(int idx) {
        if (this.subActions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.subActions[idx];
    }

    public int getSubActionsLength() {
        if (this.subActions == null) {
            return 0;
        }
        return this.subActions.length;
    }

    /**
     * @param value allowed object is
     *              {@link SubAction }
     */
    public SubAction setSubActions(int idx, SubAction value) {
        return this.subActions[idx] = value;
    }

}
