package duplicateLead;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import duplicateLead.DuplicateLead;
import duplicateLead.LoginPage;
import duplicateLead.ViewLead;
import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_DuplicateLead";
		testCaseName = "TC004_DuplicateLead";
		testDescription = "To Test Duplicate Lead";
		category= "Smoke";
		authors	="Anu";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String email) throws InterruptedException {

		ViewLead vlp = new LoginPage(driver,test)
				.enterUserName(userName)
				.enterPassword(passWord)
				.clickLogin()
				.Lead()
				.clickLeadHome()
				.clickFindLeads()
				.clickEmail()
				.enterEmailId(email)
				.clickResultingLead();
				String leadfName = vlp.getFirstName();
				//System.out.println(fNameLead);
				vlp.dupLead();
				new DuplicateLead(driver,test)
			     .clickCreateLead()
			     .verifyFname(leadfName);
			      
			      
		
		
				
				
				
		

	}

}
