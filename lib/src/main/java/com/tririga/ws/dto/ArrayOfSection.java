package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Section" type="{http://dto.ws.tririga.com}Section" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSection", propOrder = {
        "section"
})
public class ArrayOfSection {

    @XmlElement(name = "Section", nillable = true)
    protected Section[] section;

    /**
     * @return array of
     * {@link Section }
     */
    public Section[] getSection() {
        if (this.section == null) {
            return new Section[0];
        }
        Section[] retVal = new Section[this.section.length];
        System.arraycopy(this.section, 0, retVal, 0, this.section.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Section }
     */
    public void setSection(Section[] values) {
        if (values == null) {
            this.section = null;
            return;
        }
        int len = values.length;
        this.section = ((Section[]) new Section[len]);
        for (int i = 0; (i < len); i++) {
            this.section[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Section }
     */
    public Section getSection(int idx) {
        if (this.section == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.section[idx];
    }

    public int getSectionLength() {
        if (this.section == null) {
            return 0;
        }
        return this.section.length;
    }

    /**
     * @param value allowed object is
     *              {@link Section }
     */
    public Section setSection(int idx, Section value) {
        return this.section[idx] = value;
    }

}
