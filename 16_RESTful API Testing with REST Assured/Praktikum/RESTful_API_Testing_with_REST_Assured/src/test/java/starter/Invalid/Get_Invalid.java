package starter.Invalid;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get_Invalid {
    protected static String url = "https://jsonplaceholder.typicode.com/postsdabc";

    @Step("user accesses the  endpoint based on an invalid ID")
    public String userAccesTheEndpointBasedOnInvalidID(){
        return url;
    }
    @Step("a user makes a request with the GET method on the Endpoint Invalid")
    public void userMakesRequestWithTheGEtMethodeOnEnpointInvalid(){
        SerenityRest.given().get(userAccesTheEndpointBasedOnInvalidID());
    }
    @Step("the system responds with the status code 404 ")
    public void SystemResponsWithTheStatusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
