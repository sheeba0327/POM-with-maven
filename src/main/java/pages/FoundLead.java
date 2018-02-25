package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FoundLead extends ProjectMethods{
	
	
	//this page opens after entering the lead id and clicking on submit and selecting the first listing lead
	public FoundLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleFoundIDCN;
	
	public FoundLead foundComNam(){
		String text = getText(eleFoundIDCN);
		System.out.println(text);
		return this;
		
	}
	
	

	@FindBy(how=How.CLASS_NAME ,using="subMenuButtonDangerous")
	private WebElement eleDelete;
	
	public MyLeadsPage deleteButton(){
	     click(eleDelete);
		return new MyLeadsPage();
}
	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[1]")
	private WebElement eleDuplicae;
	
	public FoundLead duplicateButton(){
	     click(eleDuplicae);
		return this;
	}
}