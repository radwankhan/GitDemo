import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//round trip
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();//check box
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//departure city
		driver.findElement(By.cssSelector("a[value='CCU']")).click();//city name 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();//arrival city + city name
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//departure date
		Thread.sleep(2000);
		//arrival date
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))//round trip date enable or disable
		{
		System.out.println("its enabled");	
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		}
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		//driver.findElement(By.cssSelector("a[class='.ui-state-default']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();//passenger selection
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//for(int i=1;i<5;i++);
		int i=1;
		while (i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();//increase number of passenger
		i++;
	}
		driver.findElement(By.id("btnclosepaxoption")).click();//done button
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));//Currency selection
		s.selectByValue("USD");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();//search button
	}

}
