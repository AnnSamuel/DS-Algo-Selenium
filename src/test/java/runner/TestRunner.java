package runner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/Report.html" }, monochrome = false, tags = "@graph2", features = {
		"src/test/resources/features" }, glue = { "stepdefinition" })

public class TestRunner extends AbstractTestNGCucumberTests {
//}
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
