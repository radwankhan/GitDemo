import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("jakir");
		driver.findElement(By.className("inputtext")).sendKeys("1223");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("jack"); 
//System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div")).getText());
		
		
	}

}
