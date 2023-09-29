package starter.pilihproduk;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class produkSteps {
    @Given("user has logged in to the Sepulsa account")
    public void userHasLoggedInToTheSepulsaAccount() {
        System.out.println("On login pgae");
    }

    @When("a user wants to buy a product in a certain category")
    public void aUserWantsToBuyAProductInACertainCategory() {
        System.out.println("can choose product with category");
    }

    @Then("the system will display the products available in that category")
    public void theSystemWillDisplayTheProductsAvailableInThatCategory() {
        System.out.println("see the product");
    }

    @Given("logged in to the Sepulsa account")
    public void loggedInToTheSepulsaAccount() {
        System.out.println("On login pgae");
    }

    @When("the user wants to search for products with certain keywords")
    public void theUserWantsToSearchForProductsWithCertainKeywords() {
        System.out.println("can choose product with Keywords");
    }

    @Then("the system will display products that match the search keywords")
    public void theSystemWillDisplayProductsThatMatchTheSearchKeywords() {
        System.out.println("see the product");
    }
}
