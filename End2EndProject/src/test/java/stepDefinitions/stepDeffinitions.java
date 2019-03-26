package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;

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
		// Write code here that turns the phrase above into concrete actions
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getLogin().click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(strArg1);
		lp.getPassWord().sendKeys(strArg2);

		// log.info(text);
		lp.getButton().click();
	}

	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		PortalHomePage p = new PortalHomePage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());

	}

}