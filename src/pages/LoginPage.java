package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Functions;

public class LoginPage extends Functions {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;


	}

	/*
	 * By user = By.id("txtUsername");
	 * 
	 * By pwd = By.id("txtPassword");
	 * 
	 * By login = By.name("Submit");
	 */

	@FindBy(id = "txtUsername")
	WebElement user;

	@FindBy(id = "txtPassword")
	WebElement pwd;

	@FindBy(name = "Submit")
	WebElement login;

	public WebElement getUser() {

		return user;

	}

	public WebElement getPwd() {

		return pwd;
	}

	public WebElement getLogin() {

		return login;
	}

	public void loginApp() {

		getUser().sendKeys(readPropertyFile("username"));

		getPwd().sendKeys(readPropertyFile("password"));

		getLogin().click();

	}

}
