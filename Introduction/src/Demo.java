import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//create driver object for chrome browser
		// We will strictly implement methods of webdriver
		
			/*Class name= ChromeDriver,
			 
					X driver=new X();*/
		
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\genec\\Desktop\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com"); //URL in browser
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot account?")).click();

	}

}

/*		driver.get("http://google.com"); //hit url on the browser
System.out.println(driver.getTitle()); //validate if your page title is correct
//rahulonlinetutor@gmail.com

System.out.println(driver.getCurrentUrl());//validate if you have landed on correct URL

//System.out.println(driver.getPageSource()); //print page source

driver.get("http://yahoo.com");
//driver.navigate().back();
//driver.navigate().forward();
driver.close();//closes current browser
//driver.quit(); //closes all browsers opened by selenium script
*/