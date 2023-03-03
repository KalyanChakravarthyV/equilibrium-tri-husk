package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGuiRow complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfGuiRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuiRow" type="{http://gui.dto.ws.tririga.com}GuiRow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuiRow", propOrder = {
        "guiRow"
})
public class ArrayOfGuiRow {

    @XmlElement(name = "GuiRow", nillable = true)
    protected GuiRow[] guiRow;

    /**
     * @return array of
     * {@link GuiRow }
     */
    public GuiRow[] getGuiRow() {
        if (this.guiRow == null) {
            return new GuiRow[0];
        }
        GuiRow[] retVal = new GuiRow[this.guiRow.length];
        System.arraycopy(this.guiRow, 0, retVal, 0, this.guiRow.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link GuiRow }
     */
    public void setGuiRow(GuiRow[] values) {
        if (values == null) {
            this.guiRow = null;
            return;
        }
        int len = values.length;
        this.guiRow = ((GuiRow[]) new GuiRow[len]);
        for (int i = 0; (i < len); i++) {
            this.guiRow[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link GuiRow }
     */
    public GuiRow getGuiRow(int idx) {
        if (this.guiRow == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.guiRow[idx];
    }

    public int getGuiRowLength() {
        if (this.guiRow == null) {
            return 0;
        }
        return this.guiRow.length;
    }

    /**
     * @param value allowed object is
     *              {@link GuiRow }
     */
    public GuiRow setGuiRow(int idx, GuiRow value) {
        return this.guiRow[idx] = value;
    }

}
