package src;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchWebPage {
@Test
public void name() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	
	System.out.println("Total number of suggestions "+ list.size());
	
	for (int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("javascript tutorial")) {
		list.get(i).click();
		break;
		}
	}
	driver.close();
}

}
