import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessCssSelector {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://login.salesforce.com/");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("fewrew");

	}

}
