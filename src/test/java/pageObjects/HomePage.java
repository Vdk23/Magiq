package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{



	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By Account = By.xpath("//span[text()='My Account']");
	
	By Register = By.xpath("//a[normalize-space()='Register']");
	
	By Login = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");

	public void Account_click () {
		driver.findElement(Account).click();
	}

	public void Register_click () {
		driver.findElement(Register).click();

	}
	
	public void Login_click () {
		driver.findElement(Login).click();

	}
}
