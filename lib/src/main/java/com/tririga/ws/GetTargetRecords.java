package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTargetRecords complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getTargetRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTargetRecords", propOrder = {
        "objectTypeId",
        "sectionName"
})
public class GetTargetRecords {

    protected long objectTypeId;
    protected String sectionName;

    /**
     * Gets the value of the objectTypeId property.
     */
    public long getObjectTypeId() {
        return objectTypeId;
    }

    /**
     * Sets the value of the objectTypeId property.
     */
    public void setObjectTypeId(long value) {
        this.objectTypeId = value;
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
