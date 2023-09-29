package starter.apply;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class applySteps {
    @Given("I want to button job search")
    public void iGoToButtonJobSearch() {
        System.out.println("Job search button");
    }
    @When("I input job title on button search job title")
    public void iInputJobTitleOnButtonSearchJobTitle() {
        System.out.println("input job title");
    }
    @And("Click the job on button search")
    public void clickTheJobOnButtonSearch() {
        System.out.println("click job");
    }
    @Then("i can see list of job based on title that i input")
    public void iCanSeeListOfJobBasedOnTitleThatIInput() {
        System.out.println("get list of job");
    }

    @When("I input the city name on button search job by city")
    public void iInputTheCityNameOnButtonSearchJobByCity() {
        System.out.println("input city name");
    }
    @And("Click the city on button search")
    public void clickTheCityOnButtonSearch() {
        System.out.println("click city that i input");
    }
    @Then("i can see list of job based on city that i input")
    public void iCanSeeListOfJobBasedOnCityThatIInput() {
        System.out.println("get list of job that i input");
    }

    @When("I input job title and job city of job")
    public void iInputJobTitleAndJobCityOfJob() {
        System.out.println("input job title and city");
    }
    @And("tab enter")
    public void tabEnter() {
        System.out.println("tap enter");
    }
    @Then("I can see the list of job based on job city and job title that i want")
    public void iCanSeeTheListOfJobBasedOnJobCityAndJobTitleThatIWant() {
        System.out.println("get list job based on the title and city that i want");
    }

    @When("I click the job which in history tab")
    public void iClickTheJobWhichInHistoryTab() {
        System.out.println("click job in tab history");
    }
    @Then("I can see the list of job based on the history that i choose")
    public void iCanSeeTheListOfJobBasedOnTheHistoryThatIChoose() {
        System.out.println("get list of job based on the history that i choose");
    }
}
