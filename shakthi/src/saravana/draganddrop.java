package saravana;

import org.testng.annotations.Test;

import libray.util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class draganddrop {
	static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\latest chromedriver\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.silentOutput", "true");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
	
	  WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement src=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
	  util.capturescreenshot(driver, "dragname");
	  WebElement des=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
	  util.capturescreenshot(driver, "dropname");
	  act.dragAndDrop(src,des).perform();
  }
	
	 /* act.clickAndHold(src)
	 .pause(Duration.ofSeconds(2))
	  .moveToElement(des)
	  .pause(Duration.ofSeconds(2))
	 .release()
	 .build()
  .perform();
	 
	  
  }*/

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
