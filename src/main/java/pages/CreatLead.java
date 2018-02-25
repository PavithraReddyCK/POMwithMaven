package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreatLead extends ProjectMethods{
	public CreatLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement CreateLeadtab;
	public Createleadvalue CreateLeadtab() {
		click(CreateLeadtab);
		return new Createleadvalue();		
	}
}
