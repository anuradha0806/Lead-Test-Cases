package duplicateLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods {

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home page", "Fail");
		}
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleLead;
	public LeadsPage Lead(){
		click(eleLead);
		return new LeadsPage(driver, test);
	}
}
