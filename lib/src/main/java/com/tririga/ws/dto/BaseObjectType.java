package com.tririga.ws.dto;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseObjectType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BaseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childBaseObjectTypes" type="{http://dto.ws.tririga.com}ChildBaseObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseObjectType", propOrder = {
        "childBaseObjectTypes",
        "id",
        "name"
})
@XmlSeeAlso({
        HierarchyObjectType.class
})
public class BaseObjectType {

    @XmlElement(nillable = true)
    protected ChildBaseObjectType[] childBaseObjectTypes;
    protected Long id;
    @XmlElement(nillable = true)
    protected String name;

    /**
     * @return array of
     * {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType[] getChildBaseObjectTypes() {
        if (this.childBaseObjectTypes == null) {
            return new ChildBaseObjectType[0];
        }
        ChildBaseObjectType[] retVal = new ChildBaseObjectType[this.childBaseObjectTypes.length];
        System.arraycopy(this.childBaseObjectTypes, 0, retVal, 0, this.childBaseObjectTypes.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ChildBaseObjectType }
     */
    public void setChildBaseObjectTypes(ChildBaseObjectType[] values) {
        if (values == null) {
            this.childBaseObjectTypes = null;
            return;
        }
        int len = values.length;
        this.childBaseObjectTypes = ((ChildBaseObjectType[]) new ChildBaseObjectType[len]);
        for (int i = 0; (i < len); i++) {
            this.childBaseObjectTypes[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType getChildBaseObjectTypes(int idx) {
        if (this.childBaseObjectTypes == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.childBaseObjectTypes[idx];
    }

    public int getChildBaseObjectTypesLength() {
        if (this.childBaseObjectTypes == null) {
            return 0;
        }
        return this.childBaseObjectTypes.length;
    }

    /**
     * @param value allowed object is
     *              {@link ChildBaseObjectType }
     */
    public ChildBaseObjectType setChildBaseObjectTypes(int idx, ChildBaseObjectType value) {
        return this.childBaseObjectTypes[idx] = value;
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
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
