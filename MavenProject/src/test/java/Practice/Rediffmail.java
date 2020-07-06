package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.ws.RealWebSocket.Close;

@Test
public class Rediffmail {
	
	 {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://way2automation.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		
		
		
		driver.close();
	}
	
}
	