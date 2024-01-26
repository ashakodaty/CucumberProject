package prjtest.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import prjtest.utils.PropertyReader;

public class Base {
// driver should be visible for all the classes in the project
	public static WebDriver driver;

//Method to launch browser and used for cross browsing
	public static void launchBrowser(String browser) {
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

//Method to call appurl from appconfig properties
	public static void LaunchAppReadPropertyfile() throws IOException {
		launchBrowser("Chrome");
		String url = PropertyReader.readDataFromPropertyFile("appurl");
		driver.get(url);
		implicitWait(4);
	}
// getting Url and launch the app 
	
			public static void launchApp() {
				launchBrowser("Chrome");
				driver.get("https://dev.infyni.com/");
				implicitWait(4);
			}
//  method for implicit wait (Reusable)
	public static void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

// Method to close application to close the driver after the execution of Test case.
	public static void closeApp() {
		// driver.close();
		driver.quit();
	}

}
