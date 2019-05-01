import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create driver object for IE browser
		// We will strictly implement methods of webdriver
		
			/*Class name = InternetExplorerDriver,
			 
					X driver=new X();*/
		
		//invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\Users\\genec\\Desktop\\workspace\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		//rahulonlinetutor@gmail.com

	}
}
