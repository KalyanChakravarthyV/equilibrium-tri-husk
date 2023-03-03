package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQueryResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfQueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryResponseHelper" type="{http://dto.ws.tririga.com}QueryResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryResponseHelper", propOrder = {
        "queryResponseHelper"
})
public class ArrayOfQueryResponseHelper {

    @XmlElement(name = "QueryResponseHelper", nillable = true)
    protected QueryResponseHelper[] queryResponseHelper;

    /**
     * @return array of
     * {@link QueryResponseHelper }
     */
    public QueryResponseHelper[] getQueryResponseHelper() {
        if (this.queryResponseHelper == null) {
            return new QueryResponseHelper[0];
        }
        QueryResponseHelper[] retVal = new QueryResponseHelper[this.queryResponseHelper.length];
        System.arraycopy(this.queryResponseHelper, 0, retVal, 0, this.queryResponseHelper.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryResponseHelper }
     */
    public void setQueryResponseHelper(QueryResponseHelper[] values) {
        if (values == null) {
            this.queryResponseHelper = null;
            return;
        }
        int len = values.length;
        this.queryResponseHelper = ((QueryResponseHelper[]) new QueryResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.queryResponseHelper[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryResponseHelper }
     */
    public QueryResponseHelper getQueryResponseHelper(int idx) {
        if (this.queryResponseHelper == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryResponseHelper[idx];
    }

    public int getQueryResponseHelperLength() {
        if (this.queryResponseHelper == null) {
            return 0;
        }
        return this.queryResponseHelper.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryResponseHelper }
     */
    public QueryResponseHelper setQueryResponseHelper(int idx, QueryResponseHelper value) {
        return this.queryResponseHelper[idx] = value;
    }

}
