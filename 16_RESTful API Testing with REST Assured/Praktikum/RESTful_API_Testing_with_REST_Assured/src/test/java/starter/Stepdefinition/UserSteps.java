package starter.Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Invalid.*;
import starter.User.*;

public class UserSteps {

    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    GetID getID;
    @Steps
    Put Putid;
    @Steps
    Delete Deletid;
    @Steps
    GetID_Invalid Getidinvalid;
    @Steps
    Put_Invalid Putinvalid;
    @Steps
    Delete_Invalid Deletinvalid;
    @Steps
    Get_Invalid Getinvalid;
    @Steps
    Post_Invalid Postinvalid;


    @Given("user accesses the  endpoint")
    public void userAccessesTheEndpoint() {
        get.UserAccessesTheEndpoint();
    }

    @When("a user makes a request with the GET method")
    public void aUserMakesARequestWithTheGETMethod() {
        get.UserMakesaRequestWithGetMethod();
    }

    @Then("the system responds with the status code 200 and the available post data")
    public void theSystemRespondsWithTheStatusCodeAndTheAvailablePostData() {
        get.SystemRespondsWithTheStatuscode200();
    }


    @Given("that the user wants to create a new post data with valid data")
    public void thatTheUserWantsToCreateANewPostDataWithValidData() {
        post.CreateaNewPostData();
    }

    @When("a user makes a request with the POST method on the endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointWithPostData() {
        post.userMakesaRequestWithThePOSTMethod();
    }

    @Then("the system responds with the status code 201 and the post data that was just created")
    public void theSystemRespondsWithTheStatusCodeAndThePostDataThatWasJustCreated() {
        post.theSystemRespondsWithTheStatusCode201();
    }

    @Given("user wants to get post data based on a valid ID")
    public void userWantsToGetPostDataBasedOnAValidID() {
        getID.wantGetpostOnValidID();

    }

    @When("a user makes a request with the GET method on the endpoint")
    public void aUserMakesARequestWithTheGETMethodOnTheEndpoint() {
        getID.UserMakeaRequestWithGetMethodOnTheEndpoint();
    }

    @Then("the system gives a response with status code 200 and post data with ID 1")
    public void theSystemGivesAResponseWithStatusCodeAndPostDataWithID() {
        getID.SystemGivesaResponseWithStatusCode200();
    }

    @Given("user wants to change post data with ID 1 with valid data")
    public void userWantsToChangePostDataWithIDWithValidData() {

        Putid.userWantToChangePostDataWithID();
    }

    @When("a user makes a request with the PUT method on the endpoint with post data")
    public void aUserMakesARequestWithThePUTMethodOnTheEndpointWithPostData() {
        Putid.userMakesaRequestWithThePutMethode();
    }

    @Then("the system gives a response with status code 200 and post data with ID 1 which has been changed")
    public void theSystemGivesAResponseWithStatusCodeAndPostDataWithIDWhichHasBeenChanged() {
        Putid.systemGiveaResponseWithStatusCode200andPostDataWithId1();
    }

    @Given("user wants to delete post data with valid ID 1")
    public void userWantsToDeletePostDataWithValidID() {
        Deletid.userWantToDeletePostDataWithID();
    }

    @When("a user makes a request with the DELETE method on the endpoint")
    public void aUserMakesARequestWithTheDELETEMethodOnTheEndpoint() {
        Deletid.makeaRequestWithTheDeleteMethod();
    }

    @Then("the system gives a response with status code 200 and post data with ID 1 has been deleted")
    public void theSystemGivesAResponseWithStatusCodeAndPostDataWithIDHasBeenDeleted() {
        Deletid.systemGiveaResponseWithStatusCode200();
    }

    @Given("user wants to get post data based on an invalid ID")
    public void userWantsToGetPostDataBasedOnAnInvalidID() {
        Getidinvalid.userWantTOGetPostDataOnInvalidID();
    }

    @When("a user makes a request with the GET method on the endpoint Invalid")
    public void aUserMakesARequestWithTheGETMethodOnTheEndpointHttpsJsonplaceholderTypicodeComPostsAbc() {
        Getidinvalid.userMakesaRequestWithTheGetMethodeOnEndpointInvalid();
    }

    @Then("the system responds with the 404 status code and the appropriate error message")
    public void theSystemRespondsWithTheStatusCodeAndTheAppropriateErrorMessage() {
        Getidinvalid.systemRespondWithThe404StatusCode();
    }

    @Given("user wants to change post data with an invalid ID")
    public void userWantsToChangePostDataWithAnInvalidID() {
        Putinvalid.userWantChangePostDataWithInvalidID();
    }

    @When("a user makes a request with the PUT method on the endpoint Invalid")
    public void aUserMakesARequestWithThePUTMethodOnTheEndpointInvalid() {
        Putinvalid.userMakesaRequestWithThePutMethodeonEndpointInvalid();
    }

    @Then("the system responds with the 404 status error message")
    public void theSystemRespondsWithTheStatusErrorMessage() {
        Putinvalid.systemResponsWithThe404StatusErrorMessage();
    }

    @Given("user wants to delete post data with invalid ID")
    public void userWantsToDeletePostDataWithInvalidID() {
        Deletinvalid.userWantToDeletePostDataWithInvalidID();
    }

    @When("a user makes a request with the DELETE method on the endpoint Invalid")
    public void aUserMakesARequestWithTheDELETEMethodOnTheEndpointInvalid() {
        Deletinvalid.userMakeARequestWithTheDeleteMethodeOnEndpoitInvalid();
    }

    @Then("the system responds with the 404 status code")
    public void theSystemRespondsWithTheStatusCode() {
        Deletinvalid.systemResponsWithThe404StatusCode();

    }

    @Given("user accesses the  endpoint based on an invalid ID")
    public void userAccessesTheEndpointBasedOnAnInvalidID() {
        Getinvalid.userAccesTheEndpointBasedOnInvalidID();
    }

    @When("a user makes a request with the GET method on the Endpoint Invalid")
    public void aUserMakesARequestWithTheGETMethodOnTheEndpointInvalid() {
        Getinvalid.userMakesRequestWithTheGEtMethodeOnEnpointInvalid();

    }

    @Then("the system responds with the status code 404")
    public void theSystemRespondsWithTheStatus() {
        Getinvalid.SystemResponsWithTheStatusCode404();
    }

    @Given("user wants to create new post data with invalid ID")
    public void userWantsToCreateNewPostDataWithInvalidID() {
        Postinvalid.userWantTOCreateNewPostDataWithInvalid();
    }

    @When("a user makes a request with the POST method on the endpoint Invalid")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointInvalid() {
        Postinvalid.userMakesaRequestWithThePOSTmethodeOnEnpointInvalid();
    }

    @Then("the system responds with the status code 404 and the appropriate error message")
    public void theSystemRespondsWithTheStatusCodeAndTheAppropriateError() {
        Postinvalid.systemRespondsWithTheStatusCode404();
    }


}

