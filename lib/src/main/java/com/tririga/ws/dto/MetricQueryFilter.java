package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricQueryFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MetricQueryFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractMetricQueryCriteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricQueryFilter", propOrder = {
        "operator"
})
public class MetricQueryFilter
        extends AbstractMetricQueryCriteria {

    @XmlElement(nillable = true)
    protected Integer operator;

    /**
     * Gets the value of the operator property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setOperator(Integer value) {
        this.operator = value;
    }

}
