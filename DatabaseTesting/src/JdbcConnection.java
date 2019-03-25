import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Connection;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root", "rootpassword");
		
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'nam';");
		
	while(	rs.next()) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath(".//input[@id='username']")).sendKeys(rs.getString("name"));
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys(rs.getString("location"));
	}
	}

}
