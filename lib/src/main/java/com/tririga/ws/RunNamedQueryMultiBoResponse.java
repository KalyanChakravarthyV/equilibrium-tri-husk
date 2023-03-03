package com.tririga.ws;

import com.tririga.ws.dto.QueryMultiBoResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runNamedQueryMultiBoResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runNamedQueryMultiBoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}QueryMultiBoResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runNamedQueryMultiBoResponse", propOrder = {
        "out"
})
public class RunNamedQueryMultiBoResponse {

    protected QueryMultiBoResult out;

    /**
     * Gets the value of the out property.
     *
     * @return possible object is
     * {@link QueryMultiBoResult }
     */
    public QueryMultiBoResult getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     *
     * @param value allowed object is
     *              {@link QueryMultiBoResult }
     */
    public void setOut(QueryMultiBoResult value) {
        this.out = value;
    }

}
