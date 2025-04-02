package TestCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass{
	@Test(groups= {"Smoke", "Regression"})
	public void CON_003() throws Exception
	{	
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();

		ContactsPage cp = new ContactsPage(driver);
		cp.createNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 8, 1);
		String email = eUtil.getDataFromExcelFile("Contacts", 8, 2);
		String mobile = eUtil.getDataFromExcelFile("Contacts", 8, 3);
		String mailingCity = eUtil.getDataFromExcelFile("Contacts", 8, 4);
		String mailingState = eUtil.getDataFromExcelFile("Contacts", 8, 5);
		String mailingCountry = eUtil.getDataFromExcelFile("Contacts", 8, 6);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, email, mobile, mailingCity, mailingState, mailingCountry);
	}	

}