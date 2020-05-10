package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Functions {

	static WebDriver driver;

	static Properties properties;

	public static String readPropertyFile(String key) {

		properties = new Properties();

		try {
			properties.load(new FileInputStream("./configuration/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties.getProperty(key);

	}

	public static WebDriver browserFactory(String key) {

		String browser = readPropertyFile(key);

		if (browser.toUpperCase().equals("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

			driver = new ChromeDriver();
		}

		else if (browser.toUpperCase().equals("IE")) {

			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		}

		else {

			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			driver = new FirefoxDriver();

		}

		driver.get(readPropertyFile("url"));

		driver.manage().window().maximize();
		
		return driver;

	}

}
