package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQueryMultiBoResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfQueryMultiBoResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryMultiBoResponseColumn" type="{http://dto.ws.tririga.com}QueryMultiBoResponseColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryMultiBoResponseColumn", propOrder = {
        "queryMultiBoResponseColumn"
})
public class ArrayOfQueryMultiBoResponseColumn {

    @XmlElement(name = "QueryMultiBoResponseColumn", nillable = true)
    protected QueryMultiBoResponseColumn[] queryMultiBoResponseColumn;

    /**
     * @return array of
     * {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn[] getQueryMultiBoResponseColumn() {
        if (this.queryMultiBoResponseColumn == null) {
            return new QueryMultiBoResponseColumn[0];
        }
        QueryMultiBoResponseColumn[] retVal = new QueryMultiBoResponseColumn[this.queryMultiBoResponseColumn.length];
        System.arraycopy(this.queryMultiBoResponseColumn, 0, retVal, 0, this.queryMultiBoResponseColumn.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryMultiBoResponseColumn }
     */
    public void setQueryMultiBoResponseColumn(QueryMultiBoResponseColumn[] values) {
        if (values == null) {
            this.queryMultiBoResponseColumn = null;
            return;
        }
        int len = values.length;
        this.queryMultiBoResponseColumn = ((QueryMultiBoResponseColumn[]) new QueryMultiBoResponseColumn[len]);
        for (int i = 0; (i < len); i++) {
            this.queryMultiBoResponseColumn[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn getQueryMultiBoResponseColumn(int idx) {
        if (this.queryMultiBoResponseColumn == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryMultiBoResponseColumn[idx];
    }

    public int getQueryMultiBoResponseColumnLength() {
        if (this.queryMultiBoResponseColumn == null) {
            return 0;
        }
        return this.queryMultiBoResponseColumn.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn setQueryMultiBoResponseColumn(int idx, QueryMultiBoResponseColumn value) {
        return this.queryMultiBoResponseColumn[idx] = value;
    }

}
