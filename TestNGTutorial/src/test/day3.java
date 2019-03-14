package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any method in the class");
	}
	
	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname, String key) {

		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);

	}
	
	@BeforeMethod
	public void afterevery() {
		System.out.println(" I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println(" After executing all methods in the class");
	}

	@Test(groups=("Smoke"))
	public void MobileLogincarLoan() {
		// appium
		System.out.println("Mobillogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am no. 1");
	}
	
	@Test(enabled=false)
	public void MobilesignincarLoan() {
		// appium
		System.out.println("Mobil SIGNIN");
	}
	
	@Test(dataProvider = "getData")
	public void MobilesingoutcarLoan(String username, String password) {
		// appium
		System.out.println("Mobil SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods= {"WebloginCarLoan", "MobilesingoutcarLoan"})
	public void APIcarLoan() {
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username and password
		//2nd - username password - no credit history
		//3rd - fraudulent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		//columns in th erow are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
	
}
