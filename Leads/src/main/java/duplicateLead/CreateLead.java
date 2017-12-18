package duplicateLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
	}

}
	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement dupfName;
	public CreateLead verifyFname(String originalfName){
		verifyExactText(dupfName, originalfName);
		return this;
		
	}

	
}

