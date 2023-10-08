package stepdefinition;
import org.testng.Assert;

import DsAlgo_pom.DsAlgo_ArrayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class DsAlgo_Array extends BaseClass {

	DsAlgo_ArrayPage dsA= new DsAlgo_ArrayPage(driver);
	
   @Given("User is in the home page")
	public void user_is_in_the_home_page()  {
	   BaseClass.openSpecificPage("home");
	   
	}

	@When("User clicks on Get Started button below the Array")
	public void user_clicks_on_Get_Started_button_below_the_Array() {
      dsA.arrayGetStarted();
	}

	@Then("I verify user views array screen")
	public void i_verify_user_views_array_screen() {
		String expectedTitle = "Array";
		Assert.assertEquals(expectedTitle, BaseClass.title());
	}
	

	@Then("I validate array heading")
	public void i_validate_array_heading() {
		String arrayHeading_expected ="Array";
		 Assert.assertEquals(arrayHeading_expected,dsA.arrayHeading());
		
	}
	
	@Then("I verify the four sublinks in topics covered")
	public void i_verify_the_four_sublinks_in_topics_covered() {
		
	}
}