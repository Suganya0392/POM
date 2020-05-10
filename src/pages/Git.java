package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Git {

	WebDriver driver;

	public Git(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(id = "login_field")
	WebElement uname;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(name = "commit")
	WebElement login;

	public void loginAppGit() {

		uname.sendKeys("dkg4484");

		pwd.sendKeys("Hello123");

		login.click();
		
		pwd.sendKeys("Red123!@");
		
		login.click();

	}

}
