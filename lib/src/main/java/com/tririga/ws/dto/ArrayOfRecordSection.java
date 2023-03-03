package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecordSection complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfRecordSection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordSection" type="{http://dto.ws.tririga.com}RecordSection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecordSection", propOrder = {
        "recordSection"
})
public class ArrayOfRecordSection {

    @XmlElement(name = "RecordSection", nillable = true)
    protected RecordSection[] recordSection;

    /**
     * @return array of
     * {@link RecordSection }
     */
    public RecordSection[] getRecordSection() {
        if (this.recordSection == null) {
            return new RecordSection[0];
        }
        RecordSection[] retVal = new RecordSection[this.recordSection.length];
        System.arraycopy(this.recordSection, 0, retVal, 0, this.recordSection.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link RecordSection }
     */
    public void setRecordSection(RecordSection[] values) {
        if (values == null) {
            this.recordSection = null;
            return;
        }
        int len = values.length;
        this.recordSection = ((RecordSection[]) new RecordSection[len]);
        for (int i = 0; (i < len); i++) {
            this.recordSection[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link RecordSection }
     */
    public RecordSection getRecordSection(int idx) {
        if (this.recordSection == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recordSection[idx];
    }

    public int getRecordSectionLength() {
        if (this.recordSection == null) {
            return 0;
        }
        return this.recordSection.length;
    }

    /**
     * @param value allowed object is
     *              {@link RecordSection }
     */
    public RecordSection setRecordSection(int idx, RecordSection value) {
        return this.recordSection[idx] = value;
    }

}
