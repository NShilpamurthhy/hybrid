package RUNNER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Generic.Base_class;
import Generic.Fetch_Data;
import POM.Pom;

public class Testcase2 extends Base_class
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException
	{
		Pom p=new Pom(driver);
		p.postajob();
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				for(int k=1;k<=1;)
				{
		p.category(1);
		p.jobt(Fetch_Data.excel("Sheet1", i, j));
		p.dads(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		//p.job(Fetch_Data.excel("Sheet1", i, j+k));
		//k++;
		p.salmin(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.salmax(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.pertime(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.nego();
		p.startDate(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.companyName(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.companyDesc(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.company_logo(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.company_website(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.company_location1(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.company_SubLocation(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.city(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.contactName(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.contactEmail(Fetch_Data.excel("Sheet1", i, j+k));
		k++;
		p.contactPhone(Fetch_Data.excel("Sheet1", i, j+k));
		p.contactCheck();
		p.submit();
	}
		}
		}
	}
}
