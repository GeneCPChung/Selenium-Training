package MdntStudios;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class ValidateTitle extends Base {


    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");
        LandingPage l = new LandingPage(driver);
        //compare text from the browser with actual text - Error.
        //Assert.assertEquals(l.getTitle().getText(),"Featured Courses123");
        Assert.assertTrue(l.getNavigation().isDisplayed());

    }


}
