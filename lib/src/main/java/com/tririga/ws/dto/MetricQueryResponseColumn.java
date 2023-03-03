package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricQueryResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MetricQueryResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}QueryResponseColumn"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thresholdRangeColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thresholdRangeIconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricQueryResponseColumn", propOrder = {
        "aggregate",
        "thresholdRangeColor",
        "thresholdRangeIconUrl"
})
public class MetricQueryResponseColumn
        extends QueryResponseColumn {

    @XmlElement(nillable = true)
    protected String aggregate;
    @XmlElement(nillable = true)
    protected String thresholdRangeColor;
    @XmlElement(nillable = true)
    protected String thresholdRangeIconUrl;

    /**
     * Gets the value of the aggregate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAggregate(String value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the thresholdRangeColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getThresholdRangeColor() {
        return thresholdRangeColor;
    }

    /**
     * Sets the value of the thresholdRangeColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setThresholdRangeColor(String value) {
        this.thresholdRangeColor = value;
    }

    /**
     * Gets the value of the thresholdRangeIconUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getThresholdRangeIconUrl() {
        return thresholdRangeIconUrl;
    }

    /**
     * Sets the value of the thresholdRangeIconUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setThresholdRangeIconUrl(String value) {
        this.thresholdRangeIconUrl = value;
    }

}
