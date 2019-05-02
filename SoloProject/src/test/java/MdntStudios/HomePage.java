package MdntStudios;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {


    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username, String Password, String text) throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");
        LandingPage l = new LandingPage(driver);
        l.getLogin().click();
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
        System.out.println(text);
        lp.getLogin().click();

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
