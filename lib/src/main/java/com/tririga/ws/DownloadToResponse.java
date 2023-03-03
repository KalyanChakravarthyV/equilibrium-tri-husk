package com.tririga.ws;

import com.tririga.ws.dto.content.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadToResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="downloadToResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reponses" type="{http://content.dto.ws.tririga.com}Response" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadToResponse", propOrder = {
        "reponses"
})
public class DownloadToResponse {

    @XmlElement(required = true, nillable = true)
    protected Response[] reponses;

    /**
     * @return array of
     * {@link Response }
     */
    public Response[] getReponses() {
        if (this.reponses == null) {
            return new Response[0];
        }
        Response[] retVal = new Response[this.reponses.length];
        System.arraycopy(this.reponses, 0, retVal, 0, this.reponses.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Response }
     */
    public void setReponses(Response[] values) {
        if (values == null) {
            this.reponses = null;
            return;
        }
        int len = values.length;
        this.reponses = ((Response[]) new Response[len]);
        for (int i = 0; (i < len); i++) {
            this.reponses[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Response }
     */
    public Response getReponses(int idx) {
        if (this.reponses == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.reponses[idx];
    }

    public int getReponsesLength() {
        if (this.reponses == null) {
            return 0;
        }
        return this.reponses.length;
    }

    /**
     * @param value allowed object is
     *              {@link Response }
     */
    public Response setReponses(int idx, Response value) {
        return this.reponses[idx] = value;
    }

}
