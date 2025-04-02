package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass {
	
	SeleniumUtility sUtil = new SeleniumUtility();
	PropertiesUtility pUtil = new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	public WebDriver driver;
	public static WebDriver sDriver;  //used only for listeners 
	
	@BeforeSuite(alwaysRun=true)
		public void dbConnection() 
	{
		System.out.println("DB connection created");
	}
	
//	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome")String BROWSER) throws Exception
	{
		if (BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}	
		sDriver=driver; // initializing static driver with actual driver for listener 
		sUtil.maximaizewindow(driver);
		sUtil.implicitWait(driver, 15);
		String URL = pUtil.getDataFromPropertiesFile("url");
		sUtil.navigateToApplication(driver, URL);
		System.out.println("Application opened successfully");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		lp.loginToApplication(UN, PWD);
		System.out.println("Login successful");
	}
	
	@AfterMethod(alwaysRun=true)
	public void signoutOperation()
	{
		HomePage hp = new HomePage(driver);
		hp.signoutOperation(driver);
		System.out.println("Logout Successful");
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun=true)
	public void CloseDBConnection()
	{
		System.out.println("DB connection closed");
	}
}