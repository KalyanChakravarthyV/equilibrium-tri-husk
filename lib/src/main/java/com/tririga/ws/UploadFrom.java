package com.tririga.ws;

import com.tririga.ws.dto.content.Content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadFrom complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="uploadFrom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contents" type="{http://content.dto.ws.tririga.com}Content" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadFrom", propOrder = {
        "contents"
})
public class UploadFrom {

    @XmlElement(required = true)
    protected Content[] contents;

    /**
     * @return array of
     * {@link Content }
     */
    public Content[] getContents() {
        if (this.contents == null) {
            return new Content[0];
        }
        Content[] retVal = new Content[this.contents.length];
        System.arraycopy(this.contents, 0, retVal, 0, this.contents.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Content }
     */
    public void setContents(Content[] values) {
        if (values == null) {
            this.contents = null;
            return;
        }
        int len = values.length;
        this.contents = ((Content[]) new Content[len]);
        for (int i = 0; (i < len); i++) {
            this.contents[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Content }
     */
    public Content getContents(int idx) {
        if (this.contents == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.contents[idx];
    }

    public int getContentsLength() {
        if (this.contents == null) {
            return 0;
        }
        return this.contents.length;
    }

    /**
     * @param value allowed object is
     *              {@link Content }
     */
    public Content setContents(int idx, Content value) {
        return this.contents[idx] = value;
    }

}
