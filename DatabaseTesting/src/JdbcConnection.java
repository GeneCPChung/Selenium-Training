import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "rootpassword");
	}

}
