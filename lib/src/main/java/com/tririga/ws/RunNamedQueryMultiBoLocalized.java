package com.tririga.ws;

import com.tririga.ws.dto.Filter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runNamedQueryMultiBoLocalized complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runNamedQueryMultiBoLocalized"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filters" type="{http://dto.ws.tririga.com}Filter" maxOccurs="unbounded"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maximumResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runNamedQueryMultiBoLocalized", propOrder = {
        "projectName",
        "moduleName",
        "objectTypeName",
        "queryName",
        "filters",
        "start",
        "maximumResultCount"
})
public class RunNamedQueryMultiBoLocalized {

    @XmlElement(nillable = true)
    protected String projectName;
    protected String moduleName;
    protected String objectTypeName;
    protected String queryName;
    @XmlElement(required = true, nillable = true)
    protected Filter[] filters;
    protected int start;
    protected int maximumResultCount;

    /**
     * Gets the value of the projectName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

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
     * {@link Filter }
     */
    public Filter[] getFilters() {
        if (this.filters == null) {
            return new Filter[0];
        }
        Filter[] retVal = new Filter[this.filters.length];
        System.arraycopy(this.filters, 0, retVal, 0, this.filters.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Filter }
     */
    public void setFilters(Filter[] values) {
        if (values == null) {
            this.filters = null;
            return;
        }
        int len = values.length;
        this.filters = ((Filter[]) new Filter[len]);
        for (int i = 0; (i < len); i++) {
            this.filters[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Filter }
     */
    public Filter getFilters(int idx) {
        if (this.filters == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.filters[idx];
    }

    public int getFiltersLength() {
        if (this.filters == null) {
            return 0;
        }
        return this.filters.length;
    }

    /**
     * @param value allowed object is
     *              {@link Filter }
     */
    public Filter setFilters(int idx, Filter value) {
        return this.filters[idx] = value;
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
