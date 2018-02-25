package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLead extends ProjectMethods{
	public MyLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement Leadstab;
	public CreatLead clickCreateLead() {
		click(Leadstab);
		return new CreatLead();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	public FindLeadbyname ClickFindLeads() {
		
		click(eleFindLead);
		return new FindLeadbyname();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement MergeLeadtab;
	public MergerLeadvalues MergeLeadtab() {
		click(MergeLeadtab);
		return new MergerLeadvalues();		
	}

}
