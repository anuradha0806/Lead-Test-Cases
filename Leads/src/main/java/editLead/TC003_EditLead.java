package editLead;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import editLead.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_EditLead";
		testCaseName = "TC003_EditLead";
		testDescription = "To Test Edit Lead";
		category= "Smoke";
		authors	="Anu";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String fName, String cName) throws InterruptedException {
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLead()
		.clickLeadHome()
		.clickFindLeads()
		.clickFname(fName)
		.clickFindLeadsButton()
		.clickResultingLead()
		.clickEditLead()
		.updtcName(cName)
		.updateFields()
		.getLeadId();
		

	}

}
