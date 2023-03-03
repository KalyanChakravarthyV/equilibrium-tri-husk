package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationRows complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationRows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationRows" type="{http://dto.ws.tririga.com}IntegrationRows" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationRows", propOrder = {
        "integrationRows"
})
public class ArrayOfIntegrationRows {

    @XmlElement(name = "IntegrationRows", nillable = true)
    protected IntegrationRows[] integrationRows;

    /**
     * @return array of
     * {@link IntegrationRows }
     */
    public IntegrationRows[] getIntegrationRows() {
        if (this.integrationRows == null) {
            return new IntegrationRows[0];
        }
        IntegrationRows[] retVal = new IntegrationRows[this.integrationRows.length];
        System.arraycopy(this.integrationRows, 0, retVal, 0, this.integrationRows.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationRows }
     */
    public void setIntegrationRows(IntegrationRows[] values) {
        if (values == null) {
            this.integrationRows = null;
            return;
        }
        int len = values.length;
        this.integrationRows = ((IntegrationRows[]) new IntegrationRows[len]);
        for (int i = 0; (i < len); i++) {
            this.integrationRows[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationRows }
     */
    public IntegrationRows getIntegrationRows(int idx) {
        if (this.integrationRows == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.integrationRows[idx];
    }

    public int getIntegrationRowsLength() {
        if (this.integrationRows == null) {
            return 0;
        }
        return this.integrationRows.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationRows }
     */
    public IntegrationRows setIntegrationRows(int idx, IntegrationRows value) {
        return this.integrationRows[idx] = value;
    }

}
