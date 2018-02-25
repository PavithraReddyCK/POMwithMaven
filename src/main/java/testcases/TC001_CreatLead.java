package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import pages.CreatLead;
//import pages.Createleadvalue;
import pages.LoginPage;
//import pages.MyHome;
//import pages.MyLead;
import wdMethods.ProjectMethods;


public class TC001_CreatLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
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
		.clickCreateLead()
		.CreateLeadtab()
		.Companyname("cts")
		.Firstname("babumadav")
		.Lastname("m")
		.submitbutton();
		
		
	
}


}
