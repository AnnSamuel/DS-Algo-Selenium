package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Graph {

	WebDriver driver;

	By getStrtGraphBtn = By.xpath("//h5[text()='Graph']/../a");
	By graphLink = By.linkText("Graph");
	By graphMainIntro = By.xpath("//h4[text()='Graph']");
	By graphIntro = By.xpath("//p[text()='Graph']");
	By graphRepLink = By.linkText("Graph Representations");
	By graphRepIntro = By.xpath("//p[text()='Graph Representations']");

//try here
	By tryHereBtn = By.linkText("Try here>>>");
	//By inptCode = By.xpath("//div[@class='CodeMirror cm-s-default']//textarea[@autocorrect ='off']");
	By inptCode = By.xpath("//textarea[@autocorrect ='off']");
	By runBtn = By.xpath("//button[text()='Run']");
	By output = By.id("output");

	public Graph(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void clkGraph() {
		driver.findElement(getStrtGraphBtn).click();
	}

	public void clkGraphLink() {
		driver.findElement(graphLink).click();
	}

	public void verifyGraphPageHeading() {
		String actualHeading = driver.findElement(graphIntro).getText();
		String expectedHeading = "Graph";
		assertEquals(actualHeading, expectedHeading);
	}

	public void chkGraphMainPageTitle() {
		String expectedTitle = "Graph";
		assertEquals(expectedTitle, driver.getTitle());
	}

	public void verifyGraphMainPageHeading() {
		{
			String actualHeading = driver.findElement(graphMainIntro).getText();
			String expectedHeading = "Graph";
			assertEquals(actualHeading, expectedHeading);
		}
	}

	// try here

	public void clkTryHere() {
		driver.findElement(tryHereBtn).click();

	}

	public void inptCode(String string) {
		new Actions(driver).moveToElement(driver.findElement(inptCode)).click().perform();
		//driver.findElement(inptCode).sendKeys("");
		driver.findElement(inptCode).sendKeys(string);
	}

	public void clkRun() {
		driver.findElement(runBtn).click();

	}

	public void chkOutput(String expectedoutput) {
		String actualOutput = driver.findElement(output).getText();
		
		assertEquals(actualOutput, expectedoutput );
	}
	
	public void clkGraphRepLink() {
		driver.findElement(graphRepLink).click();
	}
	public void verifyGraphRepPageHeading() {
		String actualHeading = driver.findElement(graphRepIntro).getText();
		String expectedHeading = "Graph Representations";
		assertEquals(actualHeading, expectedHeading);
	}

}
