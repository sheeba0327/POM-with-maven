package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{

	
	//Click on CRM/SFA
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement clickCRMSFA ;
	
	
	public MyLeadsPage clickCRMlogin() {
		click(clickCRMSFA);
		return new MyLeadsPage();
		
	}
	
}
	

