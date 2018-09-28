package MetodoSAX;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class metodoSAX {

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
            Document document = builder.parse(fileIn);
            document.getDocumentElement().normalize();

            System.out.println("Elemento raiz: " + document.getDocumentElement().getElementsByTagName("Empleado"));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
