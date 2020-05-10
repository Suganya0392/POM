package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Functions;

public class HelloWorld {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = Functions.browserFactory("browser");

		WebElement ele1 = driver.findElement(By.id("login_field"));

		ele1.sendKeys("dinganes");

		WebElement ele2 = driver.findElement(By.id("password"));

		ele2.sendKeys("HelloWorld123");

		WebElement ele3 = driver.findElement(By.name("commit"));

		ele3.click();
		
		ele2.sendKeys("World123");
		
		ele3.click();

	}

}
