import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiIframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spinbot.com/Login");
		int number = findFrameNumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		
		int i;
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		for (i = 0; i < frameCount; i++) {
			driver.switchTo().frame(i);
			
			int count = driver.findElements(by).size();
			
			if(count>0) {
				driver.findElement(by).click();
				break;
			}
			else {
				System.out.println("Continue Looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
		
	}

}
