package starter.Invalid;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Put_Invalid {
    protected static String url = "https://jsonplaceholder.typicode.com/possdsd";

    @Step("user wants to change post data with an invalid ID")
    public String userWantChangePostDataWithInvalidID(){
        return url;
    }
    @Step("a user makes a request with the PUT method on the endpoint Invalid")
    public void userMakesaRequestWithThePutMethodeonEndpointInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","asdasd");
        requestBody.put("body","sdasdsd");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userWantChangePostDataWithInvalidID());
    }

    @Step("the system responds with the 404 status error message")
    public void systemResponsWithThe404StatusErrorMessage(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
