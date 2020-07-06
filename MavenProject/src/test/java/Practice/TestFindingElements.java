package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestFindingElements {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	
		driver.get("http://gmail.com");
		
		String title = driver.getTitle();
		
		WebElement username = driver.findElement(By.name("identifier"));		
		username.sendKeys("karthik.sheelam@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		
	}

}
