package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("I navigated to the login page");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("I clicked on the button");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
    }

    @And("^I enter the following details for Login$")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) throws Throwable{

       //List<List<String>> data = table.raw();

        /*System.out.println("The Value is : " + data.get(0).get(0));
        System.out.println("The Value is : " + data.get(0).get(1));*/

        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user: users){
            System.out.println("The UserName is : " + user.username);
            System.out.println("The Password is : " + user.password);
        }
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }


    public class User{
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
