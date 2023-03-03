package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplicationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dbBuildNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tririgaBuildNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInfo", propOrder = {
        "apiVersion",
        "dbBuildNumber",
        "tririgaBuildNumber"
})
public class ApplicationInfo {

    @XmlElement(nillable = true)
    protected String apiVersion;
    @XmlElement(nillable = true)
    protected String dbBuildNumber;
    @XmlElement(nillable = true)
    protected String tririgaBuildNumber;

    /**
     * Gets the value of the apiVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the dbBuildNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDbBuildNumber() {
        return dbBuildNumber;
    }

    /**
     * Sets the value of the dbBuildNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDbBuildNumber(String value) {
        this.dbBuildNumber = value;
    }

    /**
     * Gets the value of the tririgaBuildNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTririgaBuildNumber() {
        return tririgaBuildNumber;
    }

    /**
     * Sets the value of the tririgaBuildNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTririgaBuildNumber(String value) {
        this.tririgaBuildNumber = value;
    }

}
