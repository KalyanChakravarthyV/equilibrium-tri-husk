package com.tririga.ws;

import com.tririga.ws.dto.IntegrationRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="saveRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationRecords" type="{http://dto.ws.tririga.com}IntegrationRecord" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveRecord", propOrder = {
        "integrationRecords"
})
public class SaveRecord {

    @XmlElement(name = "IntegrationRecords", required = true)
    protected IntegrationRecord[] integrationRecords;

    /**
     * @return array of
     * {@link IntegrationRecord }
     */
    public IntegrationRecord[] getIntegrationRecords() {
        if (this.integrationRecords == null) {
            return new IntegrationRecord[0];
        }
        IntegrationRecord[] retVal = new IntegrationRecord[this.integrationRecords.length];
        System.arraycopy(this.integrationRecords, 0, retVal, 0, this.integrationRecords.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationRecord }
     */
    public void setIntegrationRecords(IntegrationRecord[] values) {
        if (values == null) {
            this.integrationRecords = null;
            return;
        }
        int len = values.length;
        this.integrationRecords = ((IntegrationRecord[]) new IntegrationRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.integrationRecords[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationRecord }
     */
    public IntegrationRecord getIntegrationRecords(int idx) {
        if (this.integrationRecords == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.integrationRecords[idx];
    }

    public int getIntegrationRecordsLength() {
        if (this.integrationRecords == null) {
            return 0;
        }
        return this.integrationRecords.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationRecord }
     */
    public IntegrationRecord setIntegrationRecords(int idx, IntegrationRecord value) {
        return this.integrationRecords[idx] = value;
    }

}
