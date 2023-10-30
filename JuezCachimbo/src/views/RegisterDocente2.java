
package views;

import com.formdev.flatlaf.FlatLightLaf;


public class RegisterDocente2 extends javax.swing.JPanel {

    /**
     * Creates new form RegisterDocente1
     */
    public RegisterDocente2() {
        initComponents();
        FlatLightLaf.setup(); //Modifica el diseño de los componentes de las interfaces graficas
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRegisterDC1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFClave = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgRegisterDC1.setBackground(new java.awt.Color(255, 255, 255));
        bgRegisterDC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juez_cachimbp.png"))); // NOI18N
        bgRegisterDC1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 210, 100));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        bgRegisterDC1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, 100));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Docente");
        bgRegisterDC1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, -1));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 85, 85));
        jLabel1.setText("Nombre de usuario");
        bgRegisterDC1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jTFUsername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jTFUsername.setForeground(new java.awt.Color(85, 85, 85));
        bgRegisterDC1.add(jTFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 410, 40));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(85, 85, 85));
        jLabel2.setText("Contraseña");
        bgRegisterDC1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jTFClave.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jTFClave.setForeground(new java.awt.Color(85, 85, 85));
        bgRegisterDC1.add(jTFClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 410, 40));

        btnRegistrarse.setBackground(new java.awt.Color(253, 116, 1));
        btnRegistrarse.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setFocusable(false);
        bgRegisterDC1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, 410, 50));

        add(bgRegisterDC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 658, 953));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgRegisterDC1;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFClave;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
