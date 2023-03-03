package com.tririga.ws;

import com.tririga.ws.dto.AssociationFilter;
import com.tririga.ws.dto.DisplayLabel;
import com.tririga.ws.dto.FieldSortOrder;
import com.tririga.ws.dto.Filter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runDynamicQuery complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runDynamicQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectTypeNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="guiNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="associatedModuleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associatedObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectScope" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="displayFields" type="{http://dto.ws.tririga.com}DisplayLabel" maxOccurs="unbounded"/&gt;
 *         &lt;element name="associatedDisplayFields" type="{http://dto.ws.tririga.com}DisplayLabel" maxOccurs="unbounded"/&gt;
 *         &lt;element name="fieldSortOrders" type="{http://dto.ws.tririga.com}FieldSortOrder" maxOccurs="unbounded"/&gt;
 *         &lt;element name="filters" type="{http://dto.ws.tririga.com}Filter" maxOccurs="unbounded"/&gt;
 *         &lt;element name="associationFilters" type="{http://dto.ws.tririga.com}AssociationFilter" maxOccurs="unbounded"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maximumResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runDynamicQuery", propOrder = {
        "projectName",
        "moduleName",
        "objectTypeNames",
        "guiNames",
        "associatedModuleName",
        "associatedObjectTypeName",
        "projectScope",
        "displayFields",
        "associatedDisplayFields",
        "fieldSortOrders",
        "filters",
        "associationFilters",
        "start",
        "maximumResultCount"
})
public class RunDynamicQuery {

    @XmlElement(nillable = true)
    protected String projectName;
    protected String moduleName;
    @XmlElement(required = true, nillable = true)
    protected String[] objectTypeNames;
    @XmlElement(required = true, nillable = true)
    protected String[] guiNames;
    @XmlElement(nillable = true)
    protected String associatedModuleName;
    @XmlElement(nillable = true)
    protected String associatedObjectTypeName;
    protected int projectScope;
    @XmlElement(required = true)
    protected DisplayLabel[] displayFields;
    @XmlElement(required = true, nillable = true)
    protected DisplayLabel[] associatedDisplayFields;
    @XmlElement(required = true, nillable = true)
    protected FieldSortOrder[] fieldSortOrders;
    @XmlElement(required = true, nillable = true)
    protected Filter[] filters;
    @XmlElement(required = true, nillable = true)
    protected AssociationFilter[] associationFilters;
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
     * @return array of
     * {@link String }
     */
    public String[] getObjectTypeNames() {
        if (this.objectTypeNames == null) {
            return new String[0];
        }
        String[] retVal = new String[this.objectTypeNames.length];
        System.arraycopy(this.objectTypeNames, 0, retVal, 0, this.objectTypeNames.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setObjectTypeNames(String[] values) {
        if (values == null) {
            this.objectTypeNames = null;
            return;
        }
        int len = values.length;
        this.objectTypeNames = ((String[]) new String[len]);
        for (int i = 0; (i < len); i++) {
            this.objectTypeNames[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link String }
     */
    public String getObjectTypeNames(int idx) {
        if (this.objectTypeNames == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.objectTypeNames[idx];
    }

    public int getObjectTypeNamesLength() {
        if (this.objectTypeNames == null) {
            return 0;
        }
        return this.objectTypeNames.length;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setObjectTypeNames(int idx, String value) {
        return this.objectTypeNames[idx] = value;
    }

    /**
     * @return array of
     * {@link String }
     */
    public String[] getGuiNames() {
        if (this.guiNames == null) {
            return new String[0];
        }
        String[] retVal = new String[this.guiNames.length];
        System.arraycopy(this.guiNames, 0, retVal, 0, this.guiNames.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setGuiNames(String[] values) {
        if (values == null) {
            this.guiNames = null;
            return;
        }
        int len = values.length;
        this.guiNames = ((String[]) new String[len]);
        for (int i = 0; (i < len); i++) {
            this.guiNames[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link String }
     */
    public String getGuiNames(int idx) {
        if (this.guiNames == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.guiNames[idx];
    }

    public int getGuiNamesLength() {
        if (this.guiNames == null) {
            return 0;
        }
        return this.guiNames.length;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setGuiNames(int idx, String value) {
        return this.guiNames[idx] = value;
    }

    /**
     * Gets the value of the associatedModuleName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociatedModuleName() {
        return associatedModuleName;
    }

    /**
     * Sets the value of the associatedModuleName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociatedModuleName(String value) {
        this.associatedModuleName = value;
    }

    /**
     * Gets the value of the associatedObjectTypeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociatedObjectTypeName() {
        return associatedObjectTypeName;
    }

    /**
     * Sets the value of the associatedObjectTypeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociatedObjectTypeName(String value) {
        this.associatedObjectTypeName = value;
    }

    /**
     * Gets the value of the projectScope property.
     */
    public int getProjectScope() {
        return projectScope;
    }

    /**
     * Sets the value of the projectScope property.
     */
    public void setProjectScope(int value) {
        this.projectScope = value;
    }

    /**
     * @return array of
     * {@link DisplayLabel }
     */
    public DisplayLabel[] getDisplayFields() {
        if (this.displayFields == null) {
            return new DisplayLabel[0];
        }
        DisplayLabel[] retVal = new DisplayLabel[this.displayFields.length];
        System.arraycopy(this.displayFields, 0, retVal, 0, this.displayFields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link DisplayLabel }
     */
    public void setDisplayFields(DisplayLabel[] values) {
        if (values == null) {
            this.displayFields = null;
            return;
        }
        int len = values.length;
        this.displayFields = ((DisplayLabel[]) new DisplayLabel[len]);
        for (int i = 0; (i < len); i++) {
            this.displayFields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link DisplayLabel }
     */
    public DisplayLabel getDisplayFields(int idx) {
        if (this.displayFields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.displayFields[idx];
    }

    public int getDisplayFieldsLength() {
        if (this.displayFields == null) {
            return 0;
        }
        return this.displayFields.length;
    }

    /**
     * @param value allowed object is
     *              {@link DisplayLabel }
     */
    public DisplayLabel setDisplayFields(int idx, DisplayLabel value) {
        return this.displayFields[idx] = value;
    }

    /**
     * @return array of
     * {@link DisplayLabel }
     */
    public DisplayLabel[] getAssociatedDisplayFields() {
        if (this.associatedDisplayFields == null) {
            return new DisplayLabel[0];
        }
        DisplayLabel[] retVal = new DisplayLabel[this.associatedDisplayFields.length];
        System.arraycopy(this.associatedDisplayFields, 0, retVal, 0, this.associatedDisplayFields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link DisplayLabel }
     */
    public void setAssociatedDisplayFields(DisplayLabel[] values) {
        if (values == null) {
            this.associatedDisplayFields = null;
            return;
        }
        int len = values.length;
        this.associatedDisplayFields = ((DisplayLabel[]) new DisplayLabel[len]);
        for (int i = 0; (i < len); i++) {
            this.associatedDisplayFields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link DisplayLabel }
     */
    public DisplayLabel getAssociatedDisplayFields(int idx) {
        if (this.associatedDisplayFields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associatedDisplayFields[idx];
    }

    public int getAssociatedDisplayFieldsLength() {
        if (this.associatedDisplayFields == null) {
            return 0;
        }
        return this.associatedDisplayFields.length;
    }

    /**
     * @param value allowed object is
     *              {@link DisplayLabel }
     */
    public DisplayLabel setAssociatedDisplayFields(int idx, DisplayLabel value) {
        return this.associatedDisplayFields[idx] = value;
    }

    /**
     * @return array of
     * {@link FieldSortOrder }
     */
    public FieldSortOrder[] getFieldSortOrders() {
        if (this.fieldSortOrders == null) {
            return new FieldSortOrder[0];
        }
        FieldSortOrder[] retVal = new FieldSortOrder[this.fieldSortOrders.length];
        System.arraycopy(this.fieldSortOrders, 0, retVal, 0, this.fieldSortOrders.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link FieldSortOrder }
     */
    public void setFieldSortOrders(FieldSortOrder[] values) {
        if (values == null) {
            this.fieldSortOrders = null;
            return;
        }
        int len = values.length;
        this.fieldSortOrders = ((FieldSortOrder[]) new FieldSortOrder[len]);
        for (int i = 0; (i < len); i++) {
            this.fieldSortOrders[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link FieldSortOrder }
     */
    public FieldSortOrder getFieldSortOrders(int idx) {
        if (this.fieldSortOrders == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fieldSortOrders[idx];
    }

    public int getFieldSortOrdersLength() {
        if (this.fieldSortOrders == null) {
            return 0;
        }
        return this.fieldSortOrders.length;
    }

    /**
     * @param value allowed object is
     *              {@link FieldSortOrder }
     */
    public FieldSortOrder setFieldSortOrders(int idx, FieldSortOrder value) {
        return this.fieldSortOrders[idx] = value;
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
     * @return array of
     * {@link AssociationFilter }
     */
    public AssociationFilter[] getAssociationFilters() {
        if (this.associationFilters == null) {
            return new AssociationFilter[0];
        }
        AssociationFilter[] retVal = new AssociationFilter[this.associationFilters.length];
        System.arraycopy(this.associationFilters, 0, retVal, 0, this.associationFilters.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link AssociationFilter }
     */
    public void setAssociationFilters(AssociationFilter[] values) {
        if (values == null) {
            this.associationFilters = null;
            return;
        }
        int len = values.length;
        this.associationFilters = ((AssociationFilter[]) new AssociationFilter[len]);
        for (int i = 0; (i < len); i++) {
            this.associationFilters[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link AssociationFilter }
     */
    public AssociationFilter getAssociationFilters(int idx) {
        if (this.associationFilters == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.associationFilters[idx];
    }

    public int getAssociationFiltersLength() {
        if (this.associationFilters == null) {
            return 0;
        }
        return this.associationFilters.length;
    }

    /**
     * @param value allowed object is
     *              {@link AssociationFilter }
     */
    public AssociationFilter setAssociationFilters(int idx, AssociationFilter value) {
        return this.associationFilters[idx] = value;
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
