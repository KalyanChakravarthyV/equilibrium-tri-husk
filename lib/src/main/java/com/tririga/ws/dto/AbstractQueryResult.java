package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AbstractQueryResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AbstractQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="continuationToken" type="{http://dto.ws.tririga.com}ContinuationToken" minOccurs="0"/&gt;
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractQueryResult", propOrder = {
        "continuationToken",
        "totalResults"
})
@XmlSeeAlso({
        MetricQueryResult.class,
        QueryMultiBoResult.class,
        QueryResult.class
})
public abstract class AbstractQueryResult {

    @XmlElement(nillable = true)
    protected ContinuationToken continuationToken;
    protected Integer totalResults;

    /**
     * Gets the value of the continuationToken property.
     *
     * @return possible object is
     * {@link ContinuationToken }
     */
    public ContinuationToken getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the value of the continuationToken property.
     *
     * @param value allowed object is
     *              {@link ContinuationToken }
     */
    public void setContinuationToken(ContinuationToken value) {
        this.continuationToken = value;
    }

    /**
     * Gets the value of the totalResults property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTotalResults(Integer value) {
        this.totalResults = value;
    }

}
