package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Functions;

public class LoginPage extends Functions {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	By user = By.id("txtUsername");

	By pwd = By.id("txtPassword");

	By login = By.name("Submit");

	public WebElement getUser() {

		return driver.findElement(user);

	}

	public WebElement getPwd() {

		return driver.findElement(pwd);
	}

	public WebElement getLogin() {

		return driver.findElement(login);
	}

	public void loginApp() {

		getUser().sendKeys(readPropertyFile("username"));

		getPwd().sendKeys(readPropertyFile("password"));

		getLogin().click();

	}

}
