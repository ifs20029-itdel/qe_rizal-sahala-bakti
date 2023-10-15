package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ChoosePaymentMethodPage;

public class ChoosePaymentMethodSteps {
    @Steps
    ChoosePaymentMethodPage ChoosePaymentMethodPage;

    @Given("I am on the home page2")
    public void onHomePage2(){
        ChoosePaymentMethodPage.openUrl("https://www.sepulsa.com/");
        ChoosePaymentMethodPage.validateOnTheHomePage2();
    }
    @When("I click pulsa icon2")
    public void clickPhoneCreditIcon2(){
        ChoosePaymentMethodPage.clickPhoneCreditIcon2();
    }
    @And("I enter valid phone number2")
    public void inputValidPhoneNumber2(){
        ChoosePaymentMethodPage.inputValidPhoneNumber2("085360696324");
    }
    @And("I click nominal2")
    public void clickNominal2(){
        ChoosePaymentMethodPage.clickNominal2();
    }
    @And("I am on the cart page")
    public void onCartPage2(){
        ChoosePaymentMethodPage.validateOnCartPage2();
    }
    @And("I enter my email correctly")
    public void inputEmailCorrectly(){
        ChoosePaymentMethodPage.inputEmailCorrectly("rizalsahala125@gmail.com");
    }
    @And("I enter my phone correctly")
    public void inputPhoneCorrectly(){
        ChoosePaymentMethodPage.inputPhoneNumberCorrectly("085360696324");
    }
    @And("I click lainnya dropdown")
    public void clickLainnya(){
        ChoosePaymentMethodPage.clickLainnya();
    }
    @And("I click gopay radiobutton")
    public void clickGopay(){
        ChoosePaymentMethodPage.clickGopay();
    }
    @And("I click Bayar Sekarang button")
    public void clickBayar(){
        ChoosePaymentMethodPage.clickBayar();
    }
    @Then("I am on the gopay payment code page")
    public void onPaymentPage(){
        ChoosePaymentMethodPage.validateOnPaymentPage();
    }
}
