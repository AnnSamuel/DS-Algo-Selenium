package stepdefinition;


import DsAlgo_pom.LinkedList_Pg;
import DsAlgo_pom.Stack_Pg;
import io.cucumber.java.en.*;
import utilities.BaseClass;

public class Stack_SD {
	
	LinkedList_Pg linkelistpg;
	Stack_Pg  stackpage ;
	
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
		linkelistpg = new LinkedList_Pg(BaseClass.getDriver());
		BaseClass.openPage();
	    linkelistpg.login();
	    stackpage = new Stack_Pg(BaseClass.getDriver());
	    stackpage.clickOnGetStackStarted();
	    
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    stackpage.clickOnTopicInStack(string);
	}

		
	@When("The user should be directed {string} to Page")
	public void the_user_should_be_directed_to_page(String string) {
	    stackpage.verfyHeading(string);
	}
	
}
