package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage LoginPage;

    @Given("I am on the non-account home page")
    public void onTheNonAccountHomePage(){
        LoginPage.openUrl("https://www.sepulsa.com/");
        LoginPage.validateOnNonAccountHomePage();
    }
    @When("I click signin home button")
    public void clickSigninHomeButton(){
        LoginPage.clickSigninHomeButton();
    }
    @And("I input valid email")
    public void inputValidEmail(){
        LoginPage.inputValidEmail("rizalsahala125@gmail.com");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        LoginPage.inputValidPassword("Samosir17");
    }

    @And("I click Masuk button")
    public void clickLoginButton(){
        LoginPage.clickLoginButton();
    }
    @Then("I am on the my account home page")
    public void onTheHomePage(){
        LoginPage.validateOnHomePage();
    }
}
