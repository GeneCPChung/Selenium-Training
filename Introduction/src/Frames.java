import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Code\\TestAutomation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// to determine how many iframes there are in on a page
		driver.findElements(By.tagName("iframe")).size();

		// switch from parent window to the iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		// find the "draggable" element and click on it
		driver.findElement(By.id("draggable")).click();

		Thread.sleep(3000L);

		// Invoke the "Actions" method and assign it to " a "
		Actions a = new Actions(driver);

		// find the "draggable" element and assign it to the "source" WebElement
		// variable
		WebElement source = driver.findElement(By.id("draggable"));

		// find the "target" element and assign it to the "target" WebElement variable
		WebElement target = driver.findElement(By.id("droppable"));

		// use dragAndDrop method to move source to target
		a.dragAndDrop(source, target).build().perform();

	}

}
