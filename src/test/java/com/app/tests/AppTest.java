package com.app.tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.DocumentationPage;
import com.app.pages.DownloadPage;



public class AppTest {
	static WebDriver driver;
    public final static int TIMEOUT = 10;
    DownloadPage downloads;
    DocumentationPage documentation;
    
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		String rootFolder = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        downloads = new DownloadPage(driver);
        documentation = new DocumentationPage(driver);
	}
	
	
  @Test
  public void verifyDownloadsPage() {
	    
	  	downloads.launchDownloads();
	  	downloads.verifyDownloadsHeader();
		driver.findElement(By.id("selenium_logo")).click();
	  
	  
  }
  @Test
  public void verifyDocumentationPage() {
	  
	  documentation.launchDocumentation();
	  documentation.verifyDocumentationsHeader();
		driver.findElement(By.id("selenium_logo")).click();
	  
  }
  
  @AfterMethod(alwaysRun=true)
  public void teardown() {
      driver.quit();
  }
  
}
