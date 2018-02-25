package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergerLeadvalues extends ProjectMethods{


	public MergerLeadvalues() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	private WebElement MergefromLead;
	public MergerLeadvalues MergefromLead() {
		clickWithNoSnap(MergefromLead);

		switchToWindow(1);
		return this;


	}


	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement Accountsele;
	public MergerLeadvalues Accountsele() {
		Accountsele.sendKeys("1");
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[@type='button']")
	private WebElement findleadbutton;
	public MergerLeadvalues findleadbutton() throws InterruptedException {
		click(findleadbutton);
		Thread.sleep(3000);
		return this;
	}

	@FindBy(how=How.XPATH,using="//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")
	private WebElement firstle;
	public MergerLeadvalues firstle() {
		clickWithNoSnap(firstle);

		switchToWindow(0);
		return this;


	}

	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement Mergetolead;
	public MergerLeadvalues Mergetolead() {
		clickWithNoSnap(Mergetolead);

		switchToWindow(1);
		return this;


	}


	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement toleadid;
	public MergerLeadvalues toleadid() {
		toleadid.sendKeys("1");
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[@type='button']")
	private WebElement findtbut;
	public MergerLeadvalues findtbut() throws InterruptedException {
		clickWithNoSnap(findtbut);
		Thread.sleep(3000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[2]")
	private WebElement firstled;
	public MergeLeadtab firstled() {
		clickWithNoSnap(firstled);

		switchToWindow(0);
		return new MergeLeadtab();
	}

	



}






