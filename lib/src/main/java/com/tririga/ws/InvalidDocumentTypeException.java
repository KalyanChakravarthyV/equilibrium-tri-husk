package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.743+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "InvalidDocumentTypeException", targetNamespace = "http://ws.tririga.com")
public class InvalidDocumentTypeException extends java.lang.Exception {

    private com.tririga.ws.dto.content.InvalidDocumentTypeException faultInfo;

    public InvalidDocumentTypeException() {
        super();
    }

    public InvalidDocumentTypeException(String message) {
        super(message);
    }

    public InvalidDocumentTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDocumentTypeException(String message, com.tririga.ws.dto.content.InvalidDocumentTypeException invalidDocumentTypeException) {
        super(message);
        this.faultInfo = invalidDocumentTypeException;
    }

    public InvalidDocumentTypeException(String message, com.tririga.ws.dto.content.InvalidDocumentTypeException invalidDocumentTypeException, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidDocumentTypeException;
    }

    public com.tririga.ws.dto.content.InvalidDocumentTypeException getFaultInfo() {
        return this.faultInfo;
    }
}
