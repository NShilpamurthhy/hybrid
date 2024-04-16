package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class 
{
  public Actions action(WebDriver driver)
  {
	  Actions act=new Actions(driver);
	  return act;
	  
  }
}
