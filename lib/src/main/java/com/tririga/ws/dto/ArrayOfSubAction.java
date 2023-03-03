package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubAction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfSubAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAction" type="{http://dto.ws.tririga.com}SubAction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubAction", propOrder = {
        "subAction"
})
public class ArrayOfSubAction {

    @XmlElement(name = "SubAction", nillable = true)
    protected SubAction[] subAction;

    /**
     * @return array of
     * {@link SubAction }
     */
    public SubAction[] getSubAction() {
        if (this.subAction == null) {
            return new SubAction[0];
        }
        SubAction[] retVal = new SubAction[this.subAction.length];
        System.arraycopy(this.subAction, 0, retVal, 0, this.subAction.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link SubAction }
     */
    public void setSubAction(SubAction[] values) {
        if (values == null) {
            this.subAction = null;
            return;
        }
        int len = values.length;
        this.subAction = ((SubAction[]) new SubAction[len]);
        for (int i = 0; (i < len); i++) {
            this.subAction[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link SubAction }
     */
    public SubAction getSubAction(int idx) {
        if (this.subAction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.subAction[idx];
    }

    public int getSubActionLength() {
        if (this.subAction == null) {
            return 0;
        }
        return this.subAction.length;
    }

    /**
     * @param value allowed object is
     *              {@link SubAction }
     */
    public SubAction setSubAction(int idx, SubAction value) {
        return this.subAction[idx] = value;
    }

}
