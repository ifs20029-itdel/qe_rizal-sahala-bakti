package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected static String url = "https://fakestoreapi.com/users/6";

    @Step("user wants to delete users data with valid ID")
    public String userWantToDeleteUsersDataWithValidID(){
        return url;
    }
    @Step("user selects makes a request with the DELETE method on the endpoint")
    public void UserSelectsMakeArequestWithTheDeleteMethode(){
        SerenityRest.given().delete(userWantToDeleteUsersDataWithValidID());
    }
    @Step("the system gives a response with status code 200ok")
    public void theSystemGiveAresponseWithStatusCode_200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
