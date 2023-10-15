package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class CheckoutPage extends PageObject {
    private By usernameField3(){
        return By.id("user-name");
    }

    private By passwordField3() {
        return By.id("password");
    }
    private By loginButton3() {
        return By.id("login-button");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnLoginPage3() {
        return $(loginButton3()).isDisplayed();
    }

    @Step
    public void inputUserName3(String username) {
        $(usernameField3()).type(username);
    }

    @Step
    public void inputPassword3(String password) {
        $(passwordField3()).type(password);
    }

    @Step
    public void clickLoginButton3() {
        $(loginButton3()).click();
    }
    //GANTI CASE
    private By addtocartButton3(){
        return By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    }

    private By cartIcon3() {
        return By.id("shopping_cart_container");
    }



    @Step
    public void clickAddToCartButton3() {
        $(addtocartButton3()).click();
    }


    @Step
    public void clickCartIcon3() {
        $(cartIcon3()).click();
    }
    //GANTI CASE
    private By checkoutButton(){
        return By.id("checkout");
    }
    private By FNameField(){
        return By.id("first-name");
    }

    private By LNameField() {
        return By.id("last-name");
    }
    private By PostalCodeField() {
        return By.id("postal-code");
    }
    private By continueButton(){
        return By.id("continue");
    }
    private By finishButton(){
        return By.id("finish");
    }



    @Step
    public void clickCheckoutButton() {
        $(checkoutButton()).click();
    }

    @Step
    public void inputFirstName(String firstname) {
        $(FNameField()).type(firstname);
    }
    public void inputLastName(String lastname) {
        $(LNameField()).type(lastname);
    }
    public void inputPostalCode(String postalcode) {
        $(PostalCodeField()).type(postalcode);
    }
    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }
    @Step
    public void clickFinishButton() {
        $(finishButton()).click();
    }
}
