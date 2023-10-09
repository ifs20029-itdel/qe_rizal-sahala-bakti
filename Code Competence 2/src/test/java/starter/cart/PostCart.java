package starter.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCart {
    protected static String url = "https://fakestoreapi.com/carts";

    @Step("user is on the product cart page Endpoint")
    public String useIsOntheProductCartPageEndPoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint")
    public void userMakes_a_RequestwithThePOstMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", "5");
        requestBody.put("date", "2020-02-03");
        requestBody.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(useIsOntheProductCartPageEndPoint());
    }
    @Step("The system respond with the status code 200")
    public void Thesystem_respondWuthTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
