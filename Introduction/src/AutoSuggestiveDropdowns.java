import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		//Find the dropdown element and enter the text "BENG"
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000L);
		//Use the arrow keys to navigate to the second selection
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		
		//Attempt to get the text from the selection. It should not show a result
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		//Create a JavascriptExecutor and assign it to a variable
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Locate the element in the browser console and assign it to a variable
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		
		//Assign the JavascriptExecutor to a "String" variable
		String text = (String) js.executeScript(script);
		
		//Print out the text selected by 
		System.out.println(text);
		
		//Create a variable to stop while loop if it reaches a certain number of cycles
		int i = 0;
		
		//Create a while loop with the target element as the argument. 
		//Set while loop to " ! " NOTEQUALTO
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {
			//If loop fails, add 1 to i
			i++;
			//If loop fails key down one step
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);	
			
			//Grab the text from the current element
			text = (String) js.executeScript(script);
			
			//Print out the element that was grabbed
			System.out.println(text);
			
			//Create an if statement to count how many iterations
			//The while loop has done. If it is greater than 10, break the loop
			if(i>10) {
				break;
				
			}
		}
		
		//Print out if target has not been found
		if (i>10) {
			System.out.println("Element not found");
		}
		
		//Print out if target has been found
		else {
			System.out.println("Element found");
		}
		
	}

	public void AutoSuggestiveDropdowns1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("mum");
		Thread.sleep(1000L);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));

		destination.sendKeys("del");
		Thread.sleep(1000L);

		for (int i = 1; i < 5; i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}

		Thread.sleep(1000L);
		destination.sendKeys(Keys.ENTER);
	}

}
