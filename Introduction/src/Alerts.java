import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptheadnbody.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input")).click();
		Thread.sleep(2000L);
		
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("Hello"); //Add text to an alert text box
		driver.switchTo().alert().accept(); //Accept, ok, done, yes
		//driver.switchTo().alert().dismiss(); //Decline, cancel, return, no
		

	}

}
