package assignment;

public class JDBCExample {
    // File: JDBCExample.java
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Successful!");

            String query = "INSERT INTO students (name, rollNo) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "Nik");
            ps.setInt(2, 101);
            ps.executeUpdate();

            System.out.println("Record Inserted!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

}
