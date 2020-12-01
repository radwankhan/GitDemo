import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://fly4.emirates.com");
	WebElement source=driver.findElement(By.id("ctl00_c_CtWNW_ddlFrom-suggest"));
	source.sendKeys("NEW");
	for(int i=0; i<5;i++ )
	{
		source.sendKeys(Keys.ARROW_DOWN);
	}

	
	source.sendKeys(Keys.ENTER);
	
	
	}

}
