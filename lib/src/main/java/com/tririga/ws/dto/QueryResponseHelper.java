package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResponseHelper"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assocBoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assocId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryResponseColumns" type="{http://dto.ws.tririga.com}QueryResponseColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponseHelper", propOrder = {
        "assocBoId",
        "assocId",
        "queryResponseColumns"
})
public class QueryResponseHelper
        extends AbstractQueryResponseHelper {

    @XmlElement(nillable = true)
    protected String assocBoId;
    @XmlElement(nillable = true)
    protected String assocId;
    @XmlElement(nillable = true)
    protected QueryResponseColumn[] queryResponseColumns;

    /**
     * Gets the value of the assocBoId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssocBoId() {
        return assocBoId;
    }

    /**
     * Sets the value of the assocBoId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssocBoId(String value) {
        this.assocBoId = value;
    }

    /**
     * Gets the value of the assocId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssocId() {
        return assocId;
    }

    /**
     * Sets the value of the assocId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssocId(String value) {
        this.assocId = value;
    }

    /**
     * @return array of
     * {@link QueryResponseColumn }
     */
    public QueryResponseColumn[] getQueryResponseColumns() {
        if (this.queryResponseColumns == null) {
            return new QueryResponseColumn[0];
        }
        QueryResponseColumn[] retVal = new QueryResponseColumn[this.queryResponseColumns.length];
        System.arraycopy(this.queryResponseColumns, 0, retVal, 0, this.queryResponseColumns.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryResponseColumn }
     */
    public void setQueryResponseColumns(QueryResponseColumn[] values) {
        if (values == null) {
            this.queryResponseColumns = null;
            return;
        }
        int len = values.length;
        this.queryResponseColumns = ((QueryResponseColumn[]) new QueryResponseColumn[len]);
        for (int i = 0; (i < len); i++) {
            this.queryResponseColumns[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryResponseColumn }
     */
    public QueryResponseColumn getQueryResponseColumns(int idx) {
        if (this.queryResponseColumns == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryResponseColumns[idx];
    }

    public int getQueryResponseColumnsLength() {
        if (this.queryResponseColumns == null) {
            return 0;
        }
        return this.queryResponseColumns.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryResponseColumn }
     */
    public QueryResponseColumn setQueryResponseColumns(int idx, QueryResponseColumn value) {
        return this.queryResponseColumns[idx] = value;
    }

}
