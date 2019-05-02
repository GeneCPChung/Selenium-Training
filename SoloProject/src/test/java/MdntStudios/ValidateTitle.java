package MdntStudios;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class ValidateTitle extends Base {

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void basePageNavigation() throws IOException {
        LandingPage l = new LandingPage(driver);
        //compare text from the browser with actual text - Error.
        Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
