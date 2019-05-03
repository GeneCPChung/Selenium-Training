package MdntStudios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateTitle extends Base {
    public Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
        log.info("Navigated to Home Page");
    }

    @Test
    public void basePageNavigation() throws IOException {
        LandingPage l = new LandingPage(driver);
        //compare text from the browser with actual text - Error.
        Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
        log.info("Successfully validated text message");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
