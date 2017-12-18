package editLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LeadHomePage extends ProjectMethods {

	public LeadHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Leads | opentaps CRM")) {
			throw new RuntimeException();
	}
		
}		

		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFindLeads;
		public FindLeads clickFindLeads() {
			click(eleFindLeads);
			return new FindLeads(driver, test);
		}
}