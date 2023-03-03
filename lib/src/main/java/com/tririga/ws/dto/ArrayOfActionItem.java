package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActionItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfActionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionItem" type="{http://dto.ws.tririga.com}ActionItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActionItem", propOrder = {
        "actionItem"
})
public class ArrayOfActionItem {

    @XmlElement(name = "ActionItem", nillable = true)
    protected ActionItem[] actionItem;

    /**
     * @return array of
     * {@link ActionItem }
     */
    public ActionItem[] getActionItem() {
        if (this.actionItem == null) {
            return new ActionItem[0];
        }
        ActionItem[] retVal = new ActionItem[this.actionItem.length];
        System.arraycopy(this.actionItem, 0, retVal, 0, this.actionItem.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ActionItem }
     */
    public void setActionItem(ActionItem[] values) {
        if (values == null) {
            this.actionItem = null;
            return;
        }
        int len = values.length;
        this.actionItem = ((ActionItem[]) new ActionItem[len]);
        for (int i = 0; (i < len); i++) {
            this.actionItem[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ActionItem }
     */
    public ActionItem getActionItem(int idx) {
        if (this.actionItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.actionItem[idx];
    }

    public int getActionItemLength() {
        if (this.actionItem == null) {
            return 0;
        }
        return this.actionItem.length;
    }

    /**
     * @param value allowed object is
     *              {@link ActionItem }
     */
    public ActionItem setActionItem(int idx, ActionItem value) {
        return this.actionItem[idx] = value;
    }

}
