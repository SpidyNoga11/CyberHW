import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInject {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס מספר מזהה: ");
        String userInput = scanner.nextLine().trim();
        String sql = "SELECT * FROM strawberryusers WHERE strawberryID = " + userInput;

        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
          System.out.println(rs.getString("strawberry_Name"));
        }
    }
}