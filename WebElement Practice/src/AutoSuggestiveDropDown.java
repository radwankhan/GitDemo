import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.biman-airlines.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("from-0")).click();
		//driver.findElement(By.id("from-0")).sendKeys("d");
		Thread.sleep(2000L);
		// to click on number 2, 3 or any position
		//for (int i=0;i<4;i++)
		{
		//driver.findElement(By.id("from-0")).sendKeys(Keys.ARROW_DOWN);
		}
		//driver.findElement(By.id("from-0")).sendKeys(Keys.ENTER);
		
		
		
		// to minimize the work load you can create webElement
		
		WebElement source=(driver.findElement(By.id("from-0")));
		source.sendKeys("d");
		Thread.sleep(2000L);
		for (int i=0;i<3;i++)
		{
		source.sendKeys(Keys.ARROW_DOWN);
		}
		source.sendKeys(Keys.ENTER);

}
}