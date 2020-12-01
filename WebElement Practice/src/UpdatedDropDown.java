import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.biman-airlines.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("traveller-summary")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("traveller-summary")).getText());
		
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@id=\'BE_flight_paxInfoBox\']/div/div/div[1]/div[2]/div/span[4]/button")).click();
			
		}
		System.out.println(driver.findElement(By.id("traveller-summary")).getText());
		
	}

}
