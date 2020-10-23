package saravana;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\latest chromedriver\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.silentoutput", "true");
		  WebDriver  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		  driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
	      Alert alerts=driver.switchTo().alert();
		  alerts.accept();
		  System.out.println(alerts);
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 /* WebDriverWait wait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//button[text()='Click me!'])[1]"))));
		  
		  Alert alertbox=driver.switchTo().alert();
		  alertbox.accept();
		  System.out.println(alertbox);
		  driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		  Alert alertbox2=driver.switchTo().alert();
		  alertbox2.sendKeys("rajesh");
		  System.out.println(alertbox2);*/
		  
		  
		
		  /*  driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  driver.findElement(By.xpath("(//a[text()='Javascript Alerts'])[1]")).click();*/

	}

}
