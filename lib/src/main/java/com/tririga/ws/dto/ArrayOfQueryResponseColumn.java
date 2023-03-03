package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQueryResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfQueryResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryResponseColumn" type="{http://dto.ws.tririga.com}QueryResponseColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryResponseColumn", propOrder = {
        "queryResponseColumn"
})
public class ArrayOfQueryResponseColumn {

    @XmlElement(name = "QueryResponseColumn", nillable = true)
    protected QueryResponseColumn[] queryResponseColumn;

    /**
     * @return array of
     * {@link QueryResponseColumn }
     */
    public QueryResponseColumn[] getQueryResponseColumn() {
        if (this.queryResponseColumn == null) {
            return new QueryResponseColumn[0];
        }
        QueryResponseColumn[] retVal = new QueryResponseColumn[this.queryResponseColumn.length];
        System.arraycopy(this.queryResponseColumn, 0, retVal, 0, this.queryResponseColumn.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryResponseColumn }
     */
    public void setQueryResponseColumn(QueryResponseColumn[] values) {
        if (values == null) {
            this.queryResponseColumn = null;
            return;
        }
        int len = values.length;
        this.queryResponseColumn = ((QueryResponseColumn[]) new QueryResponseColumn[len]);
        for (int i = 0; (i < len); i++) {
            this.queryResponseColumn[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryResponseColumn }
     */
    public QueryResponseColumn getQueryResponseColumn(int idx) {
        if (this.queryResponseColumn == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryResponseColumn[idx];
    }

    public int getQueryResponseColumnLength() {
        if (this.queryResponseColumn == null) {
            return 0;
        }
        return this.queryResponseColumn.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryResponseColumn }
     */
    public QueryResponseColumn setQueryResponseColumn(int idx, QueryResponseColumn value) {
        return this.queryResponseColumn[idx] = value;
    }

}
