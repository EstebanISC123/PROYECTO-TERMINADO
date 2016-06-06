package fabrica_ropa2;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Listado_Clientes extends javax.swing.JFrame {
    public Listado_Clientes() {
        initComponents();
         iniciarTabla();
        this.setLocationRelativeTo(null);

    }
     class tabla1 extends Thread {
    
    public void run() {

            //se borra el contenido de la tabla
            try {
                int filas = modelo.getRowCount();
                for (int i = 0; filas > i; i++) {
                    modelo.removeRow(0);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

            //se agregan los datos
            Process cargar = new Process();
            ArrayList<User> arrUser = cargar.obtenUser();
            while (!arrUser.isEmpty()) {
                User x = arrUser.remove(0);
                modelo.addRow(x.getRow());
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    class tabla2 extends Thread {

        public void run() {

            //se borra el contenido de la tabla
            try {
                int filas = modelo2.getRowCount();
                for (int i = 0; filas > i; i++) {
                    modelo2.removeRow(0);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

            //se agregan los datos
            Process cargar = new Process();
            ArrayList<User> arrUser = cargar.obtenUser();
            while (!arrUser.isEmpty()) {
                User x = arrUser.remove(0);
                modelo2.addRow(x.getRow());
                try {
                    sleep(800);
                } catch (InterruptedException e) {
                }
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumnos2 = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        tblAlumnos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAlumnos2);

        txtid.setText("id");

        txtNombre.setText("Nombre");

        txtCorreo.setText("Correo");

        jButton1.setText("Agregar a la BD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar en Tablas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(txtNombre)
                            .addGap(18, 18, 18)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)
                            .addComponent(jButton1)
                            .addGap(56, 56, 56)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Process agregar = new Process();
        User x = new User();
        x.setId(Integer.valueOf(txtid.getText()));
        x.setNombre(txtNombre.getText());
        x.setCorreo(txtCorreo.getText());
        agregar.agregarUsuario(x);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new tabla1().start();
        new tabla2().start();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado_Clientes().setVisible(true);
                
            }
        });
    }
DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();

    void iniciarTabla() {

        String encabezado[] = {"id", "Nombre", "Correo"};

        modelo.setColumnIdentifiers(encabezado);
        tblAlumnos.setModel(modelo);
        
        modelo2.setColumnIdentifiers(encabezado);
        tblAlumnos2.setModel(modelo2);
       }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTable tblAlumnos2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
