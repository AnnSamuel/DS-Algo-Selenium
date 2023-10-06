package stepdefinition;


import DsAlgo_pom.LinkedList_Pg;
import DsAlgo_pom.TryAndRun;
import io.cucumber.java.en.*;
import utilities.BaseClass;

public class LinkedList_SD {
	
	LinkedList_Pg linkelistpg ;
	TryAndRun tar ;
	
	
	@Given("The user is in the Linked List  page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {
		linkelistpg = new LinkedList_Pg(BaseClass.getDriver());
		BaseClass.openPage();
	    linkelistpg.login();
	    linkelistpg.clickOnLinkedList();
	}

	@When("The user clicks  the {string} button")
	public void the_user_clicks_the_button(String string) {
		linkelistpg = new LinkedList_Pg(BaseClass.getDriver());
	    linkelistpg.clickOnTopic(string);
	}

	@When("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	    linkelistpg.verifyHeading(string);
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		tar = new TryAndRun(BaseClass.getDriver());
	    tar.clickHere();
	   	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   tar.writeOnTextEditorAndRun();
	}
	
}
