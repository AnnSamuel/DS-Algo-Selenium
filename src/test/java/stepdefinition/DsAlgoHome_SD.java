package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;
import DsAlgo_pom.Home;

public class DsAlgoHome_SD {
	Home navHome = new Home();

@Given("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
    // Write code here that turns the phrase above into concrete actions
	
	navHome.dsAlgo();
}


@Then("The user should land in DS Algo portal page")
public void the_user_should_land_in_ds_algo_portal_page() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("The user clicks the Get Started button")
public void the_user_clicks_the_get_started_button() {
    // Write code here that turns the phrase above into concrete actions
	navHome.homePg();
}

@Then("The user should be redirected to homepage")
public void the_user_should_be_redirected_to_homepage() {
    // Write code here that turns the phrase above into concrete actions
	
   LoggerLoad.info("Home page displayed");
}


}
