package SeleProg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2_ParaMeter {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\TestData\\Data1.xlsx");
		Sheet excelFile = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int row=0;row<=3;row++)
		{
			for(int cell=0;cell<=3;cell++) 
		      {
				Cell value = excelFile.getRow(row).getCell(cell);
				System.out.print(value + " ");
		      }
			System.out.println();
		}
		
		System.out.println("*******************************************");
		
		for(int row=0;row<=excelFile.getLastRowNum();row++)
		{
			for(int col=0;col<excelFile.getRow(row).getLastCellNum();col++) 
		      {
				Cell value = excelFile.getRow(row).getCell(col);
				System.out.print(value+ " ");
		      }
			System.out.println();
		}
	}

}
