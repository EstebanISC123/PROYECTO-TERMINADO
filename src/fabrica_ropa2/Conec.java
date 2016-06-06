package fabrica_ropa2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conec {

    
    
   static String bd = "tareaDB";
    static String login = "root";
    static String password = "4839";
    static String url = "jdbc:mysql://localhost/" + bd;
    Connection coneccion = null;

    public Conec() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");

            //obtenemos la conexión
            coneccion = DriverManager.getConnection("jdbc:mysql://localhost/hilos?user=root&password =");
            
            if (coneccion != null) {
                System.out.println("Coneccion con DB exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }

    // Método que devuelve la referencia a la conexión
    public Connection getConnection() {
        return coneccion;
    }

    public void desconectar() {
        coneccion = null;
    }

}


