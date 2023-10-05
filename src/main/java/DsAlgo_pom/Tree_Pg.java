package DsAlgo_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tree_Pg {
	WebDriver driver;
	
	public Tree_Pg(WebDriver driver) {
		this.driver = driver;
	}
	
	By treeGetStartedBtn = By.xpath("//h5[text() = 'Tree']/..//*[text() = 'Get Started']"); 
	
	public void clickOnTreeGetStartedBtn() {
		driver.findElement(treeGetStartedBtn).click();
	}

}
