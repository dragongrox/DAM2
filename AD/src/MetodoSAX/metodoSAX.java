package MetodoSAX;


import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class metodoSAX {

    public static void main(String[] args) {
        XMLReader procesadorXML;

        try {
            procesadorXML = XMLReaderFactory.createXMLReader();

            GestionContenido gestor = new GestionContenido();
            procesadorXML.setContentHandler(gestor);
            InputSource fileXML = new InputSource("c:\\ad\\ud2\\alumnos.xml");
            procesadorXML.parse(fileXML);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class GestionContenido extends DefaultHandler {
    public GestionContenido() {
        super();
    }

    public void startDocument() {
        System.out.println("Comienzo del Document o XML");
    }

    @Override
    public void endDocument() {
        System.out.println("Final del Document o XML");
    }

    @Override
    public void startElement(String uri, String nombre,
                             String nombreC, Attributes atts) {
        System.out.println("\t Principio Elemento: " + nombre);
    }

    @Override
    public void endElement(String uri, String nombre, String nombreC) {
        System.out.println("\t Fin Elemento: " + nombre);
    }

    @Override
    public void characters(char[] ch, int inicio, int longitud)
            throws SAXException {
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll(" [\t \n] ", " ");
        System.out.println(" \t Caracteres: " + car);
    }
}
