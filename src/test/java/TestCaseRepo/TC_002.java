package TestCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_002 extends BaseClass{	
	@Test(groups= {"Sanity", "Smoke"})
		public void LE_002() throws Exception
		{
			HomePage hp = new HomePage(driver);
			hp.clickOnLeadMenu();

			LeadsPage lp = new LeadsPage(driver);
			lp.createNewLeadIcon();
			
			String fName = eUtil.getDataFromExcelFile("Leads", 5, 1);
			String lName = eUtil.getDataFromExcelFile("Leads", 5, 2);
			String company = eUtil.getDataFromExcelFile("Leads", 5, 3);
			String title = eUtil.getDataFromExcelFile("Leads", 5, 4);
			String mobile = eUtil.getDataFromExcelFile("Leads", 5, 5);
			String email = eUtil.getDataFromExcelFile("Leads", 5, 6);
			
			CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
			cnlp.createNewLead(fName, lName, company, title, mobile, email);
			
		}
		
	}