package DsAlgo_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DsAlgo_ArrayPage {
	
	WebDriver driver;
	
	private	 By arrayGetStarted = By.xpath("//a[@href=\"array\"]");
	private	 By array = By.tagName("h4");
	private	 By topicsCovered = By.tagName("p"); ////div[@class='input']//textarea
	private	 By run = By.xpath("//button");
	private	 By output = By.xpath("//*[@id=\"output\"]");
	
	public DsAlgo_ArrayPage(WebDriver driver) {
		this.driver= driver;
}
public void arrayGetStarted() {
 driver.findElement(arrayGetStarted).click();
}
  public String arrayHeading() {
	 return driver.findElement(array).getText();
	  
  }

}