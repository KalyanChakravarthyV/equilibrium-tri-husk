package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-30T12:18:29.646+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "ModuleDoesNotExistException", targetNamespace = "http://ws.tririga.com")
public class ModuleDoesNotExistException extends java.lang.Exception {

    private com.tririga.ws.errors.ModuleDoesNotExistException faultInfo;

    public ModuleDoesNotExistException() {
        super();
    }

    public ModuleDoesNotExistException(String message) {
        super(message);
    }

    public ModuleDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModuleDoesNotExistException(String message, com.tririga.ws.errors.ModuleDoesNotExistException moduleDoesNotExistException) {
        super(message);
        this.faultInfo = moduleDoesNotExistException;
    }

    public ModuleDoesNotExistException(String message, com.tririga.ws.errors.ModuleDoesNotExistException moduleDoesNotExistException, Throwable cause) {
        super(message, cause);
        this.faultInfo = moduleDoesNotExistException;
    }

    public com.tririga.ws.errors.ModuleDoesNotExistException getFaultInfo() {
        return this.faultInfo;
    }
}
