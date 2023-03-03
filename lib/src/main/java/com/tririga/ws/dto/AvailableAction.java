package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableAction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AvailableAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="availableTransitions" type="{http://dto.ws.tririga.com}Transition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableAction", propOrder = {
        "availableTransitions",
        "currentState",
        "recordId"
})
public class AvailableAction {

    @XmlElement(nillable = true)
    protected Transition[] availableTransitions;
    @XmlElement(nillable = true)
    protected String currentState;
    protected Long recordId;

    /**
     * @return array of
     * {@link Transition }
     */
    public Transition[] getAvailableTransitions() {
        if (this.availableTransitions == null) {
            return new Transition[0];
        }
        Transition[] retVal = new Transition[this.availableTransitions.length];
        System.arraycopy(this.availableTransitions, 0, retVal, 0, this.availableTransitions.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Transition }
     */
    public void setAvailableTransitions(Transition[] values) {
        if (values == null) {
            this.availableTransitions = null;
            return;
        }
        int len = values.length;
        this.availableTransitions = ((Transition[]) new Transition[len]);
        for (int i = 0; (i < len); i++) {
            this.availableTransitions[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Transition }
     */
    public Transition getAvailableTransitions(int idx) {
        if (this.availableTransitions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.availableTransitions[idx];
    }

    public int getAvailableTransitionsLength() {
        if (this.availableTransitions == null) {
            return 0;
        }
        return this.availableTransitions.length;
    }

    /**
     * @param value allowed object is
     *              {@link Transition }
     */
    public Transition setAvailableTransitions(int idx, Transition value) {
        return this.availableTransitions[idx] = value;
    }

    /**
     * Gets the value of the currentState property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrentState(String value) {
        this.currentState = value;
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
