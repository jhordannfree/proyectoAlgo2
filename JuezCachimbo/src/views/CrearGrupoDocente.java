
package views;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author Vilberto Patricio
 */

public class CrearGrupoDocente extends javax.swing.JPanel {

    public CrearGrupoDocente() {
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

        bgCrearGrupo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelBreadCrumbsCrearGrupo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoGrupo = new javax.swing.JTextField();
        txtNombreGrupo = new javax.swing.JTextField();
        jLabelImg = new javax.swing.JLabel();
        btnCrearGrupo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgCrearGrupo.setBackground(new java.awt.Color(241, 243, 246));
        bgCrearGrupo.setPreferredSize(new java.awt.Dimension(1260, 850));
        bgCrearGrupo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 116, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creación de grupos");
        bgCrearGrupo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 500, -1));

        jLabelBreadCrumbsCrearGrupo.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabelBreadCrumbsCrearGrupo.setText("Juez Cachimbo / Perfil / Creacion de grupos");
        bgCrearGrupo.add(jLabelBreadCrumbsCrearGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Código del Grupo:");
        bgCrearGrupo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de Grupo");
        bgCrearGrupo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, 40));

        txtCodigoGrupo.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        bgCrearGrupo.add(txtCodigoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 670, 40));

        txtNombreGrupo.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        bgCrearGrupo.add(txtNombreGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 670, 40));

        jLabelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearGrupo.png"))); // NOI18N
        bgCrearGrupo.add(jLabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 480, 340));

        btnCrearGrupo.setBackground(new java.awt.Color(253, 116, 1));
        btnCrearGrupo.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        btnCrearGrupo.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearGrupo.setText("Crear");
        bgCrearGrupo.add(btnCrearGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 800, 180, 40));

        btnCancelar.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(253, 116, 1));
        btnCancelar.setText("Cancelar");
        bgCrearGrupo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 800, 170, 40));

        add(bgCrearGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 953));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCrearGrupo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBreadCrumbsCrearGrupo;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JTextField txtCodigoGrupo;
    private javax.swing.JTextField txtNombreGrupo;
    // End of variables declaration//GEN-END:variables
}