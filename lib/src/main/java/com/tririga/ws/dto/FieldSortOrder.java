package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldSortOrder complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FieldSortOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldSortOrder", propOrder = {
        "dataType",
        "fieldLabel",
        "fieldName",
        "sectionName"
})
public class FieldSortOrder {

    protected int dataType;
    @XmlElement(nillable = true)
    protected String fieldLabel;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String sectionName;

    /**
     * Gets the value of the dataType property.
     */
    public int getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     */
    public void setDataType(int value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the fieldLabel property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**
     * Sets the value of the fieldLabel property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**
     * Gets the value of the fieldName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the sectionName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

}
