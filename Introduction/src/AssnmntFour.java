import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssnmntFour {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		// Select a checkbox from the checkbox example
		driver.findElement(By.id("checkBoxOption3")).click();

		// Grab the label of the selected checkbox //Put into a variable
		String option = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(option);

		// Select an option from the dropdown that coresponds with the checkbox //use
		// variable from step two
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(option);

		// Enter step 2 label text into edit box
		driver.findElement(By.id("name")).sendKeys(option);

		// Click "alert" and verify if text grabbed is in alert box
		driver.findElement(By.id("alertbtn")).click();

		// Verify correct option is listed in pop-up screen
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText(); 
		if (text.contains(option)) {
			System.out.println("Mission Success!");
		}
		else {
			System.out.println("Mission Failure!");
		}

	}

}
