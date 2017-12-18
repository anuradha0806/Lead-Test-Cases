package duplicateLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if(!verifyTitle("Duplicate Lead | opentaps CRM")) {
			throw new RuntimeException();
	}

}
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement createLead;
		public CreateLead clickCreateLead(){
			click(createLead);
			return new CreateLead(driver,test);
			
		}
	
	
}