package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {



    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void InitializeTest(){

        System.out.println("Opening the browser : MOCK");

        //Passing a dummy webdriver instance
        System.setProperty("webdriver.firefox.marionette", "C:\\Users\\genec\\Desktop\\workspace.geckodriver.exe");
        base.driver = new FirefoxDriver();


    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            //Take Screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }


}
