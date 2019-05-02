package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


    public WebDriver driver;

    By email = By.cssSelector("[id='user_email']");
    By password = By.cssSelector("[type='password']");
    By login = By.cssSelector("[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail() {return driver.findElement(email);}

    public WebElement getPassword() {return driver.findElement(password);}

    public WebElement getLogin() {return driver.findElement(login);}

    /*
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
*/
}
