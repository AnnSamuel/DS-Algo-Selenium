package DsAlgo_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
	public static WebDriver driver = new ChromeDriver();
	String URL = "https://dsportalapp.herokuapp.com/";
	By getStrtedBtn = By.xpath("//button[text()='Get Started']");

	public void dsAlgo() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
	}
	
	public void homePg()
	{
		driver.findElement(getStrtedBtn).click();
	}
}
