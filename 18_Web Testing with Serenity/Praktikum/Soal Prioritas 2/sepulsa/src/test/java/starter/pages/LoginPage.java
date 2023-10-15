package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {
    private By signinhomeButton() {
        return By.id("button_signin_home");
    }
    private By emailField(){
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }
    private By masukButton() {
        return By.id("submit_login");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnNonAccountHomePage() {
        return $(signinhomeButton()).isDisplayed();
    }
    public boolean validateOnHomePage() {
        return $(masukButton()).isDisplayed();
    }
    @Step
    public void clickSigninHomeButton() {
        $(signinhomeButton()).click();
    }

    @Step
    public void inputValidEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputValidPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(masukButton()).click();
    }
}
