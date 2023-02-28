import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End_Dropdown {

	public static void main(String[] args) throws InterruptedException {
	System.getProperty("WebDriver.Chrome.Driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	
	for (int i=1; i<4; i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}

	driver.findElement(By.id("btnclosepaxoption")).click();

	
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	//driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight.ui-state-active']")).click();

	Thread.sleep(2000);
		if (driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5"))
	{
		System.out.println("Return Date field is disabled");
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
		System.out.println("Return Date field is enabled");
		
	}
	
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
        WebElement dropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select options= new Select(dropdown);
        options.selectByValue("USD");
        
	driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
	
	}

}
