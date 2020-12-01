import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("j4kiR");
		driver.findElement(By.id("pass")).sendKeys("jannat11@01719238821");
		//driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.id("password")).sendKeys("5646");
		//driver.findElement(By.xpath("//*[@id=\'identify_email\']")).sendKeys("9294629789");
		//driver.findElement(By.name("email")).sendKeys("5548845");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MD");
		//driver.findElement(By.xpath("//*[text()='Log In']")).click();		text based xpath
System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")).getText());

	}

}
