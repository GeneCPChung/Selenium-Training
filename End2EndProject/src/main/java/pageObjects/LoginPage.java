package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.cssSelector("[id='user_email']");
	By passWord = By.cssSelector("[type='password']");
	By button = By.cssSelector("[type='submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {

		return driver.findElement(email);
	}

	public WebElement getPassWord() {

		return driver.findElement(passWord);
	}

	public WebElement getButton() {

		return driver.findElement(button);
	}

}