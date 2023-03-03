package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTransition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transition" type="{http://dto.ws.tririga.com}Transition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransition", propOrder = {
        "transition"
})
public class ArrayOfTransition {

    @XmlElement(name = "Transition", nillable = true)
    protected Transition[] transition;

    /**
     * @return array of
     * {@link Transition }
     */
    public Transition[] getTransition() {
        if (this.transition == null) {
            return new Transition[0];
        }
        Transition[] retVal = new Transition[this.transition.length];
        System.arraycopy(this.transition, 0, retVal, 0, this.transition.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Transition }
     */
    public void setTransition(Transition[] values) {
        if (values == null) {
            this.transition = null;
            return;
        }
        int len = values.length;
        this.transition = ((Transition[]) new Transition[len]);
        for (int i = 0; (i < len); i++) {
            this.transition[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Transition }
     */
    public Transition getTransition(int idx) {
        if (this.transition == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.transition[idx];
    }

    public int getTransitionLength() {
        if (this.transition == null) {
            return 0;
        }
        return this.transition.length;
    }

    /**
     * @param value allowed object is
     *              {@link Transition }
     */
    public Transition setTransition(int idx, Transition value) {
        return this.transition[idx] = value;
    }

}
