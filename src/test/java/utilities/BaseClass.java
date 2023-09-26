package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
   public static WebDriver driver;
	static String url = "https://dsportalapp.herokuapp.com/";

	public static void setUpDriver() {	       
		    driver = new ChromeDriver();//initialize chrome driver
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		    driver.manage().window().maximize();//maximize the window
	}
	
	public static void openPage() {
		driver.get(url);
	}
	public static void openSpecificPage(String subPage) {
		driver.get(url+subPage);
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
	public static void tearDown() throws InterruptedException {
	        
	    if(driver!=null) {
	         driver.close();
	         driver.quit();
	    }
	        
	} } 
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
