package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChildBaseObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfChildBaseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildBaseObjectType" type="{http://dto.ws.tririga.com}ChildBaseObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChildBaseObjectType", propOrder = {
        "childBaseObjectType"
})
public class ArrayOfChildBaseObjectType {

    @XmlElement(name = "ChildBaseObjectType", nillable = true)
    protected ChildBaseObjectType[] childBaseObjectType;

    /**
     * @return array of
     * {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType[] getChildBaseObjectType() {
        if (this.childBaseObjectType == null) {
            return new ChildBaseObjectType[0];
        }
        ChildBaseObjectType[] retVal = new ChildBaseObjectType[this.childBaseObjectType.length];
        System.arraycopy(this.childBaseObjectType, 0, retVal, 0, this.childBaseObjectType.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ChildBaseObjectType }
     */
    public void setChildBaseObjectType(ChildBaseObjectType[] values) {
        if (values == null) {
            this.childBaseObjectType = null;
            return;
        }
        int len = values.length;
        this.childBaseObjectType = ((ChildBaseObjectType[]) new ChildBaseObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.childBaseObjectType[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType getChildBaseObjectType(int idx) {
        if (this.childBaseObjectType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.childBaseObjectType[idx];
    }

    public int getChildBaseObjectTypeLength() {
        if (this.childBaseObjectType == null) {
            return 0;
        }
        return this.childBaseObjectType.length;
    }

    /**
     * @param value allowed object is
     *              {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType setChildBaseObjectType(int idx, ChildBaseObjectType value) {
        return this.childBaseObjectType[idx] = value;
    }

}
