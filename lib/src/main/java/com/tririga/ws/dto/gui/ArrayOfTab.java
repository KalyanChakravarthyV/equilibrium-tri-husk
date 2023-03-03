package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTab complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfTab"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tab" type="{http://gui.dto.ws.tririga.com}Tab" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTab", propOrder = {
        "tab"
})
public class ArrayOfTab {

    @XmlElement(name = "Tab", nillable = true)
    protected Tab[] tab;

    /**
     * @return array of
     * {@link Tab }
     */
    public Tab[] getTab() {
        if (this.tab == null) {
            return new Tab[0];
        }
        Tab[] retVal = new Tab[this.tab.length];
        System.arraycopy(this.tab, 0, retVal, 0, this.tab.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Tab }
     */
    public void setTab(Tab[] values) {
        if (values == null) {
            this.tab = null;
            return;
        }
        int len = values.length;
        this.tab = ((Tab[]) new Tab[len]);
        for (int i = 0; (i < len); i++) {
            this.tab[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Tab }
     */
    public Tab getTab(int idx) {
        if (this.tab == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.tab[idx];
    }

    public int getTabLength() {
        if (this.tab == null) {
            return 0;
        }
        return this.tab.length;
    }

    /**
     * @param value allowed object is
     *              {@link Tab }
     */
    public Tab setTab(int idx, Tab value) {
        return this.tab[idx] = value;
    }

}
