import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
    private static final String DB_URL = "jdbc:sqlserver://DESKTOP-1U1T9EL\\SQLEXPRESS;databaseName=REGISTRATION;encrypt=true;trustServerCertificate=true";
    private static final String DB_USERNAME = "rj24";
    private static final String DB_PASSWORD = "1234";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        if (isValidLogin(email, password)) {

            // Redirect to the welcome page after successful login
            response.sendRedirect("welcome.jsp");
        } else {
            // Set an error message to display on the login page
 
        	response.sendRedirect("login.html?error=1");
        }
    }

    private boolean isValidLogin(String email, String password) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String query = "SELECT COUNT(*) FROM INFO WHERE email = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, email);
                statement.setString(2, password);

                try (ResultSet resultSet = statement.executeQuery()) {
                    resultSet.next();
                    int count = resultSet.getInt(1);
                    return count == 1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
}
}
