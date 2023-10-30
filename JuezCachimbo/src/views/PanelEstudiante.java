
package views;

import com.formdev.flatlaf.FlatLightLaf; //Es una libreria de Java que permite darle un diseño mas moderno a las interfaces. Esta libreria esta en la web.
import java.awt.BorderLayout;
import javax.swing.JPanel;


/**
 *
 * @author Vilberto Patricio
 */

public class PanelEstudiante extends javax.swing.JFrame {

    public PanelEstudiante() {
        initComponents();
        setTitle("Juez Cachimbo");
        setResizable(false); //La aplicacion no sera responsiva
        InitContent();
    }
    
    //Metodo para iniciar un contenedor
    public void InitContent(){
        showJPanel(new InicioEstudiante());
    }
    
    //Metodo que permite mostrar un panel en relación a uno de los botones del menú
    public void showJPanel(JPanel p){
        p.setSize(1260, 850); //El nuevo panel tendra la misma dimension del contenedor principal
        p.setLocation(0, 0); //El nuevo panel se colocara en la posicion (0, 0)
        
        contenedorPrincipalE.removeAll();
        contenedorPrincipalE.add(p, BorderLayout.CENTER);
        contenedorPrincipalE.revalidate();
        contenedorPrincipalE.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jPanelPerfil = new javax.swing.JPanel();
        jLabelPerfil = new javax.swing.JLabel();
        jPanelPracticar = new javax.swing.JPanel();
        jLabelPracticar = new javax.swing.JLabel();
        jPanelCerrarSesion = new javax.swing.JPanel();
        jLabelCerrarSesion = new javax.swing.JLabel();
        jPanelEstadistica = new javax.swing.JPanel();
        jLabelEstadistica = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contenedorPrincipalE = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1650, 953));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio-tamanio1x.png"))); // NOI18N
        jPanelInicio.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 180, 60));

        jPanel1.add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 390, 62));

        jPanelPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil-tamanio1x.png"))); // NOI18N
        jPanelPerfil.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 60));

        jPanel1.add(jPanelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 390, 62));

        jPanelPracticar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPracticar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPracticar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPracticar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/practicar-tamanio1x.png"))); // NOI18N
        jPanelPracticar.add(jLabelPracticar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 200, 60));

        jPanel1.add(jPanelPracticar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 390, 62));

        jPanelCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelCerrarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-out-tamanio1x.png"))); // NOI18N
        jPanelCerrarSesion.add(jLabelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jPanel1.add(jPanelCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 390, 62));

        jPanelEstadistica.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEstadistica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelEstadistica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estadisticas-tamanio1x.png"))); // NOI18N
        jPanelEstadistica.add(jLabelEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 250, 60));

        jPanel1.add(jPanelEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 390, 62));

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel6.setText("Estudiante");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Juez_cachimbp.png"))); // NOI18N
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 100));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 100));

        jPanel2.setBackground(new java.awt.Color(241, 243, 246));

        jTextField1.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(85, 85, 85));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        contenedorPrincipalE.setBackground(new java.awt.Color(241, 243, 246));

        javax.swing.GroupLayout contenedorPrincipalELayout = new javax.swing.GroupLayout(contenedorPrincipalE);
        contenedorPrincipalE.setLayout(contenedorPrincipalELayout);
        contenedorPrincipalELayout.setHorizontalGroup(
            contenedorPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorPrincipalELayout.setVerticalGroup(
            contenedorPrincipalELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorPrincipalE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenedorPrincipalE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(PanelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        FlatLightLaf.setup(); //Permite iniciar la libreria y esta modifica el diseño de los componentes.
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel contenedorPrincipalE;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabelCerrarSesion;
    public javax.swing.JLabel jLabelEstadistica;
    public javax.swing.JLabel jLabelInicio;
    public javax.swing.JLabel jLabelPerfil;
    public javax.swing.JLabel jLabelPracticar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanelCerrarSesion;
    public javax.swing.JPanel jPanelEstadistica;
    public javax.swing.JPanel jPanelInicio;
    public javax.swing.JPanel jPanelPerfil;
    public javax.swing.JPanel jPanelPracticar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
