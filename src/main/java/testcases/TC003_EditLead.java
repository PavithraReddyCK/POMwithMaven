package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {


	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="login Edit Lead and Logout";
		testNodes="EditLeads";
		category="Smoke";
		authors="Pavithra";
		browserName="chrome";
		dataSheetName="TC001";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.crmsfa()
		.clickLeads()
		.ClickFindLeads()
		.ClickSelectleads()
		.ClickEditleads()
		.UpdatecompanyName("NewCompany")
		.view_createlead();

	}


}



