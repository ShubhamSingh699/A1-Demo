package TestCaseRepo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)

public class TC_001 extends BaseClass{
	@Test(groups= {"Regression"})
	public void LE_001() throws Exception
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadMenu();

		LeadsPage lp = new LeadsPage(driver);
		lp.createNewLeadIcon();

		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
	//	Assert.fail();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
		
	}

}