package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentField complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContentField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentField", propOrder = {
        "boName",
        "fieldLabel",
        "fieldName",
        "fieldType",
        "moduleName"
})
public class ContentField {

    @XmlElement(nillable = true)
    protected String boName;
    @XmlElement(nillable = true)
    protected String fieldLabel;
    @XmlElement(nillable = true)
    protected String fieldName;
    @XmlElement(nillable = true)
    protected String fieldType;
    @XmlElement(nillable = true)
    protected String moduleName;

    /**
     * Gets the value of the boName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBoName() {
        return boName;
    }

    /**
     * Sets the value of the boName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBoName(String value) {
        this.boName = value;
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
     * Gets the value of the fieldType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFieldType(String value) {
        this.fieldType = value;
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

}
