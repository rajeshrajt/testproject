package saravana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class templesite {
	static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\latest chromedriver\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.silentoutput", "true");
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.liverpoolganeshtemple.org.uk/contact-us");
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	   Actions act=new Actions(driver);
	   Thread.sleep(2000);
	  WebElement element=driver.findElement(By.id("comp-kcbhwapu1label"));
	  act.moveToElement(element).build().perform();
	  Thread.sleep(2000);

new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Upcoming Events')]"))).click();
	//  driver.findElement(By.xpath("//*[contains(text(),'U
	
	WebDriverWait wait=new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.alertIsPresent(By.xpath("//*[contains(text(),'Upcoming Events')]")));

	  
  }

}
