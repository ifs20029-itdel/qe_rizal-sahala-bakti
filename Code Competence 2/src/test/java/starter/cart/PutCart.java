package starter.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutCart {
    protected static String url = "https://fakestoreapi.com/products/7";
    @Step("user is on the product PUT page Endpoint")
    public String userIsOnTheProductPUtPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the PUT method on the endpoint")
    public void UserMakesaRequestWithThePUTMEthodeonTheEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId","3");
        requestBody.put("date","2019-12-10");
        requestBody.put("products", "[{productId:1,quantity:3}]");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userIsOnTheProductPUtPageEndpoint());
    }
    @Step("The system responds with the status code 200")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


