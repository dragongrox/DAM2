package ejercicioClase05_10_2018;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class leerimpares {


    public static void main(String[] args) {
        XMLReader procesadorXML;
        try {
            procesadorXML = XMLReaderFactory.createXMLReader();

            GestionContenido gestor = new GestionContenido();
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

class GestionContenido extends DefaultHandler {
    boolean impar = false, swLibro = false;

    public GestionContenido() {
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
        if (nombre.equals("libro")) {
            for (int i = 0; i < atts.getLength(); i++) {
                if (atts.getQName(i).equals("ISBN")) {
                    if (Integer.parseInt(atts.getValue(i)) % 2 == 1) {
                        impar = true;
                    }
                }
            }
        }
        if (nombre.equals("titulo") && impar) {
            System.out.println();
            System.out.println("Titulo: ");
            swLibro = true;
        }
    }

    @Override
    public void endElement(String uri, String nombre, String nombreC) {
    }

    @Override
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll(" [\t \n] ", " ");
        car.trim();
        if (swLibro == true) {
            System.out.print(car);
            swLibro = false;
            impar = false;
        }

    }
}
