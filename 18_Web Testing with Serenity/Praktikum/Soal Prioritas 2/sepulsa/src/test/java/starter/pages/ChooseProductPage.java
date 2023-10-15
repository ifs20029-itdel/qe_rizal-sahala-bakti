package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class ChooseProductPage extends PageObject {
    private By phonecreditIcon() {
        return By.id("product_type_0");
    }

    private By phoneField() {
        return By.id("phone_number");
    }

    private By nominalOption() {
        return By.id("Telkomsel Rp200.000");
    }

    @Step

    public static OpenUrl url(String targeturl) {
        return new OpenUrl(targeturl);
    }

    @Step
    public boolean validateOnTheHomePage() {
        return $(phonecreditIcon()).isDisplayed();
    }

    public boolean validateOnCartPage() {
        return $(nominalOption()).isDisplayed();
    }

    @Step
    public void clickPhoneCreditIcon() {
        $(phonecreditIcon()).click();
    }

    @Step
    public void inputValidPhoneNumber(String email) {
        $(phoneField()).type(email);
    }

    @Step
    public void clickNominal() {
        $(nominalOption()).click();
    }

}