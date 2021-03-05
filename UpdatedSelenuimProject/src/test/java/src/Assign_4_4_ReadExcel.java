package src;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Assign_4_4_ReadExcel {

	
	@Test
	public void test_1() throws Exception {
		File src = new File("src/test/resources/Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 0; i <= rowCount; i++) {
			String UserName = sheet.getRow(i).getCell(0).getStringCellValue();
			String Password = sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UserName +" - "+ Password);
		}
		
	}

}
