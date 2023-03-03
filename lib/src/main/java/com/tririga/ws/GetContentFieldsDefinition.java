package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContentFieldsDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getContentFieldsDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="boName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContentFieldsDefinition", propOrder = {
        "moduleName",
        "boName"
})
public class GetContentFieldsDefinition {

    @XmlElement(required = true)
    protected String moduleName;
    @XmlElement(required = true)
    protected String boName;

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

}
