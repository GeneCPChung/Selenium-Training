package selenium;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to landing page");
	}

	@Test

	public void validateAppTitle() throws IOException {

		LandingPage landingPage = new LandingPage(driver);

		// compare the text from the browser with the actual text
		Assert.assertEquals(landingPage.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validated Text message");
	}

	@AfterMethod
	public void teardown() {

		driver.close();
		driver = null;
	}

}
