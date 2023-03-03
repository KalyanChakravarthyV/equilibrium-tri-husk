package com.tririga.ws;

import com.tririga.ws.dto.KeywordSearchResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keywordSearchResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="keywordSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}KeywordSearchResult" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keywordSearchResponse", propOrder = {
        "out"
})
public class KeywordSearchResponse {

    @XmlElement(required = true, nillable = true)
    protected KeywordSearchResult[] out;

    /**
     * @return array of
     * {@link KeywordSearchResult }
     */
    public KeywordSearchResult[] getOut() {
        if (this.out == null) {
            return new KeywordSearchResult[0];
        }
        KeywordSearchResult[] retVal = new KeywordSearchResult[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link KeywordSearchResult }
     */
    public void setOut(KeywordSearchResult[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((KeywordSearchResult[]) new KeywordSearchResult[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link KeywordSearchResult }
     */
    public KeywordSearchResult getOut(int idx) {
        if (this.out == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.out[idx];
    }

    public int getOutLength() {
        if (this.out == null) {
            return 0;
        }
        return this.out.length;
    }

    /**
     * @param value allowed object is
     *              {@link KeywordSearchResult }
     */
    public KeywordSearchResult setOut(int idx, KeywordSearchResult value) {
        return this.out[idx] = value;
    }

}
