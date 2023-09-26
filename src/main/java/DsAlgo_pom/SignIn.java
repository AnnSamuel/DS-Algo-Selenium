package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	By loginBtn = By.xpath("//input[@type='submit']");
	By usrNameBtn = By.name("username");
	By pswdBtn = By.name("password");
	By valSignInErrMsg = By.className("alert");


	WebDriver driver;

	public SignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void noInputSignIn() {
		driver.findElement(loginBtn).click();
	}

	public void accessReqInpFldValMsg() {
		WebElement username = driver.findElement(usrNameBtn);
		String validationMessage = username.getAttribute("validationMessage");
		String actualValMsg = "Please fill out this field.";
		assertEquals(actualValMsg, validationMessage);
	}

	public void etrInvalidInpt(String invalidUsrName, String invalidPswd) {
		driver.findElement(usrNameBtn).sendKeys(invalidUsrName);
		driver.findElement(pswdBtn).sendKeys(invalidPswd);
		driver.findElement(loginBtn).click();
	}

	public void valSignInErrMsg()

	{
		String actualValSignInErrMsg = driver.findElement(valSignInErrMsg).getText();
		String expctedValSignInErrMsg = "Invalid Username and Password";
		assertEquals(actualValSignInErrMsg, expctedValSignInErrMsg);
	}
}
