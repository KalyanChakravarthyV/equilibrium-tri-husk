package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQueryMultiBoResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfQueryMultiBoResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryMultiBoResponseHelper" type="{http://dto.ws.tririga.com}QueryMultiBoResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryMultiBoResponseHelper", propOrder = {
        "queryMultiBoResponseHelper"
})
public class ArrayOfQueryMultiBoResponseHelper {

    @XmlElement(name = "QueryMultiBoResponseHelper", nillable = true)
    protected QueryMultiBoResponseHelper[] queryMultiBoResponseHelper;

    /**
     * @return array of
     * {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper[] getQueryMultiBoResponseHelper() {
        if (this.queryMultiBoResponseHelper == null) {
            return new QueryMultiBoResponseHelper[0];
        }
        QueryMultiBoResponseHelper[] retVal = new QueryMultiBoResponseHelper[this.queryMultiBoResponseHelper.length];
        System.arraycopy(this.queryMultiBoResponseHelper, 0, retVal, 0, this.queryMultiBoResponseHelper.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link QueryMultiBoResponseHelper }
     */
    public void setQueryMultiBoResponseHelper(QueryMultiBoResponseHelper[] values) {
        if (values == null) {
            this.queryMultiBoResponseHelper = null;
            return;
        }
        int len = values.length;
        this.queryMultiBoResponseHelper = ((QueryMultiBoResponseHelper[]) new QueryMultiBoResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.queryMultiBoResponseHelper[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper getQueryMultiBoResponseHelper(int idx) {
        if (this.queryMultiBoResponseHelper == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.queryMultiBoResponseHelper[idx];
    }

    public int getQueryMultiBoResponseHelperLength() {
        if (this.queryMultiBoResponseHelper == null) {
            return 0;
        }
        return this.queryMultiBoResponseHelper.length;
    }

    /**
     * @param value allowed object is
     *              {@link QueryMultiBoResponseHelper }
     */
    public QueryMultiBoResponseHelper setQueryMultiBoResponseHelper(int idx, QueryMultiBoResponseHelper value) {
        return this.queryMultiBoResponseHelper[idx] = value;
    }

}
