package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.cart.DeleteCart;
import starter.cart.GetCart;
import starter.cart.PostCart;
import starter.cart.PutCart;
import starter.login.LoginUser;
import starter.product.DeleteProduct;
import starter.product.GetProduct;
import starter.product.PostProduct;
import starter.product.PutProduct;
import starter.user.DeleteUser;
import starter.user.GetUser;
import starter.user.PostUser;
import starter.user.PutUser;

public class UserSteps {
    @Steps
    GetProduct getProduct;
    @Steps
    PostProduct postProduct;
    @Steps
    PutProduct putProduct;
    @Steps
    DeleteProduct deleteProduct;

    //Cart
    @Steps
    GetCart getCart;
    @Steps
    PostCart postCart;
    @Steps
    PutCart putCart;
    @Steps
    DeleteCart deleteCart;

    //LOGIN
    @Steps
    LoginUser loginUser;

    // USER
    @Steps
    GetUser getUser;
    @Steps
    PostUser postUser;
    @Steps
    PutUser putUser;
    @Steps
    DeleteUser deleteUser;

    @Given("user is on the product list page endpoint")
    public void userIsOnTheProductListPageEndpoint() {
        getProduct.UserisOnTheProductListPageEndpoint();
    }

    @When("user requests the product list endpoint")
    public void userRequestsTheProductListEndpoint() {
        getProduct.UserrequestTheProductListEndpoint();
    }

    @Then("user should receive a list of products")
    public void userShouldReceiveAListOfProducts() {
        getProduct.UserShouldReceiveAListOfProduct();
    }

    @And("i receive that the response code is 200 OK")
    public void iReceiveThatTheResponseCodeIsOK() {
        getProduct.thatTheRespodeCodeis200OK();
    }
    @Given("user is on the product POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        postProduct.userIsOnTheProductPostPageEndpoint();
    }

    @When("a user makes a request with the POST method on the endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointWithPostData() {
        postProduct.UserMakesArequestWithTheOstMethode();
    }

    @Then("the system responds with the status code 200")
    public void theSystemRespondsWithTheStatusCode() {
        postProduct.TheSystemresponsWithTheStatusCode201();
    }

    @And("the post add new prodoct that was just created")
    public void thePostAddNewProdoctThatWasJustCreated() {
        postProduct.TheSystemresponsWithTheStatusCode201();
    }


    @Given("user is on the product PUT page Endpoint")
    public void userIsOnTheProductPUTPageEndpoint() {
        putProduct.userIsOnTheProductPUtPageEndpoint();
    }

    @When("a user makes a request with the PUT method on the endpoint")
    public void aUserMakesARequestWithThePUTMethodOnTheEndpoint() {
        putProduct.UserMakesaRequestWithThePUTMEthodeonTheEndpoint();
    }

    @Then("the product information should be updated")
    public void theProductInformationShouldBeUpdated() {
        System.out.println("the product information should be updated");
    }

    @And("The system responds with the status code 200")
    public void the_SystemRespondsWithTheStatusCode() {
        putProduct.TheSystemresponsWithTheStatusCode201();
    }

    @Given("user wants to delete post data with valid ID")
    public void userWantsToDeletePostDataWithValidID() {
        deleteProduct.UserWantToDeletePostDataWithValidID();
    }

    @When("a user makes a request with the DELETE method on the endpoint")
    public void aUserMakesARequestWithTheDELETEMethodOnTheEndpoint() {
        deleteProduct.UserMakeArequestWithTheDeleteMethode();
    }

    @Then("the system gives a response with status code 200")
    public void theSystemGivesAResponseWithStatusCode() {
        deleteProduct.theSystemGiveAresponseWithStatusCode200();

    }


    @And("post data with ID 6 has been deleted")
    public void postDataWithIDHasBeenDeleted() {
        System.out.println("ID 6 has been deleted");
    }

    // CART

    @Given("user is on the cart list page endpoint")
    public void userIsOnTheCartListPageEndpoint() {
        getCart.UserIsOnTheCartListPageEndpoint();
    }

    @When("user requests the cart list endpoint")
    public void userRequestsTheCartListEndpoint() {
        getCart.user_RequestTheCartListEnpoint();

    }

    @Then("user should receive a list of cart")
    public void userShouldReceiveAListOfCart() {
        getCart.UserShouldReceviceAlistOfCart();
    }

    @And("user receive that the response code is 200 OK")
    public void userReceiveThatTheResponseCodeIsOK() {
        getCart.UserReceiveThatTheResponseCodeIs200Ok();
    }

    @Given("user is on the product cart page Endpoint")
    public void userIsOnTheProductCartPageEnpoint() {
        postCart.useIsOntheProductCartPageEndPoint();
    }

    @When("a user makes a request with the POST method on the endpoint")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpoint() {
        postCart.userMakes_a_RequestwithThePOstMethode();
    }

    @Then("The system respond with the status code 200")
    public void theSystemRespondWithTheStatusCode() {
        postCart.Thesystem_respondWuthTheStatusCode200();
    }

    @And("the item should be added to the cart")
    public void theItemShouldBeAddedToTheCart() {
        System.out.println("the item should be added to the cart");
    }

    @Given("user is on the cart PUT page Endpoint")
    public void userIsOnTheCartPUTPageEndpoint() {
        putCart.userIsOnTheProductPUtPageEndpoint();
    }

    @When("a user makes a request with the PUT method on the endpoint cart")
    public void aUserMakesARequestWithThePUTMethodOnTheEndpointCart() {
        putCart.UserMakesaRequestWithThePUTMEthodeonTheEndpoint();
    }

    @Then("the cart should be updated")
    public void theCartShouldBeUpdated() {
    }

    @And("the system respond with the status code 200")
    public void the_SystemRespondWithTheStatusCode() {
        putCart.TheSystemresponsWithTheStatusCode200();
    }

    @Given("user wants to delete Cart with valid ID")
    public void userWantsToDeleteCartWithValidID() {
        deleteCart.UserWantToDeleteCartWithValidID();
    }

    @When("a user makes a request with the Delete method on the endpoint")
    public void aUserMakesARequestWithTheDeleteMethodOnTheEndpoint() {
        deleteCart.UserMakeArequestWithTheDelete_Methode();
    }

    @Then("the system give a response with status code 200")
    public void theSystemGiveAResponseWithStatusCode() {
        deleteCart.theSystemGiveA_responseWithStatusCode200();
    }

    @And("cart item with ID 6 has been deleted")
    public void cartItemWithIDHasBeenDeleted() {
        System.out.println("cart item with ID 6 has been deleted");
    }

    @Given("user is enter valid Endpoint")
    public void userIsEnterValidEndpoint() {
        loginUser.userIsEnterValidEnpoint();
    }

    @When("a user makes a request with the POST method on the endpoint enters valid id and password")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointEntersValidEmailAndPassword() {
        loginUser.UserMakesArequestWithTheOstMethodeOntHeEnpointEntersValidIdAndPassword();
    }

    @Then("System responds with the status code 200")
    public void systemRespondsWithTheStatusCode() {
        loginUser.SystemresponsWithTheStatusCode200();
    }

    @And("user should receive a valid JWT token")
    public void userShouldReceiveAValidJWTToken() {
        System.out.println("user should receive a valid JWT token");
    }

    //USER

    @Given("user is on the user page Endpoint")
    public void userIsOnTheUserPageEndpoint() {
        getUser.userIsOntheUserPageEndpoint();
    }

    @When("user requests the user list Endpoint")
    public void userRequestsTheUserListEndpoint() {
        getUser.UserrequestTheuserListEndpoint();
    }

    @Then("user should receive the user list")
    public void userShouldReceiveTheUserList() {
        getUser.userShouldReceiveTheUserList();
    }

    @And("i receive that the response code is 200")
    public void iReceiveThatTheResponseCodeIs() {
        getUser.ReceiveThatTheResponseCodeis200();
    }

    @Given("user is on the user list page Endpoint")
    public void userIsOnTheUserListPage() {
        postUser.userIsOnTheUserListPageEndpoint();
    }

    @When("user request with the POST method on the endpoint")
    public void userRequestWithThePOSTMethodOnTheEndpoint() {
        postUser.userRequestWithThePOSTMethodeOnTheEnpoint();
    }

    @Then("the system responds with the status code 200 ok")
    public void theSystemRespondsWithTheStatusCodeOk() {
        postUser.TheSystemresponds_WithTheStatusCode200();
    }

    @And("user should receive the add user list")
    public void userShouldReceiveTheAddUserList() {
        System.out.println("user should receive the add user list");
    }

    @Given("user is on the user Update page Endpoint")
    public void userIsOnTheUserUpdatePageEndpoint() {
        putUser.userIsOnTheUserUpdatePageEnpoint();
    }

    @When("user selects makes a request with the PUT method on the endpoint")
    public void userSelectsMakesARequestWithThePUTMethodOnTheEndpoint() {
        putUser.userRequestWithThePutMethodeOnTheEndpoint();
    }

    @Then("the user details should be updated")
    public void theUserDetailsShouldBeUpdated() {
        System.out.println("the user details should be updated");
    }

    @And("the system responds with the status code 200ok")
    public void the_SystemRespondsWithTheStatusCodeOk() {
        putUser.TheSystemresponds_With_TheStatusCode200();
    }

    @Given("user wants to delete users data with valid ID")
    public void userWantsToDeleteUsersDataWithValidID() {
        deleteUser.userWantToDeleteUsersDataWithValidID();
    }

    @When("user selects makes a request with the DELETE method on the endpoint")
    public void userSelectsMakesARequestWithTheDELETEMethodOnTheEndpoint() {
        deleteUser.UserSelectsMakeArequestWithTheDeleteMethode();
    }

    @Then("the system gives a response with status code 200ok")
    public void theSystemGivesAResponseWithStatusCodeOk() {
        deleteUser.theSystemGiveAresponseWithStatusCode_200ok();
    }

    @And("Users data with ID 6 has been deleted")
    public void usersDataWithIDHasBeenDeleted() {
        System.out.println("Users data with ID 6 has been deleted");
    }
}
