package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricQueryResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MetricQueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AbstractQueryResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metricQueryResponseHelpers" type="{http://dto.ws.tririga.com}MetricQueryResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricQueryResult", propOrder = {
        "metricQueryResponseHelpers"
})
public class MetricQueryResult
        extends AbstractQueryResult {

    @XmlElement(nillable = true)
    protected MetricQueryResponseHelper[] metricQueryResponseHelpers;

    /**
     * @return array of
     * {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper[] getMetricQueryResponseHelpers() {
        if (this.metricQueryResponseHelpers == null) {
            return new MetricQueryResponseHelper[0];
        }
        MetricQueryResponseHelper[] retVal = new MetricQueryResponseHelper[this.metricQueryResponseHelpers.length];
        System.arraycopy(this.metricQueryResponseHelpers, 0, retVal, 0, this.metricQueryResponseHelpers.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link MetricQueryResponseHelper }
     */
    public void setMetricQueryResponseHelpers(MetricQueryResponseHelper[] values) {
        if (values == null) {
            this.metricQueryResponseHelpers = null;
            return;
        }
        int len = values.length;
        this.metricQueryResponseHelpers = ((MetricQueryResponseHelper[]) new MetricQueryResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.metricQueryResponseHelpers[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper getMetricQueryResponseHelpers(int idx) {
        if (this.metricQueryResponseHelpers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metricQueryResponseHelpers[idx];
    }

    public int getMetricQueryResponseHelpersLength() {
        if (this.metricQueryResponseHelpers == null) {
            return 0;
        }
        return this.metricQueryResponseHelpers.length;
    }

    /**
     * @param value allowed object is
     *              {@link MetricQueryResponseHelper }
     */
    public MetricQueryResponseHelper setMetricQueryResponseHelpers(int idx, MetricQueryResponseHelper value) {
        return this.metricQueryResponseHelpers[idx] = value;
    }

}
