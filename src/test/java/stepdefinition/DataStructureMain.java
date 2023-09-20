package stepdefinition;

import org.testng.Assert;

import DsAlgo_pom.DataStructurePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class DataStructureMain extends BaseClass {
	
	DataStructurePage ds= new DataStructurePage(BaseClass.getDriver());
	
	@Given("User logged in to the home page")
	public void user_logged_in_to_the_home_page() throws InterruptedException {
		BaseClass.openPage();
		ds.login();	
	}

	@When("User clicks on Get Started button below the Data Structures Introduction")
	public void user_clicks_on_get_started_button_below_the_data_structures_introduction() {
	    ds.dsGetStarted();
	   
	}

	@Then("I verify user views the Data structure Introduction screen")
	public void i_verify_user_views_the_data_structure_Introduction_screen() {
		 String dsPage_expected = "Data Structures-Introduction";
		 Assert.assertEquals(dsPage_expected, ds.dsPageTitle());    
	}
	
	@Then("I validate Data Structure Content")
	public void i_validate_data_structure_content() {
		String dsHeading_expected ="Data Structures-Introduction";
		 Assert.assertEquals(dsHeading_expected,ds.dsheading());
		
	}
	@Then("I verify the sign out")
	public void i_verify_the_sign_out() {
	    ds.signOut();
		
	}
	@Then("I verify Time Complexcity section")
	public void i_verify_time_complexcity_section() {
	   ds.timeComplexcity();
}
}


