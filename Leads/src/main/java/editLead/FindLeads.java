package editLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {

	public FindLeads(RemoteWebDriver driver, ExtentTest test) {
	
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads | opentaps CRM")) {
			throw new RuntimeException();
	}

}
	
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFname;
	
	public FindLeads clickFname(String fName) {
		click(eleFname);
		type(eleFname,fName);
		return this;
	}
	

   @FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
   private WebElement eleFindLeads;	
   public FindLeads clickFindLeadsButton() throws InterruptedException {
   click(eleFindLeads);
   Thread.sleep(2000);
   return this;
	}
   
   
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eleClickLeads;
	public ClickLead clickResultingLead() {
		click(eleClickLeads);
		return new ClickLead(driver, test);
	}
	
	

}
