import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssnmntFiveAutoSuggDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Thread.sleep(4000L);

		// ASSIGNMENT
		// Enter the first three letters of your desired country
		driver.findElement(By.id("autocomplete")).sendKeys("UNI");
		Thread.sleep(3000L);
		// Select the desired country from the dropdown box
		// Use the arrow keys to navigate to the second selection
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);

		// Create a JavascriptExecutor and assign it to a variable
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate the element in the browser console and assign it to a variable
		String jsScript = "return document.getElementById(\"autocomplete\").value;";

		// Assign the JavascriptExecutor to a "String" variable
		String text = (String) jse.executeScript(jsScript);

		// Print out the text selected by
		System.out.println(text);

		// Create a variable to stop while loop if it reaches a certain number of cycles
		int i = 0;

		// Create a while loop with the target element as the argument.
		// Set while loop to " ! " NOTEQUALTO
		while (!text.equalsIgnoreCase("United Arab Emirates")) {
			// If loop fails, add 1 to i
			i++;
			// If loop fails key down one step
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);

			// Grab the text from the current element
			text = (String) jse.executeScript(jsScript);

			// Print out the element that was grabbed
			System.out.println(text);

			// Create an if statement to count how many iterations
			// The while loop has done. If it is greater than 10, break the loop
			if (i > 10) {
				break;			
				
			}
		}
		//Alternative solution would be to use the " .getAttribute("value") " method to get the same result
	}

}
