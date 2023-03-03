package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tab complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tab"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sections" type="{http://dto.ws.tririga.com}Section" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tabId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tabName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tab", propOrder = {
        "sections",
        "tabId",
        "tabName"
})
public class Tab {

    @XmlElement(nillable = true)
    protected Section[] sections;
    protected Long tabId;
    @XmlElement(nillable = true)
    protected String tabName;

    /**
     * @return array of
     * {@link Section }
     */
    public Section[] getSections() {
        if (this.sections == null) {
            return new Section[0];
        }
        Section[] retVal = new Section[this.sections.length];
        System.arraycopy(this.sections, 0, retVal, 0, this.sections.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Section }
     */
    public void setSections(Section[] values) {
        if (values == null) {
            this.sections = null;
            return;
        }
        int len = values.length;
        this.sections = ((Section[]) new Section[len]);
        for (int i = 0; (i < len); i++) {
            this.sections[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Section }
     */
    public Section getSections(int idx) {
        if (this.sections == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sections[idx];
    }

    public int getSectionsLength() {
        if (this.sections == null) {
            return 0;
        }
        return this.sections.length;
    }

    /**
     * @param value allowed object is
     *              {@link Section }
     */
    public Section setSections(int idx, Section value) {
        return this.sections[idx] = value;
    }

    /**
     * Gets the value of the tabId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getTabId() {
        return tabId;
    }

    /**
     * Sets the value of the tabId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setTabId(Long value) {
        this.tabId = value;
    }

    /**
     * Gets the value of the tabName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTabName() {
        return tabName;
    }

    /**
     * Sets the value of the tabName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTabName(String value) {
        this.tabName = value;
    }

}
