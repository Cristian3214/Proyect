/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_login;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//
/**
 *
 * @author Cristian
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
        //Metodo ajustar la venta en el centro
        this.setLocationRelativeTo(this);
        //Llamar metodo y asignar Label y la ruta de la imagen 

        AjusteImagen(Contra, "src\\Recuros\\lock_FILL0_wght400_GRAD0_opsz48.png");
        AjusteImagen(Usuario, "src\\Recuros\\person_search_FILL0_wght400_GRAD0_opsz48.png");
        AjusteImagen(FondoHx, "src\\Recuros\\stripes-g6dfe4a977_1280.jpg");
        AjusteImagen(jLabel1, "src\\Recuros\\BLANCO 760X440PX_0.png");
        AjusteImagen(jLabel2, "src\\Recuros\\BLANCO 760X440PX_0.png");
        AjusteImagen(User, "src\\Recuros\\773e4a6b450dea859d9c0b9d45030ae6.png");

    }
    int xMouse, yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Contra = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        ColocarContra = new javax.swing.JPasswordField();
        ColocarUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        Boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Salida = new javax.swing.JLabel();
        FondoHx = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/lock_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        Contra.setText("Contra");
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 30, 30));

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/person_search_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 30, 30));

        ColocarContra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ColocarContra.setForeground(new java.awt.Color(204, 204, 204));
        ColocarContra.setText("programacion");
        ColocarContra.setToolTipText("");
        ColocarContra.setBorder(null);
        ColocarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ColocarContraMousePressed(evt);
            }
        });
        ColocarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarContraActionPerformed(evt);
            }
        });
        jPanel1.add(ColocarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 230, 30));

        ColocarUser.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        ColocarUser.setForeground(new java.awt.Color(153, 153, 153));
        ColocarUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ColocarUser.setText("Usuario");
        ColocarUser.setBorder(null);
        ColocarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ColocarUserMousePressed(evt);
            }
        });
        ColocarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarUserActionPerformed(evt);
            }
        });
        jPanel1.add(ColocarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/BLANCO 760X440PX_0.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 290, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/773e4a6b450dea859d9c0b9d45030ae6.png"))); // NOI18N

        Boton.setBackground(new java.awt.Color(254, 255, 153));
        Boton.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Boton.setForeground(new java.awt.Color(51, 51, 51));
        Boton.setText("Iniciar");
        Boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMouseExited(evt);
            }
        });
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/BLANCO 760X440PX_0.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/login_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 360, 530));

        FondoHx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recuros/stripes-g6dfe4a977_1280.jpg"))); // NOI18N
        jPanel1.add(FondoHx, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -20, 800, 590));

        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColocarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColocarUserActionPerformed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        // TODO add your handling code here:
        String Usuario="Pamelo";
        String Contrase??a="Computacion";
        String Pass=new String(ColocarContra.getPassword());
        if(ColocarUser.getText().equals(Usuario)&&Pass.equals(Contrase??a)){
            Menu Men1=new Menu();
            new Menu().setVisible(true);
            dispose();
            
        }else 
            JOptionPane.showMessageDialog(null, "Contrase??a incorrecta.");
    }//GEN-LAST:event_BotonActionPerformed

    private void ColocarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColocarContraActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        /*
         xMouse =evt.getX();
        yMouse =evt.getY();*/
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        /*
        int x=evt.getXOnScreen();
int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);*/
    }//GEN-LAST:event_jPanel3MouseDragged
//Seleccionar la ventana (Parte superior) y luego poder moverla 
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed
//Para poder mover la ventana a volutdad 
    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseMoved
//Poder mover la ventana 
    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged
//Salir de de la ventana 
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jPanel3MouseClicked
//Cabiar el color a la hora de colocar el mouse en el boton
    private void BotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseEntered

        Boton.setBackground(new Color(250, 250, 184));

    }//GEN-LAST:event_BotonMouseEntered
//Restablecer el color original 
    private void BotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMouseExited

        Boton.setBackground(new Color(254, 255, 154));
    }//GEN-LAST:event_BotonMouseExited
//Quitar lo "usurio y contrase??a Colocar usario y contrase??a "
    private void ColocarUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColocarUserMousePressed
        if (ColocarUser.getText().equals("Usuario")) {
            ColocarUser.setText("");
            ColocarUser.setForeground(Color.black);
            ColocarUser.setForeground(Color.black);
        }
        if (String.valueOf(ColocarContra.getPassword()).isEmpty()) {
            ColocarContra.setText("programacion");
            ColocarContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ColocarUserMousePressed
//Quitar lo "usurio y contrase??a Colocar usario y contrase??a "
    private void ColocarContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColocarContraMousePressed
        /* if(ColocarUser.getText().equals("********q")){
        
        
             ColocarContra.setText("");
        ColocarContra.setForeground(Color.black);
       ColocarContra.setForeground(Color.black);
       }
       if(String.valueOf(ColocarUser.getText()).isEmpty()){
           ColocarUser.setText("Usuario");
       ColocarUser.setForeground(Color.gray);
       
       }*/
        if (String.valueOf(ColocarContra.getPassword()).equals("programacion")) {
            ColocarContra.setText("");
            ColocarContra.setForeground(Color.black);
        }
        if (ColocarUser.getText().isEmpty()) {
            ColocarUser.setText("Usuario");
            ColocarUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ColocarContraMousePressed

    /**
     * @param args the command line arguments
     */
    //Metodo para ajustar imagen en base a al tama??o de la Label 
    private void AjusteImagen(JLabel LabelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(LabelName.getWidth(), LabelName.getHeight(), Image.SCALE_DEFAULT));
        LabelName.setIcon(icon);
        this.repaint();

    }//F

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JPasswordField ColocarContra;
    private javax.swing.JTextField ColocarUser;
    private javax.swing.JLabel Contra;
    private javax.swing.JLabel FondoHx;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel User;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
