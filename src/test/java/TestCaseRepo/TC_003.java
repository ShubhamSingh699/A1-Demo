package TestCaseRepo;

import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass{
	@Test(groups= {"Regression", "Smoke"})
	public void LE_003() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadMenu();

		LeadsPage lp = new LeadsPage(driver);
		lp.createNewLeadIcon();
		
		String lName = eUtil.getDataFromExcelFile("Leads", 8, 1);
		String company = eUtil.getDataFromExcelFile("Leads", 8, 2);
		String leadSource = eUtil.getDataFromExcelFile("Leads", 8, 3);
		String noOfEmployees = eUtil.getDataFromExcelFile("Leads", 8, 4);
		String city = eUtil.getDataFromExcelFile("Leads", 8, 5);
		String country = eUtil.getDataFromExcelFile("Leads", 8, 6);
		String state = eUtil.getDataFromExcelFile("Leads", 8, 7);
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, company, leadSource, noOfEmployees, city, country, state);
	}
}