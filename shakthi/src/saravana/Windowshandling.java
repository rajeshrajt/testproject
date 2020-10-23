package saravana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Windowshandling {
	static WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chrome driver sep20\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.silentoutput","true");
	  driver.get("http://www.leafground.com/pages/Window.html");
	 String oldwindow= driver.getWindowHandle();
	  driver.findElement(By.id("home")).click();
	 Set<String>handles =driver.getWindowHandles();
	 for(String newwindow:handles)
	 {
		 driver.switchTo().window("newwindow");
	 }
	  driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
