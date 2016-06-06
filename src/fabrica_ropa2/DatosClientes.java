package fabrica_ropa2;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class DatosClientes {

    String Nombre;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String Telefono;
    String Domiciio;
    
    public void AgregarCliente(String Nom, String ApellidoP, String ApellidoM, String Tel, String Dom){
        try {
            PrintWriter P=new PrintWriter(new FileWriter("Clientes.txt"));
            P.println(Nom+"," +ApellidoP+"," +ApellidoM+"," +Tel+"," +Dom+"," );
            P.close();
            JOptionPane.showMessageDialog(null, "Has creado un nuevo cliente");
        } catch (Exception e) {
        }
    }
}
