package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	 @FindBy(xpath= ".//*[@id='login1']")
	 WebElement userName;
	 
	 @FindBy(name= "passwd")
	 WebElement passWord;
	 
	 @FindBy(name= "proceed")
	 WebElement submit;
	 
	 @FindBy(linkText= "Home")
	 WebElement home;
	 
	public WebElement EmailId() {
		return userName;
	}
	
	public WebElement passWord() {
		return passWord;
	} 
	
	public WebElement submit() {
		return submit;
	} 
	
	public WebElement home() {
		return home;
	} 

}
