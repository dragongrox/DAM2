package MetodoDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class metodoDOMleerXML {
    public static void main(String[] args) {
        File fileIn = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\Empleados.xml");
        File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\MetodoDOM\\EmpleadosBin.bin");

        Document document;
        DocumentBuilder builder;
        NodeList empleados;
        Node emple;

        ArrayList campos = new ArrayList();


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(fileIn);
            document.getDocumentElement().normalize();

            empleados = document.getElementsByTagName("empleado");

            for (int i = 0; i < empleados.getLength(); i++) {
                emple = empleados.item(i);
                if (emple.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) emple;
                    campos.add(getNodo("id", elemento));
                    campos.add(getNodo("Dep", elemento));
                    campos.add(getNodo("Apellido", elemento));
                    campos.add(getNodo("Salario", elemento));
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("No se encontro la etiqueta");
        }

        System.out.println(campos.toString());
    }

    private static String getNodo(String etiqueta, Element elem) {
        NodeList nodo = elem.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node valornodo = (Node) nodo.item(0);
        return valornodo.getNodeValue();
    }
}
