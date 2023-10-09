package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostUser {
    protected static String url = "https://fakestoreapi.com/users";
    @Step("user is on the user list page Endpoint")
    public String userIsOnTheUserListPageEndpoint(){
        return url;
    }
    @Step("user request with the POST method on the endpoint")
    public void userRequestWithThePOSTMethodeOnTheEnpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheUserListPageEndpoint());
    }
    @Step("the system responds with the status code 200 ok")
    public void TheSystemresponds_WithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
