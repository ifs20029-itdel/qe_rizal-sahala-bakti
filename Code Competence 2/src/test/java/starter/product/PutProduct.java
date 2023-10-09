package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutProduct {
    protected static String url = "https://fakestoreapi.com/products/7";
    @Step("user is on the product PUT page Endpoint")
    public String userIsOnTheProductPUtPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the PUT method on the endpoint")
    public void UserMakesaRequestWithThePUTMEthodeonTheEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","test product");
        requestBody.put("price","13.5");
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image","https://i.pravatar.cc");
        requestBody.put("category","electronic");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userIsOnTheProductPUtPageEndpoint());
    }
    @Step("The system responds with the status code 200")
    public void TheSystemresponsWithTheStatusCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

