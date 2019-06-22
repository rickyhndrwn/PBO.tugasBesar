package pbotugasbesar;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HNDRWN
 */
public class SourceTambahStok {
    String[] data = new String[4];
    String url;
    File file;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;
    TambahStok tS;
    
    protected SourceTambahStok(TambahStok tS) {
        this.tS = tS;
    }
    
    protected void loadData() {
        tS.modelTabelTambahStok.getDataVector().removeAllElements();
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
           Object[] lData = br.lines().toArray();
            
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                tS.modelTabelTambahStok.addRow(data);
            }
        }catch(IOException e){
        }
    }
    
    protected void klikTombolSimpan() {
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0;i < tS.tabelTambahStok.getRowCount();i++){
                for(int j = 0;j < tS.tabelTambahStok.getColumnCount();j++){
                    bw.write(tS.tabelTambahStok.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }
    
    protected void klikTombolTambah() throws HeadlessException {
        boolean kSama = false, nSama = false;
        for(int i = 0;i < tS.tabelTambahStok.getRowCount();i++){
            if(tS.fieldKodeStok.getText().equals(tS.tabelTambahStok.getValueAt(i, 0))){
                kSama = true;
            }
            if(tS.fieldNamaStok.getText().equals(tS.tabelTambahStok.getValueAt(i, 1))){
                nSama = true;
            }
        }
        if(kSama){
            JOptionPane.showMessageDialog(null, "Kode Barang Kembar!", "Perhatian", HEIGHT);
        }
        if(nSama){
            JOptionPane.showMessageDialog(null, "Nama Barang Kembar!", "Perhatian", HEIGHT);
        }
        else if(!kSama && !nSama){
            if(tS.fieldKodeStok.getText().equals("") ||
                    tS.fieldNamaStok.getText().equals("") ||
                    tS.fieldJumlahStok.getText().equals("") ||
                    tS.fieldHargaStok.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harap Lengkapi Data!", "Perhatian", HEIGHT);
            }
            else{
                data[0] = tS.fieldKodeStok.getText();
                data[1] = tS.fieldNamaStok.getText();
                data[2] = tS.fieldJumlahStok.getText();
                data[3] = tS.fieldHargaStok.getText();
                
                tS.modelTabelTambahStok.addRow(data);
                
                tS.fieldKodeStok.setText("");
                tS.fieldNamaStok.setText("");
                tS.fieldJumlahStok.setText("");
                tS.fieldHargaStok.setText("");
            }
        }
    }
    
    protected void klikTombolUpdate() throws HeadlessException {
        if((tS.fieldKodeStok.getText().equals("") ||
                tS.fieldNamaStok.getText().equals("") ||
                tS.fieldJumlahStok.getText().equals("") ||
                tS.fieldHargaStok.getText().equals("")) &&
                tS.tabelTambahStok.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data atau Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            data[0] = tS.fieldKodeStok.getText();
            data[1] = tS.fieldNamaStok.getText();
            data[2] = tS.fieldJumlahStok.getText();
            data[3] = tS.fieldHargaStok.getText();
            
            int line = tS.tabelTambahStok.getSelectedRow();
            
            tS.modelTabelTambahStok.setValueAt(data[0], line, 0);
            tS.modelTabelTambahStok.setValueAt(data[1], line, 1);
            tS.modelTabelTambahStok.setValueAt(data[2], line, 2);
            tS.modelTabelTambahStok.setValueAt(data[3], line, 3);
        }
    }
    
    protected void klikTabelTambahStok() {
        tS.fieldKodeStok.setText("");
        tS.fieldKodeStok.setText(tS.tabelTambahStok.getValueAt(tS.tabelTambahStok.getSelectedRow(), 0).toString());
        tS.fieldNamaStok.setText("");
        tS.fieldNamaStok.setText(tS.tabelTambahStok.getValueAt(tS.tabelTambahStok.getSelectedRow(), 1).toString());
        tS.fieldJumlahStok.setText("");
        tS.fieldJumlahStok.setText(tS.tabelTambahStok.getValueAt(tS.tabelTambahStok.getSelectedRow(), 2).toString());
        tS.fieldHargaStok.setText("");
        tS.fieldHargaStok.setText(tS.tabelTambahStok.getValueAt(tS.tabelTambahStok.getSelectedRow(), 3).toString());
    }
}
