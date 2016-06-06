package fabrica_ropa2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Process {

     public void agregarUsuario(User user) {
        Conec2 conn = new Conec2();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO tablauser VALUES('" + user.Id + "', '" + user.Nombre+ "', '" + user.Correo+  "')";
            consulta.executeUpdate(sql);
            System.out.println("Usuario registrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

    public ArrayList<User> obtenUser() {
        ArrayList<User> arrUser = new ArrayList<>();
        Conec2 conn = new Conec2();
        String sql = "SELECT * FROM tablauser";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                User user = new User(rs.getInt("ID"),rs.getString("Nombre"), rs.getString("Correo") );
                arrUser.add(user);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrUser;
    }

    
}
