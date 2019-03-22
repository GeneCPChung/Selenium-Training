package selenium;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String userName, String passWord, String text) throws IOException {
		driver = initializeDriver();		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getLogin().click();		
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("email");
		lp.getPassWord().sendKeys("password");
		System.out.println(text);
		lp.getButton().click();		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//Row stands for how many different data types test should run
		//column stands for how many values per each test
		
		//0th row
		Object[][] data = new Object[2][3];
		
		data[0][0] = "nonRestrictedUser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";
		
		//1st row
		data[0][0] = "restrictedUser@qw.com";
		data[0][1] = "456789";
		data[0][2] = "Non Restricted User";
		
		return data;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
