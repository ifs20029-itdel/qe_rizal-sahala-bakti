package starter.User;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Put {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("user wants to change post data with ID 1 with valid data")
    public String userWantToChangePostDataWithID(){
        return url;
    }
    @Step("a user makes a request with the PUT method on the endpoint with post data")
    public String userMakesaRequestWithThePutMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","testya PUT");
        requestBody.put("body","testdong PUT");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userWantToChangePostDataWithID());
        return url;
    }

    @Step("the system gives a response with status code 200 and post data with ID 1 has been deleted")
    public void systemGiveaResponseWithStatusCode200andPostDataWithId1() {
        restAssuredThat(response -> response.statusCode(200));
    }
}



