package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Viewcreatemethod extends ProjectMethods{

	public Viewcreatemethod() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement viewcompanyname;
	public Viewcreatemethod viewcompanyname(String data) {
		return this;
		
	}
}
