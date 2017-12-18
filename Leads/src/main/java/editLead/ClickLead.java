package editLead;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;


public class ClickLead extends ProjectMethods {

	public ClickLead(RemoteWebDriver driver, ExtentTest test) {
	
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
	}

}

		@FindBy(how=How.LINK_TEXT,using="Edit")
		private WebElement eleEditLead;
		public EditLead clickEditLead() throws InterruptedException{
			click(eleEditLead);
			Thread.sleep(2000);
			return new EditLead(driver, test);
		}

}

	