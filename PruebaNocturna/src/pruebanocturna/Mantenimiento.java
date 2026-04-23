package pruebanocturna;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Mantenimiento extends javax.swing.JFrame {
   ArrayList<Usuario> lista = new ArrayList<>();
    DefaultTableModel modelo;

    public Mantenimiento() {
        initComponents();
        modelo = (DefaultTableModel) tblUsuarios.getModel(); 

        modelo.setColumnIdentifiers(new Object[]{"Usuario", "Contraseña", "Nombre", "Estado"});
        cargarXML();
        llenarTabla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        ShowP1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));

        tblUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        tblUsuarios.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsuariosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("USER:");

        txtUsuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("NAME:");

        txtPassword.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("STATUS:");

        cmbEstado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "INACTIVE" }));
        cmbEstado.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cmbEstadoComponentAdded(evt);
            }
        });
        cmbEstado.addActionListener(this::cmbEstadoActionPerformed);

        ShowP1.setText("SEE PASSWORD");
        ShowP1.addActionListener(this::ShowP1ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowP1))
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowP1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnGuardar.setText("SAVE");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnDelete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(this::btnDeleteActionPerformed);

        btnNuevo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnNuevo.setText("CLEAR AND NEW");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnAgregar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnAgregar.setText("ADD");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);

        btnLogOut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(this::btnLogOutActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo)
                    .addComponent(btnDelete)
                    .addComponent(btnLogOut))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("USER MAINTENANCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(516, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
int fila = tblUsuarios.getSelectedRow();
    
    if (fila == -1) {
        return; 
    }

   
    String userSeleccionado = modelo.getValueAt(fila, 0).toString();

    if (userSeleccionado.equals("dflores")) {
        
        cmbEstado.setSelectedItem("ACTIVE"); 
        JOptionPane.showMessageDialog(this, "El administrador dflores no se puede modificar ni inactivar.");
        return; 
    }
    }//GEN-LAST:event_cmbEstadoActionPerformed

    
    
    
    
    private void cmbEstadoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cmbEstadoComponentAdded
      
    }//GEN-LAST:event_cmbEstadoComponentAdded

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
String user = txtUsuario.getText().trim();
    String pass = new String(txtPassword.getPassword());
    String nom = txtNombre.getText();
    String est = cmbEstado.getSelectedItem().toString();

   
    if (user.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El usuario y la contraseña son obligatorios.");
        return;
    }

    
    if (usuarioYaExiste(user)) {
        JOptionPane.showMessageDialog(this, "Error: El usuario '" + user + "' ya está registrado. Intente con otro.");
        return; 
    }

    
    if (validarContraseña(pass)) {
        lista.add(new Usuario(user, pass, nom, est));
        guardarXML();
        llenarTabla();
        limpiarCampos();
        JOptionPane.showMessageDialog(this, "¡Usuario registrado con éxito!");
    }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
limpiarCampos();
        txtUsuario.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
int fila = tblUsuarios.getSelectedRow();
    
    
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario de la tabla.");
        return;
    }

   
    Usuario u = lista.get(fila);

   
    if (u.user.equals("dflores")) {
        JOptionPane.showMessageDialog(this, "El administrador raíz no puede ser modificado.");
        return;
    }

   
    String nuevoNombre = txtNombre.getText().trim(); 
    String nuevoEstado = cmbEstado.getSelectedItem().toString();
    String nuevaPass   = txtPassword.getText().trim(); 


    u.nombre = nuevoNombre; 
    u.estado = nuevoEstado;
    u.password = nuevaPass; 
    modelo.setValueAt(nuevaPass, fila, 1); 
    modelo.setValueAt(nuevoNombre, fila, 2); 
    modelo.setValueAt(nuevoEstado, fila, 3); 
    guardarXML();

    JOptionPane.showMessageDialog(this, "¡Cambios guardados con éxito!");
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int fila = tblUsuarios.getSelectedRow();
    

    if (fila < 0) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un usuario de la tabla para eliminarlo.");
        return;
    }

    String userSeleccionado = modelo.getValueAt(fila, 0).toString();

   
    if (userSeleccionado.equals("dflores")) {
        JOptionPane.showMessageDialog(this, "El administrador dflores es vital para el sistema y no puede ser eliminado.");
        return;
    }

  
    int respuesta = JOptionPane.showConfirmDialog(this, 
            "¿Está seguro de que desea eliminar al usuario: " + userSeleccionado + "?", 
            "Confirmar eliminación", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);

    if (respuesta == JOptionPane.YES_OPTION) {
        lista.remove(fila); 
        guardarXML();    
        llenarTabla();      
        JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");
    }        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ShowP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowP1ActionPerformed
        if(ShowP1.isSelected())
        {
            txtPassword.setEchoChar((char)0); 
        }
        else
        {
            txtPassword.setEchoChar('*'); 
        }        
    }//GEN-LAST:event_ShowP1ActionPerformed

    private void tblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMousePressed
    int fila = tblUsuarios.getSelectedRow();
    
    if (fila != -1) {
        try {
          
            String user   = tblUsuarios.getValueAt(fila, 0).toString(); // Usuario
            String pass   = tblUsuarios.getValueAt(fila, 1).toString(); // Contraseña
            String nombre = tblUsuarios.getValueAt(fila, 2).toString(); // Nombre
            String estado = tblUsuarios.getValueAt(fila, 3).toString(); // Estado

           
            txtUsuario.setText(user);
            txtPassword.setText(pass);
            txtNombre.setText(nombre);
            cmbEstado.setSelectedItem(estado);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    
    }

        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tblUsuariosMousePressed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
new LogIn().setVisible(true);
        dispose();
                // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    
    
    
    
    //Metodos de Apoyo
    private void limpiarCampos() {
        txtUsuario.setText("");
        txtPassword.setText("");
        txtNombre.setText("");
        cmbEstado.setSelectedIndex(0);
    }

    private void guardarXML() {
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("datos_usuarios.xml")))) {
            encoder.writeObject(lista);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void cargarXML() {
        try {
            File archivo = new File("datos_usuarios.xml");
            if (archivo.exists()) {
                try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(archivo)))) {
                    lista = (ArrayList<Usuario>) decoder.readObject();
                }
            }
        } catch (Exception e) {
            lista = new ArrayList<>();
        }

        // Validación Admin Fijo
        boolean adminExiste = false;
        for (Usuario u : lista) {
            if (u.user.equals("dflores")) {
                adminExiste = true;
                u.estado = "ACTIVE"; 
                break;
            }
        }
        if (!adminExiste) {
            lista.add(new Usuario("dflores", "AmohacerDeriv*d*s", "Admin dflores", "ACTIVE"));
            guardarXML();
        }
    }

    private void llenarTabla() {
        modelo.setRowCount(0);
        for (Usuario u : lista) {
            modelo.addRow(new Object[]{u.user, u.password, u.nombre, u.estado});
        }
    }

    private boolean validarContraseña(String pass) {
        if (pass.length() < 13) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 13 caracteres.");
            return false;
        }
        if (pass.equals(pass.toLowerCase())) {
            JOptionPane.showMessageDialog(this, "Debe tener al menos una MAYÚSCULA.");
            return false;
        }
        boolean tieneEspecial = false;
        for (char c : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                tieneEspecial = true;
                break;
            }
        }
        if (!tieneEspecial) {
            JOptionPane.showMessageDialog(this, "Debe tener un signo especial.");
            return false;
        }
        return true;
    }

    
    private boolean usuarioYaExiste(String nombreUsuario) {
    for (Usuario u : lista) {
        if (u.user.equalsIgnoreCase(nombreUsuario)) {
            return true; // Encontró una coincidencia
        }
    }
    return false; // No existe
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Mantenimiento().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ShowP1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

//
    
} 

