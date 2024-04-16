package RUNNER;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_class;
import Generic.Fetch_Data;
import POM.Pom;

public class Excel_Runner extends Base_class
{
	
@Test
public void runner1() throws EncryptedDocumentException, IOException, InterruptedException
{
	Pom p=new Pom(driver);
	for(int i=0;i<10;i++)
	{
		int j=0;
		p.loginc();
	p.username(Fetch_Data.excel("sheet1", i, j));
	Thread.sleep(2000);
	p.password(Fetch_Data.excel("sheet1", i, j+1));
	Thread.sleep(2000);
	p.loginbutton();

	}
}
}
