package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Createleadvalue extends ProjectMethods{
	public Createleadvalue() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement Companyname;
	public Createleadvalue Companyname(String data) {
		type(Companyname, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement Firstname;
	public Createleadvalue Firstname(String data) {
		type(Firstname, data);
		return this;
	}
	
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement Lastname;
	public Createleadvalue Lastname(String data) {
		type(Lastname, data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement submitbutton;
	public Viewcreatemethod submitbutton() {
		click(submitbutton);
		return new Viewcreatemethod();
	}



}

