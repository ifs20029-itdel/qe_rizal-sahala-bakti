package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected static String url = "https://fakestoreapi.com/products/6";

    @Step("user wants to delete post data with valid ID")
    public String UserWantToDeletePostDataWithValidID(){
        return url;
    }
    @Step("a user makes a request with the DELETE method on the endpoint")
    public void UserMakeArequestWithTheDeleteMethode(){
        SerenityRest.given().delete(UserWantToDeletePostDataWithValidID());
    }
    @Step("the system gives a response with status code 200")
    public void theSystemGiveAresponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
