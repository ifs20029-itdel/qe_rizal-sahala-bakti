package starter.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCart {
    protected static String url = "https://fakestoreapi.com/carts";

    @Step("user is on the cart list page endpoint")
    public String UserIsOnTheCartListPageEndpoint(){
        return url;
    }

    @Step("user requests the cart list endpoint")
    public void user_RequestTheCartListEnpoint(){
        SerenityRest.given().get(UserIsOnTheCartListPageEndpoint());

    }
    @Step("user should receive a list of cart")
    public void UserShouldReceviceAlistOfCart(){
        restAssuredThat(response -> response.log().all());
    }

    @Step("user receive that the response code is 200 OK")
    public void UserReceiveThatTheResponseCodeIs200Ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
