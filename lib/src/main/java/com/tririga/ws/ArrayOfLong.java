package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLong complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfLong"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLong", propOrder = {
        "_long"
})
public class ArrayOfLong {

    @XmlElement(name = "long", type = Long.class)
    protected long[] _long;

    /**
     * @return array of
     * {@link Long }
     */
    public long[] getLong() {
        if (this._long == null) {
            return new long[0];
        }
        long[] retVal = new long[this._long.length];
        System.arraycopy(this._long, 0, retVal, 0, this._long.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Long }
     */
    public void setLong(long[] values) {
        if (values == null) {
            this._long = null;
            return;
        }
        int len = values.length;
        this._long = ((long[]) new long[len]);
        for (int i = 0; (i < len); i++) {
            this._long[i] = new Long(values[i]);
        }
    }

    /**
     * @return one of
     * {@link Long }
     */
    public long getLong(int idx) {
        if (this._long == null) {
            throw new IndexOutOfBoundsException();
        }
        return this._long[idx];
    }

    public int getLongLength() {
        if (this._long == null) {
            return 0;
        }
        return this._long.length;
    }

    /**
     * @param value allowed object is
     *              {@link Long }
     */
    public long setLong(int idx, long value) {
        return this._long[idx] = new Long(value);
    }

}
