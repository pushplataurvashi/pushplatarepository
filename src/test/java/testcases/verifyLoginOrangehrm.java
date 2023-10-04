package testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModelOrangeHRM.loginObjOrangeHRM;

public class verifyLoginOrangehrm extends BaseClass{
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\amanp\\OneDrive\\Desktop\\LoginOrangeHRM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow   row=sheet.getRow(0);
		
		XSSFCell  cell=row.getCell(0);
		String c1=cell.toString();
		
		XSSFCell  cell1=row.getCell(1);
		String c2=cell1.toString();
		
		driverInitialize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		loginObjOrangeHRM Lobject=new loginObjOrangeHRM(driver);
		
		Lobject.Username().sendKeys(c1);
		Thread.sleep(1000);
		Lobject.Password().sendKeys(c2);
		Thread.sleep(1000);
		
		Lobject.login().click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
