package com.tririga.ws.dto.content;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.tririga.ws.dto.content package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tririga.ws.dto.content
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentField }
     */
    public ContentField createContentField() {
        return new ContentField();
    }

    /**
     * Create an instance of {@link InvalidDocumentTypeException }
     */
    public InvalidDocumentTypeException createInvalidDocumentTypeException() {
        return new InvalidDocumentTypeException();
    }

    /**
     * Create an instance of {@link Response }
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Content }
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link InvalidContentException }
     */
    public InvalidContentException createInvalidContentException() {
        return new InvalidContentException();
    }

}
