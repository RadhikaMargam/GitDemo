import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3_runTimePassword {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String Password= getPassword(driver);
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("Radhika");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(Password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
}
	public static String getPassword(WebDriver driver ) throws InterruptedException
	{
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[2]")).click();
		String PassMsg=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		System.out.println(PassMsg);
		//Please use temporary password 'rahulshettyacademy' to Login.
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
	    String[] PasswordArray=PassMsg.split("'");
	    //PasswordArray[0]=Please use temporary password 
	    //PasswordArray[1]=rahulshettyacademy' to Login.
	    
	    //0th index=rahulshettyacademy
	    //1st index=to Login.
	    String Password= PasswordArray[1].split("'")[0];
	    //
	    System.out.println(Password);
	    return Password;
	  }
	
}
