package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMultiBoResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryMultiBoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryMultiBoResponseHelpers" type="{http://dto.ws.tririga.com}QueryMultiBoResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMultiBoResult", propOrder = {
        "queryMultiBoResponseHelpers"
})
public class QueryMultiBoResult
        extends AbstractQueryResult {

    @XmlElement(nillable = true)
    protected QueryMultiBoResponseHelper[] queryMultiBoResponseHelpers;

    /**
     * @return array of
     * {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper[] getQueryMultiBoResponseHelpers() {
        if (this.queryMultiBoResponseHelpers == null) {
            return new QueryMultiBoResponseHelper[0];
        }
        QueryMultiBoResponseHelper[] retVal = new QueryMultiBoResponseHelper[this.queryMultiBoResponseHelpers.length];
        System.arraycopy(this.queryMultiBoResponseHelpers, 0, retVal, 0, this.queryMultiBoResponseHelpers.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryMultiBoResponseHelper }
     */
    public void setQueryMultiBoResponseHelpers(QueryMultiBoResponseHelper[] values) {
        if (values == null) {
            this.queryMultiBoResponseHelpers = null;
            return;
        }
        int len = values.length;
        this.queryMultiBoResponseHelpers = ((QueryMultiBoResponseHelper[]) new QueryMultiBoResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.queryMultiBoResponseHelpers[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper getQueryMultiBoResponseHelpers(int idx) {
        if (this.queryMultiBoResponseHelpers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryMultiBoResponseHelpers[idx];
    }

    public int getQueryMultiBoResponseHelpersLength() {
        if (this.queryMultiBoResponseHelpers == null) {
            return 0;
        }
        return this.queryMultiBoResponseHelpers.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper setQueryMultiBoResponseHelpers(int idx, QueryMultiBoResponseHelper value) {
        return this.queryMultiBoResponseHelpers[idx] = value;
    }

}
