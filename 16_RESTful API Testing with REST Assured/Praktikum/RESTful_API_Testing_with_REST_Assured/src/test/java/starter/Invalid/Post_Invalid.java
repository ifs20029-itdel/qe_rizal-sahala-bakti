package starter.Invalid;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post_Invalid {
    protected static String url = "https://jsonplaceholder.typicode.com/postsdabc";

    @Step("user wants to create new post data with invalid id")
    public String userWantTOCreateNewPostDataWithInvalid(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint Invalid")
    public void userMakesaRequestWithThePOSTmethodeOnEnpointInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","testya");
        requestBody.put("body","testdong");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userWantTOCreateNewPostDataWithInvalid());
    }
    @Step("the system responds with the status code 404 and the appropriate error message")
    public void systemRespondsWithTheStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

}
