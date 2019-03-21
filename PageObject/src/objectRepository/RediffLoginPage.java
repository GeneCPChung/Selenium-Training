package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.xpath(".//*[@id='login1']");
	By passWord = By.name("passwd");
	By submit = By.name("proceed");
	By home = By.linkText("Home");	
			
	public WebElement EmailId() {
		return driver.findElement(userName);
	}
	
	public WebElement passWord() {
		return driver.findElement(passWord);
	} 
	
	public WebElement submit() {
		return driver.findElement(submit);
	} 
	
	public WebElement home() {
		return driver.findElement(home);
	} 

}
