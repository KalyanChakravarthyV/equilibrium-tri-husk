package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfState complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="State" type="{http://dto.ws.tririga.com}State" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfState", propOrder = {
        "state"
})
public class ArrayOfState {

    @XmlElement(name = "State", nillable = true)
    protected State[] state;

    /**
     * @return array of
     * {@link State }
     */
    public State[] getState() {
        if (this.state == null) {
            return new State[0];
        }
        State[] retVal = new State[this.state.length];
        System.arraycopy(this.state, 0, retVal, 0, this.state.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link State }
     */
    public void setState(State[] values) {
        if (values == null) {
            this.state = null;
            return;
        }
        int len = values.length;
        this.state = ((State[]) new State[len]);
        for (int i = 0; (i < len); i++) {
            this.state[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link State }
     */
    public State getState(int idx) {
        if (this.state == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.state[idx];
    }

    public int getStateLength() {
        if (this.state == null) {
            return 0;
        }
        return this.state.length;
    }

    /**
     * @param value allowed object is
     *              {@link State }
     */
    public State setState(int idx, State value) {
        return this.state[idx] = value;
    }

}
