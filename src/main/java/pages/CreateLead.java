package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	//Click CreateLead under leads tab to create a new lead
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement clickCreateLead ;


	public CreateLead clickcreateLead() {
		click(clickCreateLead);
		return this;	
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	
	public CreateLead enterCompName(String data) {
		type(eleCompName, data);
		return this;
	
}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	
	public CreateLead enterFirstName(String data) {
		type(eleFName, data);
		return this;
	
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	
	public CreateLead enterLastName(String data) {
		type(eleLName, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();
		
	}

}
