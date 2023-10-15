package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class LoginNegativePage extends PageObject {
    private By usernameFieldd(){
        return By.id("user-name");
    }

    private By passwordFieldd() {
        return By.id("password");
    }
    private By loginNegativeButton() {
        return By.id("login-button");
    }

    @Step

    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);

    }

    @Step
    public boolean validateOnLoginNegativePage() {
        return $(loginNegativeButton()).isDisplayed();
    }
    @Step
    public boolean validateStillOnTheLoginPage() {
        return $(loginNegativeButton()).isDisplayed();
    }

    @Step
    public void inputUserNamee(String username) {
        $(usernameFieldd()).type(username);
    }

    @Step
    public void inputInvalidPassword(String password) {
        $(passwordFieldd()).type(password);
    }

    @Step
    public void clickLoginNegativeButton() {
        $(loginNegativeButton()).click();
    }
}
