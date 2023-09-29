package starter.search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
    @Given("I go to button search")
    public void iGoToButtonSearch() {
        System.out.println("On button search");
    }
    @When("I input a username")
    public void iInputAUsername() {
        System.out.println("Input username");
    }
    @And("click username that i want to see")
    public void clickUsernameThatIWantToSee() {
        System.out.println("click username");
    }
    @Then("I see the profile")
    public void iSeeTheProfile() {
        System.out.println("I see the profile");
    }

    @When("I click clear button")
    public void iClickClearButton() {
        System.out.println("click clear");
    }
    @And("Alert displayed and click clear history button")
    public void alertDisplayedAndClickClearHistoryButton() {
        System.out.println("click clear history button");
    }
    @Then("I see button search without no history")
    public void iSeeButtonSearchWithoutNoHistory() {
        System.out.println("get a button without no history");
    }

    @When("I input words that contains to my search")
    public void iInputWordsThatContainsToMySearch() {
        System.out.println("input words");
    }
    @And("tap enter")
    public void tapEnter() {
        System.out.println("tab enter");
    }
    @Then("I will get list of username that contains to my search")
    public void iWillGetListOfUsernameThatContainsToMySearch() {
        System.out.println("get list of username that contains to search");
    }
}
