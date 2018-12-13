package com.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	 

	@Test
	public void Test() throws Exception {
		{
			// TODO Auto-generated method stub
			//File file = new File (System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\shrutityagi\\eclipse-workspace\\Online\\Driver\\geckodriver.exe");
			File pathBinary = new File("C:\\Users\\shrutityagi\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			WebDriver driver = new FirefoxDriver(options);
			
			driver.get("https://www.freecrm.com");
		  	Thread.sleep(3000);
		  	 driver.findElement(By.name("username")).sendKeys("ramukneevan");
		  	
		  	 driver.findElement(By.name("password")).sendKeys("test@123");
		  	 
		//	TakeScreenshot.getScreenshot(driver, "loginpassword");
		   // FrameHandling.captureScreenShot(driver);
		 	Thread.sleep(3000);
		  	 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 // 	FrameHandling.captureScreenShot(driver);
		  	Thread.sleep(3000);
		  	driver.switchTo().frame("mainpanel");
		 // 	FrameHandling.captureScreenShot(driver);
		  	Thread.sleep(2000);
		  	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		}
}
	  /*	public static void captureScreenShot(WebDriver ldriver){
	  	// Take screenshot and store as a file format             
	  	 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           

	  	// now copy the  screenshot to desired location using copyFile method
	  	 try {
	  		FileUtils.copyFile(src, new File("D:\\selenium"+System.currentTimeMillis()+".png"));            
	  		} catch (IOException e)
	  	 {
	  		  System.out.println(e.getMessage()) ;
	  	 }
	  	                            
	  
	  	}*/
	  			
}



