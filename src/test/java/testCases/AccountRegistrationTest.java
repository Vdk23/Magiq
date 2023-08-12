package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	//public WebDriver driver;

	/* @Test(priority=1)
	public void TC1_Home() {
		HomePage Hpage = new HomePage(driver);
		Hpage.Account_click();  
		Hpage.Register_click();

	}

	@Test(priority=2)
	public void TC2_RegistrationForm() {
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.fName("Deepak");

	} */
	
	@Test
	public void TC3_Login() {
		HomePage Hpage = new HomePage(driver);
		Hpage.Account_click(); 
		Hpage.Login_click();
	}


}
