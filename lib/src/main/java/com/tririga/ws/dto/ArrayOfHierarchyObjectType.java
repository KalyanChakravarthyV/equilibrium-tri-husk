package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHierarchyObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfHierarchyObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HierarchyObjectType" type="{http://dto.ws.tririga.com}HierarchyObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHierarchyObjectType", propOrder = {
        "hierarchyObjectType"
})
public class ArrayOfHierarchyObjectType {

    @XmlElement(name = "HierarchyObjectType", nillable = true)
    protected HierarchyObjectType[] hierarchyObjectType;

    /**
     * @return array of
     * {@link HierarchyObjectType }
     */
    public HierarchyObjectType[] getHierarchyObjectType() {
        if (this.hierarchyObjectType == null) {
            return new HierarchyObjectType[0];
        }
        HierarchyObjectType[] retVal = new HierarchyObjectType[this.hierarchyObjectType.length];
        System.arraycopy(this.hierarchyObjectType, 0, retVal, 0, this.hierarchyObjectType.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link HierarchyObjectType }
     */
    public void setHierarchyObjectType(HierarchyObjectType[] values) {
        if (values == null) {
            this.hierarchyObjectType = null;
            return;
        }
        int len = values.length;
        this.hierarchyObjectType = ((HierarchyObjectType[]) new HierarchyObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.hierarchyObjectType[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link HierarchyObjectType }
     */
    public HierarchyObjectType getHierarchyObjectType(int idx) {
        if (this.hierarchyObjectType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.hierarchyObjectType[idx];
    }

    public int getHierarchyObjectTypeLength() {
        if (this.hierarchyObjectType == null) {
            return 0;
        }
        return this.hierarchyObjectType.length;
    }

    /**
     * @param value allowed object is
     *              {@link HierarchyObjectType }
     */
    public HierarchyObjectType setHierarchyObjectType(int idx, HierarchyObjectType value) {
        return this.hierarchyObjectType[idx] = value;
    }

}
