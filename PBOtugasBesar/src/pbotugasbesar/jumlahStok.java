/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotugasbesar;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thesa
 */
public class jumlahStok extends javax.swing.JFrame {

    /**
     * Creates new form jumlahStok
     */
    String url;
    File file;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;
    DefaultTableModel modelTabelStok;
    
    public jumlahStok() {
        initComponents();
        
        setLocationRelativeTo(this);
        setResizable(false);
        
        modelTabelStok = (DefaultTableModel)tabelStok.getModel();
        
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelStok = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateStok = new javax.swing.JButton();
        deleteStok = new javax.swing.JButton();
        saveStok = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah Stok", "Harga Barang"
            }
        ));
        tabelStok.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabelStok);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("DAFTAR STOK");

        updateStok.setText("Update");
        updateStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStokActionPerformed(evt);
            }
        });

        deleteStok.setText("Delete");
        deleteStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStokActionPerformed(evt);
            }
        });

        saveStok.setText("Save");
        saveStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateStok)
                    .addComponent(deleteStok, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveStok, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(updateStok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteStok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveStok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 120, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 120, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStokActionPerformed
        // TODO add your handling code here:
        saveStok();
    }//GEN-LAST:event_saveStokActionPerformed

    private void deleteStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStokActionPerformed
        // TODO add your handling code here:
        deleteStok();
        
    }//GEN-LAST:event_deleteStokActionPerformed

    private void updateStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStokActionPerformed
        // TODO add your handling code here:
        dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_updateStokActionPerformed

    private void tKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        utama u = new utama();
        u.setVisible(true);
    }//GEN-LAST:event_tKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(jumlahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jumlahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jumlahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jumlahStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jumlahStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteStok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveStok;
    private javax.swing.JButton tKembali;
    private javax.swing.JTable tabelStok;
    private javax.swing.JButton updateStok;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        modelTabelStok.getDataVector().removeAllElements();
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            Object[] lData = br.lines().toArray();
            
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                modelTabelStok.addRow(data);
            }
        }catch(IOException e){
        }
    }

    private void deleteStok() {
        if(tabelStok.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            int line = tabelStok.getSelectedRow();
            modelTabelStok.removeRow(line);
            
        }
    }

    private void saveStok() {
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0;i < tabelStok.getRowCount();i++){
                for(int j = 0;j < tabelStok.getColumnCount();j++){
                    bw.write(tabelStok.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }
    
}
