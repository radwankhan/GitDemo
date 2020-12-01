import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.biman-airlines.com/");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.id("from-0"));
		source.sendKeys("D");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.id("to-0"));
		destination.sendKeys("d");
		Thread.sleep(2000L);
		for (int i=0;i<5;i++)
		{
		destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
	}

}
