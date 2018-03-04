package testcases;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC_002_CreateLead extends ProjectMethods {

		@BeforeTest
		public void setData() {
			testCaseName="TC_002_CreateLead";
			testDescription="Create a new Lead";
			testNodes="Leads";
			category="Smoke";
			authors="Sheeba";
			browserName="chrome";
			dataSheetName="TC002";
		}		
		@Test(dataProvider="fetchData")
		public void CreateNewLead(String uName,String pwd,String CName, String FName, String LName) {

			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn();
			
			new MyHomePage()
			.clickCRMlogin()
			.clickLogInLead();
			
			new CreateLead()
			.clickcreateLead()
			.enterCompName(CName)
			.enterFirstName(FName)
			.enterLastName(LName)
			.clickSubmit()
			.verifyFName(FName);
	}
		/*@DataProvider(name="fetchData")
		public Object[][] getData(){
			Object[][] data = new Object[1][6];
			data[0][0]= "DemoSalesManager";
			data[0][1]= "crmsfa";
			data[0][2]= "Selenium Automation Engineer";
			data[0][3]= "AAAA";
			data[0][4]= "b";
			data[0][5]= "c";
			return data;
			
		}*/
}