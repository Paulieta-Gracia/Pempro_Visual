package Main;
import login.LoginFrame;
import Database.Db;

public class Main {
    public static void main(String[] args) {
        Db.ConnectionDB();
        
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
    }
}
