package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMultiBoResponseColumn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QueryMultiBoResponseColumn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}QueryResponseColumn"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiBoFieldIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rawValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMultiBoResponseColumn", propOrder = {
        "bo",
        "module",
        "multiBoFieldIndex",
        "rawValue"
})
public class QueryMultiBoResponseColumn
        extends QueryResponseColumn {

    @XmlElement(nillable = true)
    protected String bo;
    @XmlElement(nillable = true)
    protected String module;
    @XmlElement(nillable = true)
    protected String multiBoFieldIndex;
    @XmlElement(nillable = true)
    protected String rawValue;

    /**
     * Gets the value of the bo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBo() {
        return bo;
    }

    /**
     * Sets the value of the bo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBo(String value) {
        this.bo = value;
    }

    /**
     * Gets the value of the module property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the multiBoFieldIndex property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMultiBoFieldIndex() {
        return multiBoFieldIndex;
    }

    /**
     * Sets the value of the multiBoFieldIndex property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMultiBoFieldIndex(String value) {
        this.multiBoFieldIndex = value;
    }

    /**
     * Gets the value of the rawValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRawValue() {
        return rawValue;
    }

    /**
     * Sets the value of the rawValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRawValue(String value) {
        this.rawValue = value;
    }

}
