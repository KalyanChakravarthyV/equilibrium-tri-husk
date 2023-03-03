package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBaseObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfBaseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseObjectType" type="{http://dto.ws.tririga.com}BaseObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseObjectType", propOrder = {
        "baseObjectType"
})
public class ArrayOfBaseObjectType {

    @XmlElement(name = "BaseObjectType", nillable = true)
    protected BaseObjectType[] baseObjectType;

    /**
     * @return array of
     * {@link BaseObjectType }
     */
    public BaseObjectType[] getBaseObjectType() {
        if (this.baseObjectType == null) {
            return new BaseObjectType[0];
        }
        BaseObjectType[] retVal = new BaseObjectType[this.baseObjectType.length];
        System.arraycopy(this.baseObjectType, 0, retVal, 0, this.baseObjectType.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link BaseObjectType }
     */
    public void setBaseObjectType(BaseObjectType[] values) {
        if (values == null) {
            this.baseObjectType = null;
            return;
        }
        int len = values.length;
        this.baseObjectType = ((BaseObjectType[]) new BaseObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.baseObjectType[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link BaseObjectType }
     */
    public BaseObjectType getBaseObjectType(int idx) {
        if (this.baseObjectType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.baseObjectType[idx];
    }

    public int getBaseObjectTypeLength() {
        if (this.baseObjectType == null) {
            return 0;
        }
        return this.baseObjectType.length;
    }

    /**
     * @param value allowed object is
     *              {@link BaseObjectType }
     */
    public BaseObjectType setBaseObjectType(int idx, BaseObjectType value) {
        return this.baseObjectType[idx] = value;
    }

}
