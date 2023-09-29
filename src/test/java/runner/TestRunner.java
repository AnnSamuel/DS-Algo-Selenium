package runner;

import org.testng.annotations.BeforeTest;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import DsAlgo_pom.ConfigReader;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/Report.html" }, monochrome = false, tags = "@signin", features = {
		"src/test/resources/features" }, glue = { "stepdefinition" })

public class TestRunner extends AbstractTestNGCucumberTests {
//}
	@BeforeTest 
	@Parameters({"browser"})
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);
	}
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	
}
