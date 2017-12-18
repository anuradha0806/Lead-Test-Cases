package editLead;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LeadsPage extends ProjectMethods {
	public LeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Home | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeadHome;
	public LeadHomePage clickLeadHome() {
		click(eleLeadHome);
		return new LeadHomePage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}





