package stepdefinition;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseClass;

import org.testng.Assert;

import DsAlgo_pom.DataStructure_TimePage;
import DsAlgo_pom.DsAlgo_ArraySubPage;

public class DsAlgo_ArraySubSection extends BaseClass{
	
	DsAlgo_ArraySubPage sub = new DsAlgo_ArraySubPage(driver);
	
	 @Given ("User is in the Array page")
	 public void user_is_in_the_Array_page()  {
			BaseClass.openSpecificPage("array/");
			String expectedTitle = "Array";
			Assert.assertEquals(expectedTitle, BaseClass.title());					 
 }
	 
	 @When ("User clicks on {string} link")
	 public void user_clicks_on_array_in_python_text_link(String subsection)  {
		if (subsection.contains("Arrays in Python")) {
		sub.arrayInpython();
		} else if(subsection.contains("Arrays Using List")) {
		sub.arraysUsingList();		
		} else if(subsection.contains("Basic Operations in Lists")) {
		sub.basicOperationsInLists();	
		}else if(subsection.contains("Applications of Array")) {
		sub.applicationsOfArray();	
		}
		 
	 } 
	@Then ("I validate user is in {string} page")
 public void i_verify_user_views_the_array_in_python_screen(String title)  {
		if (title.contains("Arrays in Python")) {
		String expectedTitle = "Arrays in Python";
		Assert.assertEquals(expectedTitle, BaseClass.title());	
		
		} else if(title.contains("Arrays Using List")) {	
		String expectedTitle = "Arrays Using List";
		Assert.assertEquals(expectedTitle, BaseClass.title());
		
		} else if(title.contains("Basic Operations in Lists")) {	
		String expectedTitle = "Basic Operations in Lists";
		Assert.assertEquals(expectedTitle, BaseClass.title());	
		
		}else if(title.contains("Applications of Array")) {
		String expectedTitle = "Applications of Array";
		Assert.assertEquals(expectedTitle, BaseClass.title());	
		}	 
	}
}
