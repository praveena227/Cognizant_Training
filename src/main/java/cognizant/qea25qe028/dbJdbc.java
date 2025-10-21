package cognizant.qea25qe028;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class dbJdbc {
    public static void main(String args[]) {
        String username = "root";
        String password = "Praveena@2004";
        String address = "jdbc:mysql://localhost:3306/db";

        String createTab = "CREATE TABLE IF NOT EXISTS details(" +
                           "id INT AUTO_INCREMENT PRIMARY KEY, " +
                           "name VARCHAR(20), role VARCHAR(30))";
        String insertdata = "INSERT INTO details(name, role) VALUES(?, ?)";

        try {
            Connection connection = DriverManager.getConnection(address, username, password);

            
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createTab);

            
            PreparedStatement pstmt = connection.prepareStatement(insertdata);
            pstmt.setString(1, "praveena");
            pstmt.setString(2, "Gayatri");
            pstmt.executeUpdate();

            pstmt.setString(1, "tester");
            pstmt.setString(2, "devops");
            pstmt.executeUpdate();

            System.out.println("Table is created and data inserted.");

            
            pstmt.close();
            stmt.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}