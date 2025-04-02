package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("url");
//		System.out.println(value);
//		String un = prop.getProperty("un");
//		System.out.println(un);
//		String pwd = prop.getProperty("pwd");
//		System.out.println("pwd");
//		String un1 = prop.getProp\]erty("un");
		PropertiesUtility putil = new PropertiesUtility();
		String value = putil.getDataFromPropertiesFile("url");
		String UN = putil.getDataFromPropertiesFile("username");
		String PWD = putil.getDataFromPropertiesFile("password");
		driver.get(value);
		driver.findElement(By.name("user_name")).sendKeys(UN, Keys.TAB, PWD, Keys.ENTER);
		Thread.sleep(2000);
//		driver.close();
		
		
	}

}
