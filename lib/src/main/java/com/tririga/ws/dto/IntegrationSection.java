package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegrationSection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IntegrationSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://dto.ws.tririga.com}IntegrationField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rows" type="{http://dto.ws.tririga.com}IntegrationRows" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationSection", propOrder = {
        "fields",
        "name",
        "rows",
        "type"
})
public class IntegrationSection {

    @XmlElement(nillable = true)
    protected IntegrationField[] fields;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(nillable = true)
    protected IntegrationRows[] rows;
    @XmlElement(nillable = true)
    protected String type;

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
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * @return array of
     * {@link IntegrationRows }
     */
    public IntegrationRows[] getRows() {
        if (this.rows == null) {
            return new IntegrationRows[0];
        }
        IntegrationRows[] retVal = new IntegrationRows[this.rows.length];
        System.arraycopy(this.rows, 0, retVal, 0, this.rows.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationRows }
     */
    public void setRows(IntegrationRows[] values) {
        if (values == null) {
            this.rows = null;
            return;
        }
        int len = values.length;
        this.rows = ((IntegrationRows[]) new IntegrationRows[len]);
        for (int i = 0; (i < len); i++) {
            this.rows[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationRows }
     */
    public IntegrationRows getRows(int idx) {
        if (this.rows == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.rows[idx];
    }

    public int getRowsLength() {
        if (this.rows == null) {
            return 0;
        }
        return this.rows.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationRows }
     */
    public IntegrationRows setRows(int idx, IntegrationRows value) {
        return this.rows[idx] = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

}
