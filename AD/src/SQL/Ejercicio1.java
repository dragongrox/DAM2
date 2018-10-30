package SQL;

import java.sql.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "usuario");

            DatabaseMetaData metaData = connection.getMetaData();

            ResultSet resultSet = metaData.getTables(null, null, null, null);

            String nombre = metaData.getDatabaseProductName();
            String driver = metaData.getDriverName();
            String url = metaData.getURL();
            String usuario = metaData.getUserName();

            System.out.println("Nombre: " + nombre);
            System.out.println("Driver: " + driver);
            System.out.println("URL: " + url);
            System.out.println("Usuario: " + usuario);

            System.out.println();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
