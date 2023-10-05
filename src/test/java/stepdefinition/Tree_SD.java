package stepdefinition;

import DsAlgo_pom.LinkedList_Pg;
import DsAlgo_pom.Tree_Pg;
import io.cucumber.java.en.Given;
import utilities.BaseClass;

public class Tree_SD {
	
LinkedList_Pg linkelistpg;
Tree_Pg  tpg;

@Given("The user is in the Tree  page after logged in")
public void the_user_is_in_the_tree_page_after_logged_in() {
	linkelistpg = new LinkedList_Pg(BaseClass.getDriver());
	BaseClass.openPage();
    linkelistpg.login();
    tpg = new Tree_Pg(BaseClass.getDriver());
    tpg.clickOnTreeGetStartedBtn();
}



}
