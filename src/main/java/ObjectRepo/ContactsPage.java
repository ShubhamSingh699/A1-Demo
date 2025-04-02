package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Locating WebElements
public class ContactsPage {
@FindBy(xpath="//img[@title='Create Contact...']")
private WebElement CreateNewContactIcon;

//initializing WebElement
public ContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Getters
public WebElement getCreateNewContactIcon() {
	return CreateNewContactIcon;
}

//Utilization

public void createNewContactIcon()
{
	getCreateNewContactIcon().click();
}


}
