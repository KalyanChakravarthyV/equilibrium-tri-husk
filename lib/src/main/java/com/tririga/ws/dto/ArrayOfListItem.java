package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListItem" type="{http://dto.ws.tririga.com}ListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListItem", propOrder = {
        "listItem"
})
public class ArrayOfListItem {

    @XmlElement(name = "ListItem", nillable = true)
    protected ListItem[] listItem;

    /**
     * @return array of
     * {@link ListItem }
     */
    public ListItem[] getListItem() {
        if (this.listItem == null) {
            return new ListItem[0];
        }
        ListItem[] retVal = new ListItem[this.listItem.length];
        System.arraycopy(this.listItem, 0, retVal, 0, this.listItem.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ListItem }
     */
    public void setListItem(ListItem[] values) {
        if (values == null) {
            this.listItem = null;
            return;
        }
        int len = values.length;
        this.listItem = ((ListItem[]) new ListItem[len]);
        for (int i = 0; (i < len); i++) {
            this.listItem[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ListItem }
     */
    public ListItem getListItem(int idx) {
        if (this.listItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listItem[idx];
    }

    public int getListItemLength() {
        if (this.listItem == null) {
            return 0;
        }
        return this.listItem.length;
    }

    /**
     * @param value allowed object is
     *              {@link ListItem }
     */
    public ListItem setListItem(int idx, ListItem value) {
        return this.listItem[idx] = value;
    }

}
