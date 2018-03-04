package testcases;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FindLead;
import pages.FoundLead;
import pages.LoginPage;
import pages.MyHomePage;
//import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DeleteLead";
		testDescription="Delete a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sheeba";
		browserName="chrome";
		dataSheetName="TC003";
	}		
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName,String pwd,String vName, String LeadID) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn();
		
		new MyHomePage()
		.clickCRMlogin()
		.clickLogInLead();
		
		new FindLead()
		.findLeadLink()
		.findLeadtab(LeadID)
		.findButton()
		.firstLead();
		
		 new FoundLead()
		.foundComNam()
		.deleteButton();
		
		 //how can we get the text from another page to verify the item has been deleted??
		/*new FindLead()
		.findCName(data);*/
}
	/*@DataProvider(name="fetchData")
	public Object[][] getData(){
		Object[][] data = new Object[1][4];
		data[0][0]= "DemoSalesManager";
		data[0][1]= "crmsfa";
		data[0][2]= "Selenium Automation Engineer";
		data[0][3]= "100";	
		return data;
	}*/
	
}
