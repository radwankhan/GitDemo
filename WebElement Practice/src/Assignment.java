import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
		Select s=new Select(driver.findElement(By.id("Adults")));
		Thread.sleep(2000L);
		s.selectByValue("5");
	
		Select j=new Select(driver.findElement(By.id("Childrens")));
		j.selectByValue("2");
	
		driver.findElement(By.id("MoreOptionsLink")).click();
		Select c=new Select(driver.findElement(By.id("Class")));
		c.selectByIndex(0);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		}
		
	}


