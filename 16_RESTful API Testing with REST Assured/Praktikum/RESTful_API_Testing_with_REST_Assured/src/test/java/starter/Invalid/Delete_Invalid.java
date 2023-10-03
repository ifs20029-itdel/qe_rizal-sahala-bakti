package starter.Invalid;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete_Invalid {
    protected static String url = "https://jsonplaceholder.typicode.com/postsdabc";

    @Step("user wants to delete post data with invalid ID")
    public String userWantToDeletePostDataWithInvalidID(){
        return url;
    }
    @Step("a user makes a request with the DELETE method on the endpoint Invalid")
    public void userMakeARequestWithTheDeleteMethodeOnEndpoitInvalid(){
        SerenityRest.given().delete(userWantToDeletePostDataWithInvalidID());
    }
    @Step("the system responds with the 404 status code")
    public void systemResponsWithThe404StatusCode(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
