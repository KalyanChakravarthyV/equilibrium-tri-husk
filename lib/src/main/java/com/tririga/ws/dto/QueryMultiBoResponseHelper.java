package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMultiBoResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryMultiBoResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResponseHelper"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryMultiBoResponseColumns" type="{http://dto.ws.tririga.com}QueryMultiBoResponseColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMultiBoResponseHelper", propOrder = {
        "queryMultiBoResponseColumns"
})
public class QueryMultiBoResponseHelper
        extends AbstractQueryResponseHelper {

    @XmlElement(nillable = true)
    protected QueryMultiBoResponseColumn[] queryMultiBoResponseColumns;

    /**
     * @return array of
     * {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn[] getQueryMultiBoResponseColumns() {
        if (this.queryMultiBoResponseColumns == null) {
            return new QueryMultiBoResponseColumn[0];
        }
        QueryMultiBoResponseColumn[] retVal = new QueryMultiBoResponseColumn[this.queryMultiBoResponseColumns.length];
        System.arraycopy(this.queryMultiBoResponseColumns, 0, retVal, 0, this.queryMultiBoResponseColumns.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryMultiBoResponseColumn }
     */
    public void setQueryMultiBoResponseColumns(QueryMultiBoResponseColumn[] values) {
        if (values == null) {
            this.queryMultiBoResponseColumns = null;
            return;
        }
        int len = values.length;
        this.queryMultiBoResponseColumns = ((QueryMultiBoResponseColumn[]) new QueryMultiBoResponseColumn[len]);
        for (int i = 0; (i < len); i++) {
            this.queryMultiBoResponseColumns[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn getQueryMultiBoResponseColumns(int idx) {
        if (this.queryMultiBoResponseColumns == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryMultiBoResponseColumns[idx];
    }

    public int getQueryMultiBoResponseColumnsLength() {
        if (this.queryMultiBoResponseColumns == null) {
            return 0;
        }
        return this.queryMultiBoResponseColumns.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryMultiBoResponseColumn }
     */
    public QueryMultiBoResponseColumn setQueryMultiBoResponseColumns(int idx, QueryMultiBoResponseColumn value) {
        return this.queryMultiBoResponseColumns[idx] = value;
    }

}
