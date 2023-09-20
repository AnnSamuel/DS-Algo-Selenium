package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	static String url = "https://dsportalapp.herokuapp.com/";

	public static void setUpDriver() {
	       
	    if (driver==null) {
	           
		    driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
	    }
	}
	
	public static void openPage() {
	    driver.get(url);
	}
	       
	public static WebDriver getDriver() {
	    return driver;              
	}
	
	public static void tearDown() {
	        
	    if(driver!=null) {
	         driver.close();
	         driver.quit();
	    }
	        
	} 

//	public static WebDriver driver;
// 
//	public static WebDriver setupApplication(WebDriver driver)
//	{		
//		Reporter.log("=====Browser Session Started=====", true);		
//        driver = new ChromeDriver();		
//        driver.manage().window().maximize();
//        driver.get("https://dsportalapp.herokuapp.com/");		
//        Reporter.log("=====Application Started=====", true);
//		return driver;
//	}
//	
//	public static void closeApplication()
//	{
//		driver.quit();
//		Reporter.log("=====Browser Session End=====", true);
//		
//	}

}


