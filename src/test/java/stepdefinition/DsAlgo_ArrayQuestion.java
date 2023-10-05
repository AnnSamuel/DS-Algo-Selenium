package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;
import org.testng.Assert;

import DsAlgo_pom.DataStructure_TimePage;
import DsAlgo_pom.DsAlgo_ArrayQuestionPage;

public class DsAlgo_ArrayQuestion extends BaseClass{
	
	DsAlgo_ArrayQuestionPage dsques = new DsAlgo_ArrayQuestionPage(driver);
	DataStructure_TimePage ques = new DataStructure_TimePage(driver);
	 @When ("User clicks on {string}")
	 public void user_clicks_on_array_in_python_text_link(String questionSection)  {
		if (questionSection.contains("Max Consecutive Ones")) {
			dsques.maxConsecutiveOnes();
		} else if(questionSection.contains("Search the array")) {
			dsques.searchTheArray();
		} else if(questionSection.contains("Find Numbers with Even Number of Digits")) {
			dsques.findNumberswithEvenNumberofDigits();
		}else if(questionSection.contains("Squares of a Sorted Array")) {
			dsques.squaresofSortedArray();	
		}
		 
	 } 
		
	@When("User clicks Practice Questions")
 public void user_clicks_Practice_Questions()  {
		dsques.practiceQuestions();	
	}
	
	@Then("I verify user is in Practice Questions page")
 public void I_verify_user_is_in_Practice_Questions_page()  {
		String expectedTitle = "Practice Questions";
		Assert.assertEquals(expectedTitle, BaseClass.title());	
	}
	
	@When("User clicks on go back arrow in browser")
 public void user_clicks_on_go_back_arrow_in_browsers() throws InterruptedException  {
	BaseClass.back();
	}
	
	@When("I verify text area submit and run button is displayed")
 public void I_verify_text_area_submit_and_run_button_is_displayed()  {
		dsques.textAreaRunSubmitQuestionDisplayed();		
	}
	@Then("I clear the text editor box")
	public void i_clear_the_text_editor_box() {
	dsques.clearExistingText();
	ques.textEditorValid();
}
	}
