package com.tririga.ws;

import com.tririga.ws.dto.ContinuationToken;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for runNamedMetricQueryContinue complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="runNamedMetricQueryContinue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="continuationToken" type="{http://dto.ws.tririga.com}ContinuationToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "runNamedMetricQueryContinue", propOrder = {
        "continuationToken"
})
public class RunNamedMetricQueryContinue {

    protected ContinuationToken continuationToken;

    /**
     * Gets the value of the continuationToken property.
     *
     * @return possible object is
     * {@link ContinuationToken }
     */
    public ContinuationToken getContinuationToken() {
        return continuationToken;
    }

    /**
     * Sets the value of the continuationToken property.
     *
     * @param value allowed object is
     *              {@link ContinuationToken }
     */
    public void setContinuationToken(ContinuationToken value) {
        this.continuationToken = value;
    }

}
