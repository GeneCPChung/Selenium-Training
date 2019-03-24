package selenium;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String userName, String passWord, String text) throws IOException {
		
		driver.get(prop.getProperty("url"));	
		if(driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[3]/div/div/p")).isDisplayed()) {
			 driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")).click(); }
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getLogin().click();				
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("email");
		lp.getPassWord().sendKeys("password");
		
		log.info(text);
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
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver = null;
	}
	
	
	
	
	
	
	
	
	
}
