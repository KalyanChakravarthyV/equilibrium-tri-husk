package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetricQueryFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfMetricQueryFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MetricQueryFilter" type="{http://dto.ws.tririga.com}MetricQueryFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetricQueryFilter", propOrder = {
        "metricQueryFilter"
})
public class ArrayOfMetricQueryFilter {

    @XmlElement(name = "MetricQueryFilter", nillable = true)
    protected MetricQueryFilter[] metricQueryFilter;

    /**
     * @return array of
     * {@link MetricQueryFilter }
     */
    public MetricQueryFilter[] getMetricQueryFilter() {
        if (this.metricQueryFilter == null) {
            return new MetricQueryFilter[0];
        }
        MetricQueryFilter[] retVal = new MetricQueryFilter[this.metricQueryFilter.length];
        System.arraycopy(this.metricQueryFilter, 0, retVal, 0, this.metricQueryFilter.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link MetricQueryFilter }
     */
    public void setMetricQueryFilter(MetricQueryFilter[] values) {
        if (values == null) {
            this.metricQueryFilter = null;
            return;
        }
        int len = values.length;
        this.metricQueryFilter = ((MetricQueryFilter[]) new MetricQueryFilter[len]);
        for (int i = 0; (i < len); i++) {
            this.metricQueryFilter[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link MetricQueryFilter }
     */
    public MetricQueryFilter getMetricQueryFilter(int idx) {
        if (this.metricQueryFilter == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metricQueryFilter[idx];
    }

    public int getMetricQueryFilterLength() {
        if (this.metricQueryFilter == null) {
            return 0;
        }
        return this.metricQueryFilter.length;
    }

    /**
     * @param value allowed object is
     *              {@link MetricQueryFilter }
     */
    public MetricQueryFilter setMetricQueryFilter(int idx, MetricQueryFilter value) {
        return this.metricQueryFilter[idx] = value;
    }

}
