package com.tririga.ws;

import com.tririga.ws.dto.content.ContentField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContentFieldsDefinitionResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getContentFieldsDefinitionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentFields" type="{http://content.dto.ws.tririga.com}ContentField" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContentFieldsDefinitionResponse", propOrder = {
        "contentFields"
})
public class GetContentFieldsDefinitionResponse {

    @XmlElement(required = true, nillable = true)
    protected ContentField[] contentFields;

    /**
     * @return array of
     * {@link ContentField }
     */
    public ContentField[] getContentFields() {
        if (this.contentFields == null) {
            return new ContentField[0];
        }
        ContentField[] retVal = new ContentField[this.contentFields.length];
        System.arraycopy(this.contentFields, 0, retVal, 0, this.contentFields.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ContentField }
     */
    public void setContentFields(ContentField[] values) {
        if (values == null) {
            this.contentFields = null;
            return;
        }
        int len = values.length;
        this.contentFields = ((ContentField[]) new ContentField[len]);
        for (int i = 0; (i < len); i++) {
            this.contentFields[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ContentField }
     */
    public ContentField getContentFields(int idx) {
        if (this.contentFields == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.contentFields[idx];
    }

    public int getContentFieldsLength() {
        if (this.contentFields == null) {
            return 0;
        }
        return this.contentFields.length;
    }

    /**
     * @param value allowed object is
     *              {@link ContentField }
     */
    public ContentField setContentFields(int idx, ContentField value) {
        return this.contentFields[idx] = value;
    }

}
