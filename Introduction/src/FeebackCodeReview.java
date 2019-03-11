import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FeebackCodeReview
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@title='Depart date']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		Select S = new Select(driver.findElement(By.id("Adults")));

		S.selectByIndex(5);

		driver.findElement(By.id("MoreOptionsLink")).click();

		Select S1 = new Select(driver.findElement(By.id("Class")));

		S1.selectByValue("Business");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("INDIGO");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
