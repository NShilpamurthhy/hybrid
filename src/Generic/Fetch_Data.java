package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data 
{
public static String excel(String sheet1,int r,int c) throws EncryptedDocumentException, IOException
{
	
	FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
	Workbook book= WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheet1);
	Row row = sheet.getRow(r);
	Cell cell = row.getCell(c);
//	String val = cell.getStringCellValue();
	String val = cell.toString();
	System.out.println(val);
	return val;
	
}
}
