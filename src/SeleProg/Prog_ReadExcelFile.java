package SeleProg;
//Excel sheet 
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog_ReadExcelFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\TestData\\BhavTest.xlsx");
	       Sheet excelData = WorkbookFactory.create(file).getSheet("Sheet1");
	       String value = excelData.getRow(0).getCell(0).getStringCellValue();
	       String value1 = excelData.getRow(1).getCell(0).getStringCellValue();
	       String value2 = excelData.getRow(1).getCell(1).getStringCellValue();
	       String value3 = excelData.getRow(0).getCell(1).getStringCellValue();

	       System.out.println(value);
	       System.out.println(value1);
	       System.out.println(value2);
	       System.out.println(value3);

	}

	
}
