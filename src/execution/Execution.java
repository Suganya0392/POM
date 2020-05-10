package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Git;
import utility.Functions;

public class Execution {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = Functions.browserFactory("browser");

		Git git = PageFactory.initElements(driver, Git.class);

		git.loginAppGit();

	}

}
