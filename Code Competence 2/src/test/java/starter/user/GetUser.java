package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUser {
    protected static String url = "https://fakestoreapi.com/users";

    @Step("User is on the user page Endpoint")
    public String userIsOntheUserPageEndpoint(){
        return url;
    }
    @Step("user requests the user list Endpoint")
    public void UserrequestTheuserListEndpoint(){
        SerenityRest.given().get(userIsOntheUserPageEndpoint());

    }
    @Step("user should receive the user list")
    public void userShouldReceiveTheUserList(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive that the response code is 200")
    public void ReceiveThatTheResponseCodeis200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}