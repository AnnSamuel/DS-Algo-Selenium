package stepdefinition;

import DsAlgo_pom.LinkedList_Pg;
import DsAlgo_pom.Queue_Pg;
import DsAlgo_pom.TryAndRun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class Queue_SD {
	
	LinkedList_Pg linkelistpg;
	Queue_Pg  qpg;
	TryAndRun tar;
	
	@Given("The user is in the Queue  page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		linkelistpg = new LinkedList_Pg(BaseClass.getDriver());
		qpg = new Queue_Pg(BaseClass.getDriver());
		BaseClass.openPage();
	    linkelistpg.login();
	    qpg.clickOnQueueGetStartedBtn();
	    }

	@Then("The user should be redirected to a page having an tryEditor {string} with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test(String string) throws InterruptedException {
	   
		tar = new TryAndRun(BaseClass.getDriver());
	    tar.multipletext(string);
	    
	}

	@Then("verify {string}")
	public void verify(String string) throws InterruptedException {
		tar.verifyOutput(string);
}

	
	



}
