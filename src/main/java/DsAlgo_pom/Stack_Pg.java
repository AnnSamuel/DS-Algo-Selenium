package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Stack_Pg {
	WebDriver driver = null;
	
	public Stack_Pg(WebDriver driver) {
		this.driver = driver;
	}
	
	By stackGetStartedBtn = By.xpath("//h5[text() = 'Stack']/..//*[text() = 'Get Started']");
	//By operationInStack = By.linkText("Operations in Stack");
	//By verifyHeading = By.xpath("//*[@class = 'col-sm']//p[@class = 'bg-secondary text-white']");
	
	public void clickOnGetStackStarted() {
		driver.findElement(stackGetStartedBtn).click();
	}
	
	public void clickOnTopicInStack(String actionOn) {
		driver.findElement(By.linkText(actionOn)).click();
	}
	public void verfyHeading(String expectedTxt) {
		String actualTxt = (driver.getTitle());
		//String actualTxt = driver.findElement(verifyHeading).getText();
		assertEquals(actualTxt, expectedTxt);
	}
	
}
