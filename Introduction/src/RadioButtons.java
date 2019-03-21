import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
				
		Thread.sleep(2000L);
		//I was unable to use the xPath to find the element, but managed to use the CSS Selector to get the test to pass
		//driver.findElement(By.cssSelector("body.thebody:nth-child(2) td.main:nth-child(4) td.main span.text:nth-child(3) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) td.table5 > input:nth-child(3)")).click();
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		//This iterates through the above group and clicks on each radio button
		for (int i = 0; i < count; i++) 
		{
			//Thread.sleep(1000L);
			//Because we want to click on the last button in the group, using "i" instead of the index number is sufficient
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			//Determine the value of an attribute to be use in selecting the radio button dynamically
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			//Assign the code to a text variable and run it through the if statement to see if it matches
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//The if statement would not accept "==", so we use ".equals" instead to get the desired result
			if (text.equals("Cheese")) 
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
	}

}
