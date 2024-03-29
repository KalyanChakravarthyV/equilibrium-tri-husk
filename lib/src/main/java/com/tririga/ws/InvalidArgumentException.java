package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.602+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "InvalidArgumentException", targetNamespace = "http://ws.tririga.com")
public class InvalidArgumentException extends java.lang.Exception {

    private com.tririga.ws.errors.InvalidArgumentException faultInfo;

    public InvalidArgumentException() {
        super();
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArgumentException(String message, com.tririga.ws.errors.InvalidArgumentException invalidArgumentException) {
        super(message);
        this.faultInfo = invalidArgumentException;
    }

    public InvalidArgumentException(String message, com.tririga.ws.errors.InvalidArgumentException invalidArgumentException, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidArgumentException;
    }

    public com.tririga.ws.errors.InvalidArgumentException getFaultInfo() {
        return this.faultInfo;
    }
}
