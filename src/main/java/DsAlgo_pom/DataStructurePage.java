package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructurePage {

WebDriver driver;

private By homeGetStarted = By.className("btn");
private By signIn = By.linkText("Sign in");
private By userName = By.name("username");
private By password = By.name("password");
private By login = By.xpath("//input[@type='submit']");
private By dsgetStarted = By.xpath("//a[@href='data-structures-introduction']");
private By dSIntro = By.tagName("h4");
private By signOut = By.linkText("Sign out");
private By timeComplexcity = By.linkText("Time Complexity");

public DataStructurePage(WebDriver driver) {
	this.driver= driver;
}

public void mainGetStarted() {
	driver.findElement(homeGetStarted).click();	
}
 public void login() throws InterruptedException {
	driver.findElement(signIn).click();
	driver.findElement(userName).sendKeys("dsalgoproject");
	driver.findElement(password).sendKeys("quantumqa");
	driver.findElement(login).click();
	//driver.findElement(signOut).isDisplayed();
	//driver.findElement(timeComplexcity).click();
	
 }
 
 public void dsGetStarted() {
	 driver.findElement(dsgetStarted).click();
 }
 
 public String dsheading() {
	 return driver.findElement(dSIntro).getText();	 
 }
 
 public String signOut() {
	return driver.findElement(signOut).getText();
 }
 
 public void timeComplexcity() {
	 driver.findElement(timeComplexcity).isDisplayed();
	
}
 public void timeComplexcityClick() {
	 driver.findElement(timeComplexcity).click();
	 
 }
}
