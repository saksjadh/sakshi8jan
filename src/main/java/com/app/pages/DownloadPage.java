package com.app.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage {
	WebDriver driver = null ;
	
	
	public DownloadPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void launchDownloads() {
	  	driver.findElement(By.linkText("Downloads")).click();
	  	String expTitle = "Downloads | Selenium";
		String actualTitle =driver.getTitle();
		assertEquals(expTitle, actualTitle, "Downloads Page is not loaded");

	}
	
	public void verifyDownloadsHeader() {
		String actual = driver.findElement(By.xpath("//h1")).getText();
		String exp = "Downloads";
		assertEquals(exp, actual, "Verification of header Failed");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
