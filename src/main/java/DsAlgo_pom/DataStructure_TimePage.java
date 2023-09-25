package DsAlgo_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructure_TimePage {
 WebDriver driver;
 By timeComplexcity = By.linkText("Time Complexity");
 By tryHere = By.linkText("Try here>>>");
 By textEditor = By.cssSelector("div.CodeMirror textarea"); ////div[@class='input']//textarea
 By run = By.xpath("//button");
 By output = By.xpath("//*[@id=\"output\"]");

 public DataStructure_TimePage(WebDriver driver) {
		this.driver= driver;
	}
 
public void timeComplexcity() {
	driver.findElement(timeComplexcity).click();
}

public void tryHere() {
	driver.findElement(tryHere).click();
}
public void textAreaRunDisplayed() {
	driver.findElement(textEditor).isDisplayed();
	driver.findElement(run).isDisplayed();
}
	
public void textEditorValid() {
	driver.findElement(textEditor).sendKeys("print('dsalgo')");
	driver.findElement(run).click();

}
public String output() {
	return driver.findElement(output).getText();
	
}
public void textEditorInValid() {
	driver.findElement(textEditor).sendKeys("printed('dsalgo')");
	driver.findElement(run).click();
	
}
public String errorMessage() {
	return driver.switchTo().alert().getText();
}

//public String errorMessage() {
//	String s= driver.switchTo().alert().getText();
//	return s;
//}


}