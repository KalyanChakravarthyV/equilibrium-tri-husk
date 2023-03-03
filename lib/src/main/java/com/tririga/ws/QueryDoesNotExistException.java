package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.747+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "QueryDoesNotExistException", targetNamespace = "http://ws.tririga.com")
public class QueryDoesNotExistException extends java.lang.Exception {

    private com.tririga.ws.errors.QueryDoesNotExistException faultInfo;

    public QueryDoesNotExistException() {
        super();
    }

    public QueryDoesNotExistException(String message) {
        super(message);
    }

    public QueryDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryDoesNotExistException(String message, com.tririga.ws.errors.QueryDoesNotExistException queryDoesNotExistException) {
        super(message);
        this.faultInfo = queryDoesNotExistException;
    }

    public QueryDoesNotExistException(String message, com.tririga.ws.errors.QueryDoesNotExistException queryDoesNotExistException, Throwable cause) {
        super(message, cause);
        this.faultInfo = queryDoesNotExistException;
    }

    public com.tririga.ws.errors.QueryDoesNotExistException getFaultInfo() {
        return this.faultInfo;
    }
}
