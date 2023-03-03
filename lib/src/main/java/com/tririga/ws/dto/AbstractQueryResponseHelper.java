package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for AbstractQueryResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AbstractQueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractQueryResponseHelper", propOrder = {
        "boId",
        "recordId"
})
@XmlSeeAlso({
        MetricQueryResponseHelper.class,
        QueryResponseHelper.class,
        QueryMultiBoResponseHelper.class
})
public abstract class AbstractQueryResponseHelper {

    @XmlElement(nillable = true)
    protected String boId;
    @XmlElement(nillable = true)
    protected String recordId;

    /**
     * Gets the value of the boId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBoId() {
        return boId;
    }

    /**
     * Sets the value of the boId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBoId(String value) {
        this.boId = value;
    }

    /**
     * Gets the value of the recordId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

}
