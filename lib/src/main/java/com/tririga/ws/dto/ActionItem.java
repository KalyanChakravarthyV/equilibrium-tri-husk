package com.tririga.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionItem", propOrder = {
        "taskId",
        "workflowId"
})
public class ActionItem {

    protected long taskId;
    protected long workflowId;

    /**
     * Gets the value of the taskId property.
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the workflowId property.
     */
    public long getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     */
    public void setWorkflowId(long value) {
        this.workflowId = value;
    }

}
