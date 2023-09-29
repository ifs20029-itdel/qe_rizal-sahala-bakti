package starter.network;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class networkSteps {
    @Given("I go to button my network")
    public void iGoToButtonMyNetwork() {
        System.out.println("button network");
    }
    @When("I click accept")
    public void iClickAccept() {
        System.out.println("accept");
    }
    @And("I click the account profile that just connected with me")
    public void iClickTheAccountProfileThatJustConnectedWithMe() {
        System.out.println("click profile");
    }
    @Then("I see the account profile that just connected with me")
    public void iSeeTheAccountProfileThatJustConnectedWithMe() {
        System.out.println("see detail profile");
    }

    @When("I click ignore")
    public void iClickIgnore() {
        System.out.println("click ignore");
    }
    @And("I click the account profile that just ignored by me")
    public void iClickTheAccountProfileThatJustIgnoredByMe() {
        System.out.println("click profile");
    }
    @Then("i see the account profile that just ignored by me")
    public void iSeeTheAccountProfileThatJustIgnoredByMe() {
        System.out.println("see detail profile");
    }
}
