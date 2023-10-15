package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginNegativePage;

public class LoginNegativeSteps {
    @Steps
    LoginNegativePage LoginNegativePage;

    @Given("I am on the non-account home pagee")
    public void onTheNonAccountHomePagee(){
        LoginNegativePage.openUrl("https://www.sepulsa.com/");
        LoginNegativePage.validateOnNonAccountHomePagee();
    }
    @When("I click signin home buttonn")
    public void clickSigninHomeButtonn(){
        LoginNegativePage.clickSigninHomeButtonn();
    }
    @And("I input invalid email")
    public void inputInvalidEmail(){
        LoginNegativePage.inputInvalidEmail("rizalsahala@gmail.com");
    }
    @And("I input valid passwordd")
    public void inputValidPasswordd(){
        LoginNegativePage.inputValidPasswordd("Samosir17");
    }

    @And("I click Masuk buttonn")
    public void clickLoginButton(){
        LoginNegativePage.clickLoginButtonn();
    }
    @Then("I can't go to my account home page")
    public void onTheHomePage(){
        LoginNegativePage.validateStillOnLoginPage();
    }
}
