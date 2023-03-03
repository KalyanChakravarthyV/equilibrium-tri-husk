package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getObjectTypeListByModuleName complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getObjectTypeListByModuleName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isStandAlone" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectTypeListByModuleName", propOrder = {
        "moduleName",
        "isStandAlone"
})
public class GetObjectTypeListByModuleName {

    protected String moduleName;
    protected boolean isStandAlone;

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
     * Gets the value of the isStandAlone property.
     */
    public boolean isIsStandAlone() {
        return isStandAlone;
    }

    /**
     * Sets the value of the isStandAlone property.
     */
    public void setIsStandAlone(boolean value) {
        this.isStandAlone = value;
    }

}
