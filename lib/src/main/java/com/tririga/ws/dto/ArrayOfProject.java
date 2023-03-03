package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfProject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Project" type="{http://dto.ws.tririga.com}Project" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProject", propOrder = {
        "project"
})
public class ArrayOfProject {

    @XmlElement(name = "Project", nillable = true)
    protected Project[] project;

    /**
     * @return array of
     * {@link Project }
     */
    public Project[] getProject() {
        if (this.project == null) {
            return new Project[0];
        }
        Project[] retVal = new Project[this.project.length];
        System.arraycopy(this.project, 0, retVal, 0, this.project.length);
        return (retVal);
    }

    /**
     * @param values allowed objects are
     *               {@link Project }
     */
    public void setProject(Project[] values) {
        if (values == null) {
            this.project = null;
            return;
        }
        int len = values.length;
        this.project = ((Project[]) new Project[len]);
        for (int i = 0; (i < len); i++) {
            this.project[i] = values[i];
        }
    }

    /**
     * @return one of
     * {@link Project }
     */
    public Project getProject(int idx) {
        if (this.project == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.project[idx];
    }

    public int getProjectLength() {
        if (this.project == null) {
            return 0;
        }
        return this.project.length;
    }

    /**
     * @param value allowed object is
     *              {@link Project }
     */
    public Project setProject(int idx, Project value) {
        return this.project[idx] = value;
    }

}
