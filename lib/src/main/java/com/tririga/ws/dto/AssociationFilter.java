package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AssociationFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="moduleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="objectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reverseAssociation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="runTimeData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationFilter", propOrder = {
        "associationName",
        "moduleName",
        "objectTypeName",
        "reverseAssociation",
        "runTimeData"
})
public class AssociationFilter {

    @XmlElement(required = true)
    protected String associationName;
    @XmlElement(required = true)
    protected String moduleName;
    @XmlElement(nillable = true)
    protected String objectTypeName;
    protected boolean reverseAssociation;
    @XmlElement(required = true)
    protected String runTimeData;

    /**
     * Gets the value of the associationName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * Sets the value of the associationName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssociationName(String value) {
        this.associationName = value;
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
     * Gets the value of the objectTypeName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getObjectTypeName() {
        return objectTypeName;
    }

    /**
     * Sets the value of the objectTypeName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setObjectTypeName(String value) {
        this.objectTypeName = value;
    }

    /**
     * Gets the value of the reverseAssociation property.
     */
    public boolean isReverseAssociation() {
        return reverseAssociation;
    }

    /**
     * Sets the value of the reverseAssociation property.
     */
    public void setReverseAssociation(boolean value) {
        this.reverseAssociation = value;
    }

    /**
     * Gets the value of the runTimeData property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRunTimeData() {
        return runTimeData;
    }

    /**
     * Sets the value of the runTimeData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRunTimeData(String value) {
        this.runTimeData = value;
    }

}
