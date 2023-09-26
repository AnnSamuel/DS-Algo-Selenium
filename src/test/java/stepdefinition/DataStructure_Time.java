package stepdefinition;

import org.testng.Assert;
import DsAlgo_pom.DataStructurePage;
import DsAlgo_pom.DataStructure_TimePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;


public class DataStructure_Time extends BaseClass {
	
	DataStructure_TimePage dst= new DataStructure_TimePage(driver);
	
	@Given("User is in the TimeComplecity page")
	public void user_is_in_the_TimeComplecity_page()  {
	BaseClass.openSpecificPage("data-structures-introduction/");
	dst.timeComplexcity();	
	String expectedTitle = "Time Complexity";
	Assert.assertEquals(expectedTitle, BaseClass.title());
	}
	@When("User clicks on Try Here button")
	public void user_clicks_on_Try_Here_button() {
	dst.tryHere();
	}

	@Then("I verify user able to view Assessment page")
	public void i_verify_user_able_to_view_Assessment_page() {
		String expectedTitle = "Assessment";
		Assert.assertEquals(expectedTitle, BaseClass.title());
    }
	
	
	@Then("I verify text area and run button is displayed")
	public void i_verify_text_area_and_run_button_is_displayed() {
		dst.textAreaRunDisplayed();
	}
	@When("User provide valid input in the input field and clicks on run button")
	public void user_provide_valid_input_in_the_input_field_and_clicks_on_run_button() {
		dst.textEditorValid();
	}
	
	@Then("I verify output is displayed")
	public void i_verify_output_is_displayed() {
		String expectedTitle = "dsalgo";
		Assert.assertEquals(expectedTitle,dst.output());
		BaseClass.refresh();
	}
	
	
	@Then("User provide invalid input in the input field and clicks on run button")
	public void user_provide_invalid_input_in_the_input_field_and_clicks_on_run_button() {
		dst.textEditorInValid();
		
	}
	@Then("I verify error message is displayed and click on ok button")
	public void i_verify_error_message_is_displayed_and_click_on_ok_button() {
		String expectedTitle = "NameError: name 'printed' is not defined on line 1";
		Assert.assertEquals(expectedTitle, dst.errorMessage());
		BaseClass.acceptAlert();
		
		//dst.errorMessage();
		
	    
}
	
}


