package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Locating the WebElements
public class HomePage {
	@FindBy(xpath="//a[text()='Leads' and @href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organizationsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutOperation;

//Initializing the WebElements
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
//Getters methods
	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getOrganizationsMenu() {
		return organizationsMenu;
	}
	
	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignoutOperation() {
		return signOutOperation;
	}
	
//business library which clicks on leads menu	
	
	public void clickOnLeadMenu() 
	{
		getLeadsMenu().click();
	}

//business library which clicks on Contacts menu
	
	public void clickOnContactsMenu() 
	{
		getContactsMenu().click();
	}
//business library which clicks on Organizations menu	
	public void clickOnOrganizationsMenu()
	{
		getOrganizationsMenu().click();
	}
	
//business library to perform sign out operation
	
	public void signoutOperation(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignoutOperation().click();
	}
	
}