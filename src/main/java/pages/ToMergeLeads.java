
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ToMergeLeads extends ProjectMethods {


public ToMergeLeads() {
	PageFactory.initElements(driver,this);
}

@FindBy(how=How.LINK_TEXT,using="Merge Leads")
private WebElement eleFindMergeLeads;

public ToMergeLeads findLeadLink(){
	click(eleFindMergeLeads);
	return this;
}

@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
private WebElement eleImageOne;

public FindLead fromLead(){
	click(eleImageOne);
	return new FindLead();
}
@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
private WebElement eleImageTwo;

public FindLead ToLead(){
	click(eleImageTwo);
	return new FindLead();
}


}
