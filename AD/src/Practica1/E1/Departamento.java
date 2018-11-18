package Practica1.E1;

import java.io.*;

public class Departamento implements Serializable {

    int ID;
    String tipo,nombre,domicilio,ciudad,cp,provincia,pais;

    public Departamento(int ID, String tipo, String nombre, String domicilio, String ciudad, String cp, String provincia, String pais) {
        this.ID = ID;
        this.tipo = tipo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.cp = cp;
        this.provincia = provincia;
        this.pais = pais;
    }

    public static void main(String[] args) {
        Departamento departamento1=new Departamento(1,"algo","departamento1","Almeria","Almeria","04004","Almeria","España");
        Departamento departamento2=new Departamento(2,"algo mas","departamento2","Murcia","Murcia","89764","Murcia","España");
        try {
            File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\Practica1\\E1\\Departamentos.dat");
            FileOutputStream fileOutputStream=new FileOutputStream(fileOut);
            ObjectOutputStream os = new ObjectOutputStream (fileOutputStream);
            os.writeObject(departamento1);
            os.writeObject(departamento1);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
