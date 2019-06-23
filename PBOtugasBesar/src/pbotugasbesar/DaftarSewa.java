package pbotugasbesar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thesa
 */
public class DaftarSewa extends javax.swing.JFrame {
    SourceDaftarSewa sDS = new SourceDaftarSewa(this);
    DefaultTableModel modelTabelDaftarPenyewa;
    
    public DaftarSewa() {
        initComponents();
        
        setLocationRelativeTo(this);
        setResizable(false);
        
        modelTabelDaftarPenyewa = (DefaultTableModel)tabelDaftarPenyewa.getModel();
        sDS.loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDaftarPenyewa = new javax.swing.JTable();
        tDelete = new javax.swing.JButton();
        tDetail = new javax.swing.JButton();
        tKembali = new javax.swing.JButton();
        tSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR PENYEWA");

        tabelDaftarPenyewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Reg.", "Nama", "Tanggal masuk", "Tanggal kembali", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelDaftarPenyewa);
        if (tabelDaftarPenyewa.getColumnModel().getColumnCount() > 0) {
            tabelDaftarPenyewa.getColumnModel().getColumn(0).setResizable(false);
            tabelDaftarPenyewa.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelDaftarPenyewa.getColumnModel().getColumn(1).setResizable(false);
            tabelDaftarPenyewa.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelDaftarPenyewa.getColumnModel().getColumn(2).setResizable(false);
            tabelDaftarPenyewa.getColumnModel().getColumn(2).setPreferredWidth(60);
            tabelDaftarPenyewa.getColumnModel().getColumn(3).setResizable(false);
            tabelDaftarPenyewa.getColumnModel().getColumn(3).setPreferredWidth(60);
            tabelDaftarPenyewa.getColumnModel().getColumn(4).setResizable(false);
            tabelDaftarPenyewa.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        tDelete.setText("DELETE");
        tDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDeleteActionPerformed(evt);
            }
        });

        tDetail.setText("DETAIL");
        tDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDetailActionPerformed(evt);
            }
        });

        tKembali.setText("KEMBALI");
        tKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKembaliActionPerformed(evt);
            }
        });

        tSave.setText("SAVE");
        tSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(tDelete)
                        .addGap(18, 18, 18)
                        .addComponent(tDetail)
                        .addGap(18, 18, 18)
                        .addComponent(tSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tKembali))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDelete)
                    .addComponent(tDetail)
                    .addComponent(tSave)
                    .addComponent(tKembali))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDetailActionPerformed
        sDS.klikTombolDetail();
    }//GEN-LAST:event_tDetailActionPerformed

    private void tDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDeleteActionPerformed
        sDS.klikTombolDelete();
    }//GEN-LAST:event_tDeleteActionPerformed

    private void tKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKembaliActionPerformed
        dispose();
        Utama u = new Utama();
        u.setVisible(true);
    }//GEN-LAST:event_tKembaliActionPerformed

    private void tSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSaveActionPerformed
        sDS.saveData();
    }//GEN-LAST:event_tSaveActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarSewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton tDelete;
    private javax.swing.JButton tDetail;
    private javax.swing.JButton tKembali;
    private javax.swing.JButton tSave;
    protected javax.swing.JTable tabelDaftarPenyewa;
    // End of variables declaration//GEN-END:variables

}
