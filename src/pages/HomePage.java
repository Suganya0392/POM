package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	/*
	 * By quickLaunch = By.xpath("//*[@class='quickLaungeContainer']//tr/td//span");
	 * 
	 * By legend = By.xpath("//*[text()='Administration']/../..//td[2]");
	 */

	@FindBy(xpath = "//*[@class='quickLaungeContainer']//tr/td//span")
	List<WebElement> quickLaunch;

	@FindBy(how = How.XPATH, using = "//*[text()='Administration']/../..//td[2]")
	List<WebElement> legend;

	public void getQuickLaunch() {

		for (int i = 0; i < quickLaunch.size(); i++) {

			System.out.println(quickLaunch.get(i).getText());

		}
	}

	public void getLegend() {

		for (int i = 0; i < legend.size(); i++) {

			System.out.println(legend.get(i).getText());

		}
	}

}
