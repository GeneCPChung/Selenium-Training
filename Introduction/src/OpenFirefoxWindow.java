import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxWindow {

	public static void main(String[] args) {
		
		// invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		
		//Assign FirefoxDriver to variable "driver"
		WebDriver driver = new FirefoxDriver();

		//Open a web browswer and goto facebook.com
		driver.get("http://facebook.com");
		// System.out.println(driver.getTitle());
		// rahulonlinetutor@gmail.com
		
		//Find the email input field via cssSelector and type "emailaddress"
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		
		//Find the password field via xPath and type "password"
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		
		//Find the "Log In" button via xPath and click it
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

	}

}
