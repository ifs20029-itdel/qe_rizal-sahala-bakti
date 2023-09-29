package starter.pembayaran;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paymentSteps {
    @Given("user has selected the product to be purchased and entered the payment page")
    public void userHasSelectedTheProductToBePurchasedAndEnteredThePaymentPage() {
        System.out.println("on payment page");
    }

    @When("the user selects an available payment method")
    public void theUserSelectsAnAvailablePaymentMethod() {
        System.out.println("select available payment method");
    }

    @Then("the system will display transaction information and the user can make payments")
    public void theSystemWillDisplayTransactionInformationAndTheUserCanMakePayments() {
        System.out.println("see transaction information");
    }

    @Given("user has selected the product to be purchased and entered the payment")
    public void userHasSelectedTheProductToBePurchasedAndEnteredThePayment() {
        System.out.println("on payment page");
    }

    @When("the user chooses a payment method that is not available")
    public void theUserChoosesAPaymentMethodThatIsNotAvailable() {
        System.out.println("select not available payment method");
    }

    @Then("the system will display the message The payment method you selected is not available")
    public void theSystemWillDisplayTheMessageThePaymentMethodYouSelectedIsNotAvailable() {
        System.out.println("see error message");
    }
}
