package starter.account;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    @Given("I go to login page")
    public void iGoToLoginPage(){
        System.out.println("I am in login page");
    }
    @When("I input valid username and valid password")
    public void iInputValidUsernameAndValidPassword(){
        System.out.println("input username");
        System.out.println("input password");
    }
    @And("click login button")
    public void click_login_button(){
        System.out.println("click login button");
    }
    @Then("I go to homepage")
    public void i_go_to_homepage(){
        System.out.println("I am in homepage");
    }

    @When("I input null username and valid password")
    public void i_input_null_username_and_valid_password(){
        System.out.println("null username");
    }
    @Then("I will get error message null username")
    public void iWillGetErrorMessageNullUsername() {
        System.out.println("Masukkan alamat email atau nomor telepon Anda");
    }

    @When("I input valid username and null password")
    public void iInputValidUsernameAndNullPassword() {
        System.out.println("null password");
    }
    @Then("I will get error message null password")
    public void iWillGetErrorMessageNullPassword() {
        System.out.println("Masukkan password anda");
    }

    //  Scenario: Failed Login with valid username and invalid password
    @When("I input valid username and invalid password")
    public void iInputValidUsernameAndInvalidPassword() {
        System.out.println("invalid password");
    }
    @Then("I will get error message invalid password")
    public void iWillGetErrorMessageInvalidPassword() {
        System.out.println("Kata sandi yang Anda masukkan salah. Coba lagi ");
    }

    @When("I input invalid username and valid password")
    public void iInputInvalidUsernameAndValidPassword() {
        System.out.println("invalid username");
    }
    @Then("I will get error message invalid username")
    public void iWillGetErrorMessageInvalidUsername() {
        System.out.println("Tidak dapat menemukan akun LinkedIn yang dikaitkan dengan alamat email ini. Silakan coba lagi. ");
    }

    @When("I input invalid username and invalid password")
    public void iInputInvalidUsernameAndInvalidPassword() {
        System.out.println("invalid username and invalid password");
    }
    @Then("I will get error message invalid username and invalid password")
    public void iWillGetErrorMessageInvalidUsernameAndInvalidPassword() {
        System.out.println("Tidak dapat menemukan akun LinkedIn yang dikaitkan dengan alamat email ini. Silakan coba lagi.");
    }
}
