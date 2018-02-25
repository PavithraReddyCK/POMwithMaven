package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID_OR_NAME,using="updateLeadForm_companyName")
	private WebElement eleupdatecompanyName;
	
	public EditLead UpdatecompanyName(String data) {
		
		type(eleupdatecompanyName,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleupdatelead; 
	
	public Viewcreatemethod view_createlead() {
		click(eleupdatelead);
		return new Viewcreatemethod();	
	}


}
