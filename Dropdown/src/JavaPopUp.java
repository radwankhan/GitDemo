import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptheadnbody.php");
		driver.findElement(By.xpath("//input[@value='popup']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("abc"); // to send something on the edit box
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}

}
