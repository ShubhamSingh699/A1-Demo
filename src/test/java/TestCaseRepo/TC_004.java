package TestCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.ContactsPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass{
	@Test(groups= {"Sanity"})
	public void CON_001() throws Exception
	{	
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();

		ContactsPage cp = new ContactsPage(driver);
		cp.createNewContactIcon();
		
		String lName = eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String title = eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String department = eUtil.getDataFromExcelFile("Contacts", 2, 3);
		
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, title, department);
		
	}
}