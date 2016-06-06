package fabrica_ropa2;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class DatosInventario {

    String CH1;
    String M1;
    String G1;
    String CH2;
    String M2;
    String G2;
    String CH3;
    String M3;
    String G3;
     public void  AgregarInventario(String c, String v, String g, String h, String i, String j, String k, String l, String m){
            try {
                PrintWriter p=new PrintWriter (new FileWriter ("Inventario.txt"));
    p.println(c+"," +v+"," +g+"," +h+"," +i+"," +j+"," +k+"," +l+"," +m+"," );
    p.close();
        JOptionPane.showMessageDialog(null, "se ha creado el inventario");
    
            } catch (Exception e) {
            }
     }
           
}
