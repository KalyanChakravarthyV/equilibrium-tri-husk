package com.tririga.ws.dto.gui;

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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sections" type="{http://gui.dto.ws.tririga.com}Section" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tabInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tab", propOrder = {
        "id",
        "instruction",
        "label",
        "name",
        "sections",
        "tabInformation",
        "url",
        "visible"
})
public class Tab {

    protected Long id;
    @XmlElement(nillable = true)
    protected String instruction;
    @XmlElement(nillable = true)
    protected String label;
    @XmlElement(nillable = true)
    protected String name;
    @XmlElement(nillable = true)
    protected Section[] sections;
    @XmlElement(nillable = true)
    protected String tabInformation;
    @XmlElement(nillable = true)
    protected String url;
    protected Boolean visible;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the instruction property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the tabInformation property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTabInformation() {
        return tabInformation;
    }

    /**
     * Sets the value of the tabInformation property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTabInformation(String value) {
        this.tabInformation = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the visible property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

}
