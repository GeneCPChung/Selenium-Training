package selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base{
	
	
	@Test
	
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();		
		LandingPage landingPage = new LandingPage(driver);
		
		//compare the text from the browser with the actual text
		Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
		
		
		
		
		
		
	}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
