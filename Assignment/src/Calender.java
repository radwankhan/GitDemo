import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[value='CCU']")).click();
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='GOI']")).click();
		
		//for current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		//WebElement source=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		//for (int i=1;i<5;i++)
		{
		//source.sendKeys(Keys.ARROW_DOWN);
		}
		//source.sendKeys(Keys.ENTER);
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//s.selectByIndex(6);
		s.selectByVisibleText("7");
		Select r=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		r.selectByVisibleText("USD");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}
}
