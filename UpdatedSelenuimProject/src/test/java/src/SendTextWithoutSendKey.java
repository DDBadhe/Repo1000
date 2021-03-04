package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SendTextWithoutSendKey {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		js.executeScript("arguments[0].value='testing'",search);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(search).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(4000);
		driver.quit();
	}
}
