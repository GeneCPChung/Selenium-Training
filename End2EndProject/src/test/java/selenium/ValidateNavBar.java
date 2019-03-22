package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavBar extends Base{
	
	
	@Test
	
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();		
		LandingPage landingPage = new LandingPage(driver);
		
		//Validate that the navigation bar is displayed
		
		Assert.assertTrue(landingPage.getNavigation().isDisplayed());
		
		
		
		
		
	}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
