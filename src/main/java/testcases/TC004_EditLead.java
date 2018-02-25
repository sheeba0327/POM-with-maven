package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.EditLead;
import pages.FindLead;
import pages.LoginPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit an existing Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sheeba";
		browserName="chrome";
		dataSheetName="TC004";
	}		
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String vName, String LeadID, String newCName) {

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

		new EditLead()
		.editButton()
		.updateCName(newCName)
		.submitEditedLead()
		.foundComNam(newCName);
	}
	/*@DataProvider(name="fetchData")
	public Object[][] getData(){
		Object[][] data = new Object[1][5];
		data[0][0]= "DemoSalesManager";
		data[0][1]= "crmsfa";
		data[0][2]= "Selenium Automation Engineer";
		data[0][3]= "100";	
		data[0][4]= "ASDF";
		return data;
	}*/
}
