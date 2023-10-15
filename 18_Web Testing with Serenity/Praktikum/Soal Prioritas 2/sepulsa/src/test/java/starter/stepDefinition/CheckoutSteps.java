package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CheckoutPage;
import starter.pages.SuccessCOPage;

public class CheckoutSteps {

    @Given("I am on the login page3")
    public void onTheLoginPage3(){
        CheckoutPage.openUrl("https://www.saucedemo.com/");
        CheckoutPage.validateOnLoginPage3();
    }
    @When("I input valid username3")
    public void inputValidUserName3(){
        CheckoutPage.inputUserName3("standard_user");
    }
    @And("I input valid password3")
    public void inputValidPassword3(){
        CheckoutPage.inputPassword3("secret_sauce");
    }

    @And("I click login button3")
    public void clickLoginButton3(){
        CheckoutPage.clickLoginButton3();
    }
//    @And("I am on the home page3")
//    public void onTheHomePage3(){
//        CheckoutPage.validateOnHomePage3();
//    }

    @Steps
    CheckoutPage CheckoutPage;

    @Steps
    SuccessCOPage SuccessCOPage;
    @And("I click Add to cart button3")
    public void clickAddToCartButton3(){
        CheckoutPage.clickAddToCartButton3();
    }
    @And("I click cart icon3")
    public void clickCartIcon3(){
        CheckoutPage.clickCartIcon3();
    }

    @And("I click checkout button")
    public void clickCheckoutButton3(){
        CheckoutPage.clickCheckoutButton();
    }
    @And("I input First Name")
    public void inputFirstname(){
        CheckoutPage.inputFirstName("Rizal");
    }
    @And("I input Last Name")
    public void inputLastName(){
        CheckoutPage.inputLastName("Bakti");
    }
    @And("I input postal code")
    public void inputPostalCode(){
        CheckoutPage.inputPostalCode("asd1092387456");
    }
    @And("I click continue button")
    public void clickContinueButton(){
        CheckoutPage.clickContinueButton();
    }
    @And("I click finish button")
    public void clickFinishButton(){
        CheckoutPage.clickFinishButton();
    }
    @Then ("I am on the success checkout page")
    public void onSuccessCOPage(){
        SuccessCOPage.validateOnSuccessCOPage();
    }
}
