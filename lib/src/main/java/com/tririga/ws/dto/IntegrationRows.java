package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationRows complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IntegrationRows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fields" type="{http://dto.ws.tririga.com}IntegrationField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationRows", propOrder = {
        "action",
        "fields",
        "recordId",
        "rowIndex"
})
public class IntegrationRows {

    @XmlElement(required = true)
    protected String action;
    @XmlElement(nillable = true)
    protected IntegrationField[] fields;
    protected Long recordId;
    protected Integer rowIndex;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * @return array of
     * {@link IntegrationField }
     */
    public IntegrationField[] getFields() {
        if (this.fields == null) {
            return new IntegrationField[0];
        }
        IntegrationField[] retVal = new IntegrationField[this.fields.length];
        System.arraycopy(this.fields, 0, retVal, 0, this.fields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationField }
     */
    public void setFields(IntegrationField[] values) {
        if (values == null) {
            this.fields = null;
            return;
        }
        int len = values.length;
        this.fields = ((IntegrationField[]) new IntegrationField[len]);
        for (int i = 0; (i < len); i++) {
            this.fields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationField }
     */
    public IntegrationField getFields(int idx) {
        if (this.fields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fields[idx];
    }

    public int getFieldsLength() {
        if (this.fields == null) {
            return 0;
        }
        return this.fields.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationField }
     */
    public IntegrationField setFields(int idx, IntegrationField value) {
        return this.fields[idx] = value;
    }

    /**
     * Gets the value of the recordId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRecordId(Long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the rowIndex property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRowIndex() {
        return rowIndex;
    }

    /**
     * Sets the value of the rowIndex property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRowIndex(Integer value) {
        this.rowIndex = value;
    }

}
