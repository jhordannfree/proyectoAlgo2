
package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.JPanel;


/**
 *
 * @author Vilberto Patricio
 */

public class PanelRegister extends javax.swing.JFrame {

    /**
     * Creates new form PanelRegister
     */
    public PanelRegister() {
        initComponents();
        setTitle("Juez Cachimbo");
        setResizable(false);
    }
    
    public void showJPanel(JPanel p){
        p.setSize(1260, 850);
        p.setLocation(0, 0);
        
        PanelDE.removeAll();
        PanelDE.add(p, BorderLayout.CENTER);
        PanelDE.revalidate();
        PanelDE.repaint();
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
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        registrarse = new javax.swing.JLabel();
        btnEstudiante = new javax.swing.JButton();
        btnDocente1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        Panelimg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1650, 953));
        setPreferredSize(new java.awt.Dimension(1650, 953));

        PanelDE.setBackground(new java.awt.Color(255, 255, 255));
        PanelDE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        PanelDE.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 100));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juez_cachimbp.png"))); // NOI18N
        PanelDE.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 210, 100));

        registrarse.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        registrarse.setText("Registrarse como:");
        PanelDE.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.png"))); // NOI18N
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiante.setFocusable(false);
        PanelDE.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 256, 237));

        btnDocente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Docente.png"))); // NOI18N
        btnDocente1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDocente1.setFocusable(false);
        PanelDE.add(btnDocente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 256, 237));

        btnRegresar.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(253, 116, 1));
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusable(false);
        PanelDE.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 720, 394, 47));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login_Ilustrator_1.png"))); // NOI18N

        javax.swing.GroupLayout PanelimgLayout = new javax.swing.GroupLayout(Panelimg);
        Panelimg.setLayout(PanelimgLayout);
        PanelimgLayout.setHorizontalGroup(
            PanelimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelimgLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        PanelimgLayout.setVerticalGroup(
            PanelimgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelimgLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(79, 79, 79))
        );

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
            java.util.logging.Logger.getLogger(PanelRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDE;
    private javax.swing.JPanel Panelimg;
    public javax.swing.JButton btnDocente1;
    public javax.swing.JButton btnEstudiante;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel registrarse;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
