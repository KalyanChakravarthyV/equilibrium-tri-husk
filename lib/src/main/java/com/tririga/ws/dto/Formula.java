package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Formula complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Formula"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extendedFormula" type="{http://dto.ws.tririga.com}ExtendedFormula" minOccurs="0"/&gt;
 *         &lt;element name="regularFormula" type="{http://dto.ws.tririga.com}RegularFormula" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Formula", propOrder = {
        "extendedFormula",
        "regularFormula",
        "type"
})
public class Formula {

    @XmlElement(nillable = true)
    protected ExtendedFormula extendedFormula;
    @XmlElement(nillable = true)
    protected RegularFormula regularFormula;
    protected Integer type;

    /**
     * Gets the value of the extendedFormula property.
     *
     * @return possible object is
     * {@link ExtendedFormula }
     */
    public ExtendedFormula getExtendedFormula() {
        return extendedFormula;
    }

    /**
     * Sets the value of the extendedFormula property.
     *
     * @param value allowed object is
     *              {@link ExtendedFormula }
     */
    public void setExtendedFormula(ExtendedFormula value) {
        this.extendedFormula = value;
    }

    /**
     * Gets the value of the regularFormula property.
     *
     * @return possible object is
     * {@link RegularFormula }
     */
    public RegularFormula getRegularFormula() {
        return regularFormula;
    }

    /**
     * Sets the value of the regularFormula property.
     *
     * @param value allowed object is
     *              {@link RegularFormula }
     */
    public void setRegularFormula(RegularFormula value) {
        this.regularFormula = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setType(Integer value) {
        this.type = value;
    }

}
