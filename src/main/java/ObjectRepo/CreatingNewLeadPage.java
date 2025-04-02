package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleTextFeild;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileTextFeild;
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextFeild;
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextFeild;
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextFeild;
	@FindBy(xpath="//input[@name='country']")
	private WebElement countryTextFeild;
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTextFeild;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextFeild() {
		return firstName;
	}

	public WebElement getLastNameTextFeild() {
		return lastName;
	}

	public WebElement getCompanyTextFeild() {
		return company;
	}

	public WebElement getTitleTextFeild() {
		return titleTextFeild;
	}

	public WebElement getMobileTextFeild() {
		return mobileTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployeesTextFeild() {
		return noOfEmployeesTextFeild;
	}

	public WebElement getCityTextFeild() {
		return cityTextFeild;
	}

	public WebElement getCountryTextFeild() {
		return countryTextFeild;
	}

	public WebElement getStateTextFeild() {
		return stateTextFeild;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	//Utilization
	
	//Leads_001
	public void createNewLead(String fName, String lName, String company)	
	{
		getFirstNameTextFeild().sendKeys(fName);
		getLastNameTextFeild().sendKeys(lName);
		getCompanyTextFeild().sendKeys(company);
		getSaveButton().click();
	}
	
	////Leads_002
	public void createNewLead(String fName, String lName, String company, String title, String mobile, String email)	
	{
		getFirstNameTextFeild().sendKeys(fName);
		getLastNameTextFeild().sendKeys(lName);
		getCompanyTextFeild().sendKeys(company);
		getTitleTextFeild().sendKeys(title);
		getMobileTextFeild().sendKeys(mobile);
		getEmailTextFeild().sendKeys(email);
		getSaveButton().click();
	}
	
	////Leads_003
	public void createNewLead(String lName, String company, String leadSource, String noOfEmployees, String city, String country, String state)	
	{
		getLastNameTextFeild().sendKeys(lName);
		getCompanyTextFeild().sendKeys(company);
		Select sel= new Select(getLeadSourceDropdown());
		sel.selectByValue(leadSource);
		getNoOfEmployeesTextFeild().sendKeys(noOfEmployees);
		getCityTextFeild().sendKeys(city);
		getCountryTextFeild().sendKeys(country);
		getStateTextFeild().sendKeys(state);
		getSaveButton().click();
	}
}