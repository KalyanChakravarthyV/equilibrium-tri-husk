package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListByTypes complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getListByTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectTypeIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListByTypes", propOrder = {
        "objectTypeIds"
})
public class GetListByTypes {

    @XmlElement(type = Long.class)
    protected long[] objectTypeIds;

    /**
     * @return array of
     * {@link Long }
     */
    public long[] getObjectTypeIds() {
        if (this.objectTypeIds == null) {
            return new long[0];
        }
        long[] retVal = new long[this.objectTypeIds.length];
        System.arraycopy(this.objectTypeIds, 0, retVal, 0, this.objectTypeIds.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Long }
     */
    public void setObjectTypeIds(long[] values) {
        if (values == null) {
            this.objectTypeIds = null;
            return;
        }
        int len = values.length;
        this.objectTypeIds = ((long[]) new long[len]);
        for (int i = 0; (i < len); i++) {
            this.objectTypeIds[i] = new Long(values[i]);
        }
    }

    /**
     * @return one of
     * {@link Long }
     */
    public long getObjectTypeIds(int idx) {
        if (this.objectTypeIds == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.objectTypeIds[idx];
    }

    public int getObjectTypeIdsLength() {
        if (this.objectTypeIds == null) {
            return 0;
        }
        return this.objectTypeIds.length;
    }

    /**
     * @param value allowed object is
     *              {@link Long }
     */
    public long setObjectTypeIds(int idx, long value) {
        return this.objectTypeIds[idx] = new Long(value);
    }

}
