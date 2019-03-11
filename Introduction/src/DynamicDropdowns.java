import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// //a[@value='MAA'] - xpath for Chennai
		
		// //a[@value='BLR'] - xpath for Bengaluru
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//Without indexes
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//td[@class='mapbg'] //a[@value='BLR']")).click();
		
		
		
		
	}

}
