package ObjectRepo;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	//Locating WebElements
	
	@FindBy(name="user_name")
	private WebElement usernameTextFeild;
	
	@FindBy(name="user_password")
	private WebElement passwordTextFeild;

	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	//Initializing WebElements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Getter Methods
	public WebElement getUsernameTextFeild() {
		return usernameTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * This is a business library to perform Login operation to application
	 * @param username
	 * @param password
	 */
	
	public void loginToApplication(String username, String password)
	
	{
		getUsernameTextFeild().sendKeys(username);
		getPasswordTextFeild().sendKeys(password);
		getLoginButton().click();
	}
	
	
	
	
	
	
}