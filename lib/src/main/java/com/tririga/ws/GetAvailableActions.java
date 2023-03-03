package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableActions complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getAvailableActions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableActions", propOrder = {
        "recordIds"
})
public class GetAvailableActions {

    @XmlElement(type = Long.class)
    protected long[] recordIds;

    /**
     * @return array of
     * {@link Long }
     */
    public long[] getRecordIds() {
        if (this.recordIds == null) {
            return new long[0];
        }
        long[] retVal = new long[this.recordIds.length];
        System.arraycopy(this.recordIds, 0, retVal, 0, this.recordIds.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Long }
     */
    public void setRecordIds(long[] values) {
        if (values == null) {
            this.recordIds = null;
            return;
        }
        int len = values.length;
        this.recordIds = ((long[]) new long[len]);
        for (int i = 0; (i < len); i++) {
            this.recordIds[i] = new Long(values[i]);
        }
    }

    /**
     * @return one of
     * {@link Long }
     */
    public long getRecordIds(int idx) {
        if (this.recordIds == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recordIds[idx];
    }

    public int getRecordIdsLength() {
        if (this.recordIds == null) {
            return 0;
        }
        return this.recordIds.length;
    }

    /**
     * @param value allowed object is
     *              {@link Long }
     */
    public long setRecordIds(int idx, long value) {
        return this.recordIds[idx] = new Long(value);
    }

}
