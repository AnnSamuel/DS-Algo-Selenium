package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomeReg  {
	protected WebDriver driver;


	private By btn_Register = By.xpath("//a[text()=' Register ']");
	private By Confirm_Msg = By.xpath("//div[@class='alert alert-primary']");
	
	
	public HomeReg(WebDriver driver) {
		this.driver = driver;

}
	//Action methods on Home Page navigate to Registration page
	public void ClickRegisterBtn () {
		driver.findElement(btn_Register).click();
		
	
}
	public boolean AccountConfirmMsg() {
		boolean msg1 = driver.findElement(Confirm_Msg).isDisplayed();
		return msg1;
	}

}
