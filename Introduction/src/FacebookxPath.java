import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookxPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//tagName[@attribute='value'] - Xpath Syntax
/*		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); */
		
		//tagName[attribute='value'] - CSS Syntax
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my CSS");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		
	}

}
