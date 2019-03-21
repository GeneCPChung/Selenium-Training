package selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base{
	
	
	@Test
	
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();		
		LandingPage login = new LandingPage(driver);
		login.getLogin();
		
	}
}
