package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;
import cucumber.api.java.en.Then;

import java.io.IOException;

import org.junit.Assert;

import cucumber.api.java.en.And;

public class StepDefinitions extends base {
	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
	  
		driver =initializeDriver();
	    
	}

	@Given("Navigate to {string} Site")
	public void navigate_to_Site(String string) {
	   
		driver.get(string);
	}

	@Given("Click on Login link in home page to land on Secure sign in Page")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() {
		LandingPage l=new LandingPage(driver);
		l.getLogin().click(); //driver.findElement(By.css()
	    
	}

	@When("User enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String string, String string2) {
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(string);
		lp.getPassword().sendKeys(string2);
		
		lp.getLogin().click();
	    
	}

	@Then("Verify that user is succesfully logged in")
	public void verify_that_user_is_succesfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    PortalHomePage p = new PortalHomePage(driver);
	    Assert.assertTrue(p.getSearchBox().isDisplayed());
	}
	
}