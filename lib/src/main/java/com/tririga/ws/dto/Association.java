package com.tririga.ws.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Association complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Association"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dto.ws.tririga.com}AssociationDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associatedRecordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="associatedRecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="associationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="reverseAssociationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Association", propOrder = {
        "rest"
})
public class Association
        extends AssociationDefinition {

    @XmlElementRefs({
            @XmlElementRef(name = "associatedRecordId", namespace = "http://dto.ws.tririga.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "associatedRecordName", namespace = "http://dto.ws.tririga.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "associationName", namespace = "http://dto.ws.tririga.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "recordId", namespace = "http://dto.ws.tririga.com", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "reverseAssociationName", namespace = "http://dto.ws.tririga.com", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Gets the rest of the content model.
     *
     * <p>
     * You are getting this "catch-all" property because of the following reason:
     * The field name "AssociationName" is used by two different parts of a schema. See:
     * line 1133 of file:/Users/kv-root/IdeaProjects/Tririga_ApacheCXF/wsdls/UpdatedTririgaWS.wsdl
     * line 1652 of file:/Users/kv-root/IdeaProjects/Tririga_ApacheCXF/wsdls/UpdatedTririgaWS.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one
     * of both of the following declarations to change their names:
     * Gets the value of the rest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public List<JAXBElement<? extends Serializable>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.rest;
    }

}
