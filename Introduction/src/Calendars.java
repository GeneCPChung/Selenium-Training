import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendars {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		//Click on travel date field
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//List<WebElement> dates = driver.findElements(By.className("day"));
		
		//In order to select the month, you have to go to the parent node and then traverse to the month
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		
		//Create a while loop to iterate through the months until the desired month is selected
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();			
		}
		
		//Find the common attribute and put it into a list
		int count = driver.findElements(By.className("day")).size();
		
		//Iterate through the list
		for (int i = 0; i <count; i++) {
			//Get the text of the individual day
			driver.findElements(By.className("day")).get(i).getText();
			//Assign it to a variable so that i can be matched against the date
			String text = driver.findElements(By.className("day")).get(i).getText();
			
			//if "text" matches "23" execute the code
			if(text.equalsIgnoreCase("23")) {
				//click on the day
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
			
		}
		
	}

}
