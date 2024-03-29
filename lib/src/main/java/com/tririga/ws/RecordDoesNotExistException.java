package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.626+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "RecordDoesNotExistException", targetNamespace = "http://ws.tririga.com")
public class RecordDoesNotExistException extends java.lang.Exception {

    private com.tririga.ws.errors.RecordDoesNotExistException faultInfo;

    public RecordDoesNotExistException() {
        super();
    }

    public RecordDoesNotExistException(String message) {
        super(message);
    }

    public RecordDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordDoesNotExistException(String message, com.tririga.ws.errors.RecordDoesNotExistException recordDoesNotExistException) {
        super(message);
        this.faultInfo = recordDoesNotExistException;
    }

    public RecordDoesNotExistException(String message, com.tririga.ws.errors.RecordDoesNotExistException recordDoesNotExistException, Throwable cause) {
        super(message, cause);
        this.faultInfo = recordDoesNotExistException;
    }

    public com.tririga.ws.errors.RecordDoesNotExistException getFaultInfo() {
        return this.faultInfo;
    }
}
