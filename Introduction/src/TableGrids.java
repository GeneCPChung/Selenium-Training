import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableGrids {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\genec\\Desktop\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/20313/aus-vs-sl-2nd-test-sri-lanka-tour-of-australia-2019");
		driver.manage().window().maximize();

		// Locate the element for the entire table
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// int rowCount = table.findElements(By.cssSelector("cb-col cb-col-100
		// cb-scrd-itms")).size();
		// Locate the target element using Parent/Child traversing
		// div[class='cb-col cb-col-100 cb-scrd-itms'] gets you to the row of the target
		// element
		// "(space)div:nth-child(3)" gets you to the target element !!NOTE: You must
		// have a space before "div:nth-child(3)"
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		// Create an int variable to assign the numbers in the loop to
		int sum = 0;
		// Create a for loop to iterate through the table
		for (int i = 0; i < count - 2; i++) {
			// and store the information into a String variable
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			// Change the "value" variable (currently a String) into an int using
			// "Integer.parseInt(value)"
			int valueInteger = Integer.parseInt(value);
			// As the loop goes processed, the values are stored into "valueInteger"
			// and added with "sum" and stored back into itself
			sum = sum + valueInteger;
		}
		//Print out the total
	//	System.out.println(sum);
		
		// Print out second to last line using Parent/Child navigation
		// Spy on first element in the row, then enter "/following-sibling::div" "div"
		// at the beginning
		// and end depends on the type of class for the css (might even be span)
	//	System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());

		// Print out the last line using the same process as above
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());

		// Assign the extras to a String variable
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		//Convert "Extras" to an integer
		int extrasValue = Integer.parseInt(Extras);
		//Add extrasValue to sum and assign to new variable TotalSumValue
		int TotalSumValue = sum + extrasValue;
		//Print out total
		System.out.println(TotalSumValue);
	}

}
