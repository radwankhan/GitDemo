import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[value='CCU']")).click();
		Thread.sleep(5000L);
		//if there is 2 or more nodes found by same xpath then you need mention the number of xpath	
		driver.findElement(By.xpath("(//a[@value='GOI'])")).click();
		
		//if employer don't want index on the coding than first give parent xapth space than child xpath
		
		//driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BOM']")).click();
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
	}

}
