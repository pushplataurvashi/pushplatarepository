package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class VeryfySignUp extends BaseClass {
	
	@Test
	
	public void signup() throws IOException
	{
	FileInputStream fs=new FileInputStream("C:\\Users\\amanp\\OneDrive\\Desktop\\company.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	XSSFSheet sheet=workbook.getSheetAt(0);
	XSSFRow   row=sheet.getRow(0);
	
	XSSFCell cell1=row.getCell(0);
	String c1=cell1.toString();
	
	XSSFCell cell2=row.getCell(1);
	String c2=cell2.toString();
	
	XSSFRow row1=sheet.getRow(1);
	
	XSSFCell cell3=row1.getCell(0);
	String c3=cell3.toString();
	
	XSSFCell cell4=row1.getCell(1);
	String c4=cell4.toString();
	
	System.out.println(sheet.getRow(0).getCell(0));
	System.out.println(sheet.getRow(0).getCell(1));

	System.out.println(sheet.getRow(1).getCell(0));
	System.out.println(sheet.getRow(1).getCell(1));
	

}
}