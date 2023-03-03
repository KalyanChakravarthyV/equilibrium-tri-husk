package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetricQueryResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfMetricQueryResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MetricQueryResponseHelper" type="{http://dto.ws.tririga.com}MetricQueryResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetricQueryResponseHelper", propOrder = {
        "metricQueryResponseHelper"
})
public class ArrayOfMetricQueryResponseHelper {

    @XmlElement(name = "MetricQueryResponseHelper", nillable = true)
    protected MetricQueryResponseHelper[] metricQueryResponseHelper;

    /**
     * @return array of
     * {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper[] getMetricQueryResponseHelper() {
        if (this.metricQueryResponseHelper == null) {
            return new MetricQueryResponseHelper[0];
        }
        MetricQueryResponseHelper[] retVal = new MetricQueryResponseHelper[this.metricQueryResponseHelper.length];
        System.arraycopy(this.metricQueryResponseHelper, 0, retVal, 0, this.metricQueryResponseHelper.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link MetricQueryResponseHelper }
     */
    public void setMetricQueryResponseHelper(MetricQueryResponseHelper[] values) {
        if (values == null) {
            this.metricQueryResponseHelper = null;
            return;
        }
        int len = values.length;
        this.metricQueryResponseHelper = ((MetricQueryResponseHelper[]) new MetricQueryResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.metricQueryResponseHelper[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper getMetricQueryResponseHelper(int idx) {
        if (this.metricQueryResponseHelper == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metricQueryResponseHelper[idx];
    }

    public int getMetricQueryResponseHelperLength() {
        if (this.metricQueryResponseHelper == null) {
            return 0;
        }
        return this.metricQueryResponseHelper.length;
    }

    /**
     * @param value allowed object is
     *              {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper setMetricQueryResponseHelper(int idx, MetricQueryResponseHelper value) {
        return this.metricQueryResponseHelper[idx] = value;
    }

}
