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


    @Given("I am on the login pagee")
    public void onTheLoginPagee(){
        LoginNegativePage.openUrl("https://www.saucedemo.com/");
        LoginNegativePage.validateOnLoginNegativePage();
    }
    @When("I input valid usernamee")
    public void inputValidUserNamee(){
        LoginNegativePage.inputUserNamee("standard_user");
    }
    @And("I input invalid password")
    public void inputInvalidPassword(){
        LoginNegativePage.inputInvalidPassword("yahahahayukk");
    }

    @And("I click login buttonn")
    public void clickLoginNegativeButton(){
        LoginNegativePage.clickLoginNegativeButton();
    }
    @Then("I can't go to home page")
    public void stillOnTheLoginPage(){
        LoginNegativePage.validateStillOnTheLoginPage();
    }
}
