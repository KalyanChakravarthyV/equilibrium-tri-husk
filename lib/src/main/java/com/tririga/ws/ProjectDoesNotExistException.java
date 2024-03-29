package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.667+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "ProjectDoesNotExistException", targetNamespace = "http://ws.tririga.com")
public class ProjectDoesNotExistException extends java.lang.Exception {

    private com.tririga.ws.errors.ProjectDoesNotExistException faultInfo;

    public ProjectDoesNotExistException() {
        super();
    }

    public ProjectDoesNotExistException(String message) {
        super(message);
    }

    public ProjectDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectDoesNotExistException(String message, com.tririga.ws.errors.ProjectDoesNotExistException projectDoesNotExistException) {
        super(message);
        this.faultInfo = projectDoesNotExistException;
    }

    public ProjectDoesNotExistException(String message, com.tririga.ws.errors.ProjectDoesNotExistException projectDoesNotExistException, Throwable cause) {
        super(message, cause);
        this.faultInfo = projectDoesNotExistException;
    }

    public com.tririga.ws.errors.ProjectDoesNotExistException getFaultInfo() {
        return this.faultInfo;
    }
}
