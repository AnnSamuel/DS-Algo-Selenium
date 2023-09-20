package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features= "src/test/resources/features",
	plugin = {"pretty", "html:target/Report"},
	monochrome = true,
	tags= "@DataStructure",
	glue={"stepdefinition"}
	)
	
	
	public class TestRunner {
//	extends AbstractTestNGCucumberTests {		 
//		@Override
//		@DataProvider(parallel = false)
//		public Object[][] scenarios(){
//			return super.scenarios();
//		}
	}
