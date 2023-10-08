package runner;

import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features= "src/test/resources/features",
	monochrome = true,
	plugin = { "pretty",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
	tags= "@DataStructure or @Array",
	glue={"stepdefinition"}
	)
	
	
	public class TestRunnerExtentReport	extends AbstractTestNGCucumberTests {		 
//		@Override
//		@DataProvider(parallel = false)
//		public Object[][] scenarios(){
//			return super.scenarios();
//		}
	}
