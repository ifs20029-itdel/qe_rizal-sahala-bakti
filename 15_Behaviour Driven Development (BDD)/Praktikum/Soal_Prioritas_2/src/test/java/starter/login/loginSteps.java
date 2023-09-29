package starter.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("user has opened the Sepulsa login page")
    public void userHasOpenedTheSepulsaLoginPage() {
        System.out.println("On Login Page");
    }

    @When("the user enters a valid email and password")
    public void theUserEntersAValidEmailAndPassword() {
        System.out.println("Enter valid email and password");
    }

    @Then("the system will direct the user to the main Sepulsa account page")
    public void theSystemWillDirectTheUserToTheMainSepulsaAccountPage() {
        System.out.println("see the main sepulsa account page");
    }

    @Given("that the user has opened the Sepulsa login page")
    public void thatTheUserHasOpenedTheSepulsaLoginPage() {
        System.out.println("On Login Page");
    }

    @When("the user enters an invalid email and password")
    public void theUserEntersAnInvalidEmailAndPassword() {
        System.out.println("Enter invalid email and password");
    }

    @Then("the system will display an error message The email or password you entered is incorrect")
    public void theSystemWillDisplayAnErrorMessageTheEmailOrPasswordYouEnteredIsIncorrect() {
        System.out.println("See error Message");
    }
}
