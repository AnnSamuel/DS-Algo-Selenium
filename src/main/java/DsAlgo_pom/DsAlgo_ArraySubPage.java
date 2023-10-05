package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DsAlgo_ArraySubPage {
	WebDriver driver;
	
	By arrayInPython = By.linkText("Arrays in Python");
	By arraysUsingList = By.linkText("Arrays Using List");
	By basicOperationsInLists = By.linkText("Basic Operations in Lists");
    By applicationsOfArray = By.linkText("Applications of Array");
    By searchTheArray = By.linkText("Search the array");
    By maxConsecutiveOnes = By.linkText("Max Consecutive Ones");
    By findNumberswithEvenNumberofDigits = By.linkText("Find Numbers with Even Number of Digits");
    By squaresofSortedArray = By.linkText("Squares of  a Sorted Array");
    By practiceQuestions = By.linkText("Practice Questions");
	By question = By.xpath("//strong[contains(text(),'QUESTION')]");
	By textEditor = By.cssSelector("div.CodeMirror textarea");
	By run = By.xpath("//button");
	By submit = By.xpath("//input[@type='submit']");
       
    public DsAlgo_ArraySubPage(WebDriver driver) {
    	this.driver=driver;
    	 }
    
    public void arrayInpython() {
    	driver.findElement(arrayInPython).click();
    }
    public void applicationsOfArray() {
    	driver.findElement(applicationsOfArray).click();
    }
    public void arraysUsingList() {
    	driver.findElement(arraysUsingList).click();
    }
    public void basicOperationsInLists() {
    	driver.findElement(basicOperationsInLists).click();
    }
    public void searchTheArray() {
    	driver.findElement(searchTheArray).click();
    }    
    public void practiceQuestions() {
    	driver.findElement(practiceQuestions).click();
    }  
    public void maxConsecutiveOnes() {
    	driver.findElement(maxConsecutiveOnes).click();
    } 
    public void findNumberswithEvenNumberofDigits() {
    	driver.findElement(findNumberswithEvenNumberofDigits).click();
    } 
    public void squaresofSortedArray() {
    	driver.findElement(squaresofSortedArray).click();
    } 
    
    public void textAreaRunSubmitQuestionDisplayed() {
    	driver.findElement(textEditor).isDisplayed();
    	driver.findElement(run).isDisplayed();
    	driver.findElement(submit).isDisplayed();
    	driver.findElement(question).isDisplayed();
    }
    	
}
