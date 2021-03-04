package src;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static int Count = 0;
	static int ValidUrl = 0;
	static int BrokenUrl = 0;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zlti.com");	
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+ list.size());
		
		for(int i=0 ; i<list.size() ; i++) {
			Count++;
			WebElement we = list.get(i);
			String url = we.getAttribute("href");
			verifyLink(url);
		}
		
		System.out.println("Number of valid sites "+ValidUrl);
		System.out.println("Number of Broken sites" + BrokenUrl);
		driver.close();
	}

	private static void verifyLink(String checkUrl) {
		
		try {
			URL url = new URL(checkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
//			httpUrlConnection.setConnectTimeout(3000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode() == 200) {
				ValidUrl++;
				
				System.out.println(Count+ " - "+url+" - "+httpUrlConnection.getResponseMessage()+" - Valid URL" );
			}
			
			if(httpUrlConnection.getResponseCode() >= 400) {
				BrokenUrl++;
				System.out.println(Count+ " - " + url+" - "+httpUrlConnection.getResponseMessage()+" - Broken URL" );
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
