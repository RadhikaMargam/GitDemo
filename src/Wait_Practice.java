import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.getProperty("WebDriver.Chrome.Driver", "D://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, 5);
		String[] itemsNeeded= {"Cucumber", "Brocolli", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItem(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}

	public static void addItem(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> product= driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j=0;
		for(int i=0; i<product.size(); i++)
		{
			String[] name= product.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemsNeededList= Arrays.asList(itemsNeeded);
			
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
		}
	}
}
