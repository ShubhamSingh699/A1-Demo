package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
/**
 * Locating the WebElement
 */
	
@FindBy(xpath ="//img[@title='Create Lead...']")
private WebElement createNewLeadIcon;

//Initializing WebElements
public LeadsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

//Getting
public WebElement getCreateNewLeadIcon()
{
	return createNewLeadIcon;
	
}

//Utilization
public void createNewLeadIcon()
{
	getCreateNewLeadIcon().click();
}



}

