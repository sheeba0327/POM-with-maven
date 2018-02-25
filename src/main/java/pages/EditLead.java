package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {


	//Clicking on EditLead under leads tab

public EditLead() {
	PageFactory.initElements(driver,this);
}

	
@FindBy(how=How.ID,using="viewLead_companyName_sp")
private WebElement eleFoundIDCN;

public EditLead foundComNam(String data){
	verifyPartialText(eleFoundIDCN, data);
	System.out.println("Company name is updated");
	return this;
	
}



@FindBy(how=How.LINK_TEXT,using="Edit")
private WebElement eleEdit;

public EditingLead editButton(){
     click(eleEdit);
	return new EditingLead();
}

}