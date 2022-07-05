package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("user navigates to facebook website")
    public void userNavigatesToFacebookWebsite() {
        System.out.println("facebook-user navigates to facebook website");
    }

    @When("user validates the home page title")
    public void userValidatesTheHomePageTitle() {
        System.out.println("facebook-user validates the home page title");
    }

    @Then("user entered the username")
    public void userEnteredTheUsername() {
        System.out.println("facebook-user entered the username");
    }
    @Then("user should be successfully logged in")
    public void userShouldBeSuccessfullyLoggedIn() {
        System.out.println("facebook-user should be successfully logged in");
    }
    @And("user entered the password")
    public void userEnteredThePassword() {
        System.out.println("facebook-ser entered the password");
    }








    @Then("user entered the Invalid username")
    public void user_entered_the_invalid_username() {
        System.out.println("user entered the Invalid username");
    }
    @Then("user entered the Invalid password")
    public void user_entered_the_invalid_password() {
        System.out.println("user entered the Invalid password");
    }
    @Then("user should not  successfully logged in")
    public void user_should_not_successfully_logged_in() {
        System.out.println("user should not  successfully logged in");
    }




}
