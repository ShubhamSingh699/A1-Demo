package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextFeild;
	@FindBy(xpath="//input[@name='title']")
	private WebElement titleTextFeild;
	@FindBy(xpath="//input[@name='department']")
	private WebElement departmentTextFeild;
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextFeild;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextFeild;
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingCityTextFeild;
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingStateTextFeild;
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingCountryTextFeild;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	/**
	 * This is the method to initialize WebElements
	 * @param driver
	 */
	public CreatingNewContactPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	/**
	 * This is the method to obtain Getters
	 * @return
	 */
	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getTitleTextFeild() {
		return titleTextFeild;
	}

	public WebElement getDepartmentTextFeild() {
		return departmentTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getMobileTextFeild() {
		return mobileTextFeild;
	}

	public WebElement getMailingCityTextFeild() {
		return mailingCityTextFeild;
	}

	public WebElement getMailingStateTextFeild() {
		return mailingStateTextFeild;
	}

	public WebElement getMailingCountryTextFeild() {
		return mailingCountryTextFeild;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
/**
 * This is a business library to create new contact
 * @param lName
 * @param title
 * @param department
 */

	//Con_001
	public void createNewContact(String lName, String title, String department)
	{
		getLastNameTextFeild().sendKeys(lName);
		getTitleTextFeild().sendKeys(title);
		getDepartmentTextFeild().sendKeys(department);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 */
	////Con_002
	public void createNewContact(String lName, String email, String mobile, String mailingCity)
	{
		getLastNameTextFeild().sendKeys(lName);
		getEmailTextFeild().sendKeys(email);
		getMobileTextFeild().sendKeys(mobile);
		getMailingCityTextFeild().sendKeys(mailingCity);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lName
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	
	////Con_003
	public void createNewContact(String lName, String email, String mobile, String mailingCity, String mailingState, String mailingCountry)
	{
		getLastNameTextFeild().sendKeys(lName);
		getEmailTextFeild().sendKeys(email);
		getMobileTextFeild().sendKeys(mobile);
		getMailingCityTextFeild().sendKeys(mailingCity);
		getMailingStateTextFeild().sendKeys(mailingState);
		getMailingCountryTextFeild().sendKeys(mailingCountry);
		getSaveButton().click();
	}
}
	