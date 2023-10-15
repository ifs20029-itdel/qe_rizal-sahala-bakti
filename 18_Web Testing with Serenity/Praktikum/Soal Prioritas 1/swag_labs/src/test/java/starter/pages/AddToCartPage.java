package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class AddToCartPage extends PageObject {
    private By usernameField2(){
        return By.id("user-name");
    }

    private By passwordField2() {
        return By.id("password");
    }
    private By loginButton2() {
        return By.id("login-button");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnLoginPage2() {
        return $(loginButton2()).isDisplayed();
    }

    @Step
    public void inputUserName2(String username) {
        $(usernameField2()).type(username);
    }

    @Step
    public void inputPassword2(String password) {
        $(passwordField2()).type(password);
    }

    @Step
    public void clickLoginButton2() {
        $(loginButton2()).click();
    }
    //GANTI CASE
    private By addtocartButton(){
        return By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    }

    private By cartIcon() {
        return By.id("shopping_cart_container");
    }

    @Step
    public boolean validateOnProductsPage() {
        return $(addtocartButton()).isDisplayed();
    }

    @Step
    public void clickAddToCartButton() {
        $(addtocartButton()).click();
    }


    @Step
    public void clickCartIcon() {
        $(cartIcon()).click();
    }
}
