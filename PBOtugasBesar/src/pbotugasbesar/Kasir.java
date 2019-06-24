package pbotugasbesar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thesa
 */
public class Kasir extends javax.swing.JFrame {
    DefaultTableModel modelTabelDaftarBarang;
    DefaultTableModel modelTabelKasir;
    Date tanggal = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyy");
    String stringTanggal = df.format(tanggal);
    Date batasTanggal;
    SourceKasir sK = new SourceKasir(this);
    
    public Kasir() throws ParseException {
        this.batasTanggal = new SimpleDateFormat("dd-MM-yyy").parse(stringTanggal);
        initComponents();
        
        setLocationRelativeTo(this);
        setResizable(false);
        
        modelTabelDaftarBarang = (DefaultTableModel)tabelDaftarBarang.getModel();
        modelTabelKasir = (DefaultTableModel)tabelKasir.getModel();
        
        textTanggalPesanKasir.setText(stringTanggal);
        
        sK.loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fieldNamaKasir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldJumlahKasir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldNoRegKasir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKasir = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        tombolPesan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tombolTambah = new javax.swing.JButton();
        tombolCancel = new javax.swing.JButton();
        tombolClear = new javax.swing.JButton();
        tombolKembali = new javax.swing.JButton();
        textKodeKasir = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelDaftarBarang = new javax.swing.JTable();
        fieldTanggalKembali = new com.toedter.calendar.JDateChooser();
        textTanggalPesanKasir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textTotalSemua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCAFFOLDING RENT");

        jLabel2.setText("NAMA:");

        fieldNamaKasir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("JUMLAH:");

        fieldJumlahKasir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldJumlahKasir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldJumlahKasirKeyTyped(evt);
            }
        });

        jLabel4.setText("NO. REG:");

        fieldNoRegKasir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNoRegKasirKeyTyped(evt);
            }
        });

        jLabel5.setText("TANGGAL PESAN");

        jLabel6.setText("TANGGAL KEMBALI");

        tabelKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tabelKasir);
        if (tabelKasir.getColumnModel().getColumnCount() > 0) {
            tabelKasir.getColumnModel().getColumn(0).setResizable(false);
            tabelKasir.getColumnModel().getColumn(1).setResizable(false);
            tabelKasir.getColumnModel().getColumn(2).setResizable(false);
            tabelKasir.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total per-Hari:");

        textTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textTotal.setText("Rp. 0");

        tombolPesan.setText("PESAN");
        tombolPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPesanActionPerformed(evt);
            }
        });

        jLabel9.setText("KODE:");

        tombolTambah.setText("TAMBAH");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboltombolTambahActionPerformed(evt);
            }
        });

        tombolCancel.setText("CANCEL");
        tombolCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCancelActionPerformed(evt);
            }
        });

        tombolClear.setText("CLEAR");
        tombolClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolClearActionPerformed(evt);
            }
        });

        tombolKembali.setText("KEMBALI");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });

        textKodeKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tabelDaftarBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Stok", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelDaftarBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDaftarBarangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelDaftarBarang);
        if (tabelDaftarBarang.getColumnModel().getColumnCount() > 0) {
            tabelDaftarBarang.getColumnModel().getColumn(0).setResizable(false);
            tabelDaftarBarang.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelDaftarBarang.getColumnModel().getColumn(1).setResizable(false);
            tabelDaftarBarang.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelDaftarBarang.getColumnModel().getColumn(2).setResizable(false);
            tabelDaftarBarang.getColumnModel().getColumn(3).setResizable(false);
        }

        fieldTanggalKembali.setDateFormatString("dd-MM-yyy");
        fieldTanggalKembali.setMinSelectableDate(batasTanggal);
        fieldTanggalKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fieldTanggalKembaliMousePressed(evt);
            }
        });

        textTanggalPesanKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("TOTAL:");

        textTotalSemua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textTotalSemua.setText("Rp. 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fieldTanggalKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textTanggalPesanKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldNamaKasir, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldNoRegKasir, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tombolTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldJumlahKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(textKodeKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tombolCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(175, 175, 175))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tombolPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tombolKembali, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tombolClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)))
                                .addGap(14, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTotalSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(fieldNoRegKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(textKodeKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fieldNamaKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTanggalPesanKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldJumlahKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolTambah)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombolCancel)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTotalSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolPesan)
                            .addComponent(tombolClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolKembali)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPesanActionPerformed
        sK.klikTombolPesan();
    }//GEN-LAST:event_tombolPesanActionPerformed

    private void tombolClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolClearActionPerformed
        sK.klikTombolClear();
    }//GEN-LAST:event_tombolClearActionPerformed

    private void tomboltombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboltombolTambahActionPerformed
        try {
            sK.klikTombolTambah();
        } catch (ParseException ex) {
            Logger.getLogger(Kasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tomboltombolTambahActionPerformed

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        dispose();
        Utama u = new Utama();
        u.setVisible(true);
    }//GEN-LAST:event_tombolKembaliActionPerformed

    private void tabelDaftarBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDaftarBarangMouseClicked
        sK.klikTabelDaftarBarang();
    }//GEN-LAST:event_tabelDaftarBarangMouseClicked

    private void tombolCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCancelActionPerformed
        sK.klikTombolCancel();
    }//GEN-LAST:event_tombolCancelActionPerformed

    private void fieldNoRegKasirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNoRegKasirKeyTyped
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldNoRegKasirKeyTyped

    private void fieldJumlahKasirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldJumlahKasirKeyTyped
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldJumlahKasirKeyTyped

    private void fieldTanggalKembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldTanggalKembaliMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fieldTanggalKembaliMousePressed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Kasir().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Kasir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField fieldJumlahKasir;
    protected javax.swing.JTextField fieldNamaKasir;
    protected javax.swing.JTextField fieldNoRegKasir;
    protected com.toedter.calendar.JDateChooser fieldTanggalKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JTable tabelDaftarBarang;
    protected javax.swing.JTable tabelKasir;
    protected javax.swing.JLabel textKodeKasir;
    protected javax.swing.JLabel textTanggalPesanKasir;
    protected javax.swing.JLabel textTotal;
    protected javax.swing.JLabel textTotalSemua;
    private javax.swing.JButton tombolCancel;
    private javax.swing.JButton tombolClear;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolPesan;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables

}
