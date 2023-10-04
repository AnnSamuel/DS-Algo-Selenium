package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//Page specific Class contain 1)Constructor,2)WebElement and 3) Actions
public class Register {

	protected WebDriver driver;

	private By txt_userName = By.id("id_username");
	private By txt_Password = By.id("id_password1");
	private By txt_Confirm_Password = By.id("id_password2");
	private By btn_Register2 = By.xpath("//input[@type='submit']");
	private By error_mismatch= By.xpath("//div[@class='alert alert-primary']");

	// private By btn_Register = By.xpath("//a[text()=' Register ']");
	// private By Confirm_Msg = By.xpath("//div[@class='alert alert-primary']");

	// constructor
	public Register(WebDriver driver) {
		this.driver = driver;

	}

	// Action Methods
	// public void ClickRegisterBtn () {
	// driver.findElement(btn_Register).click();
	// }

	public void enterUsername(String username) {
		driver.findElement(txt_userName).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_Password).sendKeys(password);
	}

	public void ConfirmPassword(String password) {
		driver.findElement(txt_Confirm_Password).sendKeys(password);

	}

	public void ClickRegister2Button() {
		driver.findElement(btn_Register2).click();
	}

	// public void AccountConfirmMsg(String username) {
	// String msg1 = driver.findElement(Confirm_Msg).getText();
	// System.out.println(msg1);

	// String Msg_Expected = "New Account Created. You are logged in as"+(username)
	// ;
	// Assert.assertEquals(Msg_Expected,msg1);
	// }
	public String BelowUsernametxt_errorMsg() {

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		return messageStr;
	}
	public String BelowPasswordtxt_errorMsg()  {

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
	//	System.out.println("Actual message appeared on screen: " + messageStr);
		return messageStr;
	
}
	public boolean Mismatch_Error() {
		boolean error=driver.findElement(error_mismatch).isDisplayed();
		return error;
	}
}