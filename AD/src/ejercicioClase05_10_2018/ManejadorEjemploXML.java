package ejercicioClase05_10_2018;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ManejadorEjemploXML extends DefaultHandler {

    public static void main(String[] args) {

        try {
            // Creamos la factoria de parseadores por defecto
            XMLReader reader = XMLReaderFactory.createXMLReader();
            // Añadimos nuestro manejador al reader
            reader.setContentHandler(new ManejadorEjemploXML());
            // Procesamos el xml de ejemplo
            reader.parse(new InputSource(new FileInputStream("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\ejercicioClase05_10_2018\\libros.xml")));
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("\nPrincipio del documento...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("\nFin del documento...");
    }

    @Override
    public void startElement(String uri, String localName, String name,
                             Attributes attributes) throws SAXException {
        System.out.println("\nProcesando etiqueta...");
        System.out.println("\tNamespace uri: " + uri);
        System.out.println("\tNombre: " + localName);
        System.out.println("\tNombre con prefijo: " + name);

        //Recorremos los atributos
        System.out.println("\tProcesando " + attributes.getLength() + " atributos...");
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("\t\tNombre: " + attributes.getQName(i));
            System.out.println("\t\tValor: " + attributes.getValue(i));
        }

        // También podemos obtener los atributos por nombre
        String valorId = attributes.getValue("id");
        if (valorId != null) {
            System.out.println("\tId: " + valorId);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        System.out.println("\nProcesando texto dentro de una etiqueta... ");
        System.out.println("\tTexto: " + String.valueOf(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {
        System.out.println("\nFin de etiqueta...");
        System.out.println("\tNamespace uri: " + uri);
        System.out.println("\tNombre: " + localName);
        System.out.println("\tNombre con prefijo: " + name);
    }

}
