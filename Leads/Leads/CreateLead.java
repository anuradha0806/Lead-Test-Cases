package Leads;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sathya");
		driver.findElementById("createLeadForm_lastName").sendKeys("P");
		Select sourceDD = new Select(driver.findElementByName("dataSourceId"));
		sourceDD.selectByValue("LEAD_EMPLOYEE");
	//	Select marketingCampaignIdDD = new Select(driver.findElementByName("marketingCampaignId"));
	//	marketingCampaignIdDD.selectByValue("DEMO_MKTG_CAMP");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9988998899");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sathya@infosys.com");
		driver.findElementByClassName("smallSubmit").click();
		String newId = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(newId);
		/*One way of finding lead id
		String leadId = newId.substring(newId.indexOf("(")+1,newId.indexOf(")"));
		System.out.println(leadId);*/
		//Another way
		String leadId = newId.replaceAll("\\D","");
		System.out.println(leadId);
		System.out.println(leadId.length());
		
		driver.close();
		
	}

}
