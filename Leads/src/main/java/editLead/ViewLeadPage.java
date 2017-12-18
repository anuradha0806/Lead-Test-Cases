package editLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		
		this.driver = driver;
		this.test = test;
		
		PageFactory.initElements(driver, test);
		if(!verifyTitle("View Lead | opentaps CRM"))
		throw new RuntimeException();
		
	}
	
	

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement editedLeadId;
	public ViewLeadPage getLeadId(){
		String updtCompany = getText(editedLeadId);
	    String[] stringArray = updtCompany.split("\\s+");
        System.out.println(stringArray[0]);
        if (stringArray[0].equals("CTS"))
        {
        System.out.println("Company is updated correctly");
        }
		return getLeadId();
		
	}
	


}
