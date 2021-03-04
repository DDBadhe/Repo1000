package src;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingWebPage {
	@Test
	public void test_1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");	
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(4000);
		driver.quit();
	}
}
