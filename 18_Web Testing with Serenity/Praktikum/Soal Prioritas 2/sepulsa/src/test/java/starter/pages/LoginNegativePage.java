package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class LoginNegativePage extends PageObject {
    private By signinhomeButtonn() {
        return By.id("button_signin_home");
    }
    private By emailFieldd(){
        return By.id("email");
    }

    private By passwordFieldd() {
        return By.id("password");
    }
    private By masukButtonn() {
        return By.id("submit_login");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnNonAccountHomePagee() {
        return $(signinhomeButtonn()).isDisplayed();
    }
    public boolean validateStillOnLoginPage() {
        return $(masukButtonn()).isDisplayed();
    }
    @Step
    public void clickSigninHomeButtonn() {
        $(signinhomeButtonn()).click();
    }

    @Step
    public void inputInvalidEmail(String email) {
        $(emailFieldd()).type(email);
    }

    @Step
    public void inputValidPasswordd(String password) {
        $(passwordFieldd()).type(password);
    }

    @Step
    public void clickLoginButtonn() {
        $(masukButtonn()).click();
    }
}
