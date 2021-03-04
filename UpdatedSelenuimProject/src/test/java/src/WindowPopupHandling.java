package src;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPopupHandling {
	@Test
	public void test_1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();;
		String Mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!Mainwindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("ram@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(Mainwindow);
		Thread.sleep(5000);
		driver.close();
	}
}
