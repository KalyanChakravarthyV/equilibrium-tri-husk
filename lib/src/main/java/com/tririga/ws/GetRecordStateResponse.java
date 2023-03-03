package com.tririga.ws;

import com.tririga.ws.dto.State;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRecordStateResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getRecordStateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}State" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecordStateResponse", propOrder = {
        "out"
})
public class GetRecordStateResponse {

    @XmlElement(required = true, nillable = true)
    protected State[] out;

    /**
     * @return array of
     * {@link State }
     */
    public State[] getOut() {
        if (this.out == null) {
            return new State[0];
        }
        State[] retVal = new State[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link State }
     */
    public void setOut(State[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((State[]) new State[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link State }
     */
    public State getOut(int idx) {
        if (this.out == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.out[idx];
    }

    public int getOutLength() {
        if (this.out == null) {
            return 0;
        }
        return this.out.length;
    }

    /**
     * @param value allowed object is
     *              {@link State }
     */
    public State setOut(int idx, State value) {
        return this.out[idx] = value;
    }

}
