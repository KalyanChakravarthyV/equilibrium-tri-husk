package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseHelperHeader complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResponseHelperHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anyFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="failed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="responseHelpers" type="{http://dto.ws.tririga.com}ResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHelperHeader", propOrder = {
        "anyFailed",
        "failed",
        "responseHelpers",
        "successful",
        "total"
})
public class ResponseHelperHeader {

    protected Boolean anyFailed;
    protected Integer failed;
    @XmlElement(nillable = true)
    protected ResponseHelper[] responseHelpers;
    protected Integer successful;
    protected Integer total;

    /**
     * Gets the value of the anyFailed property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isAnyFailed() {
        return anyFailed;
    }

    /**
     * Sets the value of the anyFailed property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAnyFailed(Boolean value) {
        this.anyFailed = value;
    }

    /**
     * Gets the value of the failed property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setFailed(Integer value) {
        this.failed = value;
    }

    /**
     * @return array of
     * {@link ResponseHelper }
     */
    public ResponseHelper[] getResponseHelpers() {
        if (this.responseHelpers == null) {
            return new ResponseHelper[0];
        }
        ResponseHelper[] retVal = new ResponseHelper[this.responseHelpers.length];
        System.arraycopy(this.responseHelpers, 0, retVal, 0, this.responseHelpers.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ResponseHelper }
     */
    public void setResponseHelpers(ResponseHelper[] values) {
        if (values == null) {
            this.responseHelpers = null;
            return;
        }
        int len = values.length;
        this.responseHelpers = ((ResponseHelper[]) new ResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.responseHelpers[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ResponseHelper }
     */
    public ResponseHelper getResponseHelpers(int idx) {
        if (this.responseHelpers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.responseHelpers[idx];
    }

    public int getResponseHelpersLength() {
        if (this.responseHelpers == null) {
            return 0;
        }
        return this.responseHelpers.length;
    }

    /**
     * @param value allowed object is
     *              {@link ResponseHelper }
     */
    public ResponseHelper setResponseHelpers(int idx, ResponseHelper value) {
        return this.responseHelpers[idx] = value;
    }

    /**
     * Gets the value of the successful property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setSuccessful(Integer value) {
        this.successful = value;
    }

    /**
     * Gets the value of the total property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
