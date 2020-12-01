import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1_CTXT\']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[value='CCU']")).click();
		//if there is 2 or more nodes found by same xpath then you need mention the number of xpath	
		driver.findElement(By.xpath("(//a[@value='GOI'])")).click();
		
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
	}

}
