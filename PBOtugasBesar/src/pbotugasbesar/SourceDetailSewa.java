package pbotugasbesar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HNDRWN
 */
public class SourceDetailSewa {
    String[] data= new String[4];
    String url, url2;
    File file, file2;
    BufferedReader br,br2;
    BufferedWriter bw;
    FileWriter fw;
    String nama, stringTanggal, noReg;
    DetailSewa detailS;
    
    
    
    protected SourceDetailSewa(DetailSewa detailS){
        this.detailS = detailS;
    }
    
    protected void loadData(String noReg, String nama) {
        url = "src/Database/daftarPenyewa.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            Object[] lData = br.lines().toArray();
            for (Object lData1 : lData) {
                String[] data = lData1.toString().split("\t");
                if(data[0].equals(noReg) && data[1].equals(nama)){
                    detailS.textNoReg.setText(noReg);
                    detailS.textNama.setText(nama);
                    detailS.textTanggalMasuk.setText(data[2]);
                    detailS.textTanggalKembali.setText(data[3]);
                }
            }
            br.close();
            }catch(IOException e){
            }
        loadDataTabel(noReg, nama);
    }

    protected void loadDataTabel(String noReg, String nama) {
        detailS.modelTabelDetailSewa.getDataVector().removeAllElements();
        url2 = "src/Database/barangDipinjam.txt";
        file2 = new File(url2);
        try {
            br2 = new BufferedReader(new FileReader(file2));
            Object[] lData2 = br2.lines().toArray();
            for (int i = 0; i < lData2.length; i++) {
                String[] data2 = lData2[i].toString().split("\t");
                if (data2[0].equals(noReg) && data2[1].equals(nama)){
                    System.out.println(data2[2]+" "+data2[3]);
                    detailS.modelTabelDetailSewa.addRow(new Object[]{"", ""});
                    detailS.modelTabelDetailSewa.setValueAt(data2[2], i, 0);
                    detailS.modelTabelDetailSewa.setValueAt(data2[3], i, 1);
                }
            }
        }catch(IOException e){
        }
    }
}
