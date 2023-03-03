package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationRecord" type="{http://dto.ws.tririga.com}IntegrationRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationRecord", propOrder = {
        "integrationRecord"
})
public class ArrayOfIntegrationRecord {

    @XmlElement(name = "IntegrationRecord", nillable = true)
    protected IntegrationRecord[] integrationRecord;

    /**
     * @return array of
     * {@link IntegrationRecord }
     */
    public IntegrationRecord[] getIntegrationRecord() {
        if (this.integrationRecord == null) {
            return new IntegrationRecord[0];
        }
        IntegrationRecord[] retVal = new IntegrationRecord[this.integrationRecord.length];
        System.arraycopy(this.integrationRecord, 0, retVal, 0, this.integrationRecord.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationRecord }
     */
    public void setIntegrationRecord(IntegrationRecord[] values) {
        if (values == null) {
            this.integrationRecord = null;
            return;
        }
        int len = values.length;
        this.integrationRecord = ((IntegrationRecord[]) new IntegrationRecord[len]);
        for (int i = 0; (i < len); i++) {
            this.integrationRecord[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationRecord }
     */
    public IntegrationRecord getIntegrationRecord(int idx) {
        if (this.integrationRecord == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.integrationRecord[idx];
    }

    public int getIntegrationRecordLength() {
        if (this.integrationRecord == null) {
            return 0;
        }
        return this.integrationRecord.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationRecord }
     */
    public IntegrationRecord setIntegrationRecord(int idx, IntegrationRecord value) {
        return this.integrationRecord[idx] = value;
    }

}
