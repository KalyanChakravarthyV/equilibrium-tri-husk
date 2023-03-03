package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContent-1- complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfContent-1-"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Content" type="{http://content.dto.ws.tririga.com}Content" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContent-1-", propOrder = {
        "content"
})
public class ArrayOfContent1 {

    @XmlElement(name = "Content", required = true, nillable = true)
    protected Content[] content;

    /**
     * @return array of
     * {@link Content }
     */
    public Content[] getContent() {
        if (this.content == null) {
            return new Content[0];
        }
        Content[] retVal = new Content[this.content.length];
        System.arraycopy(this.content, 0, retVal, 0, this.content.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Content }
     */
    public void setContent(Content[] values) {
        if (values == null) {
            this.content = null;
            return;
        }
        int len = values.length;
        this.content = ((Content[]) new Content[len]);
        for (int i = 0; (i < len); i++) {
            this.content[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Content }
     */
    public Content getContent(int idx) {
        if (this.content == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.content[idx];
    }

    public int getContentLength() {
        if (this.content == null) {
            return 0;
        }
        return this.content.length;
    }

    /**
     * @param value allowed object is
     *              {@link Content }
     */
    public Content setContent(int idx, Content value) {
        return this.content[idx] = value;
    }

}
