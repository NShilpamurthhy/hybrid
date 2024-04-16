package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends Base_class
{
public static void screen(WebDriver driver) throws IOException
{
	String photos="./photos/";
	Date d=new Date();
	String d1= d.toString();
	String date = d1.replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photos+date+"jpeg");
	FileHandler.copy(src, dst);
	
}
}
