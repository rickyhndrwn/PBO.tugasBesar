package pbotugasbesar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thesa
 */
public class TambahStok extends javax.swing.JFrame {
    DefaultTableModel modelTabelTambahStok;
    SourceTambahStok sTS = new SourceTambahStok(this);
    
    public TambahStok() {
        initComponents();
        
        setLocationRelativeTo(this);
        setResizable(false);
        
        modelTabelTambahStok = (DefaultTableModel)tabelTambahStok.getModel();
        
        sTS.loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldKodeStok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldNamaStok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldJumlahStok = new javax.swing.JTextField();
        tTambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fieldHargaStok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTambahStok = new javax.swing.JTable();
        tSimpan = new javax.swing.JButton();
        tUpdate = new javax.swing.JButton();
        tKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAMBAH STOK");

        jLabel2.setText("KODE ");

        fieldKodeStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldKodeStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldKodeStokKeyTyped(evt);
            }
        });

        jLabel3.setText("NAMA");

        fieldNamaStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setText("JUMLAH");

        fieldJumlahStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldJumlahStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldJumlahStokKeyTyped(evt);
            }
        });

        tTambah.setText("TAMBAH");
        tTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTambahActionPerformed(evt);
            }
        });

        jLabel5.setText("HARGA");

        fieldHargaStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldHargaStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldHargaStokKeyTyped(evt);
            }
        });

        tabelTambahStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Jumlah", "Harga"
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
        tabelTambahStok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelTambahStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTambahStokMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTambahStok);
        if (tabelTambahStok.getColumnModel().getColumnCount() > 0) {
            tabelTambahStok.getColumnModel().getColumn(0).setResizable(false);
            tabelTambahStok.getColumnModel().getColumn(1).setResizable(false);
            tabelTambahStok.getColumnModel().getColumn(2).setResizable(false);
            tabelTambahStok.getColumnModel().getColumn(3).setResizable(false);
        }

        tSimpan.setText("SIMPAN");
        tSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSimpanActionPerformed(evt);
            }
        });

        tUpdate.setText("UPDATE");
        tUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUpdateActionPerformed(evt);
            }
        });

        tKembali.setText("Kembali");
        tKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tKembali)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNamaStok, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(fieldKodeStok))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldHargaStok)
                                    .addComponent(fieldJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tTambah)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(tUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tSimpan))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldKodeStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(fieldJumlahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldNamaStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(fieldHargaStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tUpdate)
                    .addComponent(tTambah)
                    .addComponent(tSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tKembali)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTambahActionPerformed
        sTS.klikTombolTambah();
    }//GEN-LAST:event_tTambahActionPerformed

    private void tSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSimpanActionPerformed
        sTS.klikTombolSimpan();
    }//GEN-LAST:event_tSimpanActionPerformed

    private void fieldKodeStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldKodeStokKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_fieldKodeStokKeyTyped

    private void fieldJumlahStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJumlahStokKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_fieldJumlahStokKeyTyped

    private void fieldHargaStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldHargaStokKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_fieldHargaStokKeyTyped

    private void tUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUpdateActionPerformed
        sTS.klikTombolUpdate();
    }//GEN-LAST:event_tUpdateActionPerformed

    private void tKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKembaliActionPerformed
        dispose();
        JumlahStok js = new JumlahStok();
        js.setVisible(true);
    }//GEN-LAST:event_tKembaliActionPerformed

    private void tabelTambahStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTambahStokMouseClicked
        sTS.klikTabelTambahStok();
    }//GEN-LAST:event_tabelTambahStokMouseClicked

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
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField fieldHargaStok;
    protected javax.swing.JTextField fieldJumlahStok;
    protected javax.swing.JTextField fieldKodeStok;
    protected javax.swing.JTextField fieldNamaStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tKembali;
    private javax.swing.JButton tSimpan;
    private javax.swing.JButton tTambah;
    private javax.swing.JButton tUpdate;
    protected javax.swing.JTable tabelTambahStok;
    // End of variables declaration//GEN-END:variables

}
