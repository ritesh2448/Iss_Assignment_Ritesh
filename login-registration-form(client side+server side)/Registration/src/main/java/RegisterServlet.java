import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    // Configure the database connection parameters
    private static final String DB_URL = "jdbc:sqlserver://DESKTOP-1U1T9EL\\SQLEXPRESS;databaseName=REGISTRATION;encrypt=true;trustServerCertificate=true";
    private static final String DB_USERNAME = "rj24";
    private static final String DB_PASSWORD = "1234";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (isValidRegistration(email, password)) {
            // Registration successful
            if (storeUserData(email, password)) {
                // Redirect to the login page,if successfully stored in database
                response.sendRedirect("login.html");
            } else {
                // Handle database error or registration failure
            	
                response.sendRedirect("register.html");
            }
        } else {
            // Registration failed

            // Show error and Redirect back to the registration page
            response.sendRedirect("register.html?error=1");
        }
    }

    private boolean isValidRegistration(String email, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "SELECT COUNT(*) FROM INFO WHERE email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, email);
                try (ResultSet rs = stmt.executeQuery()) {
                    rs.next();
                    int count = rs.getInt(1);
                    return count == 0; // Returns true if email is not registered, false otherwise
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean storeUserData(String email, String password) {
        try {
     
            Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
           
            String sql = "INSERT INTO INFO (email, password) VALUES (?, ?)";

            // Create a prepared statement with parameterized values to prevent SQL injection
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);

            int rowsAffected = statement.executeUpdate();

            statement.close();
            connection.close();

            return true; // Return true if the data was successfully inserted
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if there was an error storing the data
        }
    }
}

