import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		
		//Click on link to open a second window
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		//Prints out title of the parent
		System.out.println(driver.getTitle());
		
		//Takes all open windows and adds them to a Set
		Set<String> ids = driver.getWindowHandles();
		
		//Assigns and iterator to the " it " variable
		Iterator<String> it = ids.iterator();
		
		//Starts at the top of the set and then moves to the first key/value pair
		//Assigns the parent window key/value pair to a "parentId" String 
		String parentId = it.next();
				
		//Moves to the next key/value pair and assigns it to the "childId" string
		String childId = it.next();
		
		//Switches from the parent window to the child window using the "childId" variable
		driver.switchTo().window(childId);
		
		//From this point on, you can work on the child window using normal "driver" methods
		//In order to work on the parent window, you will need to switch back to it
		
		//Prints out the title of the child window
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		
		//Switch back to the parent window using "parentId" variable
		driver.switchTo().window(parentId);
		
		//Print out the title of the parent window
		System.out.println(driver.getTitle());
		
	}

}
