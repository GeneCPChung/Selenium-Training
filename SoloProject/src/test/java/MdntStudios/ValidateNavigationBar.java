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

public class ValidateNavigationBar extends Base {

    public Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void basePageNavigation(){
        LandingPage l = new LandingPage(driver);
        Assert.assertTrue(l.getNavigation().isDisplayed());
        log.info("Successfully validated navigation bar");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
