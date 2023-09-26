package stepdefinition;

import DsAlgo_pom.DataStructurePage;
import DsAlgo_pom.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class SignIn_SD {

	SignIn signin = new SignIn(BaseClass.getDriver());
	DataStructurePage signin1= new DataStructurePage(BaseClass.getDriver());

@Given("The user logs into {string} page")
public void the_user_logs_into__page(String login) {
    // Write code here that turns the phrase above into concrete actions
   BaseClass.openSpecificPage(login);
}

@When("User clicks sign in without entering username and pswd")
public void user_clicks_sign_in_without_entering_username_and_pswd() {
    // Write code here that turns the phrase above into concrete actions
   signin.noInputSignIn();
}


@Then("It should display an error Please fill out this field below Username textbox")
public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox() {
    // Write code here that turns the phrase above into concrete actions
    signin.accessReqInpFldValMsg();
}

@When("The user enters an invalid {string} or invalid {string} combination")
public void the_user_enters_an_invalid_or_invalid_combination(String invalidusrname, String invalidpswd) {
    // Write code here that turns the phrase above into concrete actions
   signin.etrInvalidInpt(invalidusrname, invalidpswd);
}

@Then("It should display an error Invalid Username and Password")
public void it_should_display_an_error_invalid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
   signin.valSignInErrMsg();
}
}
