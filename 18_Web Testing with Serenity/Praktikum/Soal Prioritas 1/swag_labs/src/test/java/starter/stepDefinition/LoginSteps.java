package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.HomePage;
public class LoginSteps {
    @Steps
    LoginPage LoginPage;

    @Steps
    HomePage HomePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        LoginPage.openUrl("https://www.saucedemo.com/");
        LoginPage.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUserName(){
        LoginPage.inputUserName("standard_user");
//        login.enterEmailOrPhoneAndPassword();
    }
    @And("I input valid password")
    public void inputValidPassword(){
        LoginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton(){
        LoginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        HomePage.validateOnHomePage();
    }
}
