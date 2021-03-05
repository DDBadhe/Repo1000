package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4_1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signup");	
	
	driver.findElement(By.id("firstName")).sendKeys("Ram");
	System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
	driver.findElement(By.id("lastName")).sendKeys("Badhe");
	System.out.println(driver.findElement(By.id("lastName")).getAttribute("value"));
	driver.findElement(By.id("username")).sendKeys("rambadhe100");
	System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
	driver.findElement(By.name("Passwd")).sendKeys("123456");
	System.out.println(driver.findElement(By.name("Passwd")).getAttribute("value"));
	driver.findElement(By.name("ConfirmPasswd")).sendKeys("123456");
	System.out.println(driver.findElement(By.name("ConfirmPasswd")).getAttribute("value"));
	
	Thread.sleep(4000);
	
	driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	
	Thread.sleep(4000);
	driver.quit();
}

}
