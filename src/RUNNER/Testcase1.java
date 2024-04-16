package RUNNER;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_class;
import POM.Pom;

public class Testcase1 extends Base_class
{
@Test
public void test1()
{
	Pom p=new Pom(driver);
	p.postajob();
	p.category(1);
	p.jobt("Automation engineer");
	p.dads("BE/BTECH");
	p.job("2");
	p.salmin("200000");
	p.salmax("500000");
	p.pertime("2");
	p.nego();
	p.startDate("31/12/2023");
	p.companyName("Accenture");
	p.companyDesc("good company");
	p.company_logo("C:\\Users\\RAJU\\Pictures\\Screenshots\\Screenshot (144).png");
	p.company_website("www.accenture.com");
	p.company_location1("IN.19");
	p.company_SubLocation("IN.19.583");
	p.city("1261539");
	p.contactName("accenture");
	p.contactEmail("Accenture12@gmail.com");
	p.contactPhone("9087654321");
	p.contactCheck();
	p.submit();
	Assert.fail();
}
}
