package Practica1.E1;

import java.io.*;

public class Departamento implements Serializable {

    int ID;
    String tipo, nombre, domicilio, ciudad, cp, provincia, pais;

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
        Departamento departamento1 = new Departamento(1, "algo", "departamento1", "Almeria", "Almeria", "04004", "Almeria", "España");
        Departamento departamento2 = new Departamento(2, "algo mas", "departamento2", "Murcia", "Murcia", "89764", "Murcia", "España");
        try {
            File fileOut = new File("C:\\Users\\drago\\IdeaProjects\\DAM2\\AD\\src\\Practica1\\E1\\Departamentos.dat");
            FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(departamento1);
            os.writeObject(departamento2);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
