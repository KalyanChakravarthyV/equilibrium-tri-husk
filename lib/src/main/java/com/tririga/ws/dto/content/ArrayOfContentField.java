package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContentField complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfContentField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentField" type="{http://content.dto.ws.tririga.com}ContentField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContentField", propOrder = {
        "contentField"
})
public class ArrayOfContentField {

    @XmlElement(name = "ContentField", nillable = true)
    protected ContentField[] contentField;

    /**
     * @return array of
     * {@link ContentField }
     */
    public ContentField[] getContentField() {
        if (this.contentField == null) {
            return new ContentField[0];
        }
        ContentField[] retVal = new ContentField[this.contentField.length];
        System.arraycopy(this.contentField, 0, retVal, 0, this.contentField.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ContentField }
     */
    public void setContentField(ContentField[] values) {
        if (values == null) {
            this.contentField = null;
            return;
        }
        int len = values.length;
        this.contentField = ((ContentField[]) new ContentField[len]);
        for (int i = 0; (i < len); i++) {
            this.contentField[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ContentField }
     */
    public ContentField getContentField(int idx) {
        if (this.contentField == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.contentField[idx];
    }

    public int getContentFieldLength() {
        if (this.contentField == null) {
            return 0;
        }
        return this.contentField.length;
    }

    /**
     * @param value allowed object is
     *              {@link ContentField }
     */
    public ContentField setContentField(int idx, ContentField value) {
        return this.contentField[idx] = value;
    }

}
