package com.tririga.ws;

import com.tririga.ws.dto.ActionItem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActionItemsResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getActionItemsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="out" type="{http://dto.ws.tririga.com}ActionItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActionItemsResponse", propOrder = {
        "out"
})
public class GetActionItemsResponse {

    @XmlElement(required = true, nillable = true)
    protected ActionItem[] out;

    /**
     * @return array of
     * {@link ActionItem }
     */
    public ActionItem[] getOut() {
        if (this.out == null) {
            return new ActionItem[0];
        }
        ActionItem[] retVal = new ActionItem[this.out.length];
        System.arraycopy(this.out, 0, retVal, 0, this.out.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ActionItem }
     */
    public void setOut(ActionItem[] values) {
        if (values == null) {
            this.out = null;
            return;
        }
        int len = values.length;
        this.out = ((ActionItem[]) new ActionItem[len]);
        for (int i = 0; (i < len); i++) {
            this.out[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ActionItem }
     */
    public ActionItem getOut(int idx) {
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
     *              {@link ActionItem }
     */
    public ActionItem setOut(int idx, ActionItem value) {
        return this.out[idx] = value;
    }

}
