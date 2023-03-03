package com.tririga.ws;

import com.tririga.ws.dto.ChildRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getChildrenResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getChildrenResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ChildRecord" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChildrenResponse", propOrder = {
        "out"
})
public class GetChildrenResponse {

    @XmlElement(required = true, nillable = true)
    protected ChildRecord[] out;

    /**
     * @return array of
     * {@link ChildRecord }
     */
    public ChildRecord[] getOut() {
        if (this.out == null) {
            return new ChildRecord[0];
        }
        ChildRecord[] retVal = new ChildRecord[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ChildRecord }
     */
    public void setOut(ChildRecord[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((ChildRecord[]) new ChildRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ChildRecord }
     */
    public ChildRecord getOut(int idx) {
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
     *              {@link ChildRecord }
     */
    public ChildRecord setOut(int idx, ChildRecord value) {
        return this.out[idx] = value;
    }

}
