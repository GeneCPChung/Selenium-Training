import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		// Give me the count of links on the page
		// every link should have an anchor tag "a"
		System.out.println(driver.findElements(By.tagName("a")).size());

		// How many links are in the footer section
		// Create a WebElement and assign the footer ID to "footerDriver" variable
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		// Use the same code as above, but replace it with "footerDriver"
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// Count the links in only one column
		// Create a WebElement and assign the footer ID to "footerColumn" variable - YOU
		// MIGHT NEED TO CREATE A CUSTOM XPATH!!!!!
		WebElement footerColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		// Use th esame code as above, but replace with "footerColumn"
		System.out.println(footerColumn.findElements(By.tagName("a")).size());

		// Click on each link in the colunm and check if links are working
		//Create a for loop and iterate through each link. Use " .size() to ensure flexibility
		for (int i = 1; i < footerColumn.findElements(By.tagName("a")).size(); i++) {
			
			//Assign the the "Control-Click" to a variable
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			//Click on the link using the "clickOnLinkTab" variable to open each window as a separate tab
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(3000L);

		}
		
		//When all tabs are open, assign all of them to a "Set"
		Set<String> windows = driver.getWindowHandles();
		//Create an iterator to go through the "Set" of windows
		Iterator<String> it = windows.iterator();
		
		//Create a while loop to go through each window
		while (it.hasNext()) {
			
			//Switch to the next window
			driver.switchTo().window(it.next());
			//Print out the title of the window
			System.out.println(driver.getTitle());

		}

	}

}
