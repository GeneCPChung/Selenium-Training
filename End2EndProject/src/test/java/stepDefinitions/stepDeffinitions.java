package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;

import java.io.IOException;

public class stepDeffinitions extends Base {

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@Given("Click on Login link in home page to land on sign in page")
	public void click_on_Login_link_in_home_page_to_land_on_sign_in_page() {
				
		LandingPage landingPage = new LandingPage(driver);
		if(landingPage.getPopUpSize()>0) {
			landingPage.getPopUp().click();
		}
		landingPage.getLogin().click();
	}


	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		PortalHomePage p = new PortalHomePage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());

	}
	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassWord().sendKeys(password);

		// log.info(text);
		lp.getButton().click();
    }
	
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }

}