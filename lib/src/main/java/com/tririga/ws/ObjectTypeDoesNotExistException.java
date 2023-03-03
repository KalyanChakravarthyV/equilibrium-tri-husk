package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.567+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "ObjectTypeDoesNotExistException", targetNamespace = "http://ws.tririga.com")
public class ObjectTypeDoesNotExistException extends java.lang.Exception {

    private com.tririga.ws.errors.ObjectTypeDoesNotExistException faultInfo;

    public ObjectTypeDoesNotExistException() {
        super();
    }

    public ObjectTypeDoesNotExistException(String message) {
        super(message);
    }

    public ObjectTypeDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectTypeDoesNotExistException(String message, com.tririga.ws.errors.ObjectTypeDoesNotExistException objectTypeDoesNotExistException) {
        super(message);
        this.faultInfo = objectTypeDoesNotExistException;
    }

    public ObjectTypeDoesNotExistException(String message, com.tririga.ws.errors.ObjectTypeDoesNotExistException objectTypeDoesNotExistException, Throwable cause) {
        super(message, cause);
        this.faultInfo = objectTypeDoesNotExistException;
    }

    public com.tririga.ws.errors.ObjectTypeDoesNotExistException getFaultInfo() {
        return this.faultInfo;
    }
}
