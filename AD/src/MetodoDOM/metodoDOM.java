package MetodoDOM;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class metodoDOM {
    public static String leerString(RandomAccessFile accessFile) throws IOException {
        String texto = "";
        byte caracter = 0;
        do {
            caracter = accessFile.readByte();
            if (caracter != -1) {
                texto = texto + (char) (caracter);
            }
        } while (caracter != -1);
        return texto;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\AleatorioEmple.dat");
        File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\Empleados.xml");

        RandomAccessFile file = new RandomAccessFile(fileIn, "r");

        Source source;
        Result result;

        int id, posicion;
        String dep, apellido;
        Double salario;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Empleados", null);
            document.setXmlVersion("1.0");
            id = 1;
            dep = "Informatica";
            apellido = "Shevchenko";
            salario = 1235.6;
            Element raiz = document.createElement("empleado");
            document.getDocumentElement().appendChild(raiz);
            CrearElemento("id", Integer.toString(id), raiz, document);
            CrearElemento("Dep", dep, raiz, document);
            CrearElemento("Apellido", apellido, raiz, document);
            CrearElemento("Salario", String.valueOf(salario), raiz, document);
            source = new DOMSource(document);
            result = new StreamResult(fileOut);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    private static void CrearElemento(String id, String datoEmple, Element raiz, Document document) {
        Element element = document.createElement(id);
        Text text = document.createTextNode(datoEmple);
        raiz.appendChild(element);
        element.appendChild(text);
    }
}
