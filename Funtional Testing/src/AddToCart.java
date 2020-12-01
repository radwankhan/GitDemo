import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	private static int i;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] items = { "Cucumber", "Broccolli" };
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000L);
		for (int i = 0; i < products.size(); i++)

		{
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			List itemsList = Arrays.asList(items);

			if (itemsList.contains(formatedName));
			{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if (j == 3)
				
			break;
			}
		}

	}
}
