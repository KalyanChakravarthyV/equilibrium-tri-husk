package com.tririga.ws;

import com.tririga.ws.dto.ActionItem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptActionItems complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="acceptActionItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionItems" type="{http://dto.ws.tririga.com}ActionItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptActionItems", propOrder = {
        "actionItems"
})
public class AcceptActionItems {

    @XmlElement(name = "ActionItems", required = true)
    protected ActionItem[] actionItems;

    /**
     * @return array of
     * {@link ActionItem }
     */
    public ActionItem[] getActionItems() {
        if (this.actionItems == null) {
            return new ActionItem[0];
        }
        ActionItem[] retVal = new ActionItem[this.actionItems.length];
        System.arraycopy(this.actionItems, 0, retVal, 0, this.actionItems.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ActionItem }
     */
    public void setActionItems(ActionItem[] values) {
        if (values == null) {
            this.actionItems = null;
            return;
        }
        int len = values.length;
        this.actionItems = ((ActionItem[]) new ActionItem[len]);
        for (int i = 0; (i < len); i++) {
            this.actionItems[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ActionItem }
     */
    public ActionItem getActionItems(int idx) {
        if (this.actionItems == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.actionItems[idx];
    }

    public int getActionItemsLength() {
        if (this.actionItems == null) {
            return 0;
        }
        return this.actionItems.length;
    }

    /**
     * @param value allowed object is
     *              {@link ActionItem }
     */
    public ActionItem setActionItems(int idx, ActionItem value) {
        return this.actionItems[idx] = value;
    }

}
