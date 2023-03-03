package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfModule complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfModule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Module" type="{http://dto.ws.tririga.com}Module" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfModule", propOrder = {
        "module"
})
public class ArrayOfModule {

    @XmlElement(name = "Module", nillable = true)
    protected Module[] module;

    /**
     * @return array of
     * {@link Module }
     */
    public Module[] getModule() {
        if (this.module == null) {
            return new Module[0];
        }
        Module[] retVal = new Module[this.module.length];
        System.arraycopy(this.module, 0, retVal, 0, this.module.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Module }
     */
    public void setModule(Module[] values) {
        if (values == null) {
            this.module = null;
            return;
        }
        int len = values.length;
        this.module = ((Module[]) new Module[len]);
        for (int i = 0; (i < len); i++) {
            this.module[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Module }
     */
    public Module getModule(int idx) {
        if (this.module == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.module[idx];
    }

    public int getModuleLength() {
        if (this.module == null) {
            return 0;
        }
        return this.module.length;
    }

    /**
     * @param value allowed object is
     *              {@link Module }
     */
    public Module setModule(int idx, Module value) {
        return this.module[idx] = value;
    }

}
