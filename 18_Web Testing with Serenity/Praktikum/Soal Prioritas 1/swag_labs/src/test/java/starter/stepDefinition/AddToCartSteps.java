package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AddToCartPage;
import starter.pages.CartPage;

public class AddToCartSteps {

    @Given("I am on the login page2")
    public void onTheLoginPage2(){
        AddToCartPage.openUrl("https://www.saucedemo.com/");
        AddToCartPage.validateOnLoginPage2();
    }
    @When("I input valid username2")
    public void inputValidUserName2(){
        AddToCartPage.inputUserName2("standard_user");
    }
    @And("I input valid password2")
    public void inputValidPassword2(){
        AddToCartPage.inputPassword2("secret_sauce");
    }

    @And("I click login button2")
    public void clickLoginButton2(){
        AddToCartPage.clickLoginButton2();
    }
    @And("I am on the products page")
    public void onTheProductsPage(){
        AddToCartPage.validateOnProductsPage();
    }

    @Steps
    AddToCartPage AddToCartPage;

    @Steps
    CartPage CartPage;
    @And("I click Add to cart button")
    public void clickAddToCartButton(){
        AddToCartPage.clickAddToCartButton();
    }
    @And("I click cart icon")
    public void clickCartIcon(){
        AddToCartPage.clickCartIcon();
    }

    @Then("I am on the filled cart page")
    public void onTheCartPage(){
        CartPage.validateOnCartPage();
    }
}
