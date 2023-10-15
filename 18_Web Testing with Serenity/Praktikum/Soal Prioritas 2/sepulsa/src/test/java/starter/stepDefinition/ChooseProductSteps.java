package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ChooseProductPage;

public class ChooseProductSteps {
    @Steps
    ChooseProductPage ChooseProductPage;

    @Given("I am on the home page")
    public void onHomePage(){
        ChooseProductPage.openUrl("https://www.sepulsa.com/");
        ChooseProductPage.validateOnTheHomePage();
    }
    @When("I click pulsa icon")
    public void clickPhoneCreditIcon(){
        ChooseProductPage.clickPhoneCreditIcon();
    }
    @And("I enter valid phone number")
    public void inputValidPhoneNumber(){
        ChooseProductPage.inputValidPhoneNumber("085360696324");
    }
    @And("I click nominal")
    public void clickNominal(){
        ChooseProductPage.clickNominal();
    }
    @Then("I am on the phone credit cart page")
    public void onCartPage(){
        ChooseProductPage.validateOnCartPage();
    }
}
