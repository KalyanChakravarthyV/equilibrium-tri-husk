package com.tririga.ws.dto.gui;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.tririga.ws.dto.gui package.
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tririga.ws.dto.gui
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tab }
     */
    public Tab createTab() {
        return new Tab();
    }

    /**
     * Create an instance of {@link Field }
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Section }
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link GuiRow }
     */
    public GuiRow createGuiRow() {
        return new GuiRow();
    }

    /**
     * Create an instance of {@link GUI }
     */
    public GUI createGUI() {
        return new GUI();
    }

}
