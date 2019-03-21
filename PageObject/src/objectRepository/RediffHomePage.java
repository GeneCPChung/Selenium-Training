package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
		
	@FindBy(xpath = ".//*[@class='homesprite shopicon']")
	WebElement shopping;
	
	@FindBy(id = "srchword")
	WebElement search;
	
	@FindBy(className = "newsrchbtn")
	WebElement submit;
	
	
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement Submit() {
		return submit;
	}
	
	public WebElement shopping() {
		return shopping;
	}

}
