package pruebanocturna;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;

public class LogIn extends javax.swing.JFrame {
  ArrayList<Usuario> lista = new ArrayList<>();
   int intentos = 0;
int tiempoRestante = 20;
javax.swing.Timer timer;
   

    public LogIn() {
initComponents();
    cargarXML();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUserLogin = new javax.swing.JTextField();
        txtPassLogin = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShowP1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorTab.attentionBackground"));

        txtUserLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtPassLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassLogin.addActionListener(this::txtPassLoginActionPerformed);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 153));
        btnEntrar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnEntrar.setText("ENTER");
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("USER:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("PASSWORD:");

        ShowP1.setText("SEE PASSWORD");
        ShowP1.addActionListener(this::ShowP1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowP1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowP1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("WELCOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassLoginActionPerformed
      
    }//GEN-LAST:event_txtPassLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
cargarXML(); 
    
    String userIn = txtUserLogin.getText();
    String passIn = new String(txtPassLogin.getPassword());
    boolean encontrado = false;

  
    for (Usuario u : lista) {
        if (u.user.equals(userIn) && u.password.equals(passIn)) {
            if (u.estado.equalsIgnoreCase("ACTIVE")) {
                encontrado = true;
                break; 
            } else {
                JOptionPane.showMessageDialog(this, "Este usuario está INACTIVE.");
                return; 
            }
        }
    }

   
    if (encontrado) {
        intentos = 0;
        JOptionPane.showMessageDialog(this, "¡Bienvenido " + userIn + "!");

        if (userIn.equals("dflores")) {
            // Caso ADMIN
            Mantenimiento mant = new Mantenimiento();
            mant.setVisible(true);
        } else {

            ReinicioClave rc = new ReinicioClave(userIn); 
            rc.setVisible(true);
        }
        this.dispose(); 
        
    } else {

        intentos++;
        if (intentos >= 3) {
            JOptionPane.showMessageDialog(this, "Bloqueado por 20 segundos.");
            txtUserLogin.setEnabled(false);
            txtPassLogin.setEnabled(false);
            btnEntrar.setEnabled(false);
            ShowP1.setEnabled(false);
            bloquearLogin(); // Tu método del Timer
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Intento " + intentos + " de 3");
        }
    }
    }//GEN-LAST:event_btnEntrarActionPerformed

    
    private void bloquearLogin()
{
    btnEntrar.setEnabled(false);
    txtUserLogin.setEnabled(false);
    txtPassLogin.setEnabled(false);

    tiempoRestante = 20;

    timer = new javax.swing.Timer(1000, (java.awt.event.ActionEvent e) -> {
        btnEntrar.setText("Espere " + tiempoRestante + "s");
        tiempoRestante--;
        
        if(tiempoRestante < 0)
        {
            timer.stop();
            
            btnEntrar.setEnabled(true);
            txtUserLogin.setEnabled(true);
            txtPassLogin.setEnabled(true);
            ShowP1.setEnabled(true);
            
            btnEntrar.setText("Entrar");
            intentos = 0;
        }
    });

    timer.start();
}
    
    private void ShowP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowP1ActionPerformed
  if(ShowP1.isSelected())
    {
        txtPassLogin.setEchoChar((char)0); 
    }
    else
    {
        txtPassLogin.setEchoChar('*'); 
    }        
    }//GEN-LAST:event_ShowP1ActionPerformed


    public static void main(String args[]) {
 java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ShowP1;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables

    private void cargarXML() {
    try {
        File archivo = new File("datos_usuarios.xml");
        if (archivo.exists()) {
            try (var decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(archivo)))) {
                lista = (ArrayList<Usuario>) decoder.readObject();
            }
        }
    } catch (Exception e) {
        lista = new ArrayList<>();
    }

    // --- LOGICA DE ADMIN FIJO ---
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
    }
}
    
}