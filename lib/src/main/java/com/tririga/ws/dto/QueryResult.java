package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryResponseHelpers" type="{http://dto.ws.tririga.com}QueryResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder = {
        "queryResponseHelpers"
})
public class QueryResult
        extends AbstractQueryResult {

    @XmlElement(nillable = true)
    protected QueryResponseHelper[] queryResponseHelpers;

    /**
     * @return array of
     * {@link QueryResponseHelper }
     */
    public QueryResponseHelper[] getQueryResponseHelpers() {
        if (this.queryResponseHelpers == null) {
            return new QueryResponseHelper[0];
        }
        QueryResponseHelper[] retVal = new QueryResponseHelper[this.queryResponseHelpers.length];
        System.arraycopy(this.queryResponseHelpers, 0, retVal, 0, this.queryResponseHelpers.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryResponseHelper }
     */
    public void setQueryResponseHelpers(QueryResponseHelper[] values) {
        if (values == null) {
            this.queryResponseHelpers = null;
            return;
        }
        int len = values.length;
        this.queryResponseHelpers = ((QueryResponseHelper[]) new QueryResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.queryResponseHelpers[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryResponseHelper }
     */
    public QueryResponseHelper getQueryResponseHelpers(int idx) {
        if (this.queryResponseHelpers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryResponseHelpers[idx];
    }

    public int getQueryResponseHelpersLength() {
        if (this.queryResponseHelpers == null) {
            return 0;
        }
        return this.queryResponseHelpers.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryResponseHelper }
     */
    public QueryResponseHelper setQueryResponseHelpers(int idx, QueryResponseHelper value) {
        return this.queryResponseHelpers[idx] = value;
    }

}
