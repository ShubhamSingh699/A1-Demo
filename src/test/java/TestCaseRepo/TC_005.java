package TestCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass{
	@Test(groups= {"Sanity"})
	public void CON_002() throws Exception
	{	
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();

		ContactsPage cp = new ContactsPage(driver);
		cp.createNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String email = eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mailingCity = eUtil.getDataFromExcelFile("Contacts", 5, 4);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, email, mobile, mailingCity);
	}	

}