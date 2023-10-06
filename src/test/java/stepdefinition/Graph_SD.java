package stepdefinition;

import DsAlgo_pom.Graph;
import DsAlgo_pom.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

public class Graph_SD {
	
	Graph dsAlgoGraph = new Graph(BaseClass.getDriver());
	Home dsAlgoGraph1 = new Home(BaseClass.getDriver());

@Given("The user is in the Graph page after logged in")
public void the_user_is_in_the_graph_page_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph1.signInPg();
	dsAlgoGraph.clkGraph();
}

@When("The user clicks Graph button")
public void the_user_clicks_Graph_button() {
    // Write code here that turns the phrase above into concrete actions
    dsAlgoGraph.clkGraphLink();
}

@Then("The user should be directed to Graph Page")
public void the_user_should_be_directed_to_Graph_page() {
    // Write code here that turns the phrase above into concrete actions
    dsAlgoGraph.verifyGraphPageHeading();
}



@When("The user clicks Graph Representations button")
public void the_user_clicks_graph_representations_button() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.clkGraphRepLink();
}

@Then("The user should be directed to Graph Representations Page")
public void the_user_should_be_directed_to_graph_representations_page() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.verifyGraphRepPageHeading();
}

@When("The user checks title and content")
public void the_user_checks_title_and_content() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.chkGraphMainPageTitle();
}

@Then("The user should verify title and content of Graph main Page")
public void the_user_should_verify_title_and_content_of_graph_main_page() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.verifyGraphMainPageHeading();
}

@When("The user clicks Try Here button to be redirected to a page having an tryEditor")
public void the_user_clicks_try_here_button_to_be_redirected_to_a_page_having_an_try_editor() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.clkTryHere();
}

//@Then("should be able to input print {string}")
//public void should_be_able_to_input_print(String string) {
//    // Write code here that turns the phrase above into concrete actions
//	dsAlgoGraph.inptCode(string);
//}

@Then("clicked on Run")
public void clicked_on_run() {
    // Write code here that turns the phrase above into concrete actions
	dsAlgoGraph.clkRun();
}
//

@Then("should be able to input {string}")
public void should_be_able_to_input(String printName) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Thread.sleep(1000);
  dsAlgoGraph.inptCode(printName);  
}

@Then("verify output with {string}")
public void verify_output_with(String expectedOutput) {
    // Write code here that turns the phrase above into concrete actions
    dsAlgoGraph.chkOutput(expectedOutput);
}


}
