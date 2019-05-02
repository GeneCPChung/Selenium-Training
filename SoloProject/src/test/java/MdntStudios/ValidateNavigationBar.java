package MdntStudios;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavigationBar extends Base {

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void basePageNavigation(){
        LandingPage l = new LandingPage(driver);
        Assert.assertTrue(l.getNavigation().isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
