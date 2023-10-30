
package views;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author Vilberto Patricio
 */

public class PerfilEstudiante extends javax.swing.JPanel {

    public PerfilEstudiante() {
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

        bgPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelEstadistica1 = new javax.swing.JPanel();
        jPanelEstadistica2 = new javax.swing.JPanel();
        jPanelEstadistica4 = new javax.swing.JPanel();
        jPanelEstadistica3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelFotografia = new javax.swing.JPanel();
        jLabeñDatosPersonales = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEditarDatos = new javax.swing.JButton();

        bgPerfil.setBackground(new java.awt.Color(241, 243, 246));
        bgPerfil.setPreferredSize(new java.awt.Dimension(1260, 850));
        bgPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 116, 1));
        jLabel1.setText("Estadísticas generales");
        bgPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jPanelEstadistica1.setBackground(new java.awt.Color(241, 243, 246));
        jPanelEstadistica1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 213, 190), new java.awt.Color(243, 213, 190)));

        javax.swing.GroupLayout jPanelEstadistica1Layout = new javax.swing.GroupLayout(jPanelEstadistica1);
        jPanelEstadistica1.setLayout(jPanelEstadistica1Layout);
        jPanelEstadistica1Layout.setHorizontalGroup(
            jPanelEstadistica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        jPanelEstadistica1Layout.setVerticalGroup(
            jPanelEstadistica1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        bgPerfil.add(jPanelEstadistica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 356, 175));

        jPanelEstadistica2.setBackground(new java.awt.Color(241, 243, 246));
        jPanelEstadistica2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 213, 190), new java.awt.Color(243, 213, 190)));

        javax.swing.GroupLayout jPanelEstadistica2Layout = new javax.swing.GroupLayout(jPanelEstadistica2);
        jPanelEstadistica2.setLayout(jPanelEstadistica2Layout);
        jPanelEstadistica2Layout.setHorizontalGroup(
            jPanelEstadistica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanelEstadistica2Layout.setVerticalGroup(
            jPanelEstadistica2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        bgPerfil.add(jPanelEstadistica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jPanelEstadistica4.setBackground(new java.awt.Color(241, 243, 246));
        jPanelEstadistica4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 213, 190), new java.awt.Color(243, 213, 190)));

        javax.swing.GroupLayout jPanelEstadistica4Layout = new javax.swing.GroupLayout(jPanelEstadistica4);
        jPanelEstadistica4.setLayout(jPanelEstadistica4Layout);
        jPanelEstadistica4Layout.setHorizontalGroup(
            jPanelEstadistica4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanelEstadistica4Layout.setVerticalGroup(
            jPanelEstadistica4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        bgPerfil.add(jPanelEstadistica4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        jPanelEstadistica3.setBackground(new java.awt.Color(241, 243, 246));
        jPanelEstadistica3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 213, 190), new java.awt.Color(243, 213, 190)));

        javax.swing.GroupLayout jPanelEstadistica3Layout = new javax.swing.GroupLayout(jPanelEstadistica3);
        jPanelEstadistica3.setLayout(jPanelEstadistica3Layout);
        jPanelEstadistica3Layout.setHorizontalGroup(
            jPanelEstadistica3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        jPanelEstadistica3Layout.setVerticalGroup(
            jPanelEstadistica3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        bgPerfil.add(jPanelEstadistica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(243, 213, 190));
        bgPerfil.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 790, 10));

        jPanelFotografia.setBackground(new java.awt.Color(241, 243, 246));
        jPanelFotografia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(243, 213, 190), new java.awt.Color(243, 213, 190)));

        javax.swing.GroupLayout jPanelFotografiaLayout = new javax.swing.GroupLayout(jPanelFotografia);
        jPanelFotografia.setLayout(jPanelFotografiaLayout);
        jPanelFotografiaLayout.setHorizontalGroup(
            jPanelFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanelFotografiaLayout.setVerticalGroup(
            jPanelFotografiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        bgPerfil.add(jPanelFotografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 100, 100));

        jLabeñDatosPersonales.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabeñDatosPersonales.setText("{Nombres}, {Apellidos}");
        bgPerfil.add(jLabeñDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 450, -1));

        jLabelUsername.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabelUsername.setText("{Username}");
        bgPerfil.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 340, -1));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("{Ranking}");
        bgPerfil.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 100, -1));

        btnEditarDatos.setBackground(new java.awt.Color(253, 116, 1));
        btnEditarDatos.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        btnEditarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarDatos.setText("Editar datos personales");
        btnEditarDatos.setFocusable(false);
        bgPerfil.add(btnEditarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPerfil;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabeñDatosPersonales;
    private javax.swing.JPanel jPanelEstadistica1;
    private javax.swing.JPanel jPanelEstadistica2;
    private javax.swing.JPanel jPanelEstadistica3;
    private javax.swing.JPanel jPanelEstadistica4;
    private javax.swing.JPanel jPanelFotografia;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
