package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordSearchResult complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfKeywordSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeywordSearchResult" type="{http://dto.ws.tririga.com}KeywordSearchResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordSearchResult", propOrder = {
        "keywordSearchResult"
})
public class ArrayOfKeywordSearchResult {

    @XmlElement(name = "KeywordSearchResult", nillable = true)
    protected KeywordSearchResult[] keywordSearchResult;

    /**
     * @return array of
     * {@link KeywordSearchResult }
     */
    public KeywordSearchResult[] getKeywordSearchResult() {
        if (this.keywordSearchResult == null) {
            return new KeywordSearchResult[0];
        }
        KeywordSearchResult[] retVal = new KeywordSearchResult[this.keywordSearchResult.length];
        System.arraycopy(this.keywordSearchResult, 0, retVal, 0, this.keywordSearchResult.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link KeywordSearchResult }
     */
    public void setKeywordSearchResult(KeywordSearchResult[] values) {
        if (values == null) {
            this.keywordSearchResult = null;
            return;
        }
        int len = values.length;
        this.keywordSearchResult = ((KeywordSearchResult[]) new KeywordSearchResult[len]);
        for (int i = 0; (i < len); i++) {
            this.keywordSearchResult[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link KeywordSearchResult }
     */
    public KeywordSearchResult getKeywordSearchResult(int idx) {
        if (this.keywordSearchResult == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.keywordSearchResult[idx];
    }

    public int getKeywordSearchResultLength() {
        if (this.keywordSearchResult == null) {
            return 0;
        }
        return this.keywordSearchResult.length;
    }

    /**
     * @param value allowed object is
     *              {@link KeywordSearchResult }
     */
    public KeywordSearchResult setKeywordSearchResult(int idx, KeywordSearchResult value) {
        return this.keywordSearchResult[idx] = value;
    }

}
