import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// Currency
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(3);
		s.selectByVisibleText("AED");
		// Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while (i < 5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;// 2 adults
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// From Origin
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		// To Destination
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		// "Done" Button
		Thread.sleep(2000L);
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date1")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		} else
		{
			Assert.assertTrue(false);
		}

	}

}
