package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadtab extends ProjectMethods{

	public MergeLeadtab() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement mergebut;
	public MergeLeadtab mergebut() {
		click(mergebut);
		
		acceptAlert();
		
		return this;		
	}
}




