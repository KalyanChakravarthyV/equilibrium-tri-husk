package com.tririga.ws;

import com.tririga.ws.dto.BaseObjectType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getObjectTypeListByModuleNameResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getObjectTypeListByModuleNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}BaseObjectType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectTypeListByModuleNameResponse", propOrder = {
        "out"
})
public class GetObjectTypeListByModuleNameResponse {

    @XmlElement(required = true, nillable = true)
    protected BaseObjectType[] out;

    /**
     * @return array of
     * {@link BaseObjectType }
     */
    public BaseObjectType[] getOut() {
        if (this.out == null) {
            return new BaseObjectType[0];
        }
        BaseObjectType[] retVal = new BaseObjectType[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link BaseObjectType }
     */
    public void setOut(BaseObjectType[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((BaseObjectType[]) new BaseObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link BaseObjectType }
     */
    public BaseObjectType getOut(int idx) {
        if (this.out == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.out[idx];
    }

    public int getOutLength() {
        if (this.out == null) {
            return 0;
        }
        return this.out.length;
    }

    /**
     * @param value allowed object is
     *              {@link BaseObjectType }
     */
    public BaseObjectType setOut(int idx, BaseObjectType value) {
        return this.out[idx] = value;
    }

}
