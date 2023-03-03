package com.tririga.ws;

import com.tririga.ws.dto.ApplicationInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationInfoResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getApplicationInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ApplicationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationInfoResponse", propOrder = {
        "out"
})
public class GetApplicationInfoResponse {

    protected ApplicationInfo out;

    /**
     * Gets the value of the out property.
     *
     * @return possible object is
     * {@link ApplicationInfo }
     */
    public ApplicationInfo getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     *
     * @param value allowed object is
     *              {@link ApplicationInfo }
     */
    public void setOut(ApplicationInfo value) {
        this.out = value;
    }

}
