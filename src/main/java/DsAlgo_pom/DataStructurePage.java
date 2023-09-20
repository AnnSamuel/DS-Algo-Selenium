package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
 public void login() throws InterruptedException {
	driver.findElement(homeGetStarted).click();
	driver.findElement(signIn).click();
	driver.findElement(userName).sendKeys("dsalgoproject");
	driver.findElement(password).sendKeys("quantumqa");
	driver.findElement(login).click();
	Thread.sleep(5000);
	//driver.findElement(signOut).isDisplayed();
	//driver.findElement(timeComplexcity).click();
	
 }
 
 public void dsGetStarted() {
	 driver.findElement(dsgetStarted).click();
 }
 
 public String dsPageTitle() {
	 return driver.getTitle();	 
 }
 
 public String dsheading() {
	 return driver.findElement(dSIntro).getText();	 
 }
 
 public void signOut() {
	 String signOut_expected="Sign out";
	 String signOut_actual=driver.findElement(signOut).getText();
	 Assert.assertEquals(signOut_expected, signOut_actual);
 }
 
 public void timeComplexcity() {
	 driver.findElement(timeComplexcity).isDisplayed();
	 
 }
}
