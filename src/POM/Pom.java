package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Generic.Base_page ;
import Generic.Selectclass;

public class Pom extends Base_page
{
@FindBy (xpath = "//a[text()='Login']")
private WebElement login;

@FindBy (xpath ="//input[@id='email']" )
private WebElement email;

@FindBy(xpath = "//input[@id='password']")
private WebElement pass;

@FindBy(xpath = "//button[@id='loginBtn']")
private WebElement log;

@FindBy(xpath = "//a[text()=' Post a Job']")
private WebElement postBtn;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[1]")
private WebElement drop;

@FindBy(xpath = "//input[@id='title']")
private WebElement jobtitle;

@FindBy(id = "description")
private WebElement Dadd;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[2]")
private WebElement jobtype;

@FindBy(xpath = "//textarea[@id='description']")
private WebElement areafield;

@FindBy(id = "salary_min")
private WebElement salmin;


@FindBy(id = "salary_max")
private WebElement salmax;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[3]")
private WebElement per;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[4]")
private WebElement location;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[5]")
private WebElement Sublocation;

@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']/ancestor::span/preceding-sibling::select)[6]")
private WebElement city;

@FindBy(id = "negotiable")
private WebElement negotiable;

@FindBy(id = "start_date")
private WebElement startDate;

@FindBy(id = "company_name")
private WebElement companyName;

@FindBy(id = "company_description")
private WebElement company_desc;

@FindBy(id = "logo")
private WebElement c_logo;

@FindBy(id = "company_website")
private WebElement company_website;

@FindBy(id = "contact_name")
private WebElement contactName;

@FindBy(id = "contact_email")
private WebElement contact_email;

@FindBy(id = "contact_phone")
private WebElement contact_phone;


@FindBy(id = "contact_phone_hidden")
private WebElement contact_check;

@FindBy(id = "createAdBtn")
private WebElement submit;

public Pom(WebDriver driver)
{
	super(driver);
}
public void submit()
{
	submit.click();
}
public void contactCheck()
{
	contact_check.click();
}
public void contactName(String Contname)
{
	contactName.sendKeys(Contname);
}
public void contactEmail(String Contemail)
{
	contact_email.sendKeys(Contemail);
}
public void contactPhone(String ContPhone)
{
	contact_phone.sendKeys(ContPhone);
}
public void company_location1(String loc1)
{
	Select country = Selectclass.select(location);
	country.selectByValue(loc1);
}
public void company_SubLocation(String sub)
{
	Select state = Selectclass.select(Sublocation);
	state.selectByValue(sub);
}
public void city(String city_name)
{
	Select city1= Selectclass.select(city);
	city1.selectByValue(city_name);
}

public void company_website(String site)
{
	company_website.sendKeys(site);
}
public void company_logo(String cdesc)
{
	c_logo.sendKeys(cdesc);
}
public void companyDesc(String cdesc)
{
	company_desc.sendKeys(cdesc);
}
public void companyName(String cname)
{
	companyName.sendKeys(cname);
}
public void startDate(String date)
{
	startDate.sendKeys(date);
}
public void nego()
{
	negotiable.click();
}
public void pertime(String i)
{
	Select time = Selectclass.select(per);
	time.selectByVisibleText(" per day ");
	
}
public void salmin(String min)
{
	salmin.sendKeys(min);
}
public void salmax(String max)
{
	salmax.sendKeys(max);
}
public void job(String val)
{
	Select s= Selectclass.select(jobtype);
	s.selectByVisibleText(val);
}
public void area(String data)
{
	areafield.sendKeys(data);
}
public void jobt(String title)
{
	jobtitle.sendKeys(title);
}
public void postajob()
{
	postBtn.click();
}
public void category(int s1)
{
	Select s= Selectclass.select(drop);
	s.selectByIndex(s1);
}
public void loginc()
{
	login.click();
}
public void username(String user)
{
	email.sendKeys(user);
}

public void password(String pwd)
{
	pass.sendKeys(pwd);
}
public void loginbutton()
{
	log.click();
}
public void dads(String desc)
{
	Dadd.sendKeys(desc);
}






}
