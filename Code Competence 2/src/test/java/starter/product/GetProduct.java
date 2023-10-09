package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProduct {
    protected static String url = "https://fakestoreapi.com/products";

    @Step("user is on the product list page endpoint")
    public String UserisOnTheProductListPageEndpoint(){
        return url;
    }
    @Step("user requests the product list endpoint")
    public void UserrequestTheProductListEndpoint(){
        SerenityRest.given().get(UserisOnTheProductListPageEndpoint());
    }
    @Step("user should receive a list of products")
    public void UserShouldReceiveAListOfProduct(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive that the response code is 200 OK")
    public void thatTheRespodeCodeis200OK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
