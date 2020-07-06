package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class firsttestngfileTest {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Selenium\\geckodriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.gecko.driver", driverPath);
          driver = new FirefoxDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          AssertJUnit.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
          
      }
}