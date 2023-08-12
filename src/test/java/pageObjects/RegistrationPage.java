package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class RegistrationPage extends BasePage{



	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "input-firstname")
	WebElement enter_fisrtName;

	@FindBy(id= "input-lastname")
	WebElement enter_lastName;

	@FindBy(id = "input-email")
	WebElement enter_email;

	@FindBy(id = "input-password")
	WebElement enter_password;

	public void fName (String firstName) {

		enter_fisrtName.sendKeys(firstName);
		}

	public void lName (String lastName) {
		enter_lastName.sendKeys(lastName);
	}

	public void email1 (String email) {
		enter_email.sendKeys(email);
	}

	public void pwd (String password) {
		enter_password.sendKeys("Admin");
	}


}
