package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LandingPage {
	
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='sign_in']");	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getLogin() {
		driver.findElement(signIn).click();
	}
	
}
