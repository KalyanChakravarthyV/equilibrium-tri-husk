package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfObjectTypeActionStep complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfObjectTypeActionStep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectTypeActionStep" type="{http://dto.ws.tririga.com}ObjectTypeActionStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectTypeActionStep", propOrder = {
        "objectTypeActionStep"
})
public class ArrayOfObjectTypeActionStep {

    @XmlElement(name = "ObjectTypeActionStep", nillable = true)
    protected ObjectTypeActionStep[] objectTypeActionStep;

    /**
     * @return array of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep[] getObjectTypeActionStep() {
        if (this.objectTypeActionStep == null) {
            return new ObjectTypeActionStep[0];
        }
        ObjectTypeActionStep[] retVal = new ObjectTypeActionStep[this.objectTypeActionStep.length];
        System.arraycopy(this.objectTypeActionStep, 0, retVal, 0, this.objectTypeActionStep.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link ObjectTypeActionStep }
     */
    public void setObjectTypeActionStep(ObjectTypeActionStep[] values) {
        if (values == null) {
            this.objectTypeActionStep = null;
            return;
        }
        int len = values.length;
        this.objectTypeActionStep = ((ObjectTypeActionStep[]) new ObjectTypeActionStep[len]);
        for (int i = 0; (i < len); i++) {
            this.objectTypeActionStep[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep getObjectTypeActionStep(int idx) {
        if (this.objectTypeActionStep == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.objectTypeActionStep[idx];
    }

    public int getObjectTypeActionStepLength() {
        if (this.objectTypeActionStep == null) {
            return 0;
        }
        return this.objectTypeActionStep.length;
    }

    /**
     * @param value allowed object is
     *              {@link ObjectTypeActionStep }
     */
    public ObjectTypeActionStep setObjectTypeActionStep(int idx, ObjectTypeActionStep value) {
        return this.objectTypeActionStep[idx] = value;
    }

}
