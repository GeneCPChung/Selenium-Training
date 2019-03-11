import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		// use select class to click dropdown and select two adults
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByIndex(1);

		// use select class to click "children" dropdown and select one child
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByIndex(1);

		// click on "Depart On" and select the current date
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"))
				.click();

		// click on "More Options" link
		driver.findElement(By.id("MoreOptionsLink")).click();

		// Select "Preferred Airline" field and enter "Indigo" in field
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

		// click on "Search Flights" button
		driver.findElement(By.id("SearchBtn")).click();

		// grab error message and print out on console
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
