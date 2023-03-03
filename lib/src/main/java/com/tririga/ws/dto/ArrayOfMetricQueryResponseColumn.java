package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetricQueryResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfMetricQueryResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MetricQueryResponseColumn" type="{http://dto.ws.tririga.com}MetricQueryResponseColumn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetricQueryResponseColumn", propOrder = {
        "metricQueryResponseColumn"
})
public class ArrayOfMetricQueryResponseColumn {

    @XmlElement(name = "MetricQueryResponseColumn", nillable = true)
    protected MetricQueryResponseColumn[] metricQueryResponseColumn;

    /**
     * @return array of
     * {@link MetricQueryResponseColumn }
     */
    public MetricQueryResponseColumn[] getMetricQueryResponseColumn() {
        if (this.metricQueryResponseColumn == null) {
            return new MetricQueryResponseColumn[0];
        }
        MetricQueryResponseColumn[] retVal = new MetricQueryResponseColumn[this.metricQueryResponseColumn.length];
        System.arraycopy(this.metricQueryResponseColumn, 0, retVal, 0, this.metricQueryResponseColumn.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link MetricQueryResponseColumn }
     */
    public void setMetricQueryResponseColumn(MetricQueryResponseColumn[] values) {
        if (values == null) {
            this.metricQueryResponseColumn = null;
            return;
        }
        int len = values.length;
        this.metricQueryResponseColumn = ((MetricQueryResponseColumn[]) new MetricQueryResponseColumn[len]);
        for (int i = 0; (i < len); i++) {
            this.metricQueryResponseColumn[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link MetricQueryResponseColumn }
     */
    public MetricQueryResponseColumn getMetricQueryResponseColumn(int idx) {
        if (this.metricQueryResponseColumn == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metricQueryResponseColumn[idx];
    }

    public int getMetricQueryResponseColumnLength() {
        if (this.metricQueryResponseColumn == null) {
            return 0;
        }
        return this.metricQueryResponseColumn.length;
    }

    /**
     * @param value allowed object is
     *              {@link MetricQueryResponseColumn }
     */
    public MetricQueryResponseColumn setMetricQueryResponseColumn(int idx, MetricQueryResponseColumn value) {
        return this.metricQueryResponseColumn[idx] = value;
    }

}
