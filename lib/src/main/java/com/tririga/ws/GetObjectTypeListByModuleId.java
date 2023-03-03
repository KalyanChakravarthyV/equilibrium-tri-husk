package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getObjectTypeListByModuleId complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getObjectTypeListByModuleId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="isStandAlone" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getObjectTypeListByModuleId", propOrder = {
        "moduleId",
        "isStandAlone"
})
public class GetObjectTypeListByModuleId {

    protected long moduleId;
    protected boolean isStandAlone;

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
