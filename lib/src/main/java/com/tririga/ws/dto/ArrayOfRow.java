package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRow complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Row" type="{http://dto.ws.tririga.com}Row" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRow", propOrder = {
        "row"
})
public class ArrayOfRow {

    @XmlElement(name = "Row", nillable = true)
    protected Row[] row;

    /**
     * @return array of
     * {@link Row }
     */
    public Row[] getRow() {
        if (this.row == null) {
            return new Row[0];
        }
        Row[] retVal = new Row[this.row.length];
        System.arraycopy(this.row, 0, retVal, 0, this.row.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Row }
     */
    public void setRow(Row[] values) {
        if (values == null) {
            this.row = null;
            return;
        }
        int len = values.length;
        this.row = ((Row[]) new Row[len]);
        for (int i = 0; (i < len); i++) {
            this.row[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Row }
     */
    public Row getRow(int idx) {
        if (this.row == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.row[idx];
    }

    public int getRowLength() {
        if (this.row == null) {
            return 0;
        }
        return this.row.length;
    }

    /**
     * @param value allowed object is
     *              {@link Row }
     */
    public Row setRow(int idx, Row value) {
        return this.row[idx] = value;
    }

}
