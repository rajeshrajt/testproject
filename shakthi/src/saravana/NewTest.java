package saravana;

import org.testng.annotations.Test;


import libray.util;
import libray.util;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
	static WebDriver dr;

	public static void capturescreenshot(WebDriver driver, String screenname ) 
	{
		
	}
  @Test
  public void f() {
	 
	  
     // dr.findElement(By.id("DrpDwnMn0-jgk1label")).click();
   

  }
  
      
  @BeforeClass
  public void beforeClass() throws IOException, InterruptedException {
	   dr.findElement(By.xpath("//p[text()='ABOUT']")).click();
	   //Thread.sleep(3000);
	  util.capturescreenshot(dr, "aboutus");
	
	}
  

  @BeforeTest
  public void beforeTest() throws IOException, InterruptedException {
	  dr.get("https:\\www.shakthisaravana.com");
	// Thread.sleep(3000);
	  util.capturescreenshot(dr,"website");
	 
		
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\new version chrome\\chromedriver.exe");
	  
      System.setProperty("webdriver.chrome.silentOutput", "true");
      dr=new ChromeDriver();
  }

}
