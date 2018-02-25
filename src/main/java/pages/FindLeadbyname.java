package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadbyname extends ProjectMethods{
	public FindLeadbyname() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(how=How.XPATH,using="//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleSelectlead;

	public FindLeadbyname ClickSelectleads() {
		clickWithNoSnap(eleSelectlead);
		return this;
	}


	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditlead; 

	public EditLead ClickEditleads() {
		click(eleEditlead);
		return new EditLead();	
	}

}