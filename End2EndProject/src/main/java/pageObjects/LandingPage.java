package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LandingPage {
	
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href*='sign_in']");	
	By title = By.cssSelector(".text-center>h2");
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup = By.xpath(".//button[text()='NO THANKS']");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signIn);
		
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public int getPopUpSize() {
		return driver.findElements(popup).size();
	}	
	
	public WebElement getPopUp() {
		return driver.findElement(popup);
	}
	
	public WebElement getNavigation() {
		return driver.findElement(title);
	}
	
	
}
