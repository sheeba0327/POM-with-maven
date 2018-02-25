package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods {
//click on find lead tab under Leads tab
	
	public FindLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	public FindLead findLeadLink(){
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleFindLeads1;
	
	public FindLead findLeadtab(String data){
		type(eleFindLeads1, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindButton;
	
	public FindLead findButton(){
		click(eleFindButton);
		return  this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	private WebElement eleFirstLead;
	
	public FindLead firstLead(){
		
		click(eleFirstLead);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
	private WebElement eleFindCName;
	
	public FindLead findCName(String data){
		type(eleFindCName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFindFName;
	
	public FindLead findFName(String data){
		type(eleFindFName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class = 'x-form-element']/input[1]")
	private WebElement eleLeadID1;
	
	public FindLead findLeadID1(String data){
		type(eleLeadID1, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class = 'linktext'])[7]")
	private WebElement eleSecondLead;
	
	public FindLead secondLead(){
		click(eleSecondLead);
		return this;
	}
	
	
	
}

