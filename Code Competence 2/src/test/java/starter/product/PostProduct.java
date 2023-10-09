package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProduct {
    protected static String url = "https://fakestoreapi.com/products";
    @Step("user is on the product POST page endpoint")
    public String userIsOnTheProductPostPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint with post data")
    public void UserMakesArequestWithTheOstMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","test product");
        requestBody.put("price","13.5");
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image","https://i.pravatar.cc");
        requestBody.put("category","electronic");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductPostPageEndpoint());
    }
    @Step("tthe system responds with the status code 201")
    public void TheSystemresponsWithTheStatusCode201(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
