package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGUI complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfGUI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUI" type="{http://gui.dto.ws.tririga.com}GUI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGUI", propOrder = {
        "gui"
})
public class ArrayOfGUI {

    @XmlElement(name = "GUI", nillable = true)
    protected GUI[] gui;

    /**
     * @return array of
     * {@link GUI }
     */
    public GUI[] getGUI() {
        if (this.gui == null) {
            return new GUI[0];
        }
        GUI[] retVal = new GUI[this.gui.length];
        System.arraycopy(this.gui, 0, retVal, 0, this.gui.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link GUI }
     */
    public void setGUI(GUI[] values) {
        if (values == null) {
            this.gui = null;
            return;
        }
        int len = values.length;
        this.gui = ((GUI[]) new GUI[len]);
        for (int i = 0; (i < len); i++) {
            this.gui[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link GUI }
     */
    public GUI getGUI(int idx) {
        if (this.gui == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.gui[idx];
    }

    public int getGUILength() {
        if (this.gui == null) {
            return 0;
        }
        return this.gui.length;
    }

    /**
     * @param value allowed object is
     *              {@link GUI }
     */
    public GUI setGUI(int idx, GUI value) {
        return this.gui[idx] = value;
    }

}
