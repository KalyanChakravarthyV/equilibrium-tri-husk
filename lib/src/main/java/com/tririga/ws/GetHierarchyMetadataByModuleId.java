package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHierarchyMetadataByModuleId complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getHierarchyMetadataByModuleId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHierarchyMetadataByModuleId", propOrder = {
        "moduleId"
})
public class GetHierarchyMetadataByModuleId {

    protected long moduleId;

    /**
     * Gets the value of the moduleId property.
     */
    public long getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     */
    public void setModuleId(long value) {
        this.moduleId = value;
    }

}
