package src;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.implementation.bytecode.StackSize;

public class ExtentReport {

	public static void main(String[] args) {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/report1.html") ;
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test1 = extent.createTest("Test1- Google search", "Validating search");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://www.google.com");	
		test1.pass("navigated to google.com");
	
		driver.findElement(By.name("q")).sendKeys("testing");
		test1.pass("entered text in search box");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).sendKeys(Keys.ENTER).build().perform();
		test1.pass("pressed search button");
		
		driver.close();
		driver.quit();
		test1.pass("closed browser");
		
		
		test1.info("test completed");
		
		extent.flush();

	}
}
