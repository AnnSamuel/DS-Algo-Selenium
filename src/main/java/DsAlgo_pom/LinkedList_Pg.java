package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LinkedList_Pg {
	WebDriver driver;
	
	
	public LinkedList_Pg(WebDriver driver) {
		this.driver = driver;
	}
	By linkedListGetStartedBtn = By.xpath("//h5[text() = 'Linked List']/..//*[text() = 'Get Started']");
	By homeGetStartedBtn = By.linkText("Get Started"); 
	By signInBtn = By.linkText("Sign in");
	By userName = By.id("id_username");
	By password = By.id("id_password");
	By loginBtn = By.xpath("//*[@value = 'Login']");
		
	public void login(){
		driver.findElement(homeGetStartedBtn).click();
		driver.findElement(signInBtn).click();
		driver.findElement(userName).sendKeys("dsalgoproject");
		driver.findElement(password).sendKeys("quantumqa");
		driver.findElement(loginBtn).click();
	}
	public void clickOnLinkedList(){	
		driver.findElement(linkedListGetStartedBtn).click();
	 }
	
	public void clickOnTopic(String topicName){
		driver.findElement(By.linkText(topicName)).click();
	}
	public void verifyHeading(String expectedTxt){
		String actualTxt  = driver.getTitle();
		//String actualTxt = driver.findElement(headingOfPage).getText();
		assertEquals(expectedTxt, actualTxt);
	
	}
	/*public void clickHere(){
		
		driver.findElement(tryHere).click();
	}*/
		
	/*public void writeOnTextEditorAndRun(){
		
		driver.findElement(textEditor).sendKeys("print(\"Hello\")");
		driver.findElement(runBtn).click();
		
	}*/
	
	/*public void clickOnCreateLinkedList(){
		driver.findElement(createLinkedList).click();

	}
	
	public void clickOnTypsOfLinkedList(){
		driver.findElement(typesOfLinkedList).click();
	}
	
	public void clickOnImplementLinkedList(){
		driver.findElement(implementLinkedList).click();
	}
	public void clickOnTraversal(){
		driver.findElement(traversal).click();
	}
	
	public void clickOnInsertion(){
		driver.findElement(insertion).click();
	}
	public void clickOnDeletion(){
		driver.findElement(deletion).click();
	}
	public void clickOnPracticeQutn(){
		driver.findElement(practiceQutn).click();
	}*/
}


