package saravana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Annamm {
	static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://sinet-tech.com/annam/admin/login");
	  driver.findElement(By.name("username")).clear();
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys("aur0r@12345");
	  driver.findElement(By.id("yw0")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Offers ']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[text()='Create']")).click();
	  Thread.sleep(3000);
	   driver.findElement(By.xpath("//input [@id=\"type1\" and @name=\"type\" and @checked]")).click();
	   Thread.sleep(3000);
	 // WebElement element=driver.findElement(By.id("restaruant_id"));
	 // element.click();
	  //Select select1=new Select(element);
	  //select1.selectByValue("2");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\jars\\chromedriver.exe");
      System.setProperty("webdriver.chrome.silentOutput", "true");
      driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass()  {
	
	 
	  
	  
	  
  }

}
