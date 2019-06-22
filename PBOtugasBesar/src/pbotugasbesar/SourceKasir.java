package pbotugasbesar;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HNDRWN
 */
public class SourceKasir {
    String[] data = new String[4];
    String url;
    File file;
    BufferedReader br;
    BufferedWriter bw;
    FileWriter fw;
    int total = 0, kembali = 0;
    Date tanggal = new Date();
    DateFormat df = new SimpleDateFormat("dd-MM-yyy");
    String stringTanggal = df.format(tanggal);
    Kasir kasir;
    
    protected SourceKasir(Kasir kasir) {
        this.kasir = kasir;
    }
    
    protected void loadData() {
        kasir.modelTabelDaftarBarang.getDataVector().removeAllElements();
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            Object[] lData = br.lines().toArray();
            
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                kasir.modelTabelDaftarBarang.addRow(data);
            }
        }catch(IOException e){
        }
    }
    
    protected void saveData() {
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0;i < kasir.tabelDaftarBarang.getRowCount();i++){
                for(int j = 0;j < kasir.tabelDaftarBarang.getColumnCount();j++){
                    bw.write(kasir.tabelDaftarBarang.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }
    
    protected void saveDataPesan(String nama, String stringTanggal, String tanggalKembali){
        url = "src/Database/daftarPenyewa.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(nama+"\t"+stringTanggal+"\t"+tanggalKembali);
            bw.newLine();
            bw.close();
        }catch(IOException e){
        }
    }
    
    protected void saveDataDipinjam(String nama){
        url = "src/Database/barangDipinjam.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file, true));
            for(int i = 0;i < kasir.tabelKasir.getRowCount();i++){
                bw.write(nama + "\t");
                for(int j = 1;j < kasir.tabelKasir.getColumnCount() - 1;j++){
                    
                    bw.write(kasir.tabelKasir.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }

    protected void klikTabelDaftarBarang() {
        kasir.fieldKodeKasir.setText("");
        kasir.fieldKodeKasir.setText(kasir.tabelDaftarBarang.getValueAt(kasir.tabelDaftarBarang.getSelectedRow(), 0).toString());
    }

    protected void klikTombolClear() {
        kasir.fieldNoRegKasir.setText("");
        kasir.fieldNamaKasir.setText("");
        kasir.fieldKodeKasir.setText("");
        kasir.fieldJumlahKasir.setText("");
    }
    
    protected void klikTombolTambah() {
        String[] data2 = new String[4];
        String kodeBarang = kasir.fieldKodeKasir.getText();
        String stringJumlahBarang = kasir.fieldJumlahKasir.getText();
        int jumlahBarang = Integer.parseInt(stringJumlahBarang);
        String namaBarang = "";
        int hargaBarang = 0,stokBarang = 0,  baris = 0;
        boolean ada = false;
        if(kodeBarang.equals("") || stringJumlahBarang.equals("") || kasir.fieldNamaKasir.equals("")){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data!", "Perhatian", HEIGHT);
        }
        else{
            for(int i = 0;i < kasir.tabelDaftarBarang.getRowCount();i++){
                if(kodeBarang.equals(kasir.modelTabelDaftarBarang.getValueAt(i, 0))){
                    namaBarang = kasir.modelTabelDaftarBarang.getValueAt(i, 1).toString();
                    hargaBarang = Integer.parseInt(kasir.modelTabelDaftarBarang.getValueAt(i, 3).toString());
                    stokBarang = Integer.parseInt(kasir.modelTabelDaftarBarang.getValueAt(i, 2).toString());
                    baris = i;
                    ada = true;
                }
            }
            
            if(ada && stokBarang >= jumlahBarang){
                stokBarang -= jumlahBarang;
                kasir.modelTabelDaftarBarang.setValueAt(stokBarang, baris, 2);
                saveData();
                loadData();
                data2[0] = kodeBarang;
                data2[1] = namaBarang;
                data2[2] = "" + jumlahBarang;
                data2[3] = "" + (hargaBarang * jumlahBarang);
                kasir.modelTabelKasir.addRow(data2);
                total += (hargaBarang * jumlahBarang);
                kasir.textTotal.setText("Rp. " + total);
                kasir.tabelDaftarBarang.setSelectionMode(1);
                saveData();
            }
            else{
                JOptionPane.showMessageDialog(null, "Data Kurang");
            }
        }
    }
    
    protected void klikTombolPesan() {
        String tanggalKembali = "";
        tanggalKembali = df.format(kasir.fieldTanggalKembali.getDate());
        if(total == 0){
            JOptionPane.showMessageDialog(null, "Harap Pilih Barang!", "Perhatian", HEIGHT);
        }
        else{
            String nama = kasir.fieldNamaKasir.getText();
            saveDataDipinjam(nama);
            saveDataPesan(nama, stringTanggal, tanggalKembali);
            kasir.fieldNoRegKasir.setText("");
            kasir.fieldNamaKasir.setText("");
            kasir.fieldKodeKasir.setText("");
            kasir.fieldJumlahKasir.setText("");
            kasir.fieldTanggalKembali.setDate(null);
            for(int i = 0;i <= kasir.tabelKasir.getRowCount();i++){
                kasir.modelTabelKasir.removeRow(i);
            }
            kasir.textTotal.setText("Rp. 0");
            total = 0;
        }
    }
    
    protected void klikTombolCancel() throws NumberFormatException, HeadlessException {
        int jKembali = 0, hKembali = 0;
        String kKembali = "";
        if(kasir.tabelKasir.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            int line = kasir.tabelKasir.getSelectedRow();
            jKembali = Integer.parseInt(kasir.tabelKasir.getValueAt(line, 2).toString());
            hKembali = Integer.parseInt(kasir.tabelKasir.getValueAt(line, 3).toString());
            kKembali = kasir.tabelKasir.getValueAt(line, 0).toString();
            
            for(int i = 0;i < kasir.tabelDaftarBarang.getRowCount();i++){
                if(kKembali.equals(kasir.modelTabelDaftarBarang.getValueAt(i, 0))){
                    int dataAwal = Integer.parseInt(kasir.modelTabelDaftarBarang.getValueAt(i, 2).toString());
                    
                    int sKembali = dataAwal + jKembali;
                    
                    String data2 = Integer.toString(sKembali);
                    
                    kasir.modelTabelDaftarBarang.setValueAt(data2, i, 2);
                }
            }
            total -= hKembali;
            kasir.textTotal.setText("Rp. " + total);
            kasir.modelTabelKasir.removeRow(line);
            saveData();
        }
        saveData();
    }
}
