package MdntStudios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {
    public Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username, String Password, String text) throws IOException {

        driver.get(prop.getProperty("url"));
        log.info("Navigated to Home Page");
        LandingPage l = new LandingPage(driver);
        l.getLogin().click();
        log.info("Clicked on Login Link");
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        log.info("Entered Email");
        lp.getPassword().sendKeys(Password);
        log.info("Entered Password");
        lp.getLogin().click();
        log.info(text);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][3];

        data[0][0] = "nonrestricteduser@def.com";
        data[0][1] = "123456";
        data[0][2] = "Unrestricted User";

        data[1][0] = "restricteduser@def.com";
        data[1][1] = "678910";
        data[1][2] = "Restricted User";

        return data;
    }

}
