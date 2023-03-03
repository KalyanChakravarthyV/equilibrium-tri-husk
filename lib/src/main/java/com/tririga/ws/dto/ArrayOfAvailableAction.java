package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAvailableAction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfAvailableAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableAction" type="{http://dto.ws.tririga.com}AvailableAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAvailableAction", propOrder = {
        "availableAction"
})
public class ArrayOfAvailableAction {

    @XmlElement(name = "AvailableAction", nillable = true)
    protected AvailableAction[] availableAction;

    /**
     * @return array of
     * {@link AvailableAction }
     */
    public AvailableAction[] getAvailableAction() {
        if (this.availableAction == null) {
            return new AvailableAction[0];
        }
        AvailableAction[] retVal = new AvailableAction[this.availableAction.length];
        System.arraycopy(this.availableAction, 0, retVal, 0, this.availableAction.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AvailableAction }
     */
    public void setAvailableAction(AvailableAction[] values) {
        if (values == null) {
            this.availableAction = null;
            return;
        }
        int len = values.length;
        this.availableAction = ((AvailableAction[]) new AvailableAction[len]);
        for (int i = 0; (i < len); i++) {
            this.availableAction[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AvailableAction }
     */
    public AvailableAction getAvailableAction(int idx) {
        if (this.availableAction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.availableAction[idx];
    }

    public int getAvailableActionLength() {
        if (this.availableAction == null) {
            return 0;
        }
        return this.availableAction.length;
    }

    /**
     * @param value allowed object is
     *              {@link AvailableAction }
     */
    public AvailableAction setAvailableAction(int idx, AvailableAction value) {
        return this.availableAction[idx] = value;
    }

}
