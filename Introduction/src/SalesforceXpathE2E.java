import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceXpathE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("my email");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}

}
