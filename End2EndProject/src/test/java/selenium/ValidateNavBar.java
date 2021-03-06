package selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavBar extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	
	public void validateNavigationBar() throws IOException {
				
		LandingPage landingPage = new LandingPage(driver);
		
		//Validate that the navigation bar is displayed
		
		Assert.assertTrue(landingPage.getNavigation().isDisplayed());
		log.info("Successfully validated NavBar");
				
	}
	
	
	 @AfterMethod public void teardown() {
		 
		 driver.close(); 
		 driver = null;	 
	 }
	
		
	
	
	
	
	
	
	
	
	
	
	
	
}
