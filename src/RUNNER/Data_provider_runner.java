package RUNNER;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_class;
import POM.Pom;

public class Data_provider_runner extends Base_class
{
   @Test(dataProvider = "raj")
   public void test1(String user,String pwd) throws InterruptedException
   {
	   Pom p=new Pom(driver);
	   p.loginc();
	   Thread.sleep(2000);
	   p.username(user);
	   Thread.sleep(2000);
	   p.password(pwd);
	   Thread.sleep(2000);
	   p.loginbutton();
   }
   @DataProvider(name = "raj")
   public Object[][] check()
   {
	   return new Object[][]
			   {{"spiderman","webdeveloper"},
		   {"superman","bro"},
		   {"ironman","dhobi"}};
   }
}
