package src;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromConfig {
	@Test
	public void test_1() throws InterruptedException {
		Properties properties = new Properties();
		try {
			
			InputStream input = new FileInputStream("E:\\WORKSPACE\\UpdatedSelenuimProject\\src\\test\\resources\\src\\config.properties");
			
			properties.load(input);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String url = properties.getProperty("Url");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("identifierId")).sendKeys(properties.getProperty("email"));
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		Thread.sleep(4000);
		driver.quit();
	}
	
}
