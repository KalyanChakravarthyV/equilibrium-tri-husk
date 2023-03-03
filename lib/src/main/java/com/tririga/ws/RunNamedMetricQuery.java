package com.tririga.ws;

import com.tririga.ws.dto.GroupBy;
import com.tririga.ws.dto.MetricQueryFilter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runNamedMetricQuery complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runNamedMetricQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metricQueryfilters" type="{http://dto.ws.tririga.com}MetricQueryFilter" maxOccurs="unbounded"/&gt;
 *         &lt;element name="groupBy" type="{http://dto.ws.tririga.com}GroupBy" minOccurs="0"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maximumResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runNamedMetricQuery", propOrder = {
        "moduleName",
        "objectTypeName",
        "queryName",
        "metricQueryfilters",
        "groupBy",
        "start",
        "maximumResultCount"
})
public class RunNamedMetricQuery {

    protected String moduleName;
    protected String objectTypeName;
    protected String queryName;
    @XmlElement(required = true, nillable = true)
    protected MetricQueryFilter[] metricQueryfilters;
    @XmlElement(nillable = true)
    protected GroupBy groupBy;
    protected int start;
    protected int maximumResultCount;

    /**
     * Gets the value of the moduleName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the objectTypeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjectTypeName() {
        return objectTypeName;
    }

    /**
     * Sets the value of the objectTypeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjectTypeName(String value) {
        this.objectTypeName = value;
    }

    /**
     * Gets the value of the queryName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * @return array of
     * {@link MetricQueryFilter }
     */
    public MetricQueryFilter[] getMetricQueryfilters() {
        if (this.metricQueryfilters == null) {
            return new MetricQueryFilter[0];
        }
        MetricQueryFilter[] retVal = new MetricQueryFilter[this.metricQueryfilters.length];
        System.arraycopy(this.metricQueryfilters, 0, retVal, 0, this.metricQueryfilters.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link MetricQueryFilter }
     */
    public void setMetricQueryfilters(MetricQueryFilter[] values) {
        if (values == null) {
            this.metricQueryfilters = null;
            return;
        }
        int len = values.length;
        this.metricQueryfilters = ((MetricQueryFilter[]) new MetricQueryFilter[len]);
        for (int i = 0; (i < len); i++) {
            this.metricQueryfilters[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link MetricQueryFilter }
     */
    public MetricQueryFilter getMetricQueryfilters(int idx) {
        if (this.metricQueryfilters == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.metricQueryfilters[idx];
    }

    public int getMetricQueryfiltersLength() {
        if (this.metricQueryfilters == null) {
            return 0;
        }
        return this.metricQueryfilters.length;
    }

    /**
     * @param value allowed object is
     *              {@link MetricQueryFilter }
     */
    public MetricQueryFilter setMetricQueryfilters(int idx, MetricQueryFilter value) {
        return this.metricQueryfilters[idx] = value;
    }

    /**
     * Gets the value of the groupBy property.
     *
     * @return possible object is
     * {@link GroupBy }
     */
    public GroupBy getGroupBy() {
        return groupBy;
    }

    /**
     * Sets the value of the groupBy property.
     *
     * @param value allowed object is
     *              {@link GroupBy }
     */
    public void setGroupBy(GroupBy value) {
        this.groupBy = value;
    }

    /**
     * Gets the value of the start property.
     */
    public int getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Gets the value of the maximumResultCount property.
     */
    public int getMaximumResultCount() {
        return maximumResultCount;
    }

    /**
     * Sets the value of the maximumResultCount property.
     */
    public void setMaximumResultCount(int value) {
        this.maximumResultCount = value;
    }

}
