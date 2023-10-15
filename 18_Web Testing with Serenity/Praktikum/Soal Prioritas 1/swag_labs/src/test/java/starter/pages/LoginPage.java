package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("user-name");
    }

    private By passwordField() {
        return By.id("password");
    }
    private By loginButton() {
        return By.id("login-button");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }
}
