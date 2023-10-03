package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {

    protected static String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("user accesses the  endpoint")
    public String UserAccessesTheEndpoint(){
        return url;
    }

    @Step("a user makes a request with the GET method")
    public void UserMakesaRequestWithGetMethod(){
        SerenityRest.given().get(UserAccessesTheEndpoint());
    }

    @Step("the system responds with the status code 200 and the available post data")
    public void SystemRespondsWithTheStatuscode200(){
        restAssuredThat(response -> response.statusCode(200));
    }


}
