package fabrica_ropa2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Datos_Login extends javax.swing.JFrame {

    public Datos_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 69, 27));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 240, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 240, -1));

        jButton1.setText("Log in");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 240, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Cerrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 477, 68, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fabrica_ropa2/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
       int Valida=ValidaUsuario();
if(Valida==0){
    Texto T=new Texto();
   int a= T.Verificar(txtUsername.getText(), txtPassword.getText());
   if (a==1){    
   Entrada E=new Entrada();
        E.setVisible(true);
        this.setVisible(false);
        
    }else{
        JOptionPane.showMessageDialog(this, "Nombre y contrasena incorrectos");
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.requestFocus();
                }
    
}      else{
    JOptionPane.showMessageDialog(this, "Te falta ingresar algun dato ");
    if(Valida==2){
        txtPassword.requestFocus();
    
    }else{
        txtUsername.requestFocus();
    }
}







//        int Valida = validaForma();
//            if (Valida==0){
//                Usuario OUsuario = new Usuario();
//                
//            }
//        
        
        
//        int valida = validaForma();
//        if(valida == 0) {
//            Usuario objUsuario = new Usuario();
//            if(objUsuario.ValidaUsuario(txtUsername.getText(), txtPassword.getPassword()) != 0)
//            {
//                Entrada objMenu = new Entrada();
//                this.setVisible(false);
//                objMenu.setVisible(true);
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos");
//                txtUsername.setText("");
//                txtPassword.setText("");
//                txtUsername.requestFocus();
//            }
//        }
//        else {
//            JOptionPane.showMessageDialog(null, "El nombre de usuario y contraseña son requeridos");
//            if(valida == 2)
//                txtPassword.requestFocus();
//            else
//               txtUsername.requestFocus(); 
//        }
           
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code her
        Login LO=new Login ();
        LO.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
//         String Username="Esteban";
//        String password="1324";
//        
//        String S=new String (txtPassword.getText());
//        if (txtUsername.getText().equals(Username)&& S.equals(password)){
//            JOptionPane.showMessageDialog(this,"usuario y contraseña son correctos",null,JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/fabrica_Ropa2/ok.png"));
//            
//        }else
//                JOptionPane.showMessageDialog(this,"usuario y/o contraseña son incorrectos",null,JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/fabrica_Ropa2/stop.png"));
//
//    
//      setVisible(false);
        
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Login().setVisible(true);
            }
        });
    }
     public int validaForma() {
        int controlFalta = 0;
        //boolean correcto = false;
        
        if((txtUsername.getText().isEmpty()))
            controlFalta += 1;
        if((txtPassword.getPassword().length) == 0)
            controlFalta +=2;
        
        /*if(!(txtNomUsuario.getText().isEmpty()) && (txtPassword.getPassword().length) >0)
            correcto = true;*/
        
        return controlFalta;
    
     }
     
     public int ValidaUsuario(){
         
     int controlFalta=0;
     if ((txtUsername.getText().isEmpty())){
         controlFalta+=1;    
     }
     if((txtPassword.getText().isEmpty())){
         controlFalta+=2;
     }return controlFalta;
     }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
