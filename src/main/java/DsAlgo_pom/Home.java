package DsAlgo_pom;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;




public class Home{
	public WebDriver driver;
	//String URL = "https://dsportalapp.herokuapp.com/";
	By verifyDsAlgoPortlContent = By.xpath("//h1[text()='Preparing for the Interviews']");
	By getStrtedBtn = By.xpath("//button[text()='Get Started']");

	String UrlHome = "https://dsportalapp.herokuapp.com/home";

	By chkPaneCnt = By.className("card-body");
	//// div[contains(@class,'card-body')]
	private List<String> expectedDSList = Arrays.asList("Data Structures-Introduction", "Array", "Linked List", "Stack",
			"Queue", "Tree", "Graph");

	By DsDrpDwn = By.linkText("Data Structures");
	By DsDrpDwnList = By.className("dropdown-item");
	private List<String> expecteDrpDwnList = Arrays.asList("Arrays", "Linked List", "Stack", "Queue", "Tree", "Graph");

	By notLoggedInErrMsg = By.xpath("//div[contains(text(),'You are not logged in')]");
	By homePgGetStrtedBtn = By.xpath("//a[text()='Get Started']");
	By selDrpDown = By.xpath("//a[text()='Graph']");
	By signInBtn = By.xpath("//a[text()='Sign in']");
	By RegisterBtn = By.xpath("//a[text()=' Register ']");
	By userName = By.id("id_username");
	By password = By.id("id_password");
	By loginBtn = By.xpath("//*[@value = 'Login']");
	By signOutBtn = By.linkText("Sign out");
	By loggedInMsg = By.xpath("//div[contains(text(),'You are logged in')]");
	By dsGetStrtedBtn = By.linkText("Get Started");
	By selArrDrpDown = By.linkText("Arrays");

	public Home(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public void dsAlgo() {
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get(URL);
	}

	public void verifyDsAlgoPortl() {
		String expectedTxt = "Preparing for the Interviews";
		String actualTxt = driver.findElement(verifyDsAlgoPortlContent).getText();
		assertEquals(expectedTxt, actualTxt);
	}

	public void clickGetStrtBtn() {
		driver.findElement(getStrtedBtn).click();

	}

	public void homepage() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(UrlHome);
	}

	public void chkPanes(int expectedPanes) {
		List<WebElement> paneList = driver.findElements(chkPaneCnt);
		assertEquals(paneList.size(), expectedPanes);
//		paneList.forEach((pane) -> {
//			
//		})
//		
		for (int i = 0; i < paneList.size(); i++) {
			WebElement pane = paneList.get(i);
			WebElement cardTitle = pane.findElement(By.className("card-title"));
			assertEquals(cardTitle.getText(), expectedDSList.get(i));
		}

	}

	public void clkDsDrpDwnBtn(int expectedDrpDwn) {
		driver.findElement(DsDrpDwn).click();
		List<WebElement> dsDrpDwnList = driver.findElements(DsDrpDwnList);
		assertEquals(dsDrpDwnList.size(), expectedDrpDwn);

		for (int i = 0; i < dsDrpDwnList.size(); i++) {
			WebElement dropdownAnchor = dsDrpDwnList.get(i);
			// WebElement dsDrpDwnListNames = getDsDrpDwnList.findElement(DsDrpDwnList);
			assertEquals(dropdownAnchor.getText(), expecteDrpDwnList.get(i));
		}
	}

	

	public void chkNotLoggedInErrMsg() {
		String actualErrMsg = "You are not logged in";
		String expectederrMsg = driver.findElement(notLoggedInErrMsg).getText();
		assertEquals(actualErrMsg, expectederrMsg);
	}

	public void clkHomePgGetStrtedBtn() {
		driver.findElement(homePgGetStrtedBtn).click();

	}

	public void clkSelDrpDown() {
		driver.findElement(DsDrpDwn).click();
		driver.findElement(selDrpDown).click();
	}

	public void clkSignIn() {
		driver.findElement(signInBtn).click();
	}

	public void verifySignInPg() {
		String actualUrl = "https://dsportalapp.herokuapp.com/login";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}

	public void clkRegister() {
		driver.findElement(RegisterBtn).click();
	}

	public void verifyRegisterPg() {
		String actualUrl = "https://dsportalapp.herokuapp.com/register";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}
	
	public void chkLoggedInMsg() {
		String actualErrMsg = "You are logged in";
		String expectederrMsg = driver.findElement(loggedInMsg).getText();
		assertEquals(actualErrMsg, expectederrMsg);
	}

	public void signInPg() {
		//homepage();
		driver.findElement(signInBtn).click();
		driver.findElement(userName).sendKeys("dsalgoproject");
		driver.findElement(password).sendKeys("quantumqa");
		driver.findElement(loginBtn).click();

	}
	
	public void signout() {
		driver.findElement(signOutBtn).click();
	}
	
	public void clkDsGetStrtedBtn() {
		driver.findElement(dsGetStrtedBtn).click();
		
	}
	
	public void dsIntroPg() {
		String actualUrl = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}
	
	public void clkDrpDwnArrayPg() {
		driver.findElement(DsDrpDwn).click();
		driver.findElement(selArrDrpDown).click();
		
	}
	public void arrayPg() {
		String actualUrl = "https://dsportalapp.herokuapp.com/array/";
		String expectedUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl, actualUrl);
	}
	
}
