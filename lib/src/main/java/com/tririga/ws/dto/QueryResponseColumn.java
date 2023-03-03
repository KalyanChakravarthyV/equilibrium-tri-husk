package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for QueryResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResponseColumn", propOrder = {
        "displayValue",
        "index",
        "label",
        "name",
        "section",
        "uom",
        "value"
})
@XmlSeeAlso({
        QueryMultiBoResponseColumn.class,
        MetricQueryResponseColumn.class
})
public class QueryResponseColumn {

    @XmlElement(nillable = true)
    protected String displayValue;
    protected Integer index;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String section;
    @XmlElement(nillable = true)
    protected String uom;
    @XmlElement(nillable = true)
    protected String value;

    /**
     * Gets the value of the displayValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayValue(String value) {
        this.displayValue = value;
    }

    /**
     * Gets the value of the index property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the section property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the uom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

}
