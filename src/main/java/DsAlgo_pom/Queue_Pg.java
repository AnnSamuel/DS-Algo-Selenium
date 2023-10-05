package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Queue_Pg {
	WebDriver driver;
	public Queue_Pg(WebDriver driver) {
		this.driver = driver;
	}
	
	By queueGetStartedBtn = By.xpath("//h5[text() = 'Queue']/..//*[text() = 'Get Started']");
	
	public void clickOnQueueGetStartedBtn() {
		driver.findElement(queueGetStartedBtn).click();
	}
}
