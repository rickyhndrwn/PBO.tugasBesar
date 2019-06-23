package pbotugasbesar;

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
public class SourceJumlahStok {
    String url;
    File file;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;
    JumlahStok jS;
    
    public SourceJumlahStok(JumlahStok jS) {
        this.jS = jS;
    }
    
    public void loadData() {
        jS.modelTabelStok.getDataVector().removeAllElements();
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            Object[] lData = br.lines().toArray();
            
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                jS.modelTabelStok.addRow(data);
            }
        }catch(IOException e){
        }
    }
    
    public void deleteStok() {
        if(jS.tabelStok.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Harap Pilih Baris!", "Perhatian", HEIGHT);
        }
        else{
            int line = jS.tabelStok.getSelectedRow();
            jS.modelTabelStok.removeRow(line);
        }
    }
    
    public void saveStok() {
        url = "src/Database/stok.txt";
        file = new File(url);
        try{
            bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0;i < jS.tabelStok.getRowCount();i++){
                for(int j = 0;j < jS.tabelStok.getColumnCount();j++){
                    bw.write(jS.tabelStok.getValueAt(i, j).toString() + "\t");
                }
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
        }
    }
}
