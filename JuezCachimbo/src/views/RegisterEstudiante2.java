
package views;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author Vilberto Patricio
 */

public class RegisterEstudiante2 extends javax.swing.JFrame {

    /**
     * Creates new form PanelRegister
     */
    public RegisterEstudiante2() {
        initComponents();
        setTitle("Juez Cachimbo");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDE = new javax.swing.JPanel();
        btnRegistrarseE = new javax.swing.JButton();
        txtClaveRegisterE = new javax.swing.JTextField();
        jLabelPasswordRD = new javax.swing.JLabel();
        txtUsernameRegisterE = new javax.swing.JTextField();
        jLabelUsernameRegisterD = new javax.swing.JLabel();
        jLabelEstudiante = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabelPasswordRD1 = new javax.swing.JLabel();
        jComboBoxGrupoE = new javax.swing.JComboBox<>();
        Panelimg = new javax.swing.JPanel();
        jLabelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1650, 953));

        PanelDE.setBackground(new java.awt.Color(255, 255, 255));
        PanelDE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarseE.setBackground(new java.awt.Color(253, 116, 1));
        btnRegistrarseE.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnRegistrarseE.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarseE.setText("Registrarse");
        btnRegistrarseE.setFocusable(false);
        PanelDE.add(btnRegistrarseE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, 410, 50));

        txtClaveRegisterE.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtClaveRegisterE.setForeground(new java.awt.Color(85, 85, 85));
        PanelDE.add(txtClaveRegisterE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 410, 40));

        jLabelPasswordRD.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabelPasswordRD.setForeground(new java.awt.Color(85, 85, 85));
        jLabelPasswordRD.setText("Contraseña");
        PanelDE.add(jLabelPasswordRD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        txtUsernameRegisterE.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtUsernameRegisterE.setForeground(new java.awt.Color(85, 85, 85));
        PanelDE.add(txtUsernameRegisterE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 410, 40));

        jLabelUsernameRegisterD.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabelUsernameRegisterD.setForeground(new java.awt.Color(85, 85, 85));
        jLabelUsernameRegisterD.setText("Nombre de usuario");
        PanelDE.add(jLabelUsernameRegisterD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabelEstudiante.setFont(new java.awt.Font("Poppins SemiBold", 1, 22)); // NOI18N
        jLabelEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstudiante.setText("Estudiante");
        PanelDE.add(jLabelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, -1));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juez_cachimbp.png"))); // NOI18N
        PanelDE.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 210, 100));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        PanelDE.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, 100));

        jLabelPasswordRD1.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabelPasswordRD1.setForeground(new java.awt.Color(85, 85, 85));
        jLabelPasswordRD1.setText("Grupo");
        PanelDE.add(jLabelPasswordRD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, -1, -1));

        jComboBoxGrupoE.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jComboBoxGrupoE.setForeground(new java.awt.Color(85, 85, 85));
        jComboBoxGrupoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo 01", "Grupo 02", "Grupo 03", "Grupo 04" }));
        PanelDE.add(jComboBoxGrupoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 140, 40));

        Panelimg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        Panelimg.add(jLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 94, 850, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDE, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Panelimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDE, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
            .addComponent(Panelimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegisterEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterEstudiante2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEstudiante2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDE;
    private javax.swing.JPanel Panelimg;
    private javax.swing.JButton btnRegistrarseE;
    private javax.swing.JLabel icon;
    public javax.swing.JComboBox<String> jComboBoxGrupoE;
    private javax.swing.JLabel jLabelEstudiante;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelPasswordRD;
    private javax.swing.JLabel jLabelPasswordRD1;
    private javax.swing.JLabel jLabelUsernameRegisterD;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtClaveRegisterE;
    private javax.swing.JTextField txtUsernameRegisterE;
    // End of variables declaration//GEN-END:variables
}