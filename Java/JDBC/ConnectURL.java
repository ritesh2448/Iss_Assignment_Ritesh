package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {
    public static void main(String[] args) {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://DESKTOP-1U1T9EL\\SQLEXPRESS;databaseName=REGISTRATION;encrypt=true;trustServerCertificate=true";
        String user ="rj24";
        String password = "1234";
        
        try  {
            
        	Connection con = DriverManager.getConnection(connectionUrl,user,password);
        	System.out.print("connected");        	
        	String sql = "INSERT INTO INFO (email, password) VALUES (?, ?)";

            // Create a prepared statement with parameterized values to prevent SQL injection
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "ritesh@gmail.com");
            statement.setString(2, "4567");
            int rows = statement.executeUpdate();

           if (rows>0) {
        	   System.out.println("row has been inserted");
           }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}