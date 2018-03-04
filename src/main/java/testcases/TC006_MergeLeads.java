package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.FindLead;
import pages.LoginPage;
import pages.MyHomePage;
import pages.ToMergeLeads;
import wdMethods.ProjectMethods;

public class TC006_MergeLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLeads";
		testDescription="Merge two Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Sheeba";
		browserName="chrome";
		dataSheetName="TC006";
	}		
	@Test(dataProvider="fetchData")
	public void MergeLeads(String uName,String pwd,String vName, String leadID1, String leadID2) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName);
		
		new MyHomePage()
		.clickCRMlogin()
		.clickLogInLead();
		 
		new ToMergeLeads()
		.findLeadLink()
		.fromLead()
		.findLeadID1(leadID1)
	    .findButton()
	    .firstLead();
		
		new ToMergeLeads()
		.fromLead()
		.findLeadID1(leadID2)
	    .findButton()
	    .firstLead();
		

}
}
