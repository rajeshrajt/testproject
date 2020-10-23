package saravana;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class mouseover {
	static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\latest chromedriver\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.silentOutput", "true");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
  }
  @AfterClass
  public void afterClass() {
  }

}
