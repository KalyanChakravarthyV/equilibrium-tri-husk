package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.727+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "InvalidContentException", targetNamespace = "http://ws.tririga.com")
public class InvalidContentException extends java.lang.Exception {

    private com.tririga.ws.dto.content.InvalidContentException faultInfo;

    public InvalidContentException() {
        super();
    }

    public InvalidContentException(String message) {
        super(message);
    }

    public InvalidContentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidContentException(String message, com.tririga.ws.dto.content.InvalidContentException invalidContentException) {
        super(message);
        this.faultInfo = invalidContentException;
    }

    public InvalidContentException(String message, com.tririga.ws.dto.content.InvalidContentException invalidContentException, Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidContentException;
    }

    public com.tririga.ws.dto.content.InvalidContentException getFaultInfo() {
        return this.faultInfo;
    }
}
