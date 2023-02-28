import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author ADMIN
 *
 */
public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome -ChromeDriver extension- methods close get
		// FireFox - FireFoxDriver extension - methods close get
		// Webdriver close get
		// Webdriver methods + chrome methods

		// Selenium Manager (beta phase)
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\chromedriver_win32\\chromedriver.exe");
		// setProperty("WebDriver.chrome.driver", "D:/chromedriver.exe")
		// WebDriver driver = new ChromeDriver();

		// FireFox launch
		// webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		// WebDriver driver = new FireFoxDriver();

		// MicroSoft Edge
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();

	}

}
