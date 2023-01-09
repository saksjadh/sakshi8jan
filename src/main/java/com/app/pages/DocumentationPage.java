package com.app.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage {
	WebDriver driver = null;
	
	public DocumentationPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
}

	public void launchDocumentation() {
	  	driver.findElement(By.linkText("Documentation")).click();
	  	String expTitle = "The Selenium Browser Automation Project | Selenium";
		String actualTitle =driver.getTitle();
		assertEquals(expTitle, actualTitle, "Documentation Page is not loaded");
	}
	
	public void verifyDocumentationsHeader() {
		String actual = driver.findElement(By.xpath("//h1")).getText();
		String exp = "The Selenium Browser Automation Project";
		assertEquals(exp, actual, "Verification of header Failed");
	}

	


	}


