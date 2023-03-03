package com.tririga.ws;

import com.tririga.ws.dto.ResponseHelper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserLicensesResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getUserLicensesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ResponseHelper" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserLicensesResponse", propOrder = {
        "out"
})
public class GetUserLicensesResponse {

    @XmlElement(required = true, nillable = true)
    protected ResponseHelper[] out;

    /**
     * @return array of
     * {@link ResponseHelper }
     */
    public ResponseHelper[] getOut() {
        if (this.out == null) {
            return new ResponseHelper[0];
        }
        ResponseHelper[] retVal = new ResponseHelper[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ResponseHelper }
     */
    public void setOut(ResponseHelper[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((ResponseHelper[]) new ResponseHelper[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ResponseHelper }
     */
    public ResponseHelper getOut(int idx) {
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
     *              {@link ResponseHelper }
     */
    public ResponseHelper setOut(int idx, ResponseHelper value) {
        return this.out[idx] = value;
    }

}
