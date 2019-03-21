package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

public class LoginApplication {
	// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in pageFactory style
	
	@Test
	public void Login() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.passWord().sendKeys("12345");
		rd.submit().click();
		rd.home().click();
		Thread.sleep(5000L);
		RediffHomePage rh = new RediffHomePage(driver);
		rh.shopping().click();
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
	
	}
}
