import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.getProperty("WebDriver.Chrome.Driver" , "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//select 5 adult in no. of passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for (int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		
		//Assert equals checking whether passeger has '5 adult selected
		Assert.assertEquals(driver.findElement(By.className("paxinfo")).getText(), "5 Adult");

		
		//select to and from dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//Parent child relationship xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//select current date
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.cssSelector("a[class= 'ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		//click senior citizen checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//Assert true //verifing whether senior citizen is selected
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Assert false //verifing whether senior citizen is not selected // it will fail
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//print no. of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//check whether Return date is enabled or disabled
	   System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5"))
		{
			System.out.println("is disabled");
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	
		if (driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("1"))
		{
			System.out.println("is enabled");
		}
	   
		}	

}

