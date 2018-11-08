package Practica1.E5;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class CrearHTML {
    public static void main(String args[]) {
        Source xml = new StreamSource(new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E2\\Departamentos.xml"));
        Source xslt = new StreamSource("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E5\\Departamentos.xsl");
        StringWriter sw = new StringWriter();

        try {

            FileWriter fileWriter = new FileWriter("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E5\\Departamentos.html");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(xslt);
            transformer.transform(xml, new StreamResult(sw));
            fileWriter.write(sw.toString());
            fileWriter.close();

            System.out
                    .println("Se ha generado el HTML");

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerFactoryConfigurationError e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
