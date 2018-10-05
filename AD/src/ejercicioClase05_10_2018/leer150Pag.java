package ejercicioClase05_10_2018;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class leer150Pag {


    public static void main(String[] args) {
        XMLReader procesadorXML;
        try {
            procesadorXML = XMLReaderFactory.createXMLReader();

            GestionContenido150 gestor = new GestionContenido150();
            procesadorXML.setContentHandler(gestor);

            InputSource fileXML = new InputSource("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\ejercicioClase05_10_2018\\libros.xml");

            procesadorXML.parse(fileXML);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class GestionContenido150 extends DefaultHandler {
    String salida = "";
    boolean swLibros = false, sw150 = false;

    public GestionContenido150() {
        super();
    }

    @Override
    public void startDocument() {
    }

    @Override
    public void endDocument() {
    }

    @Override
    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
        for (int i = 0; i < atts.getLength(); i++) {
            if (atts.getQName(i).equals("ISBN"))
                salida = salida + "\nLibro " + atts.getValue(i);
        }
        if (nombre.equals("paginas"))
            swLibros = true;
    }

    @Override
    public void endElement(String uri, String nombre, String nombreC) {
        if (nombre.equals("editorial")) {
            if (sw150)
                System.out.println(salida);
            sw150 = false;
            salida = "";
        }

    }

    @Override
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll(" [\t \n] ", " ");
        car.trim();
        salida = salida + car;
        if (swLibros == true) {
            if (Integer.parseInt(car) > 150) {
                sw150 = true;
                swLibros = false;
            } else
                swLibros = false;
        }


    }
}
