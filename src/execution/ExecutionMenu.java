package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.LoginPage;
import utility.Functions;

public class ExecutionMenu {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = Functions.browserFactory("browser");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.loginApp();
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		
		homePage.getQuickLaunch();
		
		homePage.getLegend();
	}

}


