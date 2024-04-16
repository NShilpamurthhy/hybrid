package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Frame_constants
{
	public  WebDriver driver;
  @BeforeMethod
  public void launch()
  {
	 System.setProperty(gecko_key,gecko_val);
	  driver=new FirefoxDriver();
	  driver.get(Base_url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @AfterMethod
  public void closeapp(ITestResult res) throws IOException
  {
	  if(ITestResult.FAILURE==res.getStatus())
	  {
		  ScreenShot.screen(driver);
	  }
	  driver.close();
  }
}
