package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginUser {
    protected static String url = "https://fakestoreapi.com/auth/login";
    @Step("user is enter valid Endpoint")
    public String userIsEnterValidEnpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint enters valid id and password")
    public void UserMakesArequestWithTheOstMethodeOntHeEnpointEntersValidIdAndPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username","mor_2314");
        requestBody.put("password","83r5^_");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsEnterValidEnpoint());
    }
    @Step("System responds with the status code 200")
    public void SystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
