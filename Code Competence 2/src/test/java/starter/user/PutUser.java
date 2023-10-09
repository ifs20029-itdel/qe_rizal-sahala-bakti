package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutUser {
    protected static String url = "https://fakestoreapi.com/users/7";
    @Step("user is on the user Update page Endpoint")
    public String userIsOnTheUserUpdatePageEnpoint(){
        return url;
    }
    @Step("user selects makes a request with the PUT method on the endpoint")
    public void userRequestWithThePutMethodeOnTheEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userIsOnTheUserUpdatePageEnpoint());
    }
    @Step("the system responds with the status code 200 ok")
    public void TheSystemresponds_With_TheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
