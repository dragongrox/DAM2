package Practica1.E2;

import Practica1.E1.Departamento;
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CrearXML_Departamentos {
    public static void leerString(ObjectInputStream objeto) {
        try {
            objeto.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        File fileIn = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E1\\Departamentos.dat");
        File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E2\\Departamentos.xml");

        FileInputStream fileInputStream = new FileInputStream(fileIn);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Source source;
        Result result;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Departamento", null);
            document.setXmlVersion("1.0");
            Departamento departamento1 = (Departamento) objectInputStream.readObject();
            Departamento departamento2 = (Departamento) objectInputStream.readObject();
            CrearDepartamento(departamento1, document, 1);
            CrearDepartamento(departamento2, document, 2);
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void CrearDepartamento(Departamento departamento, Document document, int numeroDep) {
        int ID;
        String tipo, nombre, domicilio, ciudad, cp, provincia, pais;

        ID = departamento.getID();
        tipo = departamento.getTipo();
        nombre = departamento.getNombre();
        domicilio = departamento.getDomicilio();
        ciudad = departamento.getCiudad();
        cp = departamento.getCp();
        provincia = departamento.getProvincia();
        pais = departamento.getPais();

        Element raiz = document.createElement("departamento" + numeroDep);
        document.getDocumentElement().appendChild(raiz);
        CrearElemento("ID", Integer.toString(ID), raiz, document);
        CrearElemento("tipo", tipo, raiz, document);
        CrearElemento("nombre", nombre, raiz, document);
        CrearElemento("domicilio", domicilio, raiz, document);
        CrearElemento("ciudad", ciudad, raiz, document);
        CrearElemento("cp", cp, raiz, document);
        CrearElemento("provincia", provincia, raiz, document);
        CrearElemento("pais", pais, raiz, document);
    }

    private static void CrearElemento(String id, String datoEmple, Element raiz, Document document) {
        Element element = document.createElement(id);
        Text text = document.createTextNode(datoEmple);
        raiz.appendChild(element);
        element.appendChild(text);
    }
}
