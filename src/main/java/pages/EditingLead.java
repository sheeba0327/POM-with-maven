package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditingLead extends ProjectMethods {
	//Editing lead after clicking edit button
	

public EditingLead() {
	PageFactory.initElements(driver,this);
}

	
@FindBy(how=How.ID,using="updateLeadForm_companyName")
private WebElement updateCompName;

public EditingLead updateCName(String data){
	type(updateCompName, data);
	return this;
	
}

@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
private WebElement editButton;

public EditLead submitEditedLead() {
	click(editButton);
	return new EditLead();
}
}
