
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            String url = "jdbc:mysql://localhost:3306/Local instance MySQL80";
            String username = "root";
            String password = "Per4ik29091994";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}