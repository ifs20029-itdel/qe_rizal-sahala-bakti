package starter.Invalid;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetID_Invalid {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/abc";

    @Step("user wants to get post data based on an invalid ID")
    public String userWantTOGetPostDataOnInvalidID(){
        return url;
    }
    @Step("a user makes a request with the GET method on the endpoint Invalid")
    public void userMakesaRequestWithTheGetMethodeOnEndpointInvalid(){
        SerenityRest.given().get(userWantTOGetPostDataOnInvalidID());
    }
    @Step("the system responds with the 404 status code and the appropriate error message")
    public void systemRespondWithThe404StatusCode(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

