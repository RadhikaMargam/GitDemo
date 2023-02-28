import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTraversing {

	public static void main(String[] args) {
		
		System.getProperty("WebDriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		//it will open the url and wait untill the content is loaded, inbuilt wait is present in get()
		driver.navigate().to("https://rahulshettyacademy.com");
		//it will open the url but dont wait until the content is loaded, inbuilt wait is not available
		driver.navigate().to("http://www.google.com/"); 
	}

}  
   