package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_MergeLead";
		testDescription="login Merge Lead and Logout";
		testNodes="MergeLeads";
		category="Smoke";
		authors="Pavithra";
		browserName="chrome";
		dataSheetName="TC001";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) throws InterruptedException {


		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.crmsfa()
		//Myhome
		.clickLeads()

		//Mylead

		.MergeLeadtab()

		//MergerLeadvalues

		.MergefromLead()
		.Accountsele()
		.findleadbutton()
		.firstle()
		.Mergetolead()
		.toleadid()
		.findtbut()
		.firstled()
	
		
		//MergeLeadtab
		.mergebut();
	}


}






