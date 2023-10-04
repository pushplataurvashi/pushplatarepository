package Demo.UrvashiDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel.LoginObjects;

public class VerifyLogin2 extends BaseClass{

	@Test
	public void login() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\amanp\\OneDrive\\Desktop\\verifylogindata.xlsx");
		
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
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginObjects lpo=new LoginObjects(driver);
		lpo.enterUsername().sendKeys(c1);
		Thread.sleep(1000);

		lpo.enterPassword().sendKeys(c2);
		Thread.sleep(1000);

		lpo.clickOnLogin().click();
		Thread.sleep(1000);
		
		lpo.enterUsername().sendKeys(c3);
		Thread.sleep(1000);

		lpo.enterPassword().sendKeys(c4);
		Thread.sleep(1000);

		lpo.clickOnLogin().click();

		
	}
	
	
}
