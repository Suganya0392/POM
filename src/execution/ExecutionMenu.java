package execution;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;
import utility.Functions;

public class ExecutionMenu {
	
	static WebDriver driver;

	public static void main(String[] args) {


		Functions function = new Functions();

	driver = function.browserFactory("browser");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.loginApp();

		HomePage homepage = new HomePage(driver);

		homepage.getQuickLaunch();

		homepage.getLegend();

	}

}
