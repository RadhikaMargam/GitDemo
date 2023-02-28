import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("WebDriver.Chrome.Driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		String[] itemWish = { "Brocolli", "Cucumber", "Beetroot" };
		int j = 0;

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			// format it to get the actual vegetable name (remove -1 KG)
			// broccoli -1 KG
			// using split("-"), broccoli //1 KG
			String[] productName = products.get(i).getText().split("-");
			// productName[0]= "Broccoli "
			// ProductName[1]= "1 KG"
			// trim() will remove white spaces
			String formattedName = productName[0].trim();
			// check the name you extracted is present in array or not
			// convert array into array list for easy search

			List<String> a1 = Arrays.asList(itemWish);

			if (a1.contains(formattedName)) 
			{
				// click on add to cart
				j++;
				//driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemWish.length)
				{
					break;

				}
			}
		}

	}

}
