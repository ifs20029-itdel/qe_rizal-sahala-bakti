package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.Step;

public class CartPage extends PageObject {
    private By title(){
        return By.className("title");
    }

    @Step
    public void validateOnCartPage(){
        $(title()).isDisplayed();
    }
}
