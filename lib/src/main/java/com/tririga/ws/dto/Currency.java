package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decimal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
        "abbreviation",
        "decimal",
        "delimiter",
        "format",
        "name",
        "symbol"
})
public class Currency {

    @XmlElement(nillable = true)
    protected String abbreviation;
    @XmlElement(nillable = true)
    protected String decimal;
    @XmlElement(nillable = true)
    protected String delimiter;
    @XmlElement(nillable = true)
    protected String format;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected String symbol;

    /**
     * Gets the value of the abbreviation property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the decimal property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDecimal(String value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the delimiter property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the format property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormat(String value) {
        this.format = value;
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
     * Gets the value of the symbol property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

}
