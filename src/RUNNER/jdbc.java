package RUNNER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

import Generic.Base_class;
import POM.Pom;

public class jdbc extends Base_class
{
	
  @Test
  public void jdbc1() throws SQLException, InterruptedException
  {
	  String url="jdbc:mysql://localhost:3306/test7";
	  String un="root";
	  String pass="root";
	  Connection con= DriverManager.getConnection(url,un,pass);
	  Statement s= con.createStatement();
	  ResultSet eq = s.executeQuery("select * from Data5");
	  while(eq.next())
	  {
		  String user = eq.getString(1);
		  String pwd = eq.getString(2);
		  System.out.println(user+""+pwd);
		  Pom p=new Pom(driver);
		 p.loginc();
		  Thread.sleep(2000);
		  p.username(user);
		  Thread.sleep(2000);
		  p.password(pwd);
		  Thread.sleep(2000);
		  p.loginbutton();
		  
	  }
  }
}
