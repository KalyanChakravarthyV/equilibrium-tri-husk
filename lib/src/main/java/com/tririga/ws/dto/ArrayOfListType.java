package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListType" type="{http://dto.ws.tririga.com}ListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListType", propOrder = {
        "listType"
})
public class ArrayOfListType {

    @XmlElement(name = "ListType", nillable = true)
    protected ListType[] listType;

    /**
     * @return array of
     * {@link ListType }
     */
    public ListType[] getListType() {
        if (this.listType == null) {
            return new ListType[0];
        }
        ListType[] retVal = new ListType[this.listType.length];
        System.arraycopy(this.listType, 0, retVal, 0, this.listType.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ListType }
     */
    public void setListType(ListType[] values) {
        if (values == null) {
            this.listType = null;
            return;
        }
        int len = values.length;
        this.listType = ((ListType[]) new ListType[len]);
        for (int i = 0; (i < len); i++) {
            this.listType[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ListType }
     */
    public ListType getListType(int idx) {
        if (this.listType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listType[idx];
    }

    public int getListTypeLength() {
        if (this.listType == null) {
            return 0;
        }
        return this.listType.length;
    }

    /**
     * @param value allowed object is
     *              {@link ListType }
     */
    public ListType setListType(int idx, ListType value) {
        return this.listType[idx] = value;
    }

}
