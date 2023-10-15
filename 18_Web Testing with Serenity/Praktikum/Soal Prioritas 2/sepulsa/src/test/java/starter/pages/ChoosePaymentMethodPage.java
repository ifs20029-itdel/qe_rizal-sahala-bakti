package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;

public class ChoosePaymentMethodPage extends PageObject {
    private By phonecreditIcon2() {
        return By.id("product_type_0");
    }

    private By phoneField2() {
        return By.id("phone_number");
    }

    private By nominalOption2() {
        return By.id("Telkomsel Rp200.000");
    }
    private By emailfield() {
        return By.id("guest_email");
    }
    private By phonefield() {
        return By.id("guest_phone");
    }
    private By lainnyaOption() {
        return By.id("show_all_payment");
    }

    private By gopayRadiobutton() {
        return By.id("checkbox Gopay");
    }
    private By bayarButton() {
        return By.id("submit_payment");
    }

    @Step

    public static OpenUrl url(String targeturl) {
        return new OpenUrl(targeturl);
    }

    @Step
    public boolean validateOnTheHomePage2() {
        return $(phonecreditIcon2()).isDisplayed();
    }

    public boolean validateOnCartPage2() {
        return $(nominalOption2()).isDisplayed();
    }
    public boolean validateOnPaymentPage() {
        return $(bayarButton()).isDisplayed();
    }

    @Step
    public void clickPhoneCreditIcon2() {
        $(phonecreditIcon2()).click();
    }

    @Step
    public void inputValidPhoneNumber2(String phone) {
        $(phoneField2()).type(phone);
    }

    @Step
    public void clickNominal2() {
        $(nominalOption2()).click();
    }
    @Step
    public void inputEmailCorrectly(String email) {
        $(emailfield()).type(email);
    }
    @Step
    public void inputPhoneNumberCorrectly(String email) {
        $(phonefield()).type(email);
    }
    @Step
    public void clickLainnya() {
        $(lainnyaOption()).click();
    }
    @Step
    public void clickGopay() {
        $(gopayRadiobutton()).click();
    }
    @Step
    public void clickBayar() {
        $(bayarButton()).click();
    }
}