package ejercicioClase28_09_2018;

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
import java.io.*;

public class ejercicioClase {
    public static void CrearFichAccesoAleatorio(String ruta, String contenido) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile(ruta, "rw");
        accessFile.writeBytes(contenido);
    }

    public static void CrearFich(String ruta, String contenido) throws IOException {
        FileWriter fileWriter = new FileWriter(ruta);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(contenido);
        bufferedWriter.close();
    }

    private static void CrearElemento(String id, String datoEmple, Element raiz, Document document) {
        Element element = document.createElement(id);
        Text text = document.createTextNode(datoEmple);
        raiz.appendChild(element);
        element.appendChild(text);
    }

    public static void main(String[] args) throws IOException {
        String ruta = "C:\\Pruebas\\numerosAA.dat", destino = "C:\\Pruebas\\numeros.XML";
        //CrearFichAccesoAleatorio(ruta,"1\n2\n3\n4\n5\n6\n");
        CrearFich(ruta, "1\n2\n3\n4\n5\n");

        File fileIn = new File(ruta);
        File fileOut = new File(destino);

        RandomAccessFile file = new RandomAccessFile(fileIn, "r");
        BufferedReader fich = new BufferedReader(new FileReader(fileIn));

        Source source;
        Result result;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "numeros", null);
            document.setXmlVersion("1.0");
            /*do {
                CrearElemento("numero", file.readLine(), raiz, document);
            }while (file.getFilePointer()<file.length());*/
            do {
                Element element = document.createElement("numero");
                Text text = document.createTextNode(fich.readLine());
                document.getDocumentElement().appendChild(element);
                element.appendChild(text);
            } while (fich.ready());

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
}
