package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class ClosePopUp extends Base {
	
	@Test
	public void initialize() throws IOException, InterruptedException {
		driver = initializeDriver();
		Thread.sleep(10000L);
		if(!driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[3]/div/div/p")).getText().isEmpty()) {
		 driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")).click(); }
		
		
	}
	
	@AfterMethod
	public void closing() {
		
		driver.close();
		driver = null;
	}
}
