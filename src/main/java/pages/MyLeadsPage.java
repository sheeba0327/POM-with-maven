package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	//Clicking on Leads tab 

public MyLeadsPage() {
	PageFactory.initElements(driver,this);
}

@FindBy(how=How.LINK_TEXT,using="Leads")
private WebElement clickLeads ;


public MyLeadsPage clickLogInLead() {
	click(clickLeads);
	return this;
	
}

}