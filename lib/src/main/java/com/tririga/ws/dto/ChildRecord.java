package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildRecord complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChildRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildRecord", propOrder = {
        "childCount",
        "path"
})
public class ChildRecord
        extends Record {

    protected Long childCount;
    @XmlElement(nillable = true)
    protected String path;

    /**
     * Gets the value of the childCount property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getChildCount() {
        return childCount;
    }

    /**
     * Sets the value of the childCount property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setChildCount(Long value) {
        this.childCount = value;
    }

    /**
     * Gets the value of the path property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPath(String value) {
        this.path = value;
    }

}
