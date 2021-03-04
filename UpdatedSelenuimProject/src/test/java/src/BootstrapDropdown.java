package src;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class BootstrapDropdown {


		@Test
		public void test_1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
			Reporter.log("The browser window is opened");
			driver.manage().window().maximize();
			Reporter.log("The browser window is maximized");
			driver.findElement(By.className("multiselect-selected-text")).click();
			Reporter.log("clicked for sign in");
			Thread.sleep(5000);
			Reporter.log("slept for 5 sec");
			String at = driver.getTitle();
			System.out.println(at);
			driver.close();
			Reporter.log("browser is closed");
			
			Assert.assertEquals(at, "A demo with option groups");
		}
	}



