import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo
{

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Code\\TestAutomation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();	
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id=\'nav-link-accountList\']"));
		
		//use ALLCAPS in text field and double-click to highlight
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//moves to a specific element and right click
		a.moveToElement(move).contextClick().build().perform();
				
	}

}
