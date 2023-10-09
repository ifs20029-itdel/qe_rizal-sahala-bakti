package starter.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCart {
    protected static String url = "https://fakestoreapi.com/carts/6";

    @Step("user wants to delete Cart with valid ID")
    public String UserWantToDeleteCartWithValidID(){
        return url;
    }
    @Step("a user makes a request with the Delete method on the endpoint")
    public void UserMakeArequestWithTheDelete_Methode(){
        SerenityRest.given().delete(UserWantToDeleteCartWithValidID());
    }
    @Step("the system give a response with status code 200")
    public void theSystemGiveA_responseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

