package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DsAlgo_pom.DataStructurePage;
import DsAlgo_pom.HomeReg;
import DsAlgo_pom.Register;
import io.cucumber.java.en.*;


import utilities.BaseClass;

public class RegStepDef extends BaseClass {

	//WebDriver driver = null;
	HomeReg hp;
	Register rp;
	DataStructurePage ds;
	@SuppressWarnings("deprecation")

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		System.out.println("Inside step- Browser is open");
		
//		// important step to set project path
//		String ProjectPath = System.getProperty("user.dir");
//		System.out.println("Project Path is:" + ProjectPath);
//		System.out.println(ProjectPath + "/src/test/resources/drivers/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ProjectPath + "/src/test/resources/driver/chromedriver.exe");
//		// System.setProperty("webdriver.chrome.driver", "");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

//		driver.manage().window().maximize();
//
//		driver.get("https://dsportalapp.herokuapp.com/home");
		ds= new DataStructurePage(driver);
		
		
		ds.mainGetStarted();
		
		hp = new HomeReg(driver);
		
		hp.ClickRegisterBtn();
		
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {

		rp = new Register(driver);
		rp.ClickRegister2Button();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String messageStr) {
	
		System.out.println("Error msg"+messageStr);

	}

	@When("^The user clicks Register button after entering (.*) with other fields empty$")
	public void the_user_clicks_register_button_after_entering_sdet_student_with_other_fields_empty(String username) {
		rp = new Register(driver);
		rp.enterUsername(username);
		rp.ClickRegister2Button();
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String messageStr) {
		System.out.println("Error msg"+messageStr);
	}

	@When("^The user clicks Register button after entering (.*) and S(.*) with Password Confirmation field empty$")
	public void the_user_clicks_register_button_after_entering_sdet_student_and_sted_with_password_confirmation_field_empty(String username, String password) {
		rp = new Register(driver);
		rp.enterUsername(username);
		rp.enterPassword(password);
		rp.ClickRegister2Button();
     }
	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String messageStr) {
		System.out.println("Error msg"+messageStr);
	}
	


//	@When("The user enters with characters {String}")
//	public void the_user_enters_with_characters_c_$(String username) {
//	    
//	
//		rp = new Register(driver);
//		rp.enterUsername(username);
//		
//		
//	}
//
//	@And("^Enters (.*) and  confirm (.*)$")
//	public void enters_sted_and_confirm_sted_clicks_on_register_button(String password,String confpass ) {
//		rp = new Register(driver);
//		rp.enterPassword(password);
//		rp.ConfirmPassword(password);
//		
//	}
//
//	@And("Clicks on Register button")
//	public void clicks_on_register_button() {
//		rp = new Register(driver);
//		rp.ClickRegister2Button();
//	}

//	@Then("It should display an error message {string}")
//	public void it_should_display_an_error_message(String erromsg) {
//		rp = new Register(driver);
//		Assert.assertTrue(rp.Mismatch_Error());
//	 //   String expectedMsg=erromsg;
//	 //  Assert.assertEquals(expectedMsg,rp.Mismatch_Error());
//}

	@When("The user enters username {string}")
	public void the_user_enters_username(String username) {
		rp = new Register(driver);
		rp.enterUsername(username);
		
	   
	}

	@When("Enters different password {string} and confirmpassword {string}")
	public void enters_different_password_and_confirmpassword(String password, String Confirmpass) {
		rp.enterPassword(password);
	   rp.ConfirmPassword(Confirmpass);
	   
	   
	   
	}@When("Clicks on Register button")
	public void clicks_on_register_button() {
		rp.ClickRegister2Button();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		Assert.assertTrue(rp.Mismatch_Error());
	}
	@Then("It should display {string} on Home Page.")
	public void it_should_display_on_home_page(String string) {
	    
      Assert.assertTrue(hp.AccountConfirmMsg());
	}

	
	}

	
