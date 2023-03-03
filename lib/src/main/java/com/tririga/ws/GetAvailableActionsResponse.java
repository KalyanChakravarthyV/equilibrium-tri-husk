package com.tririga.ws;

import com.tririga.ws.dto.AvailableAction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableActionsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getAvailableActionsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}AvailableAction" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableActionsResponse", propOrder = {
        "out"
})
public class GetAvailableActionsResponse {

    @XmlElement(required = true, nillable = true)
    protected AvailableAction[] out;

    /**
     * @return array of
     * {@link AvailableAction }
     */
    public AvailableAction[] getOut() {
        if (this.out == null) {
            return new AvailableAction[0];
        }
        AvailableAction[] retVal = new AvailableAction[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AvailableAction }
     */
    public void setOut(AvailableAction[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((AvailableAction[]) new AvailableAction[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AvailableAction }
     */
    public AvailableAction getOut(int idx) {
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
     *              {@link AvailableAction }
     */
    public AvailableAction setOut(int idx, AvailableAction value) {
        return this.out[idx] = value;
    }

}
