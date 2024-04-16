package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectclass 
{
public static Select select(WebElement ele)
{
	Select s=new Select(ele);
	return s;
}
}
