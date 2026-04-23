package pruebanocturna;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ReinicioClave extends javax.swing.JFrame {
    private String usuarioRecibido;
    private ArrayList<Usuario> lista = new ArrayList<>();
    /**
     * Creates new form ReinicioClave
     * @param userIn
     */
    public ReinicioClave(String userIn) {
  initComponents();
        this.usuarioRecibido = userIn; 
        this.setLocationRelativeTo(null);
        cargarXML();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewPass = new javax.swing.JPasswordField();
        OldPass = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShowP1 = new javax.swing.JRadioButton();
        ShowP2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));

        NewPass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        OldPass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        btnReset.setBackground(new java.awt.Color(153, 255, 153));
        btnReset.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(this::btnResetActionPerformed);

        btnCancelar.setBackground(new java.awt.Color(153, 255, 153));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnCancelar.setText("CANCEL");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("ACTUAL PASSWORD:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("NEW PASSWORD:");

        ShowP1.setText("SEE PASSWORD");
        ShowP1.addActionListener(this::ShowP1ActionPerformed);

        ShowP2.setText("SEE PASSWORD");
        ShowP2.addActionListener(this::ShowP2ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(OldPass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowP1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowP2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowP1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowP2))
                .addGap(50, 50, 50)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("CHANGE PASSWORD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    cargarXML(); 
    String passViejaDigitada = new String(OldPass.getPassword()).trim();
    String passNuevaDigitada = new String(NewPass.getPassword()).trim();
    Usuario uActual = null; 
    for (Usuario u : lista) {
        if (u.user.trim().equalsIgnoreCase(usuarioRecibido.trim())) {
            uActual = u; 
            break;
        }
    }

    if (uActual == null || !uActual.password.trim().equals(passViejaDigitada)) {
        JOptionPane.showMessageDialog(this, "La contraseña actual (OldPass) es incorrecta.");
        return;
    }

    if (passNuevaDigitada.equals(passViejaDigitada)) {
        JOptionPane.showMessageDialog(this, "La nueva contraseña no puede ser igual a la anterior.");
        return;
    }

    if (validarContraseña(passNuevaDigitada)) {
        uActual.password = passNuevaDigitada; 
        guardarXML();              
        
        JOptionPane.showMessageDialog(this, "¡Contraseña actualizada con éxito!");       
        new LogIn().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ShowP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowP1ActionPerformed
        if(ShowP1.isSelected())
        {
            OldPass.setEchoChar((char)0);
        }
        else
        {
            OldPass.setEchoChar('*'); 
        }       
    }//GEN-LAST:event_ShowP1ActionPerformed

    private void ShowP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowP2ActionPerformed
        
if(ShowP1.isSelected())
        {
            NewPass.setEchoChar((char)0); 
        }
        else
        {
            NewPass.setEchoChar('*');
        }      


// TODO add your handling code here:
    }//GEN-LAST:event_ShowP2ActionPerformed

private void cargarXML() {
        try {
            File archivo = new File("datos_usuarios.xml");
            if (archivo.exists()) {
                try (var decoder = new java.beans.XMLDecoder(new java.io.BufferedInputStream(new java.io.FileInputStream(archivo)))) {
                    lista = (ArrayList<Usuario>) decoder.readObject();
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

private void guardarXML() {
        try {
            File archivo = new File("datos_usuarios.xml");
            try (var encoder = new java.beans.XMLEncoder(new java.io.BufferedOutputStream(new java.io.FileOutputStream(archivo)))) {
                encoder.writeObject(lista);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar XML.");
        }
    }



private boolean validarContraseña(String pass) {
        if (pass.length() < 13) {
            JOptionPane.showMessageDialog(this, "Debe tener al menos 13 caracteres.");
            return false;
        }
        boolean tieneMayus = !pass.equals(pass.toLowerCase());
        boolean tieneEspecial = pass.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        
        if (!tieneMayus || !tieneEspecial) {
            JOptionPane.showMessageDialog(this, "Debe incluir una Mayúscula y un símbolo.");
            return false;
        }
        return true;
    }


    public static void main(String args[]) {
java.awt.EventQueue.invokeLater(() -> new ReinicioClave("dflores").setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField NewPass;
    private javax.swing.JPasswordField OldPass;
    private javax.swing.JRadioButton ShowP1;
    private javax.swing.JRadioButton ShowP2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
