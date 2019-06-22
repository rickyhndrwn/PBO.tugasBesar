package pbotugasbesar;

import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author HNDRWN
 */
public class SourceLogin {
    Login login;
    
    protected SourceLogin(Login login) {
        this.login = login;
    }
    
    protected void klikTombolLogin() throws HeadlessException {
        if(login.userText.equals("") || login.passText.equals("")){
            JOptionPane.showMessageDialog(null, "Harap Lengkapi Data!", "Perhatian", HEIGHT);
        }
        else{
            String user = login.userText.getText();
            String pass = login.passText.getText();
            String user1 = "admin";
            String pass1 = "admin";
            if(user.equals(user1) && pass.equals(pass1)){
                login.userText.setText("");
                login.passText.setText("");
                login.dispose();
                TambahStok ts = new TambahStok();
                ts.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "username atau password salah", "Perhatian", HEIGHT);
            }
        }
    }
}
