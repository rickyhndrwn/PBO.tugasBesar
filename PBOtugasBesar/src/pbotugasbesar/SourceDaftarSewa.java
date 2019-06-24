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
public class SourceDaftarSewa {
    String[] data= new String[4];
    String url;
    File file;
    BufferedReader br;
    BufferedWriter bw;
    FileWriter fw;
    String nama = "", stringTanggal, noReg = "";
    DaftarSewa dS;
    
    protected SourceDaftarSewa(DaftarSewa dS){
        this.dS = dS;
    }
    
    protected void loadData() {
        dS.modelTabelDaftarPenyewa.getDataVector().removeAllElements();
        url = "src/Database/daftarPenyewa.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            Object[] lData = br.lines().toArray();
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                dS.modelTabelDaftarPenyewa.addRow(data);
            }
        }catch(IOException e){
        }
    }
    
    protected void saveData(){
        url = "src/Database/daftarPenyewa.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0;i < dS.tabelDaftarPenyewa.getRowCount();i++){
                for(int j = 0;j < dS.tabelDaftarPenyewa.getColumnCount();j++){
                    bw.write(dS.tabelDaftarPenyewa.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }
    
    protected void klikTombolDetail() throws HeadlessException {
        if(dS.tabelDaftarPenyewa.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            int baris = dS.tabelDaftarPenyewa.getSelectedRow();
            String noReg = dS.modelTabelDaftarPenyewa.getValueAt(baris, 0).toString();
            String nama = dS.modelTabelDaftarPenyewa.getValueAt(baris, 1).toString();
            dS.dispose();
            DetailSewa d = new DetailSewa(noReg, nama);
            d.setVisible(true);
        }
    }
    
    protected void klikTombolDelete() throws HeadlessException {
        if(dS.tabelDaftarPenyewa.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            int line = dS.tabelDaftarPenyewa.getSelectedRow();
            dS.modelTabelDaftarPenyewa.removeRow(line);
        }
    }
}
