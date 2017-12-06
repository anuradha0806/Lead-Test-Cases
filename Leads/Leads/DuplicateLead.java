package Leads;


import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByName("emailAddress").sendKeys("sathya@infosys.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		String fName = driver.findElementById("viewLead_firstName_sp").getText();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByClassName("smallSubmit").click();
		String dupfName = driver.findElementById("viewLead_firstName_sp").getText();
		if (fName.equals(dupfName))
		{
			System.out.println("Name is matching");
		}
		driver.close();
	
	}

}
