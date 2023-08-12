package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
    By Email = By.xpath("//input[@id='input-email']");
    
    By Password = By.xpath("");
    

	public void enterEmail () {
		driver.findElement(Email).click();
	}

	public void enterPassword () {
		driver.findElement(Password).click();
	}



}
