package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.ConfigReader;

public class Hooks {

	@Before
    public static void setUp() throws Throwable {
		
		
       BaseClass.setUpDriver(ConfigReader.getBrowserType());    
    }
 
    @After
    public static void tearDown(Scenario scenario) throws InterruptedException {
    		
        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
        BaseClass.tearDown();
    }
    
}
