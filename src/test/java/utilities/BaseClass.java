package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	static String url = "https://dsportalapp.herokuapp.com/";

	public static void setUpDriver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();// initialize chrome driver

			LoggerLoad.info("testing on chrome");
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();// initialize firefox driver

			LoggerLoad.info("testing on firefox");
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();// initialize edge driver

			LoggerLoad.info("testing on edge");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		driver.manage().window().maximize();// maximize the window
	}

	public static void openPage() {
		driver.get(url);
	}

	public static void openSpecificPage(String subPage) {
		driver.get(url + subPage);
	}

	public static String title() {
		return driver.getTitle();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void back() throws InterruptedException {
		 driver.navigate().back();
		 }

	public static void tearDown() throws InterruptedException {

		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null; // ? is this right?
		}

	}
}
//	public WebDriver setupApplication()
//	{		
//		System.out.println("dfggdfgdfgfdg");
//		Reporter.log("=====Browser Session Started=====", true);		
//        driver = new ChromeDriver();		
//        driver.manage().window().maximize();
//       driver.get("https://dsportalapp.herokuapp.com/");		
//       Reporter.log("=====Application Started=====", true);
//       return driver;
//	}
//	
//	@AfterClass
//	public void closeApplication()
//	{
//		driver.quit();
//		Reporter.log("=====Browser Session End=====", true);
//		
//	}
//
//}
//
//
