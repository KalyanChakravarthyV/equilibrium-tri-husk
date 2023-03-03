package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedFormula complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExtendedFormula"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parameters" type="{http://dto.ws.tririga.com}ExtendedFormulaParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedFormula", propOrder = {
        "expression",
        "id",
        "parameters"
})
public class ExtendedFormula {

    @XmlElement(nillable = true)
    protected String expression;
    protected Long id;
    @XmlElement(nillable = true)
    protected ExtendedFormulaParam[] parameters;

    /**
     * Gets the value of the expression property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * @return array of
     * {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam[] getParameters() {
        if (this.parameters == null) {
            return new ExtendedFormulaParam[0];
        }
        ExtendedFormulaParam[] retVal = new ExtendedFormulaParam[this.parameters.length];
        System.arraycopy(this.parameters, 0, retVal, 0, this.parameters.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ExtendedFormulaParam }
     */
    public void setParameters(ExtendedFormulaParam[] values) {
        if (values == null) {
            this.parameters = null;
            return;
        }
        int len = values.length;
        this.parameters = ((ExtendedFormulaParam[]) new ExtendedFormulaParam[len]);
        for (int i = 0; (i < len); i++) {
            this.parameters[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam getParameters(int idx) {
        if (this.parameters == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.parameters[idx];
    }

    public int getParametersLength() {
        if (this.parameters == null) {
            return 0;
        }
        return this.parameters.length;
    }

    /**
     * @param value allowed object is
     *              {@link ExtendedFormulaParam }
     */
    public ExtendedFormulaParam setParameters(int idx, ExtendedFormulaParam value) {
        return this.parameters[idx] = value;
    }

}
