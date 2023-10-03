package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("user wants to delete post data with valid ID 1")
    public String userWantToDeletePostDataWithID(){
        return url;
    }


    @Step("user makes a request with the DELETE method on the endpoint")
    public void makeaRequestWithTheDeleteMethod(){
        SerenityRest.given().delete(userWantToDeletePostDataWithID());
    }


    @Step("The system gives a response with status code 200 and post data with ID 1 has been deleted")
    public void systemGiveaResponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
