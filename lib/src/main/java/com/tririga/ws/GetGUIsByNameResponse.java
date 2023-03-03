package com.tririga.ws;

import com.tririga.ws.dto.gui.GUI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGUIsByNameResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getGUIsByNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://gui.dto.ws.tririga.com}GUI" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGUIsByNameResponse", propOrder = {
        "out"
})
public class GetGUIsByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected GUI[] out;

    /**
     * @return array of
     * {@link GUI }
     */
    public GUI[] getOut() {
        if (this.out == null) {
            return new GUI[0];
        }
        GUI[] retVal = new GUI[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link GUI }
     */
    public void setOut(GUI[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((GUI[]) new GUI[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link GUI }
     */
    public GUI getOut(int idx) {
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
     *              {@link GUI }
     */
    public GUI setOut(int idx, GUI value) {
        return this.out[idx] = value;
    }

}
