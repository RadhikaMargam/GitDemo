import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

  System.getProperty("WebDriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/angularpractice/");
  driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("aaa");
  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
  driver.findElement(By.id("exampleInputPassword1")).sendKeys("abc");
  Thread.sleep(2000);
  driver.findElement(By.id("exampleCheck1")).click();
  WebElement dropDown= driver.findElement(By.id("exampleFormControlSelect1"));
  Select options= new Select(dropDown);
  options.selectByIndex(1);
  System.out.println(options.getFirstSelectedOption().getText());
  driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]")).click();
  driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01/01/1990");
  driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
  Thread.sleep(2000);
  System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
  
  
  
	}

}
