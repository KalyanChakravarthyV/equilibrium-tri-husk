package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtendedFormulaParam complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfExtendedFormulaParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedFormulaParam" type="{http://dto.ws.tririga.com}ExtendedFormulaParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedFormulaParam", propOrder = {
        "extendedFormulaParam"
})
public class ArrayOfExtendedFormulaParam {

    @XmlElement(name = "ExtendedFormulaParam", nillable = true)
    protected ExtendedFormulaParam[] extendedFormulaParam;

    /**
     * @return array of
     * {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam[] getExtendedFormulaParam() {
        if (this.extendedFormulaParam == null) {
            return new ExtendedFormulaParam[0];
        }
        ExtendedFormulaParam[] retVal = new ExtendedFormulaParam[this.extendedFormulaParam.length];
        System.arraycopy(this.extendedFormulaParam, 0, retVal, 0, this.extendedFormulaParam.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ExtendedFormulaParam }
     */
    public void setExtendedFormulaParam(ExtendedFormulaParam[] values) {
        if (values == null) {
            this.extendedFormulaParam = null;
            return;
        }
        int len = values.length;
        this.extendedFormulaParam = ((ExtendedFormulaParam[]) new ExtendedFormulaParam[len]);
        for (int i = 0; (i < len); i++) {
            this.extendedFormulaParam[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam getExtendedFormulaParam(int idx) {
        if (this.extendedFormulaParam == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.extendedFormulaParam[idx];
    }

    public int getExtendedFormulaParamLength() {
        if (this.extendedFormulaParam == null) {
            return 0;
        }
        return this.extendedFormulaParam.length;
    }

    /**
     * @param value allowed object is
     *              {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam setExtendedFormulaParam(int idx, ExtendedFormulaParam value) {
        return this.extendedFormulaParam[idx] = value;
    }

}
