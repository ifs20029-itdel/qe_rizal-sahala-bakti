package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("that the user wants to create a new post data with valid data")
    public String CreateaNewPostData(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint with post data")
    public void userMakesaRequestWithThePOSTMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","testya");
        requestBody.put("body","testdong");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(CreateaNewPostData());
    }
    @Step("the system responds with the status code 201 and the post data that was just created")
    public void theSystemRespondsWithTheStatusCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

}
