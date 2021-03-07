package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_4_2 {
	
	@Test
	public void test_1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");		
	

		driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"search_type\"]/option[3]")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
	
	}
}
