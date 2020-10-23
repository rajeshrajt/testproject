package saravana;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametrizedtesting {
	 WebDriver driver;
	@Parameters({"url","browsertype"})
	@BeforeTest
	public void invokebrowser(String url,String browsertype)
	{
	if(browsertype.equals("CH"))
	{
		WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
	}
	else if(browsertype.equals("FF"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else
	{
	     WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
	driver.get(url);
	}
	@Test
	public void validatetitle()
	{
		String expected="google";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		}
}
