import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector(".btn.btn-default")).click();
		Thread.sleep(3000L);
		System.out.println(driver.switchTo().alert().getText());     // to get the text from pop up window
		driver.switchTo().alert().accept();   // to click on positive note on the pop up window
		
		//for negative note
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		Thread.sleep(3000L);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
