package Practica1.E3_4;

import Practica1.E1.Departamento;
import com.thoughtworks.xstream.XStream;

import java.io.*;


public class CrearXMLXStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fileIn = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E1\\Departamentos.dat");
        File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\main\\java\\Practica1\\E3_4\\Departamentos.xml");
        FileInputStream fileInputStream = new FileInputStream(fileIn);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut));

        Departamento departamento1 = (Departamento) objectInputStream.readObject();
        Departamento departamento2 = (Departamento) objectInputStream.readObject();
        String XML = convertirAXML(departamento1);
        XML += convertirAXML(departamento2);
        System.out.println(XML);
        bufferedWriter.write(XML);
    }

    public static String convertirAXML(final Departamento departamento) {
        XStream xstream = new XStream();
        xstream.alias("Departamento", departamento.getClass());
        return xstream.toXML(departamento);
    }
}
