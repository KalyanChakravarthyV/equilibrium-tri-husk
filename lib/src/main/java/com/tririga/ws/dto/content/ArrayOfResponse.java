package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://content.dto.ws.tririga.com}Response" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponse", propOrder = {
        "response"
})
public class ArrayOfResponse {

    @XmlElement(name = "Response", nillable = true)
    protected Response[] response;

    /**
     * @return array of
     * {@link Response }
     */
    public Response[] getResponse() {
        if (this.response == null) {
            return new Response[0];
        }
        Response[] retVal = new Response[this.response.length];
        System.arraycopy(this.response, 0, retVal, 0, this.response.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Response }
     */
    public void setResponse(Response[] values) {
        if (values == null) {
            this.response = null;
            return;
        }
        int len = values.length;
        this.response = ((Response[]) new Response[len]);
        for (int i = 0; (i < len); i++) {
            this.response[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Response }
     */
    public Response getResponse(int idx) {
        if (this.response == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.response[idx];
    }

    public int getResponseLength() {
        if (this.response == null) {
            return 0;
        }
        return this.response.length;
    }

    /**
     * @param value allowed object is
     *              {@link Response }
     */
    public Response setResponse(int idx, Response value) {
        return this.response[idx] = value;
    }

}
