    package fabrica_ropa2;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Usuario {

    private String NombreUsuario;
    private String Password;        
    private String Nombre;
    private int ClaveTipo;

    public Usuario(String nNombreUsuario, String nPassword, String nNombre, int nClaveTipo) {
        this.NombreUsuario = nNombreUsuario;
        this.Password = nPassword;
        this.Nombre = nNombre;
                int ClaveTipo=nClaveTipo;
    }

    
    

    public int getClaveTipo() {
        return ClaveTipo;
    }

    

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getPassword1() {
        return Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public void setPassword1(String Password1) {
        this.Password = Password1;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setClaveTipo(int ClaveTipo) {
        this.ClaveTipo = ClaveTipo;
    }
    

    
   
       
    public int ValidaUsuario(String nNombreUsuario,
            char[] nPassword){
        int TipoUusario=0;
        try{
            File archivo=new File("Clientes.txt");
            if (archivo.exists()){
                BufferedReader BR = new BufferedReader(new FileReader ("Clientes.txt"));
                String linea;
               while((linea=BR.readLine())!=null) {
                   StringTokenizer st=new StringTokenizer(linea,",");
                   String NombreUsuario = st.nextToken().trim();
                   String Password1 = st.nextToken().trim();
                   char[] clave=Password1.toCharArray();
                   if((NombreUsuario.equals(nNombreUsuario))&&
                           (Arrays.equals(clave, nPassword))){
                   TipoUusario = Integer.parseInt(st.nextToken().trim());
               }
                   
            }        
                
            }else {
                JOptionPane.showMessageDialog(null, "El archivo de Clientes no existe");
            }
        }
            
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, "se ha producido un error");
                    }
        return TipoUusario;
        }
        
    
    
}
    
    
    
    

