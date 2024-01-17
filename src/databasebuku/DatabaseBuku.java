
package databasebuku;
import com.DatabaseCon.DBcon;
import com.login.LoginFrame;
public class DatabaseBuku {

    public static void main(String[] args) {
        //Buat objel untuk login frame
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();

        DBcon.loadConnection();
    }
    
}
