package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryAndRun {
	WebDriver driver;
	By tryHere = By.linkText("Try here>>>");
	By textEditor = By.xpath("//*[@autocorrect ='off']");
	By runBtn = By.xpath("//*[text() = 'Run']");
	By outputTxtEditor = By.id("output");
	public TryAndRun(WebDriver driver) {
		this.driver = driver;
		
	}
	public void clickHere(){
		
		driver.findElement(tryHere).click();
	}
	public void writeOnTextEditorAndRun(){
		
		driver.findElement(textEditor).sendKeys("print(\"Hello\")");
		driver.findElement(runBtn).click();
		
	}
	public void multipletext(String string) throws InterruptedException {
		driver.findElement(textEditor).sendKeys(string);
		
		driver.findElement(runBtn).click();
		
		//System.out.println(driver.findElement(outputTxtEditor).getText());
	}
	
	public void verifyOutput(String expectedoutput) throws InterruptedException {
		String actualOutput = driver.findElement(outputTxtEditor).getText();
		assertEquals(actualOutput,expectedoutput);
		/*if(expectedoutput.equalsIgnoreCase("WelCome")) {
		//	Thread.sleep(3000);
		//	Alert alert  = driver.switchTo().alert();
		//	System.out.println("****************"+alert.getText());
			//alert.accept();
		}
		else {
			assertEquals(actualOutput,expectedoutput);
		}*/
				
	}
	
}
