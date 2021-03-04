package src;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SettingSizeOfBrowserWindow {

	@Test
	public void test_1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");	
		
		driver.manage().window().setSize(new Dimension(400, 400));
		Thread.sleep(4000);
		driver.quit();
	}

}
