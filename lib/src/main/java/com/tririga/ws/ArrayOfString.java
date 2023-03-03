package com.tririga.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfString complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", propOrder = {
        "string"
})
public class ArrayOfString {

    @XmlElement(nillable = true)
    protected String[] string;

    /**
     * @return array of
     * {@link String }
     */
    public String[] getString() {
        if (this.string == null) {
            return new String[0];
        }
        String[] retVal = new String[this.string.length];
        System.arraycopy(this.string, 0, retVal, 0, this.string.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setString(String[] values) {
        if (values == null) {
            this.string = null;
            return;
        }
        int len = values.length;
        this.string = ((String[]) new String[len]);
        for (int i = 0; (i < len); i++) {
            this.string[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link String }
     */
    public String getString(int idx) {
        if (this.string == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.string[idx];
    }

    public int getStringLength() {
        if (this.string == null) {
            return 0;
        }
        return this.string.length;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setString(int idx, String value) {
        return this.string[idx] = value;
    }

}
