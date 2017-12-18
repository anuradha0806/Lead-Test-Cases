package editLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;


	public class EditLead extends ProjectMethods {

		public EditLead(RemoteWebDriver driver, ExtentTest test) {
		
			this.driver = driver;
			this.test = test;
					
			PageFactory.initElements(driver, this);		
			if(!verifyTitle("opentaps CRM")) {
				reportStep("this is not EditLead Page", "FAIL");
		}

	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCName;
	public EditLead updtcName(String cName){		
		type(eleCName,cName);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement eleUpdate;
	public ViewLeadPage updateFields(){
		click(eleUpdate);
		return new ViewLeadPage(driver, test);
		
				
	}
	
}
