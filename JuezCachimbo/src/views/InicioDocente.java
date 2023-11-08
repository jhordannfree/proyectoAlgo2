
package views;

import com.formdev.flatlaf.FlatLightLaf;


/**
 *
 * @author Vilberto Patricio
 */

public class InicioDocente extends javax.swing.JPanel {

    public InicioDocente() {
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

        bgInicioDocente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPaneRanking = new javax.swing.JScrollPane();
        jTableRanking = new javax.swing.JTable();
        jLabelBreadCrumbsInicioD = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgInicioDocente.setBackground(new java.awt.Color(241, 243, 246));
        bgInicioDocente.setPreferredSize(new java.awt.Dimension(1260, 850));
        bgInicioDocente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 116, 1));
        jLabel1.setText("Ranking de estudiantes");
        bgInicioDocente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jScrollPaneRanking.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneRanking.setFocusable(false);
        jScrollPaneRanking.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N

        jTableRanking.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jTableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Nombre del estudiante", "# Preguntas correctas", "# Preguntas incorrectas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRanking.setShowGrid(false);
        jTableRanking.setShowHorizontalLines(true);
        jTableRanking.setShowVerticalLines(true);
        jScrollPaneRanking.setViewportView(jTableRanking);

        bgInicioDocente.add(jScrollPaneRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 1140, 710));

        jLabelBreadCrumbsInicioD.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabelBreadCrumbsInicioD.setText("Juez Cachimbo / Inicio");
        bgInicioDocente.add(jLabelBreadCrumbsInicioD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        add(bgInicioDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 953));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgInicioDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBreadCrumbsInicioD;
    private javax.swing.JScrollPane jScrollPaneRanking;
    private javax.swing.JTable jTableRanking;
    // End of variables declaration//GEN-END:variables
}
