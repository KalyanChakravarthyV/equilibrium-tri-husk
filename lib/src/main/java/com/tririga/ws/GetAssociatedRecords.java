package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAssociatedRecords complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getAssociatedRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="associationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAssociatedRecords", propOrder = {
        "recordId",
        "associationString",
        "maxResults"
})
public class GetAssociatedRecords {

    protected long recordId;
    protected String associationString;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxResults;

    /**
     * Gets the value of the recordId property.
     */
    public long getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     */
    public void setRecordId(long value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the associationString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociationString() {
        return associationString;
    }

    /**
     * Sets the value of the associationString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociationString(String value) {
        this.associationString = value;
    }

    /**
     * Gets the value of the maxResults property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

}
