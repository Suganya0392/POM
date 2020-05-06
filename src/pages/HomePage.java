package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	By quickLaunch = By.xpath("//*[@class='quickLaungeContainer']//tr/td//span");

	By legend = By.xpath("//*[text()='Administration']/../..//td[2]");

	public void getQuickLaunch() {

		List<WebElement> quick = driver.findElements(quickLaunch);

		for (int i = 0; i < quick.size(); i++) {

			System.out.println(quick.get(i).getText());

		}
	}

	public void getLegend() {

		List<WebElement> leg = driver.findElements(legend);

		for (int i = 0; i < leg.size(); i++) {

			System.out.println(leg.get(i).getText());

		}
	}

}
