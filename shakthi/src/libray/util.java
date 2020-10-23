package libray;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class util {
	public static void capturescreenshot(WebDriver driver, String screenname ) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File ("./capturedscreenshot/"+screenname+".png"));
		System.out.println("screenshot has taken");
		//driver.quit();
	
	}
}
