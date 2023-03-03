package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for State complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="State"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trans" type="{http://dto.ws.tririga.com}Transition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "State", propOrder = {
        "recordId",
        "state",
        "trans"
})
public class State {

    protected Long recordId;
    @XmlElement(nillable = true)
    protected String state;
    @XmlElement(nillable = true)
    protected Transition[] trans;

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

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * @return array of
     * {@link Transition }
     */
    public Transition[] getTrans() {
        if (this.trans == null) {
            return new Transition[0];
        }
        Transition[] retVal = new Transition[this.trans.length];
        System.arraycopy(this.trans, 0, retVal, 0, this.trans.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Transition }
     */
    public void setTrans(Transition[] values) {
        if (values == null) {
            this.trans = null;
            return;
        }
        int len = values.length;
        this.trans = ((Transition[]) new Transition[len]);
        for (int i = 0; (i < len); i++) {
            this.trans[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Transition }
     */
    public Transition getTrans(int idx) {
        if (this.trans == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.trans[idx];
    }

    public int getTransLength() {
        if (this.trans == null) {
            return 0;
        }
        return this.trans.length;
    }

    /**
     * @param value allowed object is
     *              {@link Transition }
     */
    public Transition setTrans(int idx, Transition value) {
        return this.trans[idx] = value;
    }

}
