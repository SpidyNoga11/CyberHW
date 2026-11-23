import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class NsqlInjection {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("הכנס מספר מזהה: ");

        int userInput = scanner.nextInt();

        String sql = "SEL1ECT * FROM strawberryusers WHERE strawberryID = ? ;";
        PreparedStatement stataement = DatabaseConnection.getConnection().prepareStatement(sql);

        stataement.setInt(1, userInput);

       ResultSet re = stataement.executeQuery() ; 
        while (re.next()) {
          System.out.println(re.getString("strawberry_Name"));
        }
    }
}
