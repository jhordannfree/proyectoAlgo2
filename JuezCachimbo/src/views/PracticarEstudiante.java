
package views;

import com.formdev.flatlaf.FlatLightLaf;

public class PracticarEstudiante extends javax.swing.JPanel {

    public PracticarEstudiante() {
        initComponents();
        FlatLightLaf.setup();
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
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        bgPerfil.setBackground(new java.awt.Color(241, 243, 246));
        bgPerfil.setPreferredSize(new java.awt.Dimension(1260, 850));
        bgPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel26.setText("Juez Cachimbo / Practicar");
        bgPerfil.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTable1.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Titulo", "Descripción", "Enlace"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bgPerfil.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 950, 540));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 116, 1));
        jLabel1.setText("Textos recomendados");
        bgPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 30));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
