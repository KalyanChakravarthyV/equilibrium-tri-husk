package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for HierarchyObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HierarchyObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}BaseObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="children" type="{http://dto.ws.tririga.com}HierarchyObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rootOfHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyObjectType", propOrder = {
        "children",
        "rootOfHierarchy"
})
@XmlSeeAlso({
        ObjectType.class
})
public class HierarchyObjectType
        extends BaseObjectType {

    @XmlElement(nillable = true)
    protected HierarchyObjectType[] children;
    protected Boolean rootOfHierarchy;

    /**
     * @return array of
     * {@link HierarchyObjectType }
     */
    public HierarchyObjectType[] getChildren() {
        if (this.children == null) {
            return new HierarchyObjectType[0];
        }
        HierarchyObjectType[] retVal = new HierarchyObjectType[this.children.length];
        System.arraycopy(this.children, 0, retVal, 0, this.children.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link HierarchyObjectType }
     */
    public void setChildren(HierarchyObjectType[] values) {
        if (values == null) {
            this.children = null;
            return;
        }
        int len = values.length;
        this.children = ((HierarchyObjectType[]) new HierarchyObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.children[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link HierarchyObjectType }
     */
    public HierarchyObjectType getChildren(int idx) {
        if (this.children == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.children[idx];
    }

    public int getChildrenLength() {
        if (this.children == null) {
            return 0;
        }
        return this.children.length;
    }

    /**
     * @param value allowed object is
     *              {@link HierarchyObjectType }
     */
    public HierarchyObjectType setChildren(int idx, HierarchyObjectType value) {
        return this.children[idx] = value;
    }

    /**
     * Gets the value of the rootOfHierarchy property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRootOfHierarchy() {
        return rootOfHierarchy;
    }

    /**
     * Sets the value of the rootOfHierarchy property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRootOfHierarchy(Boolean value) {
        this.rootOfHierarchy = value;
    }

}
