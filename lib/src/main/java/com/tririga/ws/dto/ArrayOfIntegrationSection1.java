package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegrationSection-1- complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfIntegrationSection-1-"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntegrationSection" type="{http://dto.ws.tririga.com}IntegrationSection" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegrationSection-1-", propOrder = {
        "integrationSection"
})
public class ArrayOfIntegrationSection1 {

    @XmlElement(name = "IntegrationSection", required = true, nillable = true)
    protected IntegrationSection[] integrationSection;

    /**
     * @return array of
     * {@link IntegrationSection }
     */
    public IntegrationSection[] getIntegrationSection() {
        if (this.integrationSection == null) {
            return new IntegrationSection[0];
        }
        IntegrationSection[] retVal = new IntegrationSection[this.integrationSection.length];
        System.arraycopy(this.integrationSection, 0, retVal, 0, this.integrationSection.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link IntegrationSection }
     */
    public void setIntegrationSection(IntegrationSection[] values) {
        if (values == null) {
            this.integrationSection = null;
            return;
        }
        int len = values.length;
        this.integrationSection = ((IntegrationSection[]) new IntegrationSection[len]);
        for (int i = 0; (i < len); i++) {
            this.integrationSection[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link IntegrationSection }
     */
    public IntegrationSection getIntegrationSection(int idx) {
        if (this.integrationSection == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.integrationSection[idx];
    }

    public int getIntegrationSectionLength() {
        if (this.integrationSection == null) {
            return 0;
        }
        return this.integrationSection.length;
    }

    /**
     * @param value allowed object is
     *              {@link IntegrationSection }
     */
    public IntegrationSection setIntegrationSection(int idx, IntegrationSection value) {
        return this.integrationSection[idx] = value;
    }

}
