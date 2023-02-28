import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_checkbox {

	public static void main(String[] args) {
	
		System.getProperty("WebDriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
				
		//Check first checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		//verify whether first checkbox is checked
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		//uncheck first checkbox
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		
		//verify whether first checkbox is unchecked
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
       // no. of checkboxes
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
