package saravana;

import org.testng.annotations.Test;

import libray.util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Tekapti {
	static WebDriver driver;
  @Test
  public void f() {
  }
	  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	  //login for tekapti
	   Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='E-mail ']")).sendKeys("testerrajesht@gmail.com");
	  Thread.sleep(3000);
	  util.capturescreenshot(driver, "emailid entering");
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rajeshraj03");
	  Thread.sleep(3000);
	  util.capturescreenshot(driver, "password entering");
	  driver.findElement(By.xpath("//button[@class='btn btn-custom-submit']")).click();
	  util.capturescreenshot(driver, "clickl login button");
	  System.out.println("login successfully");
	
	
	 
      //login with facebook
	  //driver.findElement(By.xpath("//button[@class='btn btn-custom-fb form-control']")).click();
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8807523006");
	  //Thread.sleep(3000);
	  //driver.findElement(By.id("pass")).sendKeys("cableraja");
	  //Thread.sleep(3000);
	  //driver.findElement(By.id("u_0_0")).click();
	  //System.out.println("sucessfully login with facebook");
	  
	  
	  
      
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException, IOException {
	  //clicking technogies and start the xam
	  Thread.sleep(3000);
      driver.findElement(By.xpath("(//a[text()='Technologies'])[1]")).click();
      Thread.sleep(3000);
     util.capturescreenshot(driver, "click the technologies");
      driver.findElement(By.xpath("//img[@src='http://tekadmin.tekaptitude.com/images/technology/Java.png']")).click();
	  Thread.sleep(3000);
	 util.capturescreenshot(driver, "choose the java technology");
      driver.findElement(By.xpath("//img[@src='./assets/images/tri-simple_10.png']")).click();
      Thread.sleep(4000);
     util.capturescreenshot(driver, "select the level");
    // driver.findElement(By.xpath("//a[@class='popup-close']")).click();
     driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  
     
     driver.findElement(By.xpath("//button[text()=' Start Exam ']")).click();
      Thread.sleep(3000);
     util.capturescreenshot(driver, "start xam");
      driver.findElement(By.xpath("//input[@value='B']")).click();
      Thread.sleep(3000);
      util.capturescreenshot(driver, "optionselecting");
     driver.findElement(By.xpath("//button[text()=' Next ']")).click();
    util.capturescreenshot(driver, "clicknext");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='C']")).click();
   Thread.sleep(3000);
      driver.findElement(By.xpath("//button[text()='Finish']")).click();
      util.capturescreenshot(driver, "click finish");
     Thread.sleep(3000);
    driver.findElement(By.xpath("//button[text()='OK']")).click();
     util.capturescreenshot(driver, "click ok");
     Thread.sleep(3000);
      driver.findElement(By.xpath("//a[@class='popup-close']")).click();
       util.capturescreenshot(driver, "clicking close button");
   
      //seeing my account
      Thread.sleep(3000);
      WebElement element=driver.findElement(By.id("navbarDropdownMenuLink"));
 	 element.click();
 	 Thread.sleep(3000);
      driver.findElement(By.xpath("//div[text()=' My Account']")).click();
      util.capturescreenshot(driver, "Account details");
      System.out.println("my account details");
    
  }

  @BeforeClass
  public void beforeClass() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\latest chromedriver\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.silentOutput", "true");
	  driver=new ChromeDriver();
	  
	  //register for techapti
      driver.get("http://tekaptitude.com/#/");
      util.capturescreenshot(driver, "launchpage");
      Thread.sleep(3000);
      driver.manage().window().maximize();
      util.capturescreenshot(driver, "maximizewindowpage");
       Thread.sleep(3000);
	  WebElement element=driver.findElement(By.id("navbarDropdownMenuLink"));
	  element.click();
	 Thread.sleep(3000);
	 util.capturescreenshot(driver, "click the drop down");
	 driver.findElement(By.xpath("(//span[@class='usr'])[2]")).click();
	 util.capturescreenshot(driver, "clicking register/login");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='btn btn-custom-submit']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='Full name*']")).sendKeys("Rajes");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//input[@placeholder='Email address*']")).sendKeys("testerrajesht@gmail.com");
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Password*']")).sendKeys("rajeshraj03");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
	 System.out.println("registered successfully");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='btn btn-custom-submit']")).click();
  }
	 
	
	  
	   @AfterClass
  public void afterClass() throws InterruptedException, IOException {
	  //logout
	  Thread.sleep(5000);
	  WebElement element1=driver.findElement(By.id("navbarDropdownMenuLink"));
	  	 element1.click();
	  	 driver.findElement(By.xpath("//div[text()=' Logout ']")).click();
	    util.capturescreenshot(driver, "logout");
	     System.out.println("logout successfully");
	 
	   
  }

}
