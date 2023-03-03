package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResponseHelper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfResponseHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHelper" type="{http://dto.ws.tririga.com}ResponseHelper" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseHelper", propOrder = {
        "responseHelper"
})
public class ArrayOfResponseHelper {

    @XmlElement(name = "ResponseHelper", nillable = true)
    protected ResponseHelper[] responseHelper;

    /**
     * @return array of
     * {@link ResponseHelper }
     */
    public ResponseHelper[] getResponseHelper() {
        if (this.responseHelper == null) {
            return new ResponseHelper[0];
        }
        ResponseHelper[] retVal = new ResponseHelper[this.responseHelper.length];
        System.arraycopy(this.responseHelper, 0, retVal, 0, this.responseHelper.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ResponseHelper }
     */
    public void setResponseHelper(ResponseHelper[] values) {
        if (values == null) {
            this.responseHelper = null;
            return;
        }
        int len = values.length;
        this.responseHelper = ((ResponseHelper[]) new ResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.responseHelper[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ResponseHelper }
     */
    public ResponseHelper getResponseHelper(int idx) {
        if (this.responseHelper == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.responseHelper[idx];
    }

    public int getResponseHelperLength() {
        if (this.responseHelper == null) {
            return 0;
        }
        return this.responseHelper.length;
    }

    /**
     * @param value allowed object is
     *              {@link ResponseHelper }
     */
    public ResponseHelper setResponseHelper(int idx, ResponseHelper value) {
        return this.responseHelper[idx] = value;
    }

}
