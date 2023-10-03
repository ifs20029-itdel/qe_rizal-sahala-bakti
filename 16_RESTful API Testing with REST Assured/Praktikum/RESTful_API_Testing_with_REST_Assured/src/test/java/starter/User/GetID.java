package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetID {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("user wants to get post data based on a valid ID")
    public String wantGetpostOnValidID(){
        return url;
    }
    @Step("a user makes a request with the GET method on the endpoint")
    public void UserMakeaRequestWithGetMethodOnTheEndpoint(){
        SerenityRest.given().get(wantGetpostOnValidID());
    }

    @Step("the system gives a response with status code 200 and post data with ID 1")
    public void SystemGivesaResponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}

