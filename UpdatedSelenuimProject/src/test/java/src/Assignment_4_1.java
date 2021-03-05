package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/signup");	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement ele=driver.findElement(By.id("firstName"));
	String p = ele.getAttribute("id");

	
	js.executeScript("document.getElementById('firstName').value='ram@gmail.com'");
//    js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
//            ele, "firstName", "ram@gmail.com");
	
//	js.executeScript("document.getElementById('firstName').setAttribute('id', 'ram@gmail.com')");
//	String p = ele.getAttribute("name");
//	p.setAttribute("name", "ram@gmail.com");
//	System.out.println(ele.getAttribute("name"));
	
}

}
