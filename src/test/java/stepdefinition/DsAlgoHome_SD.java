package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;
import utilities.LoggerLoad;
import DsAlgo_pom.Home;

public class DsAlgoHome_SD extends BaseClass{
	Home navHome = new Home(BaseClass.getDriver());
	

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.openPage();
		//navHome.dsAlgo();
	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
		// Write code here that turns the phrase above into concrete actions
		navHome.verifyDsAlgoPortl();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		navHome.clickGetStrtBtn();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		// Write code here that turns the phrase above into concrete actions

		LoggerLoad.info("Home page displayed");
	}

	@Then("The user should see {int} panes with different data structires")
	public void the_user_should_see_panes_with_different_data_structires(int expectedPanes) {
		// Write code here that turns the phrase above into concrete actions
		navHome.chkPanes(expectedPanes);
	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		// Write code here that turns the phrase above into concrete actions
		navHome.homepage();

	}

	@Then("I should see {int} different data structure entries in that dropdown")
	public void i_should_see_different_data_structure_entries_in_that_dropdown(int expectedDrpDwn) {
		// Write code here that turns the phrase above into concrete actions
		navHome.clkDsDrpDwnBtn(expectedDrpDwn);
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		navHome.chkNotLoggedInErrMsg();
	}

	@Then("It should alert the user with a message You are logged in")
	public void it_should_alert_the_user_with_a_message_You_are_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		navHome.chkLoggedInMsg();
	}
	
	@When("The user clicks any of the {string} buttons below the data structure")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structure(String string) {
		// Write code here that turns the phrase above into concrete actions
		navHome.clkHomePgGetStrtedBtn();
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		// Write code here that turns the phrase above into concrete actions
		
		navHome.clkSelDrpDown();
	}
	
	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
	    // Write code here that turns the phrase above into concrete actions
		navHome.clkSignIn();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	   navHome.verifySignInPg();
	}
	
	@When("The user clicks Register")
	public void the_user_clicks_register() {
	    // Write code here that turns the phrase above into concrete actions
	   navHome.clkRegister();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	    // Write code here that turns the phrase above into concrete actions
	   navHome.verifyRegisterPg();
	}
	
	
	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		//navHome.signout();
		//navHome.clickGetStrtBtn();
	    navHome.signInPg();
	}
	

	@When("The user clicks  {string} button below the {string}")
	public void the_user_clicks_button_below_the(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		navHome.clkDsGetStrtedBtn();
	}

	@Then("The user should land in {string}")
	public void the_user_should_land_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    navHome.dsIntroPg();
	}

	@When("The user clicks the {string} button in Array Pane or select Array item from the drop down menu")
	public void the_user_clicks_the_button_in_array_pane_or_select_array_item_from_the_drop_down_menu(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   navHome.clkDrpDwnArrayPg();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		navHome.arrayPg();
	   
	}
}
