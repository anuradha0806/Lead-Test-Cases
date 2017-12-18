package duplicateLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	public ViewLead(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
	}

}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement firstName;
	public String getFirstName(){
		String leadName = getText(firstName);
		return leadName;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement dupLead;
	public DuplicateLead dupLead(){
		click(dupLead);
		return new DuplicateLead(driver,test);
		
	}
	
	
}
	