package fabrica_ropa2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Texto  {
    
    String Usuario;
    String Contrasena;
    String Nombre;
    int Tipo_de_Usuario;
    
    public void GuardarEmpleado(String Usuario, String Contras ){
        
        try {
            PrintWriter P=new PrintWriter(new FileWriter("Usuarios.txt"));
            P.println(Usuario +"," +Contras+"," );   
            P.close();
            JOptionPane.showMessageDialog(null, "creaste un nuevo USUARIO");
            
        }
catch (Exception e){}    
    }

 public int Verificar(String Usuario, String Contrase){
int Tipo=0;
     try {
            BufferedReader BR=new BufferedReader(new FileReader("Usuarios.txt"));
            String linea;
            while((linea=BR.readLine())!=null){
                StringTokenizer st =new StringTokenizer(linea, ",");
                String NUsuario=st.nextToken().trim();
                String NContrase=st.nextToken().trim();
                if(Usuario.equals(NUsuario)&& Contrase.equals(NContrase)){
                    //Tipo=Integer.parseInt(st.nextToken().trim());
                    //JOptionPane.sh
                   Tipo+=1;
      JOptionPane.showMessageDialog(null, "felicicdades");

                }
            }
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "error en alguna parte" +e);
     }return Tipo;
     
 }
    
    
}
